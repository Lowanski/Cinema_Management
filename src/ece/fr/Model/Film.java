package ece.fr.Model;

import java.util.Date;

/**
 * The type Film.
 */
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
    private String image;

    /**
     * Instantiates a new Film.
     *
     * @param filmID      the film id
     * @param name        the name
     * @param gender      the gender
     * @param description the description
     * @param releaseDate the release date
     * @param image       the image
     */
//Film Constructor
    public Film(int filmID, String name, String gender, String description, Date releaseDate, String image){
        this.filmID = filmID;
        this.gender = gender;
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        String pathImage = "Ressources/Films/"+image;
        this.image= pathImage;
        this.priceGuest = 12;
        this.priceChildren = 7;
        this.priceRegular = 10;
        this.priceSenior = 9;

    }

    /**
     * Instantiates a new Film.
     *
     * @param filmID        the film id
     * @param name          the name
     * @param gender        the gender
     * @param description   the description
     * @param priceChildren the price children
     * @param priceGuest    the price guest
     * @param priceRegular  the price regular
     * @param priceSenior   the price senior
     * @param releaseDate   the release date
     * @param image         the image
     */
    public Film (int filmID,String name,String gender, String description,int priceChildren,int priceGuest,int priceRegular,int priceSenior,Date releaseDate, String image){
        this.filmID = filmID;
        this.gender = gender;
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.priceGuest = priceGuest;
        this.priceChildren = priceChildren;
        this.priceRegular = priceRegular;
        this.priceSenior = priceSenior;
        String pathImage = "Ressources/Films/"+image;
        this.image= pathImage;
    }

    /**
     * Gets release date.
     *
     * @return the release date
     */
//Date get
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Gets price children.
     *
     * @return the price children
     */
//Price cheldren geter
    public int getPriceChildren() {
        return priceChildren;
    }

    /**
     * Gets price guest.
     *
     * @return the price guest
     */
    public int getPriceGuest() {
        return priceGuest;
    }

    /**
     * Gets price regular.
     *
     * @return the price regular
     */
    public int getPriceRegular() {
        return priceRegular;
    }

    /**
     * Gets price senior.
     *
     * @return the price senior
     */
    public int getPriceSenior() {
        return priceSenior;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate () {return releaseDate;}

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getID() {
        return filmID;
    }

    /**
     * Sets price children.
     *
     * @param priceChildren the price children
     */
    public void setPriceChildren(int priceChildren) {
        this.priceChildren = priceChildren;
    }

    /**
     * Sets price guest.
     *
     * @param priceGuest the price guest
     */
    public void setPriceGuest(int priceGuest) {
        this.priceGuest = priceGuest;
    }

    /**
     * Sets price regular.
     *
     * @param priceRegular the price regular
     */
    public void setPriceRegular(int priceRegular) {
        this.priceRegular = priceRegular;
    }

    /**
     * Sets price senior.
     *
     * @param priceSenior the price senior
     */
    public void setPriceSenior(int priceSenior) {
        this.priceSenior = priceSenior;
    }
    @Override
    public String toString(){ //The ChoiceBOX element use natively the tostring methode to display the name of the object added
        return name;
    }
}
