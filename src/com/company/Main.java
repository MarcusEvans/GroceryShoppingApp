package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nHello Grocery Shopping App\n");

        Random rand = new Random();

        GroceryItem groceries = new GroceryItem(LocalDate.now(), "Eggs", rand.nextInt(5) + 1);
        System.out.println(groceries);


        ArrayList<String> groceryItems = new ArrayList<>();
        ArrayList<ArrayList<String>> randomGrocery = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            groceryItems.add("Milk");
            groceryItems.add("Eggs");
            groceryItems.add("Ham");
        }
    }
}