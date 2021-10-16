package jc_dz4;

import java.util.HashMap;

public class PhoneBook {

    /*private String surname;
    private String number;

    public PhoneBook(String surname, String number) {
        this.surname = surname;
        this.number = number;
    }

    public String getSurname() {
         return surname;
    }
    public void setSurname(String surname) {
         this.surname = surname;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }*/

    HashMap<String, String> citizen = new HashMap<>();

    public String get(String surname) {
        return citizen.get(surname);
    }

    public void add(String surname, String number) {
        citizen.put(surname,number);
    }

    public void info() {
        System.out.println(citizen);
    }

}
