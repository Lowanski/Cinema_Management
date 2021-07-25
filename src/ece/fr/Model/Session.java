package ece.fr.Model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 * The type Session.
 */
public class Session {
    private Timestamp timestamp;
    private String time;
    private String date;
    private int leftPlaces;
    private int IDsession;
    private int IDfilm;
    private int room;


    /**
     * Instantiates a new Session.
     *
     * @param IDsession  the dsession
     * @param leftPlaces the left places
     * @param timestamp  the timestamp
     * @param room       the room
     * @param IDfilm     the dfilm
     */
    public Session (int IDsession,int leftPlaces,Timestamp timestamp,int room,int IDfilm){
        this.timestamp=timestamp;
        this.time= timestamp.toString().substring(11);
        this.date= timestamp.toString().substring(0,10);
        this.leftPlaces=leftPlaces;
        this.IDfilm=IDfilm;
        this.IDsession=IDsession;
        this.room=room;
    }

    /**
     * Gets i dsession.
     *
     * @return the i dsession
     */
    public int getIDsession() {
        return IDsession;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * Gets room.
     *
     * @return the room
     */
    public int getRoom() {
        return room;
    }

    /**
     * Gets left places.
     *
     * @return the left places
     */
    public int getLeftPlaces() {
        return leftPlaces;
    }

    /**
     * Gets i dfilm.
     *
     * @return the i dfilm
     */
    public int getIDfilm() {
        return IDfilm;
    }

    @Override
    public String toString(){
        return String.valueOf(IDsession);
    }
}
