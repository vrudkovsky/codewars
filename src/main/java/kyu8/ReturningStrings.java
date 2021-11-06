package kyu8;

/**
 * Make a function that will return a greeting statement that uses an input;
 * your program should return, "Hello, <name> how are you doing today?".
 *
 * [Make sure you type the exact thing I wrote or the program may not execute properly]
 */

public class ReturningStrings {
    public static String greetv1(String name) {
        StringBuilder sb = new StringBuilder();
            sb.append("Hello, ").append(name)
                .append(" how are you doing today?");
        return String.valueOf(sb);
    }

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static void main(String[] args) {

    }
}
