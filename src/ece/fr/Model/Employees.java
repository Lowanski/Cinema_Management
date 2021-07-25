package ece.fr.Model;

/**
 * The type Employees.
 */
public class Employees extends AuthentificatedUser{


    /**
     * Instantiates a new Employees.
     *
     * @param uID      the u id
     * @param gender   the gender
     * @param fN       the f n
     * @param name     the name
     * @param age      the age
     * @param email    the email
     * @param password the password
     * @param type     the type
     */
    Employees(int uID,String gender, String fN, String name, int age, String email, String password, int type) {
        super( uID,gender, fN, name, age, email, password, type);
    }
}
