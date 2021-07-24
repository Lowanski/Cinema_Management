package ece.fr.Model;

import java.util.Date;

public class Reservation {
    int totPrice;
    Film film;
    Date date;
    User user;
    int numberChildren;
    int numberStandard;
    int numberSenior;
    int numberGuest;

    public Reservation(int totPrice, Film film, Date date, User user, int numberChildren, int numberStandard, int numberSenior, int numberGuest) {
        this.totPrice = totPrice;
        this.film = film;
        this.date = date;
        this.user = user;
        this.numberChildren = numberChildren;
        this.numberStandard = numberStandard;
        this.numberSenior = numberSenior;
        this.numberGuest = numberGuest;
    }

    public Date getDate() {
        return date;
    }

    public Film getFilm() {
        return film;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public int getNumberGuest() {
        return numberGuest;
    }

    public int getNumberSenior() {
        return numberSenior;
    }

    public int getNumberStandard() {
        return numberStandard;
    }

    public int getTotPrice() {
        return totPrice;
    }

    public User getUser() {
        return user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }

    public void setNumberGuest(int numberGuest) {
        this.numberGuest = numberGuest;
    }

    public void setNumberSenior(int numberSenior) {
        this.numberSenior = numberSenior;
    }

    public void setNumberStandard(int numberStandard) {
        this.numberStandard = numberStandard;
    }

    public void setTotPrice(int totPrice) {
        this.totPrice = totPrice;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
