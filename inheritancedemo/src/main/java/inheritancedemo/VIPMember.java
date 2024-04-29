/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author Administrator
 */
public class VIPMember extends Member {
    //Child constructor
    public VIPMember(String pname, int pmemid, int pmemsince) {
        super(pname, pmemid, pmemsince);
        System.out.println("Child Constructor with 3 parameters");
    }
    
    //Overrides parent class's method
    @Override
    public void calculateAnnualFee() {
        annualFee = (1 - 0.01 * getDiscount()) * 1200;
    }
}
