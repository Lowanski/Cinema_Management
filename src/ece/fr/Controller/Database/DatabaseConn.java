package ece.fr.Controller.Database;

import ece.fr.Model.AuthentificatedUser;
import ece.fr.Model.Film;
import ece.fr.Model.Session;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * The type Database conn.
 */
public class DatabaseConn {
    /**
     * The Conn.
     */
    Connection conn = null;

    /**
     * Create connection connection.
     *
     * @return the connection
     */
    public Connection createConnection()
    {
        try
        {
            // db parameters
            //String url       = "jdbc:mysql://localhost:3306/CinemaDB"; // Enter a database name
            String url       = "jdbc:mysql://localhost:3306/cinemadb";
            String user      = "root";
            //String password  = "root";
            String password  = "admin";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);

        }
        catch( Exception e )
        {
            System.out.println("Error Occured " + e.toString());
        }
        return conn;
    }

    /**
     * Gets list of user in database
     *
     * @return an arraylist of user
     * @throws SQLException the sql exception
     */
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

    /**
     * Gets list of film in database
     *
     * @return an arraylist of film
     * @throws SQLException the sql exception
     */
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

    /**
     * Gets a list of link to image.
     *
     * @return an arraylist of link image
     * @throws SQLException the sql exception
     */
    public ArrayList getImage() throws SQLException {
        ArrayList<String> listImage = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from image");
        while (rs.next())
            listImage.add(rs.getString(2));
        return listImage;
    }

    /**
     * Gets a list of sessions for a movie
     *
     * @param IDmovie the id of the movie you want the session related
     * @return the list session related to this movie id
     * @throws SQLException the sql exception
     */
    public ArrayList getListSession(int IDmovie) throws SQLException {
        ArrayList<Session> listSession = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from `session` WHERE `FilmID` = '" + IDmovie + "';");
        while (rs.next())
            listSession.add(new Session(rs.getInt(1),rs.getInt(2),rs.getTimestamp(3),rs.getInt(4),rs.getInt(5)));
        return listSession;
    }

    /**
     * Gets a list of all session
     *
     * @return the list session all
     * @throws SQLException the sql exception
     */
    public ArrayList getListSessionAll() throws SQLException {
        ArrayList<Session> listSession = new ArrayList<>();
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from `session`;");
        while (rs.next())
            listSession.add(new Session(rs.getInt(1),rs.getInt(2),rs.getTimestamp(3),rs.getInt(4),rs.getInt(5)));
        return listSession;
    }

    /**
     * Gets the number of ticket sold for a specify movie
     *
     * @param movieID the movie id
     * @return the number of ticket sold for this movie
     * @throws SQLException the sql exception
     */
    public int getticketsold (int movieID) throws SQLException{
        int ticketsold=0;
        conn = createConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from `session` WHERE `FilmID` = '" + movieID + "';");
        while (rs.next())
            ticketsold=ticketsold+(80-rs.getInt(2));
        return ticketsold;
    }


    /**
     * Create user in database
     *
     * @param gender    the gender
     * @param firstName the first name
     * @param name      the name
     * @param age       the age
     * @param email     the email
     * @param password  the password
     * @param type      the type
     * @throws SQLException the sql exception
     */
    public void createUser(String gender, String firstName,String name, int age, String email, String password, int type) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `User` (`UserID`,`Gender` , `FirstName`, `LastName`, `Age`, `Email`, `Password`, `Type`) VALUES (NULL, '"+ gender +"', '"+ firstName +"', '"+ name +"', '"+ age +"', '"+ email +"', '"+ password +"', '"+ type +"')");
        conn.close();
    }

    /**
     * Create film in database
     *
     * @param name          the name
     * @param gender        the gender
     * @param description   the description
     * @param priceChildren the price children
     * @param priceGuest    the price guest
     * @param priceRegular  the price regular
     * @param priceSenior   the price senior
     * @param releaseDate   the release date
     * @param image         the image
     * @throws SQLException the sql exception
     */
    public void createFilm(String name, String gender, String description, int priceChildren, int priceGuest, int priceRegular, int priceSenior, Date releaseDate, String image)throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `film`(`FilmID`, `Name`, `Gender`, `Description`, `PriceGuest`, `PriceRegular`, `PriceChildren`, `PriceSenior`, `ReleaseDate`,`IDimage`) VALUES (NULL,'"+ name +"', '"+ gender +"', '"+ description +"', '"+ priceGuest +"', '"+ priceRegular +"', '"+ priceChildren +"', '"+ priceSenior +"', '"+releaseDate +"', '"+image +"')");
        conn.close();
    }

    /**
     * Create session in database
     *
     * @param place  the place left
     * @param time   the time
     * @param room   the room
     * @param filmID the film id
     * @throws SQLException the sql exception
     */
    public void createSession (int place, Timestamp time,int room,int filmID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `session` (`SessionID`,`LeftPlace` , `Schedule`, `Room`, `FilmID`) VALUES (NULL, '"+ place +"', '"+ time +"', '"+ room +"', '"+ filmID +"')");
    }

    /**
     * Create booking in database
     *
     * @param userID    the user id
     * @param sessionID the session id
     * @throws SQLException the sql exception
     */
    public void createBooking (int userID,int sessionID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("INSERT INTO `Booking` (`UserID`,`SessionID`) VALUES ('"+ userID +"', '"+ sessionID +"')");
    }


    /**
     * Delete session in database
     *
     * @param sessionID the session id
     * @throws SQLException the sql exception
     */
    public void deleteSession (int sessionID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("DELETE FROM `session` WHERE `SessionID` ='" + sessionID + "';");
    }

    /**
     * Delete movie and related session in database
     *
     * @param movieID the movie id
     * @throws SQLException the sql exception
     */
    public void deleteMovie (int movieID) throws SQLException {
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("DELETE FROM `session` WHERE `FilmID` ='" + movieID + "';");
        int rs1 = stmt.executeUpdate("DELETE FROM `film` WHERE `FilmID` ='" + movieID + "';");

    }


    /**
     * Updateticketprice update the ticket price for a movie in database
     *
     * @param movieID       the movie id
     * @param priceGuest    the price guest
     * @param priceRegular  the price regular
     * @param priceChildren the price children
     * @param priceSenior   the price senior
     * @throws SQLException the sql exception
     */
    public void updateticketprice (int movieID,int priceGuest,int priceRegular,int priceChildren,int priceSenior)throws SQLException{
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("UPDATE `film` SET `PriceGuest`='"+ priceGuest+"',`PriceRegular`='"+ priceRegular+"',`PriceChildren`='"+ priceChildren+"',`PriceSenior`='"+ priceSenior+"' WHERE `FilmID`='" + movieID + "';");
        //ResultSet rs = stmt.executeQuery("UPDATE `film` SET `PriceGuest` = '"+ priceGuest +"', `PriceRegular` = '"+ priceRegular +"', `PriceChildren`= '"+ priceChildren +"', `PriceSenior`= '"+ priceSenior +"' WHERE `FilmID` = '" + movieID + "';");
    }

    /**
     * Update session left place in database
     *
     * @param sessionID    the session id
     * @param newLeftPlace the new left place
     * @throws SQLException the sql exception
     */
    public void updateSessionLeftPlace (int sessionID,int newLeftPlace)throws SQLException{
        conn = createConnection();
        Statement stmt = conn.createStatement();
        int rs = stmt.executeUpdate("UPDATE `Session` SET `LeftPlace`='"+ newLeftPlace+"' WHERE `SessionID`='" + sessionID + "';");
        //ResultSet rs = stmt.executeQuery("UPDATE `film` SET `PriceGuest` = '"+ priceGuest +"', `PriceRegular` = '"+ priceRegular +"', `PriceChildren`= '"+ priceChildren +"', `PriceSenior`= '"+ priceSenior +"' WHERE `FilmID` = '" + movieID + "';");
    }

    /*
     * TODO update methods
     */
}
