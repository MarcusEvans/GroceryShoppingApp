package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class GroceryItem {


    private LocalDate date;
    public String groceryItem;
    private int numberOfItems;



    public GroceryItem(LocalDate date, String groceryItems, int numberOfItems) {
        this.date = date;
        this.groceryItems = groceryItems;
        this.numberOfItems = numberOfItems;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = LocalDate.now().minusDays(1);
    }

    public String getGroceryItem() {
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
