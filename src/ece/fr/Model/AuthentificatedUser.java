package ece.fr.Model;

public class AuthentificatedUser extends User{
    protected String firstName;
    protected String name;
    protected int age;
    protected String email;
    protected String password;
    protected int type;

    public AuthentificatedUser(int uID, String fN, String name, int age, String email, String password, int type){
        super(uID);
        firstName=fN;
        this.name=name;
        this.age=age;
        this.email=email;
        this.password=password;
        this.type=type;
    }
}
