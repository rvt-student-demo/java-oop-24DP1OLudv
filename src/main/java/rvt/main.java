package rvt;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class main {
    public static void main(String[] args) {
        test();
        
    }

    public static void test() {

        try (Scanner reader = new Scanner(new File("data/data.csv"))){
        
        while(reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }

        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
    }
    



}
