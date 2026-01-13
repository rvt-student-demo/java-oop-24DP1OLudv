package rvt;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Pasutijuma_vesture {
    public static void main(String[] args) {
        nolasitajs();
        
    }

    public static void nolasitajs() {

        try (Scanner reader = new Scanner(new File("data/orders.csv"))){
        
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] dati = line.split(",");

            String name = dati[1];
            String id = dati[0];
            String product = dati[2];
            int quantity = Integer.valueOf(dati[3]);
            double price = Double.valueOf(dati[4]);
            double sum = quantity + price;

            System.out.println(
                "Pasutijums: #" + id + ": " + name + " pasutija " + quantity + " "+  product + " (" + price + ") " + "-> Kopa: " + sum + "EUR"
            );
        }

        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
    }
    



}
