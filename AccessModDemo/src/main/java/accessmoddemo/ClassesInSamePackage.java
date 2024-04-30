/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessmoddemo;

/**
 *
 * @author Administrator
 */
public class ClassesInSamePackage {
    //Just an empty class
}

// Class A is a Derived class from/of AccessModDemo
class ClassA extends AccessModDemo {
    public void printMessages() {
        //Accessing these fields is okay
        System.out.println("Public int: " + publicNum);
        System.out.println("Protected int: " + protectedNum);
        System.out.println("Package-private int: " + packagePrivateNum);
        //Accessing this field is Not okay
        System.out.println("Private int: " + privateNum);
    }
    
// Class B is not a derived class, simply another class in the same package
// Therefore we need to create an object for class AccessModDemo
class ClassB {
    public void printMessages() {
        AccessModDemo obj = new AccessModDemo();
        
        // These are okay
        System.out.println("Public int: " + obj.publicNum);
        System.out.println("Protected int: " + obj.protectedNum);
        System.out.println("Package-private int: " + obj.packagePrivateNum);
        // This is not okay again
        System.out.println("Private int: " + obj.privateNum);
        
    }
}
    
}