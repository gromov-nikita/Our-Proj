package models;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Date date;
    public Date getDate() {
        return date;
    }
    public Person(String name, String lastName) throws IOException {
        this.name = name;
        this.lastName = lastName;
        date = new GregorianCalendar().getTime();
        email = //  name + lastName + new Random().nextInt(100) + Parser.getProperty("mail");

        password = new BigInteger(50, new SecureRandom()).toString(32);
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Person: \n" +
                "  name: " + name + '\n' +
                "  lastName: " + lastName + '\n' +
                "  email: " + email + '\n' +
                "  password: " + password + '\n' +
                "  date: " + date + '\n';
    }
}
