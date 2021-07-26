package cs.lab;

import java.util.logging.Logger;
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.Test;

class DemoTest {
    static final Logger logger = Logger.getLogger(DemoTest.class.getName());
    static final Scanner scan = new Scanner(System.in);

    @Test
    void contextLoads(){
        VaccinationApplication.getInstance();
    }

    @Test
    void checkPassword(){
        String username = "anquisbarr";
        String password = "rrabsiuqna";
        String check = User.reverseString(username);
        Assert.assertEquals(password,check);
    }

    @Test
    void createPerson(){
        String age = User.randomAge();
        String dni = User.randomAge();
        Person expected = new Person("anquisbarr","",age,dni);
        Person actual = new Person();

        actual.setName("anquisbarr");
        actual.setLastname("");
        actual.setAge(age);
        actual.setDni(dni);

        Assert.assertEquals(expected.getName(),actual.getName());
        Assert.assertEquals(expected.getLastname(),actual.getLastname());
        Assert.assertEquals(expected.getAge(),actual.getAge());
        Assert.assertEquals(expected.getDni(),actual.getDni());
    }

    
};