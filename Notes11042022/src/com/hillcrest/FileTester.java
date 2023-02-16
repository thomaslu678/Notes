package com.hillcrest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTester {

    public static void main(String[] args) throws FileNotFoundException {
        var console = new Scanner(System.in);
        System.out.println("Enter the input file name: ");
        var inputFileName = console.nextLine();
        System.out.println("Enter the name of the output file: ");
        var outputFileName = console.nextLine();

        var inputFile = new File(inputFileName);
        var in = new Scanner(inputFile);
        var out = new PrintWriter(outputFileName);

        double sum = 0;
        int count = 0;
        while(in.hasNextInt()){
            var value = in.nextDouble();
            System.out.println(value);
            sum += value;
            count++;
        }
        out.printf("Total: %8.2f", sum);
        if(count > 0){
            out.printf("Average: %8.2f", (sum/count));
        }
        in.close();
        out.close();

    }

}
