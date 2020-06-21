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


