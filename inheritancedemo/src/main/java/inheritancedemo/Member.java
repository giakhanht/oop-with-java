/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancedemo;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */

//Abstract methods only exists within agstract classes
abstract public class Member {
    //Some fields
    public String welcome = "Welcome to ABC fitness!";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;
    
    //Some constructors
    public Member() {
        System.out.println("Parent Constructor with no parameter");
    }
    public Member(String pname, int pmemid, int pmemsince) {
        System.out.println("Parent Constructor with 3 parameters");
        name = pname;
        memberID = pmemid;
        memberSince = pmemsince;
    }
    
    //Some setter and getter
    public double getDiscount() {
        return discount;
    }
    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        
        String password;
        System.out.println("Please enter the admin password: ");
        password = input.nextLine();
        
        if (!password.equals("abcd")) {
            System.out.println("You do not have access to input discount");
        }
        else {
           System.out.println("Please enter the discount: ");
           discount = input.nextInt();
        }
    }
    
    //Some methods
    public void displayMemInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }
    
    abstract public void calculateAnnualFee();
}
