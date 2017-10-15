package first;
import java.sql.*;

public class main {
    Connection con= null;
    public static Connection connectDbase(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con= DriverManager.getConnection("jdbc:sqlite:base.sqlite");
            System.out.println("Connected");
            return con;
        }
        catch(Exception e){
            System.out.println("Not Connected");
            return null;
        }
        
            
    }
}
