package Practice_programming.java;

public class sumofarray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int num : array) {
            sum += num;
            System.out.println("print the sum of array:" + sum);
        }
    }
}