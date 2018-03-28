/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author ANURANGA
 */
public class DB {

    private static String url = "jdbc:mysql://localhost:3307/jayashakthi";
    private static Connection c = null;
    private String sql;

    private static Connection mycon() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection(url, "root", "123");
            return c;
        } else {

            return c;
        }

    }

    public static void putData(String sql) throws Exception {
        mycon().createStatement().executeUpdate(sql);
    }

    public static ResultSet getData(String abc) throws Exception {

        return mycon().createStatement().executeQuery(abc);
    }
}
