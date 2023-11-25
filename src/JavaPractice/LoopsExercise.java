package JavaPractice;

import java.util.Scanner;

public class LoopsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true){
            System.out.print("Enter a number : ");
            sum += scanner.nextInt();

            if (sum > 100){
                break;
            }
        }
        System.out.println(sum+" done! ");

        for (sum = 0; true; ){

            System.out.print("Enter a number for second time : ");
            sum += scanner.nextInt();

            if (sum == 100){
                System.out.println(sum+ "completed go forward");
                continue;
            }

            if (sum == 200){
                break;
            }

            if (sum > 250){
                break;
            }


        }
        System.out.println(sum+" done!");

        System.out.println("\n Strict Divisors of a number \n");

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int sumOfStrictDivisor = 0;
        System.out.print("Strict Divisor of "+number+" is : ");
        for (int i = 1; i <= number/2; i++){
            if (number%i == 0){
                sumOfStrictDivisor += i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n Sum of strict divisor is : "+sumOfStrictDivisor);


        System.out.println("\n Sequence of positive numbers ends when user write negative number \n");

        System.out.println("Enter positive numbers ");
        int positiveNumber = scanner.nextInt();

        int max = positiveNumber;
        int min = positiveNumber;

        while (true){
            positiveNumber = scanner.nextInt();

            if (positiveNumber < 0 ){
                break;
            }

            if (positiveNumber > max){
                max = positiveNumber;
            }

            if (positiveNumber < min) {
                min = positiveNumber;
            }
        }

        System.out.println("min = "+min+", max = "+max);


        System.out.println("\n Sum of digits in integer \n");

        System.out.println("Enter a digit : ");
        int digit = scanner.nextInt();
        int sum1 = 0;

        while (digit > 0){
            sum1 = sum1 + digit % 10;
            digit = digit / 10;
        }
        System.out.println("sum = "+sum1);


        System.out.println("\n Fibonacci Sequence \n");

        System.out.println("Enter a FSNumber");
        int fSNumber = scanner.nextInt();
        int result = 0;
        int v1 = 1;
        int v2 = 1;

        for (int i = 1; i <= fSNumber-2; i++){
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }

        System.out.println("result = "+result);

        System.out.println("\n separate the character of a string using spaces \n ");
        System.out.println("please write your string ");
        String str = scanner.nextLine();

        for (int i = 0; i <= str.length() - 1; i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println("\n Length of this character is : "+str.length());

        System.out.println("\n read  character from right side  \n ");

        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }


        System.out.println("\n find palindrome string  \n ");
        System.out.println("Enter your string to find palindrome or not : ");
        String palindromeStr = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0, j = palindromeStr.length() - 1; i < j; i++ ,j--){
            if (palindromeStr.charAt(i) == palindromeStr.charAt(j)){
                continue;
            }
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "Palindrome" : "not Palindrome");


        System.out.println("printing integers like 1 22 333 4444 55555 .............nnnnnnn ");

        System.out.print("Enter a number to print it chunks : ");
        int chunksNumber = scanner.nextInt();

        for (int i = 1; i <= chunksNumber; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

       System.out.println("\n in Opposite side \n");

        for (int i = chunksNumber; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n both loops goto in same way \n");

        for (int i = 1; i <= chunksNumber; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }

            for (int j = chunksNumber; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n in Opposite side \n");

        for (int i = chunksNumber; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }

            for (int j = chunksNumber; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n print in another method \n");

        for (int i = 1; i <= chunksNumber; i++){
            for (int j = 1; j <= chunksNumber-i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n triangle\n");

        for (int i = 1; i <= chunksNumber; i++){
            for (int j = 1; j <= chunksNumber-i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n triangle with empty center \n");

        for (int i = 1; i <= chunksNumber; i++){
            for (int j = 1; j <= chunksNumber-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++){
                if (i == chunksNumber){
                    System.out.print("*");

                } else
                    if (j == 1 || j == 2*i - 1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                }
            }

            System.out.println();
        }

        System.out.println("\n square \n");
        for (int i = 1; i <= chunksNumber; i++) {
            for (int j = 1; j <= chunksNumber; j++) {
                System.out.print("* ");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n square with no center asterisks \n");

        for (int i = 1; i <= chunksNumber; i++) {
            for (int j = 1; j <= chunksNumber; j++) {
                if (i == 1 || i == chunksNumber || j == 1 || j == chunksNumber) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
