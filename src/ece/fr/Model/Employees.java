package ece.fr.Model;

public class Employees extends AuthentificatedUser{


    Employees(int uID, String fN, String name, int age, String email, String password, int type) {
        super(uID, fN, name, age, email, password, type);
    }
}
