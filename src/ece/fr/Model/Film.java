package ece.fr.Model;

import java.util.Date;

public class Film {
    private int filmID;
    private String name;
    private String gender;
    private String description;
    private int priceGuest;
    private int priceRegular;
    private int priceChildren;
    private int priceSenior;
    private Date releaseDate;
    private String pathPoster;
//Film Constructor
    public Film(int filmID, String name, String gender, String description, Date releaseDate){
        this.filmID = filmID;
        this.gender = gender;
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.priceGuest = 12;
        this.priceChildren = 7;
        this.priceRegular = 10;
        this.priceSenior = 9;

    }
    public Film (int filmID,String name,String gender, String description,int priceChildren,int priceGuest,int priceRegular,int priceSenior,Date releaseDate,String pathPoster){
        this.filmID = filmID;
        this.gender = gender;
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.priceGuest = priceGuest;
        this.priceChildren = priceChildren;
        this.priceRegular = priceRegular;
        this.priceSenior = priceSenior;
        this.pathPoster = pathPoster;

    }
//Date get
    public Date getReleaseDate() {
        return releaseDate;
    }
//Price cheldren geter
    public int getPriceChildren() {
        return priceChildren;
    }

    public int getPriceGuest() {
        return priceGuest;
    }

    public int getPriceRegular() {
        return priceRegular;
    }

    public int getPriceSenior() {
        return priceSenior;
    }

    public String getDescription() {
        return description;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Date getDate () {return releaseDate;}

    public String getPathPoster() { return pathPoster; }

    public void setPriceChildren(int priceChildren) {
        this.priceChildren = priceChildren;
    }

    public void setPriceGuest(int priceGuest) {
        this.priceGuest = priceGuest;
    }

    public void setPriceRegular(int priceRegular) {
        this.priceRegular = priceRegular;
    }

    public void setPriceSenior(int priceSenior) {
        this.priceSenior = priceSenior;
    }
}
