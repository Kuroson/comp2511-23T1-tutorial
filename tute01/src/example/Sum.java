package example;

import java.util.Scanner;

/**
 * Write a program that uses the `Scanner` class
 * which reads in a line of numbers separated by spaces,
 * and sums them.
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int sums = 0;
        for (String x : numbers) {
            sums += Integer.parseInt(x);
        }
        System.out.println(sums);
        scanner.close();
    }
}
