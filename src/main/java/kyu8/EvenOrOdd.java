package kyu8;

/**
 * Create a function that takes an integer as an argument
 * and returns "Even" for even numbers or "Odd" for odd numbers.
 */

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Place code here
        return (number % 2 != 0)? "Odd" : "Even";
    }

    public static void main(String[] args) {
        System.out.printf("%s", even_or_odd(4));
    }
}
