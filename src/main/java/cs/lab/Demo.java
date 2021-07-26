package cs.lab;

import java.util.Scanner;
import java.util.logging.Logger;
public class Demo {
    static final Logger logger = Logger.getLogger(Demo.class.getName());
    static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args){
        logger.info("PC Template");
        VaccinationApplication.getInstance().userLogin(scan);    
    }    
}
    