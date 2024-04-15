/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buyer;

/**
 *
 * @author User
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private ObservableList<String> items;

    public Cart() {
        items = FXCollections.observableArrayList();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }
    
    public void clearCart() {
        items.clear();
    }

    public ObservableList<String> getItems() {
        return items;
    }
}
