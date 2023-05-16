package mysqltype;
import java.sql.*;

public class connectingdatabase {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Pandusai@2003");
        Statement smt=(Statement) con.createStatement();
        boolean rs=((java.sql.Statement) smt).execute("create database secbpractice");
        if(rs){
            System.out.println("not created !");
        }
        con.close();
        
    }
}