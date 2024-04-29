/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author Administrator
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        /*
        NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);
        
        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();
        
        mem1.displayMemInfo();
        mem2.displayMemInfo();
        
        //Test set discount for mem1 Normal member
        System.out.println("\n");
        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();
        */
        
        /*
        Create an array of Member class and assign objects of 
        NormalMember and VIPMember child classes to it.
        */
        Member[] clubMembers = new Member[6];
        
        clubMembers[0] = new NormalMember("James", 1, 2010);
        clubMembers[1] = new NormalMember("Andy", 2, 2011);
        clubMembers[2] = new NormalMember("Bill", 3, 2011);
        clubMembers[3] = new VIPMember("Carol", 4, 2012);
        clubMembers[4] = new VIPMember("Everlyn", 5, 2013);
        clubMembers[5] = new Member("Yvonne", 6, 2014);
        
        //Utilize for statement to calculate pay for each member.
        for (Member m : clubMembers) {
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
    }
    
}
