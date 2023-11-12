package JavaPractice;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = 0;
        while (j <= 10){
            System.out.println(" this is while loop "+j);
            j++;
        }

        int k = 0;
        while (k <= 15){
            System.out.println(k);
            k++;
        }

        int i = 0;
        while (i <= 8){
            System.out.println(i+" hello");
            i++;
        }

        System.out.print("Enter a number to chick it's in the range of 1 to 10 or not: ");

        int number = scanner.nextInt();

        while (number < 1 || number > 10){
            System.out.print(number+" is not between 1 and 10 try again: ");
            number = scanner.nextInt();
        }
        System.out.println(number+" is between 1 and 10 ");



    }
}
