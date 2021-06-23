package ece.fr.Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    Connection conn = null;


    public Connection createConnection()
    {

        try
        {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/"; // Enter a database name
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

    /*
    * TODO create methods
    */

    /*
     * TODO update methods
     */
}
