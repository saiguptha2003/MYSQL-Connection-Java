package mysqltype;

import java.sql.*;

import javax.swing.plaf.nimbus.State;

public class entryindatabase {
    String name;
    int roll;
    String secb;
     void createuser(String a,int b,String c){
        name=a;
        roll=b;
        secb=c;
    }
    public static void main(String[] args) throws Exception{
        Connection s=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/secbpractice","root","Pandusai@2003");
        entryindatabase db=new entryindatabase();
        db.createuser("pandurangasai", 91,"b" );
        String sqlquery="insert into studenttable(name, roll, secb)"+" values( ?, ?, ? )";
        PreparedStatement preparedquery=s.prepareStatement(sqlquery);
        preparedquery.setString(1,db.name);
        preparedquery.setInt(2, db.roll);
        preparedquery.setString(3, db.secb);
        preparedquery.execute();
        s.close();

        
    }
    
}
