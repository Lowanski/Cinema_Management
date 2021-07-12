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

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
