package ece.fr.Model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Session {
    private Timestamp timestamp;
    private String time;
    private String date;
    private int leftPlaces;
    private int IDsession;
    private int IDfilm;
    private int room;


    public Session (int IDsession,int leftPlaces,Timestamp timestamp,int room,int IDfilm){
        this.timestamp=timestamp;
        this.time= timestamp.toString().substring(11);
        this.date= timestamp.toString().substring(0,9);
        this.leftPlaces=leftPlaces;
        this.IDfilm=IDfilm;
        this.IDsession=IDsession;
        this.room=room;
    }

    public int getIDsession() {
        return IDsession;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getRoom() {
        return room;
    }

    public int getLeftPlaces() {
        return leftPlaces;
    }
    @Override
    public String toString(){
        return String.valueOf(IDsession);
    }
}
