package database;

import multithreding.bank.producerConsummer.Producer;

import java.sql.*;

/**
 * Created by ES on 10.12.2015.
 */
public class DataBaseMAIN {
    public static void main(String[] args) throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String connectionString = "jdbc:postgresql://localhost:5432/postgres";


        Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres");
        String sql = "UPDATE store SET name=? WHERE id= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"Mouse--");
        preparedStatement.setInt(2,1);
        preparedStatement.executeUpdate();
        preparedStatement.close();

        //notCorrectUpdate(connection);
        read(connection);

        connection.close();
    }

    public static void notCorrectUpdate(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        int id = 1;
        String newName = "RAM";
        String sql = "UPDATE store SET name='" + newName + "' WHERE id=" + id;
        int n = statement.executeUpdate(sql);
        System.out.println(n);
    }

    public static void read(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        String sql = "SELECT id AS Item_Id, name, category, price FROM store";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int item_id = resultSet.getInt("Item_Id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            Product product = new Product(item_id, name, category, price);
            System.out.println(product);

        }
        resultSet.close();
    }
}
