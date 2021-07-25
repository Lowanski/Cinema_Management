package ece.fr.Model;

/**
 * User type :
 * 0 = Guest
 * 1 = Children
 * 2 = Regular
 * 3 = Senior
 * 5 = Employee
 */
public class User {
    /**
     * The User id.
     */
    protected int userID;

    /**
     * Instantiates a new User.
     *
     * @param uID the u id
     */
    public User(int uID) {
        userID=uID;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public int getUserID() {
        return userID;
    }
}
