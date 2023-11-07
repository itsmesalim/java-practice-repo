package JavaPractice;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n && Operator \n");

        System.out.println(89>11 && 10<90);
        System.out.println(1200 == 800+4 && 3400 > 1700 || 456 < 589);
        System.out.println(3490*2 == 6980 && 890/2 != 500);
        System.out.println(568/4 == 78 && 89*4 == 400 && 13+6 > 17);

        System.out.println("\n || Operator \n");

        System.out.println(678>458 || 888/4 == 204 || 8976*3 != 12345);
        System.out.println(67>98 || 3049 == 654+544 || 8776 < 12450-5876);

        int a = 10;
        int b = 15;
        int max = a < b ? b : a;
        int min = a > b ? b : a;

        System.out.println(max);
        System.out.println(min);

        String name = "Salim Ullah";
        System.out.println(name.isEmpty() ? "The name is invalid " : name);
        System.out.println(name.isBlank() ? "You have no write name " : name);
        System.out.println(!name.isEmpty() ? name : "The name is not valid ");

        System.out.println("\n oooooooooooooooooooooooooooo \n");

        int i = 0, j = 1;
        boolean c = getValue(i, j) ? true : false;
        System.out.println(c);

    }
       public static boolean getValue(int i, int j){
        return i > j;
       }
}
