package example;

import java.util.Scanner;

/**
 * Write a program that uses the `Scanner` class
 * which reads in a line of numbers separated by spaces,
 * and sums them.
 */
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] numbers = input.split(" ");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        s.close();
        System.out.println(sum);
    }
}
