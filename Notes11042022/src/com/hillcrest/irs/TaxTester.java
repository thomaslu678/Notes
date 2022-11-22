package com.hillcrest.irs;

import java.util.Scanner;

public class TaxTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        if(!in.hasNextDouble()){
            System.out.println("Invalid value.Must be a floating point number.");
            System.exit(0);
        }


        double income = in.nextDouble();
        System.out.print("Are you married? [Y/N] ");
        String maritalStatus = in.nextLine();

        int status;
        // Verbose way
        if(maritalStatus.equals("Y")){
            status = Tax.MARRIED;
        }
//        else if(){
//            status = Tax.SINGLE;
//        }
//        else{
//            System.out.println("Not a valid marital status.");
//            return;
//        }

        // Ternary operator
        int ternaryStatus = maritalStatus.equals("Y")
                ? Tax.MARRIED
                : Tax.SINGLE;

        // Java 10
        var taxReturn = new Tax(ternaryStatus, income);
        System.out.printf("Your tax bill is $%.2f", taxReturn.getTax());

    }

}
