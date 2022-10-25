import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number with a decimal for us to round:");
        double value = in.nextDouble();

        long wholeNumber = Math.round(value);
        System.out.println(value + " rounded is " + wholeNumber);

        int radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        //System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.printf("The area of a circle with radius %d is %.2f", radius, area);
    }


}