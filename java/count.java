package Practice_programming.java;

import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count:");
        int count = scanner.nextInt();
        int arr[] = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("Enter the value" + i + ":" + arr[i]);
            scanner.close();
        }

    }

}
