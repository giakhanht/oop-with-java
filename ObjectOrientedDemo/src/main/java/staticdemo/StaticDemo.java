package staticdemo;

public class StaticDemo {
    public static void main(String[] args) {
        //For non-static fields&methods, we need to create a FieldsAndMethods object.
        FieldsAndMethods obj = new FieldsAndMethods();
        
        System.out.println("Message: " + obj.getMessage());
        obj.displayMessage();
        
        //For static fields&methods, creating a FieldsAndMethods object is unnecessary.
        System.out.println("Greetings: " + FieldsAndMethods.greeting);
        FieldsAndMethods.displayGreeting();
        
    }
}