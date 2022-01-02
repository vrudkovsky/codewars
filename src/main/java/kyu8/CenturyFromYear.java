package kyu8;

public class CenturyFromYear {
    public static int century(int number) {
        return (number + 99) / 100;
    }

    public static void main(String[] args) {
        System.out.println(century(1705)); //18
        System.out.println(century(1900)); //19
        System.out.println(century(1601)); //17
        System.out.println(century(2000)); //20
        System.out.println(century(89)); //1
    }
}
