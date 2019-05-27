package MainFolder;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConsole {

    Connection connection = new DataBaseConnector().getConnection();


    public void fillTable(){
        try{
            Statement statement;
            statement = connection.createStatement();
            statement.executeQuery("Create database if not exist 'Preffered_Routes';");
            statement.executeQuery("use 'Preffered_Routes';");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }






}
