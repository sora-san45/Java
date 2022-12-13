import java.sql.*;

public class JDBCConnect{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mary","mec","mec");
            Statement st=con.createStatement();  
            ResultSet res=st.executeQuery("select * from student"); 
            System.out.println("admno\tstdname\t\t\tstdclass\tadmn_date");
            while(res.next()){
                int ad= res.getInt(1);
                String name=res.getString(2);
                int cl=res.getInt(3);
                String date = res.getString(4);
                System.out.println(ad+"\t"+name+"\t\t"+cl+"\t\t"+date);
            }
        }
        catch(Exception e){
            System.out.println("Error occured");
        }
    }
}
