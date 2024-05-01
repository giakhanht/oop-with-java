/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonunboxing;

/**
 *
 * @author Administrator
 */
public class AutonUnboxing {
    public static void main(String[] args) {
        //Integer is a wrapper class of int
        //Converting int to Integer object
        //Traditional way: passing int value to Integer class constructor
        Integer intObject = new Integer(100);
        //Autoboxing way:
        Integer intObjec = 100;
        
        //Converting Integer object to int
        //Traditional way: use intValue() method of Integer class
        int intValue = intObject.intValue();
        //Unboxing way:
        int inValu = intObjec;
        
        //Convert strings into primitive types using wrapper class
        String number = "5";
        int stringToInt = Integer.parseInt(number);
        
        String numDouble = "2.34";
        double stringToDouble = Double.parseDouble(numDouble);
        
        System.out.println(stringToDouble);
    }
}
