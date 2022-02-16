package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/test_md3?useSSL=false";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "123456";

    public Connection getConnection() {
        Connection connection = null;
        try {
            // Đổi class hiện tại về quản lý như 1 drive
            Class.forName("com.mysql.jdbc.Driver");

            //Quản lý connection vs driver manager
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
