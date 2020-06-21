//*
//Have to create an arrayList to add customer information
//Have to add print Cust method
//*
package edu.psu.abington.ist.ist242;
import java.util.*;
public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;
    private String customerAddress;

    public Customer() {

    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String _customerName) {
        this.customerName = _customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String _customerPhoneNumber) {
        this.customerPhoneNumber = _customerPhoneNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void customerRecord(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to add a Customer or Remove a Customer: ");

        if(input.nextLine().equals("Add")){
            System.out.print("Enter you name: ");
            setCustomerName(input.nextLine());
            System.out.print("Enter you ID: ");
            setCustomerId(input.nextInt());
            input.nextLine();
            System.out.print("Enter you Phone: ");
            setCustomerPhoneNumber(input.nextLine());
            System.out.print("Enter you Address: ");
            setCustomerAddress(input.nextLine());
        }else{
            //
        }
    }
}
