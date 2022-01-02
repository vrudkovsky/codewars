package kyu8;

import com.google.protobuf.EnumOrBuilder;

public class CountSheep {
    public static String countingSheep(int num) {
        //Add your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            sb.append(" sheep...");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}
