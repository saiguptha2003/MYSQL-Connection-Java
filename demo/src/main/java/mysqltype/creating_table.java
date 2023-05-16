package mysqltype;
import java.sql.*;
public class creating_table {
    public static void main(String[] args) throws Exception {
        System.out.println("creating msql table!");
        Connection s=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/secbpractice", "root", "Pandusai@2003");
        Statement smt=s.createStatement();
        boolean flag=smt.execute("create table studenttable (name varchar(200), roll int, secb varchar(12))");
        if(flag){
            System.out.println("table created!");
        }
        s.close();
    }

    
}
