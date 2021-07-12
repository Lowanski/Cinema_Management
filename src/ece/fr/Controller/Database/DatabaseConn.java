package ece.fr.Controller.Database;

import ece.fr.Model.AuthentificatedUser;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConn {
    Connection conn = null;

    public Connection createConnection()
    {
        try
        {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/CinemaDB"; // Enter a database name
            String user      = "root";
            String password  = "root";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);

        }
        catch( Exception e )
        {
            System.out.println("Error Occured " + e.toString());
        }
        return conn;
    }
    
    public ArrayList getUser() throws SQLException {
        ArrayList<AuthentificatedUser> listUser = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from User");
        while (rs.next())
            listUser.add(new AuthentificatedUser(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7)));

        conn.close();
        return listUser;
    }

    public void createUser(String firstName,String name, int age, String email, String password, int type) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        System.out.println("INSERT INTO `User` (`UserID`, `FirstName`, `LastName`, `Age`, `Email`, `Password`, `Type`) VALUES (NULL, '"+ firstName +"', '"+ name +"', '"+ age +"', '"+ email +"', '"+ password +"', '"+ type +"')");
        int rs = stmt.executeUpdate("INSERT INTO `User` (`UserID`, `FirstName`, `LastName`, `Age`, `Email`, `Password`, `Type`) VALUES (NULL, '"+ firstName +"', '"+ name +"', '"+ age +"', '"+ email +"', '"+ password +"', '"+ type +"')");
        conn.close();
    }

    /*
     * TODO update methods
     */
}
