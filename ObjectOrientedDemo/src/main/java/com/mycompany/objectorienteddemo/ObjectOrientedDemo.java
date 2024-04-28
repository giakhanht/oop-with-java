/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorienteddemo;

/**
 *
 * @author Administrator
 */
public class ObjectOrientedDemo {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Peter");
        staff1.setHoursWorked(160);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);
        
        Staff staff2 = new Staff("James", "Lee");
        staff2.setHoursWorked(300);
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);
        
        //Error test case
        System.out.println("\nUpdating James' hours of work to -10");
        staff2.setHoursWorked(-10);
        
        System.out.println("Hours Jame worked: " + staff2.getHoursWorked());
        
        System.out.println("Pay = " + staff2.calculatePay());
        
    }
}
