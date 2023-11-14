package JavaPractice;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Table in column and row \n");

        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 10; j++){
                System.out.print(j * i+" ");
            }
            System.out.println();

            if (i == 5){
                System.out.println("stop here! ");
                break;
            }
        }

        System.out.println("\n program using break keyword \n");

        for (int i = 0; i <= 10; i++){
            System.out.println(i+" : print 10 times ");
            if (i == 5){
                System.out.println("Ending of Loop ");
                break;
            }
        }

        System.out.print("\n List of Odd numbers using break keyword : ");

        for (int i = 0; i <= 50; i++){
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }

            if (i == 27){
                System.out.println("stop here!");
                break;
            }
        }

        System.out.println("\n program using continue keyword \n");

        for (int i = 0; i <= 10; i++){
            if (i == 5){
                System.out.println("Ending the Loop ");
                continue;
            }
            System.out.println(i+" : Hello for loop continue! ");
        }

        for (int i = 0; i <= 10; i++){
            if ((i == 5) || (i == 8)){
                System.out.println("Ending the Loop ");
                continue;
            }
            System.out.println(i+" : Hello for loop continue! ");
        }

        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i+" : Hello for loop continue! ");
        }

        System.out.println("\n\n");
        int i = 0;
        while (i <= 10){
            i++;
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i+" : continue in while loop ");

        }

        System.out.println("\n");
        int n;
        while (true){
            System.out.print("Enter a number between 1 and 10 : ");
            n = scanner.nextInt();
            if (n < 1 || n >10 ){
                continue;
            }
            System.out.println(n+" : is between 1 and 10 ");
            break;
        }
        System.out.print("\n List of even numbers : ");

        for (int k = 0; k <= 100; k++){
            if (k % 2 == 1){
                continue;
            }
            System.out.print(k+" ");
        }

        System.out.print("\n List of odd numbers : ");
        for (int k = 100; k >= 1; k--){
            if (k % 2 == 0){
                continue;
            }
            System.out.print(k+" ");
        }
    }
}
