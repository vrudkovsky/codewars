package kyu8;

/**
 * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
 *
 * doubleChar("String") ==> "SSttrriinngg"
 * doubleChar("Hello World") ==> "HHeelllloo  WWoorrlldd"
 * doubleChar("1234!_ ") ==> "11223344!!__  "
 */

public class DoubleChar {
    public static String doubleChar(String s){
        //enter your code here
        StringBuilder sb = new StringBuilder();
        char[] cs = s.toCharArray();
        for (char c :  cs) {
            sb.append(c).append(c);
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.printf("%s", doubleChar("String"));
    }
}
