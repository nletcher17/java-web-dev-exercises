package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        Float miles = input.nextFloat();
        System.out.println("Enter amount of gas (in gallons): ");
        Float gallon = input.nextFloat();
        System.out.println("Your miles per gallon is: " + miles/gallon);
        input.close();
    }
}
