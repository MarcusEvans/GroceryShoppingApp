package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class GroceryItem {


    private LocalDate date;
    public String description;
    private int numberOfItems;



    public GroceryItem(LocalDate date, String description, int numberOfItems) {
        this.date = date;
        this.description = description;
        this.numberOfItems = numberOfItems;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = LocalDate.now().minusDays(1);
    }

    public ArrayList<ArrayList<String>> getDescription() {
        Random rand = new Random();
        ArrayList<String> groceries = new ArrayList<>();
        ArrayList<ArrayList<String>> randomGrocery = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            groceries.add("Ham");
            groceries.add("Milk");
            groceries.add("Eggs");
        }
        for (int i = 0; i < groceries.size(); i++) {
            int num = rand.nextInt(3)+1;
            if (groceries.get(i).equals(num)){
                randomGrocery.add(groceries);
            }
        }
        return randomGrocery;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        Random random =new Random();
        this.numberOfItems = random.nextInt(5)+1;
    }

    @Override
    public String toString() {
        return  date + "|" +  description + "|" + numberOfItems + "\n";
    }
}
