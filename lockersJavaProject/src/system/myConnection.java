package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class myConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectLockers;user=Admin;password=Admin";

            Properties properties = new Properties();
            properties.setProperty("trustServerCertificate", "true");

            con = DriverManager.getConnection(url,properties);
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
        public static Connection getConnectionNormal() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectLockers;user=User;password=User";

            Properties properties = new Properties();
            properties.setProperty("trustServerCertificate", "true");

            con = DriverManager.getConnection(url,properties);
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
