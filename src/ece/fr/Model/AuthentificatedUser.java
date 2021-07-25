package ece.fr.Model;

/**
 * The type Authentificated user.
 */
public class AuthentificatedUser extends User{
    /**
     * The Gender.
     */
    protected String gender;
    /**
     * The First name.
     */
    protected String firstName;
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Age.
     */
    protected int age;
    /**
     * The Email.
     */
    protected String email;
    /**
     * The Password.
     */
    protected String password;
    /**
     * The Type.
     */
    protected int type;

    /**
     * Instantiates a new Authentificated user.
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
    public AuthentificatedUser( int uID, String gender,String fN, String name, int age, String email, String password, int type){
        super(uID);
        this.gender = gender;
        firstName=fN;
        this.name=name;
        this.age=age;
        this.email=email;
        this.password=password;
        this.type=type;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
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
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() { return gender; }
}
