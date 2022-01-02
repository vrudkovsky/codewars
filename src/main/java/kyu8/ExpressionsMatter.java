package kyu8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExpressionsMatter {

    public static int expressionsMatter(int a, int b, int c) {
        // Your Code here... Happy Coding!
        List<Integer> ls = new ArrayList<>();
        ls.add(a*b*c);
        ls.add(a+b+c);
        ls.add(a*b+c);
        ls.add(a*(b+c));
        ls.add(a+b*c);
        ls.add((a+b)*c);
        ls.add(a*(b+c));
        ls.add(a*(b+c));
        ls.add(a*(b+c));
        ls.add(a*(b+c));
        return ls.stream().max(Comparator.comparing( Integer::intValue )).get();
    }

    public static void main(String[] args) {
        System.out.println(expressionsMatter(1, 1, 10));
    }
}
