/*
Project: Car Design
Purpose Details: Car Dealership Application
Course: IST 242
Team 4
Developed: June 14, 2020
Last date Changed: June 21, 2020
Rev: 1
*/
package edu.psu.abington.ist.ist242;

public class salesPerson {

    private String eName;
    private int eID;
    private int ePhone;

    public salesPerson(){
        //Comming soon
    }
    public salesPerson(String eName, int eID, int ePhone) {
        this.eName = eName;
        this.eID = eID;
        this.ePhone = ePhone;
    }

    public String geteName() {
        return eName;
    }

    public int geteID() {
        return eID;
    }

    public int getePhone() {
        return ePhone;
    }

    public static void salesPersonsRecord(){
        System.out.println("Coming Soon");
    }
}


