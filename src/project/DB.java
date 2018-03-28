
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class DB {
     String url="jdbc:mysql://localhost:3307/jayashakthi";
    Connection c=null;
    private String  sql;
    
    public Connection mycon() throws Exception{
        if (c==null) {
            Class.forName("com.mysql.jdbc.Driver");
            c=(Connection)DriverManager.getConnection(url, "root", "123");
            return c;
        }else{
        
        return c;
        }


}
    public void putData(String sql) throws Exception{
        mycon().createStatement().executeUpdate(sql);
    }
    
    public ResultSet getData (String abc) throws Exception{
    
       return  mycon().createStatement().executeQuery(abc);
    }
    
}
