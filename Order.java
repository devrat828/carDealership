package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }
    public Order(){

    }

    //Setters and Getters
    public int getorderId() {
        return orderId;
    }
    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }
    public static void orderRecords(){
        System.out.println("Coming Soon");
    }

}
