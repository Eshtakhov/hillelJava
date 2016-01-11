package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by ES on 14.12.2015.
 */
public class ProductdbDAO implements ProductDAO {
    private Connection connection;


    public ProductdbDAO() {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String connectionString = "jdbc:postgresql://localhost:5432/postgres";
        try {
            connection = DriverManager.getConnection(connectionString, "postgres", "postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }));
    }

    @Override
    public Optional<Product> findById(int id) {
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
        }

    }

    @Override
    public List<Product> findALl() {
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void deleteById(int id) {
        try {
            String sql = "DELETE from store Where id =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }

    @Override
    public void update(Product product) {
        try {
            String sql = "UPDATE store SET name=?,category=?,price=? WHERE id= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getCategory());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setInt(4, product.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }

    @Override
    public void create(Product product) {
        try{
            String sql = "INSERT INTO store (id,name,category,price) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getCategory());
            preparedStatement.setInt(4, product.getPrice());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
    protected void finilize() throws SQLException {
        connection.close();
    }
}
