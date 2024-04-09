/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Digital_Marketing_Excutive;

/**
 *
 * @author USER
 */
public class AdsHelper {
    private String productname;
    private Integer price,discount;

    public AdsHelper(String productname, Integer price, Integer discount) {
        this.productname = productname;
        this.price = price;
        this.discount = discount;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public int getProductPriceNow(){
        int productPriceNow=(price-discount);
        return productPriceNow;
    }

    @Override
    public String toString() {
        return "Productname=" + productname +"\n"+ "Price=" + price +" BDT"+"\n"+ "Discount=" + discount+" BDT" +"\n"+"A Special Price Now "+getProductPriceNow()+" BDT";
    }

    Object getProductName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

