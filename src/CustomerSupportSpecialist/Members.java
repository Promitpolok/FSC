/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerSupportSpecialist;

/**
 *
 * @author User
 */

public class Members {
    private String name;
    private int memberId;
    private double annualFee;

    public Members(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public Members(int parseInt, String text, String value, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public double getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(double annualFee) {
        this.annualFee = annualFee;
    }

    public void display() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
        System.out.println("Annual Fee: $" + annualFee);
    }

    // Abstract method to be implemented by subclasses
    public void membershipBenefits(){
        
    }
}
