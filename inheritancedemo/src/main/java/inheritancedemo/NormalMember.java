/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author Administrator
 */
public class NormalMember extends Member {
    //Some child constructors
    public NormalMember() {
        System.out.println("Child Constructor with no parameter");
    }
    //Java automatically calls parent's parameterless constructor if I don't specify otherwise.
    //Use super(arguments) to call a specific parent's constructor with parameters in child constructor.
    public NormalMember(String pname, int pmemid, int pmemsince) {
        super(pname, pmemid, pmemsince);
        
    }
    
    //Overrides the calculatePay() method of the parent
    @Override
    public void calculateAnnualFee() {
        annualFee = (1 - 0.01 * getDiscount()) * (100 + 12 * 30);
    }
}
