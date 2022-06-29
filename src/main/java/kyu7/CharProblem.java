package kyu7;

public class CharProblem {
    public static int howOld(final String herOld) {

        //your code here, return correct age as int
        String[] splited = herOld.split("\\s+");
        return Integer.parseInt(splited[0]);
    }

    public static void main(String[] args) {

    }
}
