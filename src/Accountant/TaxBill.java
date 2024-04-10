/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accountant;

/**
 *
 * @author USER
 */
public class TaxBill { 
    private String status; 
    private float income,unitTax; 

    public TaxBill(String status, float income, float unitTax) {
        this.status = status;
        this.income = income;
        this.unitTax = unitTax;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getUnitTax() {
        return unitTax;
    }

    public void setUnitTax(float unitTax) {
        this.unitTax = unitTax;
    }

    public float getTaxBillAmount(){
       float taxBillAmount =(unitTax*income)/100f;
        return taxBillAmount;
    
    }

    @Override
    public String toString() {
        return "Status=  " + status +"\n"+ "Income=" + income +"  BDT"+ "\n"+ "UnitTax=  " + unitTax +"%"+ "\n"+"Total Tax Bill  "+ getTaxBillAmount()+"  BDT";
    }

    
    
}
