package ece.fr.Controller.Database;

import ece.fr.Model.AuthentificatedUser;
import ece.fr.Model.Film;
import ece.fr.Model.Session;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class DatabaseConn {
    Connection conn = null;

    public Connection createConnection()
    {
        try
        {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/CinemaDB"; // Enter a database name
            //String url       = "jdbc:mysql://localhost:3306/cinemadb";
            String user      = "root";
            String password  = "root";
            //String password  = "admin";

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
            listUser.add(new AuthentificatedUser(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8)));

        conn.close();
        return listUser;
    }
    public ArrayList getFilm() throws SQLException {
        ArrayList<Film> listMovies = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from Film LEFT JOIN image ON Film.IDimage = image.IDimage");
        while (rs.next())
            listMovies.add(new Film(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(7), rs.getInt(5),rs.getInt(6),rs.getInt(8),rs.getDate(9),rs.getString(12)));

        conn.close();
        return listMovies;
    }
    public ArrayList getImage() throws SQLException {
        ArrayList<String> listImage = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from image");
        while (rs.next())
            listImage.add(rs.getString(2));
        return listImage;
    }

    public ArrayList getListSession(int IDmovie) throws SQLException {
        ArrayList<Session> listSession = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from `session` WHERE `FilmID` = '" + IDmovie + "';");
        while (rs.next())
            listSession.add(new Session(rs.getInt(1),rs.getInt(2),rs.getTimestamp(3),rs.getInt(4),rs.getInt(5)));
        return listSession;
    }

    public ArrayList getListSessionAll() throws SQLException {
        ArrayList<Session> listSession = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from `session`;");
        while (rs.next())
            listSession.add(new Session(rs.getInt(1),rs.getInt(2),rs.getTimestamp(3),rs.getInt(4),rs.getInt(5)));
        return listSession;
    }



    public void createUser(String gender, String firstName,String name, int age, String email, String password, int type) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `User` (`UserID`,`Gender` , `FirstName`, `LastName`, `Age`, `Email`, `Password`, `Type`) VALUES (NULL, '"+ gender +"', '"+ firstName +"', '"+ name +"', '"+ age +"', '"+ email +"', '"+ password +"', '"+ type +"')");
        conn.close();
    }
    public void createFilm(String name, String gender, String description, int priceChildren, int priceGuest, int priceRegular, int priceSenior, Date releaseDate, String image)throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `film`(`FilmID`, `Name`, `Gender`, `Description`, `PriceGuest`, `PriceRegular`, `PriceChildren`, `PriceSenior`, `ReleaseDate`,`IDimage`) VALUES (NULL,'"+ name +"', '"+ gender +"', '"+ description +"', '"+ priceGuest +"', '"+ priceRegular +"', '"+ priceChildren +"', '"+ priceSenior +"', '"+releaseDate +"', '"+image +"')");
        conn.close();
    }
    public void createSession (int place, Timestamp time,int room,int filmID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `session` (`SessionID`,`LeftPlace` , `Schedule`, `Room`, `FilmID`) VALUES (NULL, '"+ place +"', '"+ time +"', '"+ room +"', '"+ filmID +"')");
    }

    public void createBooking (int userID,int sessionID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `Booking` (`UserID`,`SessionID`) VALUES ('"+ userID +"', '"+ sessionID +"')");
    }





    public void deleteSession (int sessionID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("DELETE FROM `session` WHERE `SessionID` ='" + sessionID + "';");
    }
    public void deleteMovie (int movieID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("DELETE FROM `session` WHERE `FilmID` ='" + movieID + "';");
        int rs1 = stmt.executeUpdate("DELETE FROM `film` WHERE `FilmID` ='" + movieID + "';");

    }
}
