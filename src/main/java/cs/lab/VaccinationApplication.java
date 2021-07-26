package cs.lab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Random;

public class VaccinationApplication {
    
    static final Logger logger = Logger.getLogger(VaccinationApplication.class.getName());
    static final Random rand = new Random();
    private static VaccinationApplication instance;
    ArrayList<VaccinationCenter> vaccinationCenters;

    VaccinationApplication(){
        //DEFAULT CONSTRUCTOR
    }

    public static VaccinationApplication getInstance(){
        if(instance == null){
            instance = new VaccinationApplication();
        }
        return instance;
    }
    
    public boolean userLogin(Scanner scan){
        logger.info("Log In:");
        logger.info("Username:");
        String username = scan.nextLine();
        logger.info("Password:");
        String password = scan.nextLine();
        scan.close();

        if (username != null && password != null){
            String passwordCheck = reverseString(password);
            if (username.equals(passwordCheck)){
                logger.info("Log In successfull");
                Person person = new Person();
                person.setName(username);
                person.setLastname("");
                person.setAge(randomAge());
                person.setDni(randomDni());
                return true;
            }
        }
        logger.info("Log In fail");
        return false;
    }

    //It will release a VaccinationCenter 
    public void release(Integer centerId){
        
    }

    //It will put on hold a VaccinationCenter
    public void hold(Integer centerId){

    }

    public void notify(Person person){

    }

    public static String reverseString(String word){
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        sb.reverse();
        return sb.toString();
    }

    public static String randomAge(){
        Integer age = rand.nextInt(120);
        return age.toString();
    }

    public static String randomDni(){
        Integer dni = rand.nextInt(99999999);
        return dni.toString();
    }
}
