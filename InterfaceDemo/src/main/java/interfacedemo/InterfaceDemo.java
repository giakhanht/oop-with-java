/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacedemo;

/**
 *
 * @author Administrator
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();
        System.out.println("The value of the constant is: " + MyInterface.myInt);
        
        MyInterface.someStaticMethod();
        a.someDefaultMethod();
    }
}

class MyClass implements MyInterface {
    @Override
    public void someMethod() {
        System.out.println("This is a method implemented in MyClass");
    }
}

interface MyInterface {
    int myInt = 5;
    //This is an abstract interface
    //Every abstract methods delcared inside interface must be implemented by the class
    void someMethod();
    
    //From Java 8 onwards we can implement static and default methods in interfaces
    //Reason: to ensure binary compatibility
    public static void someStaticMethod() {
        System.out.println("This is a static method in an interface");
    }    
    public default void someDefaultMethod() {
        System.out.println("This is a default method in an interface");
    }
}