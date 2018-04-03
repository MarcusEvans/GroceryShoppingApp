package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nHello Grocery Shopping App\n");


        GroceryItem groceries = new GroceryItem();

        Random rand = new Random();

        ArrayList<String> groceryItems = new ArrayList<>();
        groceryItems.add("Milk");
        groceryItems.add("Eggs");
        groceryItems.add("Ham");

        System.out.println(groceryItems);




    }
}
