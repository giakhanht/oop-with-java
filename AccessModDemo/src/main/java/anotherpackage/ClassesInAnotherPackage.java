/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotherpackage;
import accessmoddemo.AccessModDemo;
/**
 *
 * @author Administrator
 */
public class ClassesInAnotherPackage {
    //Just another empty class
}

class ClassC extends AccessModDemo {
    public void printMessages() {
        //These are OK
        System.out.println("Public int: " + publicNum);
        System.out.println("Protected int: " + protectedNum);
        //These are Not OK
        System.out.println("Package-private int: " + packagePrivateNum);
        System.out.println("Private int: " + privateNum);
    }
}
class ClassD {
    public void printMessages() {
        AccessModDemo obj = new AccessModDemo();
        //These are OK
        System.out.println("Public int: " + obj.publicNum);
        //These are Not OK
        System.out.println("Protected int: " + obj.protectedNum);
        System.out.println("Protected int: " + obj.protectedNum);
        System.out.println("Protected int: " + obj.protectedNum);
    }
}
