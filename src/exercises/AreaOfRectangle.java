package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        Integer length = input.nextInt();
        System.out.println("Enter width: ");
        Integer width = input.nextInt();
        System.out.println("The area is " + length*width);
        input.close();
    }
}
