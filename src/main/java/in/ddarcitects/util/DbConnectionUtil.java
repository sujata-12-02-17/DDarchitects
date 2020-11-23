package in.ddarcitects.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {

    private String url="jdbc:mysql://localhost:3306/dd_architects?useSSL=false";
    private String username="root";
    private String password="sujata";


    public Connection getConnection() {
                Connection con = null;
         try {
                con = DriverManager.getConnection(url, username, password);


            } catch (SQLException e) {

                e.printStackTrace();
        }

         return  con;
    }
}



