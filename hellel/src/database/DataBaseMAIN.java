package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by ES on 10.12.2015.
 */
public class DataBaseMAIN {
    public static void main(String[] args) throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String connectionString = "jdbc:postgresql://localhost:5432/postgres";


        Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres");
        //create(connection, new Product(4, "Table", "Funiture", 100));
        Optional<Product> productOptional = findById(connection, 1);
        if (productOptional.isPresent()) {
            System.out.println("product in optional " + productOptional.get());
        }
        deleteByID(connection, 3);

        findALl(connection);
        connection.close();
    }

    private static void deleteByID(Connection connection, int id) throws SQLException {
        String sql = "DELETE from store Where id =?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        statement.close();

    }

    public static void create(Connection connection, Product product) throws SQLException {
        String sql = "INSERT INTO store (id,name,category,price) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setString(3, product.getCategory());
        preparedStatement.setInt(4, product.getPrice());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void rightRead(Connection connection) throws SQLException {
        String sql = "UPDATE store SET name=? WHERE id= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Mouse--");
        preparedStatement.setInt(2, 1);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void notCorrectUpdate(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        int id = 1;
        String newName = "RAM";
        String sql = "UPDATE store SET name='" + newName + "' WHERE id=" + id;
        int n = statement.executeUpdate(sql);
        System.out.println(n);
    }

    public static List<Product> findALl(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        String sql = "SELECT id AS Item_Id, name, category, price FROM store";
        ResultSet resultSet = statement.executeQuery(sql);
        List<Product> products = new ArrayList<>();

        while (resultSet.next()) {
            int item_id = resultSet.getInt("Item_Id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            Product product = new Product(item_id, name, category, price);
            products.add(product);
        }
        resultSet.close();
        return products;
    }

    public static Optional<Product> findById(Connection connection, int id) throws SQLException {
        String sql = "SELECT  name, category, price FROM store";
        PreparedStatement statement = connection.prepareStatement(sql);
        Optional<Product> product = Optional.empty();
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            product = Optional.of(new Product(id, name, category, price));
        }
        resultSet.close();
        return product;
    }
}
