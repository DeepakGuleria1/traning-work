import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

    public class Main {
        public static void main(String[] args) {
            try {
                // Register the driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Getting the connection
                String mysqlurl = "jdbc:mysql://localhost:3306/";
                Connection con = DriverManager.getConnection(mysqlurl, "root", "deepak@12345");
                System.out.println("Connection established");

                // Creating the statement
                Statement stmt = con.createStatement();

                // Create database
                String query = "CREATE DATABASE std";

                // Execute query
                stmt.execute(query);
                System.out.println("Database created");

                // Close the resources
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }