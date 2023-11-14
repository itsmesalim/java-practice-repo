package JavaPractice;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = 0;
        while (j <= 5){
            System.out.println(" this is while loop "+j);
            j++;
        }


        int k = 0;
        System.out.print("List of numbers from 0 to 50 : ");
        while (k <= 50){
            System.out.print(" "+k);
            k++;
        }

        System.out.print("\n Enter a number to chick it's in the range of 1 to 10 or not: ");

        int number = scanner.nextInt();

        while (number < 1 || number > 10){
            System.out.print(number+" is not between 1 and 10 try again: ");
            number = scanner.nextInt();
        }
        System.out.println(number+" is between 1 and 10 ");

        System.out.println("\n Table \n");
        int a = 0;

        while (a <= 5){

            int b = 0;
            while (b <= 10) {
                System.out.println(b + " x " + a + " = " + (b * a));
                b++;
            }
            a++;
        }

        int m = 0;
        System.out.print("List of numbers from 0 to 50 uses of break keyword : ");
        while (m <= 50){
            System.out.print(" "+m);
            m++;

            if (m == 34){
                System.out.println("stop here ");
                break;
            }
        }
    }
}
