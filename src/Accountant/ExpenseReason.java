/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accountant;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class ExpenseReason implements Serializable{
    private String spendReason;
    private float amount;
    private LocalDate date;

    public ExpenseReason(String spendReason, float amount, LocalDate date) {
        this.spendReason = spendReason;
        this.amount = amount;
        this.date = date;
    }

    public String getSpendReason() {
        return spendReason;
    }

    public void setSpendReason(String spendReason) {
        this.spendReason = spendReason;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "spendReason=" + spendReason + ", amount=" + amount + ", date=" + date ;
    }

    
    
}
