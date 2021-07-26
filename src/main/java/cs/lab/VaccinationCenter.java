package cs.lab;

import java.util.ArrayList;

public class VaccinationCenter{
    Integer centerId;
    ArrayList<Person> vaccinationList;
    Boolean status;
    
    VaccinationCenter(){
        //DEFAULT CONSTRUCTOR
    }   
    
    public void addPersonVaccination(Person person) throws IllegalArgumentException{
        if (!vaccinationList.contains(person)){
            vaccinationList.add(person);
            VaccinationApplication.getInstance().notify(person);
        }else{
            throw new IllegalArgumentException("Person already exists in the Vaccination List");
        }    
    }
}