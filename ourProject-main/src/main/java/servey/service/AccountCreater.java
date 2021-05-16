package servey.service;

import helpers.Parser;
import models.Org;
import models.Person;
import reposit.StaffRepository;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

public class AccountCreater {
    public static String emailGen(Person p, Org org) throws IOException {
        String email = p.getName() + p.getLastName() + Parser.getProperty("mail");
        for(Person x : org.getStaff().) {

        }
    }
    public static String passwordGen() {
        return new BigInteger(50, new SecureRandom()).toString(32);
    }
}
