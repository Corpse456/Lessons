package lesson77.jdbc.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleConnectionMain {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/eCommercePlatform";
        Connection connection = DriverManager.getConnection(url, "postgres", "admin");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM users");
        result.next();
        System.out.println(result.getString("name"));
        result.next();
        System.out.println(result.getString("name"));
        result.next();
        System.out.println(result.getString("name"));
        
        /*String url = "jdbc:postgresql://localhost/test";
        Properties props = new Properties();
        props.setProperty("user", "fred");
        props.setProperty("password", "secret");
        props.setProperty("ssl", "true");
        Connection conn = DriverManager.getConnection(url, props);
        String url2 = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
        Connection conn2 = DriverManager.getConnection(url2);*/
    }
}
