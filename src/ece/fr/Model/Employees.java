package ece.fr.Model;

public class Employees extends AuthentificatedUser{


    Employees(int uID,String gender, String fN, String name, int age, String email, String password, int type) {
        super( uID,gender, fN, name, age, email, password, type);
    }
}
