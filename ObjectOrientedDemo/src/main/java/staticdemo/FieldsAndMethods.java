/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticdemo;

/**
 *
 * @author Administrator
 */
class FieldsAndMethods {
    //Non-static fields and methods
    private String message = "Hello World";
    void displayMessage() {
            System.out.println("Your Message: " + message);
    }
    //Static fields and methods
    public static String greeting = "Good Morning!";
    public static void displayGreeting() {
            System.out.println("Your Greeting: " + greeting);
    }
    
    //Include some getters and setters regarding best practices
    public void setMessage(String newMessage) {
        message = newMessage;
    }
    public String getMessage() {
        return message;
    }
}
