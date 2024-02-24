/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author pc
 */
public class ConnectionDatabase {
     public static Connection getConn() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://nguyenlong:1433;databaseName=QLSach;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
            String userName = "sa";
            String password = "123456789";
            Connection conn = DriverManager.getConnection(url, userName, password);
            return conn; 
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static void main(String[] args) {
        Connection con = ConnectionDatabase.getConn();
        // Sử dụng 'con' để thực hiện các thao tác với cơ sở dữ liệu
    }
}

