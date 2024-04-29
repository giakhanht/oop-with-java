/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivevsreference;

/**
 *
 * @author Administrator
 */
public class ValueChangeMethods {
    /*
We're going to pass in a primitive data in one method
and reference data in another to see whehter each type of data changes
after being processed in the methods.
    */
    public void passPrimitive(int primitivePara) {
        primitivePara = 10;
        System.out.println("Primi data type value inside method: " + primitivePara);
    }
    
    public void passReference(int[] referencePara) {
        referencePara[0] = 555;
        System.out.println("Ref data type index 0 value inside method: " + referencePara[0]);
    }
}
