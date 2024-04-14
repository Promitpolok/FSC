/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerSupportSpecialist;

/**
 *
 * @author User
 */
public class PlatinumMember extends Members {
    public PlatinumMember(String name, int memberId) {
        super(name, memberId);
        setAnnualFee(1700.0); // Set the annual fee for platinum members
    }

    @Override
    public void membershipBenefits() {
        System.out.println("Platinum member benefits: Premium support and exclusive deals.");
    }
}
