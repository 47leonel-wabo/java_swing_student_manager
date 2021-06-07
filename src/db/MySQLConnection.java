package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQLConnection {

    Connection conn = null;

    public static Connection connectDB() {
        try {
            // Loading MySQL Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establishing connection by providing link to database, root username and its password
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/".concat(DatabaseDetails.databaseName),
                    DatabaseDetails.rootUser,
                    DatabaseDetails.rootPassword);

            // Show success message dialog
            // JOptionPane.showMessageDialog(null, "Database Connection established Sucessfully");
            return connection;

        } catch (Exception e) {
            // Show message dialog
            JOptionPane.showMessageDialog(null, e.getMessage());

            return null;
        }
    }

}
