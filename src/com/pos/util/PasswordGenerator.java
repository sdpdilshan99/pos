package com.pos.util;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordGenerator {

    public static String hash(String passwordTxt) {
        return BCrypt.hashpw(passwordTxt, BCrypt.gensalt());
    }

    public static boolean check(String passwordTxt, String hashedPassword) {
        return BCrypt.checkpw(passwordTxt, hashedPassword);


    }

}





