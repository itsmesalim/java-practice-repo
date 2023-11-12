package JavaPractice;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("this is do while loop : "+i);
            i++;
        }while (i <= 10);

        int n = 0;
        System.out.print("List of All Numbers : ");
        do {
            System.out.print(" "+n);
            n++;
        }while (n <= 50);

        int j = 1;
        System.out.print("\nList of Odd Numbers : ");
        do {
            System.out.print(" "+j);
            j++;
            if (j%2 == 0){
                j++;
            }
        }while (j <= 50);

        int k = 0;
        System.out.print("\nList of Even Numbers : ");
        do {
            System.out.print(" "+k);
            k++;
            if (k%2 == 1){
                k++;
            }
        }while (k <= 50);

        System.out.println("\n table \n");
        int a = 2;
        int b = 0;

        do {
            System.out.println(b+" x "+a+" = "+(b*a));
            b++;
        }while (b <= 10);


        int number;
        do {
            System.out.print("\n Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }while (number < 1 || number > 10);
        System.out.println(number+" is between 1 and 10 ");

    }
}
