package com.hillcrest.chapter11.data;

import com.hillcrest.chapter10.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataAnalyzer {

    public static void main(String[] args) throws BadDataException {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        String fileName = console.next();
        boolean valid = false;

        while (!valid) {
            try (Scanner in = new Scanner(new File(fileName))) {
                if (!in.hasNextInt()) {
                    throw new BadDataException("Count expected");
                }
                int count = in.nextInt();
                DataSet set = new DataSet(count);
                while (in.hasNextDouble()) {
                    set.addItem(in.nextDouble());
                }
                System.out.print("Average value is: " + set.average());
                valid = true;

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                System.out.print("Please enter the file name: ");
                fileName = console.next();
            } catch (BadDataException e) {
                System.out.println("Bad Data File");
                System.out.println(e.getMessage());
                System.out.println("Please enter the file name: ");
                fileName = console.next();

            }
        }

        System.out.println("Finished");


    }

}
