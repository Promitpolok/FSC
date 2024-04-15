/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Digital_Marketing_Excutive;

/**
 *
 * @author USER
 */
public class Ambassador { 
    private String productName,ambassadorName;

    public Ambassador(String productName, String ambassadorName) {
        this.productName = productName;
        this.ambassadorName = ambassadorName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAmbassadorName() {
        return ambassadorName;
    }

    public void setAmbassadorName(String ambassadorName) {
        this.ambassadorName = ambassadorName;
    }

    @Override
    public String toString() {
        return  "ProductName:  " + productName +"\n"+ "s Best Ambassador For This :  " + ambassadorName + '}';
    }
    
    
    
}
