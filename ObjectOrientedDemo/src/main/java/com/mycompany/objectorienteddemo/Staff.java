/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorienteddemo;

/**
 *
 * @author Administrator
 */
public class Staff {
    //Fields - variables
    private String nameOfStaff;
    private final int hourlyRate=30;
    private int hoursWorked;
    
    //Methods - code blocks that perform certain tasks - with parameters
    // void means this method doesn't return any result
    public void printMessage() {
        System.out.println("Calculating Pay...");
    }
    
    public int calculatePay() {
        printMessage();
        
        int staffPay;
        staffPay = hourlyRate * hoursWorked;
        
        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }
    
    //Same name, but different signature caculatePay() vs calculatePay(int...)
    public int calculatePay(int bonus, int allowance) {
        printMessage();
        
        if (hoursWorked > 0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else
            return 0;
    }
    
    /*
    Allowing & Placing certain Restrictions for other classes
    when accessing this class's fields
    using setters and getters
    */
    public void setHoursWorked(int hours) {
        if (hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("Error: Hours of Work Can Not be Smaller than 0");
            System.out.println("Error: Hours of Work is not updated");
        }
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }
    
    /*
    Constructors - similar to method - but do not return value
    Used to create objects from class template
    Always have the same name as the class
    */
    public Staff(String name) {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------");
    }
    
    public Staff(String firstName, String lastName) {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------");
    }
}
