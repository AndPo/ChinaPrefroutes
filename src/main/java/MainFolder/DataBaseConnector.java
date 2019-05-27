package MainFolder;
import java.sql.*;

public class DataBaseConnector {

    Connection connection;



    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_new?serverTimezone=UTC", "root", "root");

            return connection;
        }catch(ClassNotFoundException exe){
            exe.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if(connection!=null){

                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return connection;
    }
}
