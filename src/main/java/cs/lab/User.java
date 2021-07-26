package cs.lab;

import java.util.Scanner;
import java.util.logging.Logger;
import java.security.SecureRandom;

public class User {
    static String username;
    static String password;
    static Boolean status;

    static final Logger logger = Logger.getLogger(User.class.getName());
    private static SecureRandom rand = new SecureRandom();

    User() {
        // DEFAULT CONSTRUCTOR
    }

    public static boolean userLogin(Scanner scan, Boolean success) {
        while (Boolean.TRUE.equals(success)) {
            logger.info("Log In:");
            logger.info("Username:");
            username = scan.nextLine();
            logger.info("Password:");
            password = scan.nextLine();
            scan.close();

            if (username != null && password != null) {
                String passwordCheck = reverseString(password);
                if (username.equals(passwordCheck)) {
                    logger.info("Log In successfull");
                    status = true;
                    Person person = new Person();
                    person.setName(username);
                    person.setLastname("");
                    person.setAge(randomAge());
                    person.setDni(randomDni());
                    return true;
                }
            }
            else{
                logger.info("Log In fail");
                status = false;
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String word) {
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        sb.reverse();
        return sb.toString();
    }

    public static String randomAge() {
        Integer age = rand.nextInt(120);
        return age.toString();
    }

    public static String randomDni() {
        Integer dni = rand.nextInt(99999999);
        return dni.toString();
    }
}
