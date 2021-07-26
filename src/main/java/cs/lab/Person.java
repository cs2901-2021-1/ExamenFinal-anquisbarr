package cs.lab;

public class Person{
    String name;
    String lastname;
    String age;
    String dni;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    Person(){
        //DEFAULT CONSTRUCTOR
    }

    Person(String name, String lastname, String age, String dni){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.dni = dni;
    }



}