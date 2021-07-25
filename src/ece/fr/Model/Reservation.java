package ece.fr.Model;

import javafx.collections.ObservableList;

import java.util.Date;

/**
 * The type Reservation.
 */
public class Reservation {
    /**
     * The Tot price.
     */
    int totPrice;
    /**
     * The Film.
     */
    Film film;
    /**
     * The Session.
     */
    Session session;
    /**
     * The Date.
     */
    Date date;
    /**
     * The Number children.
     */
    int numberChildren;
    /**
     * The Number standard.
     */
    int numberStandard;
    /**
     * The Number senior.
     */
    int numberSenior;
    /**
     * The Number guest.
     */
    int numberGuest;

    /**
     * Instantiates a new Reservation.
     *
     * @param totPrice       the tot price
     * @param film           the film
     * @param session        the session
     * @param date           the date
     * @param numberChildren the number children
     * @param numberStandard the number standard
     * @param numberSenior   the number senior
     * @param numberGuest    the number guest
     */
    public Reservation(int totPrice, Film film,Session session, Date date, int numberChildren, int numberStandard, int numberSenior, int numberGuest) {
        this.totPrice = totPrice;
        this.film = film;
        this.session = session;
        this.date = date;
        this.numberChildren = numberChildren;
        this.numberStandard = numberStandard;
        this.numberSenior = numberSenior;
        this.numberGuest = numberGuest;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Gets film.
     *
     * @return the film
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Gets number children.
     *
     * @return the number children
     */
    public int getNumberChildren() {
        return numberChildren;
    }

    /**
     * Gets number guest.
     *
     * @return the number guest
     */
    public int getNumberGuest() {
        return numberGuest;
    }

    /**
     * Gets number senior.
     *
     * @return the number senior
     */
    public int getNumberSenior() {
        return numberSenior;
    }

    /**
     * Gets number standard.
     *
     * @return the number standard
     */
    public int getNumberStandard() {
        return numberStandard;
    }

    /**
     * Gets tot price.
     *
     * @return the tot price
     */
    public int getTotPrice() {
        return totPrice;
    }

    /**
     * Gets session.
     *
     * @return the session
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Sets film.
     *
     * @param film the film
     */
    public void setFilm(Film film) {
        this.film = film;
    }

    /**
     * Sets number children.
     *
     * @param numberChildren the number children
     */
    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }

    /**
     * Sets number guest.
     *
     * @param numberGuest the number guest
     */
    public void setNumberGuest(int numberGuest) {
        this.numberGuest = numberGuest;
    }

    /**
     * Sets number senior.
     *
     * @param numberSenior the number senior
     */
    public void setNumberSenior(int numberSenior) {
        this.numberSenior = numberSenior;
    }

    /**
     * Sets number standard.
     *
     * @param numberStandard the number standard
     */
    public void setNumberStandard(int numberStandard) {
        this.numberStandard = numberStandard;
    }

    /**
     * Sets tot price.
     *
     * @param totPrice the tot price
     */
    public void setTotPrice(int totPrice) {
        this.totPrice = totPrice;
    }

    /**
     * Sets session.
     *
     * @param session the session
     */
    public void setSession(Session session) {
        this.session = session;
    }
}
