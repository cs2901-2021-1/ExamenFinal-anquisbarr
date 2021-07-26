package cs.lab;

import java.util.logging.Logger;
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.Test;

class DemoTest {
    static final Logger logger = Logger.getLogger(DemoTest.class.getName());
    static final Scanner scan = new Scanner(System.in);

    @Test
    void checkPassword(){
        String username = "anquisbarr";
        String password = "rrabsiuqna";
        String check = VaccinationApplication.reverseString(username);
        Assert.assertEquals(password,check);
    }
};