package Practice_programming.java;

import java.util.Scanner;

public class modules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firstNumber:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the secondNumber:");
        int secondNumber = scanner.nextInt();
        int output = firstNumber % secondNumber;
        System.out.println("Enter the number:" + output);
        scanner.close();
    }

}
