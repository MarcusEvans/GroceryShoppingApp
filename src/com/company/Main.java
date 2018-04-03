package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("\nHello Grocery Shopping App\n");

        Random rand = new Random();

        GroceryItem groceries = new GroceryItem(LocalDate.now(), "Eggs", rand.nextInt(5) + 1);
        System.out.println(groceries);


        ArrayList<String> groceryItems = new ArrayList<>();
        ArrayList<ArrayList<String>> randomGrocery = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(10)+1; i++) {
            groceryItems.add("Milk");
            groceryItems.add("Eggs");
            groceryItems.add("Ham");
        }


        //TODO Writer recent purchases to a file
        ArrayList<GroceryItem> groceryFile = fileWriter(10,"GroceryList.txt");
        System.out.println(groceryFile);




        //TODO * How many items were purchased during the last visit to the grocery store?

        //TODO * What is the total price of items purchased on date [D]?

        //TODO * How many times was [A] purchased? For example, if A is eGGs then the above sample item should be counted.

        //TODO * What items were purchased that cost more than $10?



    }

    private static ArrayList<GroceryItem> fileWriter(int xAmount, String Filename) {
        Random rand = new Random();
        ArrayList<GroceryItem> list = new ArrayList<>();
        for (int i = 0; i < xAmount; i++) {
            GroceryItem object = new GroceryItem(LocalDate.now(), "Eggs", rand.nextInt(5) + 1);
            list.add(object);
        }
        File outfile = new File(Filename);
        try (PrintWriter pw = new PrintWriter(outfile)) {
            for (int i = 0; i < xAmount; i++) {
                ArrayList<GroceryItem> fileOutput = list;
                pw.println(list);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}