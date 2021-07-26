package cs.lab;

import java.util.ArrayList;

public class VaccinationApplication {
    
    private static VaccinationApplication instance;
    ArrayList<VaccinationCenter> vaccinationCenters;

    private VaccinationApplication(){
        vaccinationCenters = new ArrayList<>();
    }
    
    public static synchronized VaccinationApplication getInstance(){
        if(instance == null){
            instance = new VaccinationApplication();
        }
        return instance;
    }
    

    //It will release a VaccinationCenter 
    public void release(Integer centerId){

    }

    //It will put on hold a VaccinationCenter
    public void hold(Integer centerId){

    }

    public void notify(Person person){
        
    }
}
