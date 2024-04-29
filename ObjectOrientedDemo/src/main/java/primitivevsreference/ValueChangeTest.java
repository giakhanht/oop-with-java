/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivevsreference;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class ValueChangeTest {
    public static void main(String[] args) {
        //We test the values before-after being processed by methods
        ValueChangeMethods obj = new ValueChangeMethods();
        
        int number = 15;
        System.out.println("Before: " + number);
        obj.passPrimitive(number);
        System.out.println("After: " + number);
        
        System.out.println("\n\n");
        
        int[] numArray = {1,2,3,4,5};
        System.out.println("Before: " + numArray[0]);
        obj.passReference(numArray);
        System.out.println("After: " + numArray[0]);
        System.out.println("Full Array" + Arrays.toString(numArray));
        
        /*
        Reason: passing reference data type variable means passing its address 
        (where the memory contains that variable), thus changes made to the
        ref data type value are permanent.
        Meanwhile, passing primitive data type variable means passing
        only its value.
        */
    }
}
