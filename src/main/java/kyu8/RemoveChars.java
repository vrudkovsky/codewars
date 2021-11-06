package kyu8;

/**
 * It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
 * You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 */

public class RemoveChars {
    public static String remove(String s) {
        return s.substring(1,s.length() - 1);
    }

    public static void main(String[] args) {
        System.out.printf("%s\n", remove("eloquent"));
    }
}
