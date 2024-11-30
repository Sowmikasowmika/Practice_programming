package Practice_programming.java;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second Number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third Number: ");
        int thirdNumber = scanner.nextInt();
        int output = firstNumber + secondNumber + thirdNumber;
        System.out.println("Enter the number:" + output);
        scanner.close();
    }

}
