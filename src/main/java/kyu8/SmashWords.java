package kyu8;

public class SmashWords {

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(smash("Bilal", "Throughout"));
    }
}
