/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerSupportSpecialist;

/**
 *
 * @author User
 */
public class SilverMember extends Members {
    public SilverMember(String name, int memberId) {
        super(name, memberId);
        setAnnualFee(1000.0); // Set the annual fee for silver members
    }

    @Override
    public void membershipBenefits() {
        System.out.println("Silver member benefits: Discounts on select products.");
    }
}
