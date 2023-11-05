package JavaPractice;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println("\n == Operators \n");

        System.out.println("2 == 2 : "+(2 == 2));
        System.out.println("2 == 3 : "+(2 == 3));
        System.out.println("23+5 == 16+12 : "+(23+5 == 16+12));

        int a = 67;
        int b = 45;
        System.out.println("a == b : "+(a == b));

        System.out.println("\n != Operators \n");

        System.out.println("4567 != 8756 : "+(4567.45d != 8756.67d));
        System.out.println("5678.34 != 5678.34 : "+(5678.34f != 5678.34f));
        double c = 456.67;
        double d = 456.67;
        double e = 567.87;
        double f = 567.87;
        System.out.println("c != f : "+ (c != f));
        System.out.println("d != c : "+ (d != c));
        System.out.println("f != d : "+ (f != d));
        System.out.println("d != e : "+ (d != e));
        System.out.println("e != F : "+ (e != f));

        System.out.println("\n > Operators \n");

        System.out.println(45 > 40);
        System.out.println(56 > 59);
        System.out.println(45+15 > 60);
        System.out.println(70+6 > 65+7);
        System.out.println(90-30 > 50);
        System.out.println(78/2 > 50/7);

        System.out.println("\n >= Operators \n");

        System.out.println(78 >= 67);
        System.out.println(90 >= 90);
        System.out.println(456 >= 895);
        System.out.println(678+345 >= 5467-3459);
        System.out.println(987/5 >= 786/2);

        System.out.println("\n < Operators \n");

        System.out.println(890 < 1298);
        System.out.println(7834/9 < 1293);
        System.out.println(394 *5 < 786*2);
        System.out.println(873/2 < 340);

        System.out.println("\n <= Operators \n");

        System.out.println(540 <= 540);
        System.out.println(230*2 <= 480);
        System.out.println(680/2 <= 330);

    }
}
