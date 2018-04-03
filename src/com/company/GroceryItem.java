package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class GroceryItem {

    Random rand = new Random();

    private LocalDateTime date;
    public ArrayList<String> ;
    private int numberOfItems;



    public GroceryItem(LocalDateTime date, ArrayList groceryItems, int numberOfItems) {
        date = purchaseDate;
        groceryItems = purchasedItem;
        numberOfItems = amountOfItems;
    }

    public void setDate(LocalDateTime value) {
        date = LocalDateTime.now().minusDays(1);
    }

    public ArrayList<String> getGroceryItem() {
        return groceryItem;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "date=" + date +
                ", groceryItem='" + groceryItem + '\'' +
                ", numberOfItems=" + numberOfItems +
                '}';
    }
}
