package mysqltype;
import java.sql.*;


public class retrivealldata {
    public static void main(String[] args) throws SQLException {
        Connection s=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/secbpractice", "root", "Pandusai@2003");
        Statement smt=(Statement) s.createStatement();
        ResultSet r=smt.executeQuery("select * from studenttable");
        while(r.next()){
        System.out.println("\nname: "+r.getString(1));
        System.out.println("roll:"+r.getString(2));
        System.out.println("sec: :"+r.getString(3));
        System.out.println("**********************************\n");
        }
        s.close();
        
        
    }
    
}
