package JavaPractice;

import java.util.Scanner;

public class IfElseConditions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     /*   if (true){
            System.out.println("this is the 1st if statement ");
        }else {
            System.out.println("this is the 1st else statement ");
        }

        if (false){
            System.out.println("this is the 2nd if statement");
        }else {
            System.out.println("this is the 2nd else statement ");
        }

        System.out.println("out side of both if else condition");

        System.out.print("Enter number : ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number+" is Even ");
        }else {
            System.out.println(number+" is Odd ");
        }

        if ((number > 10) && (number < 100)){
            System.out.println("the number is between 10 and 100");
        }else{
            System.out.println("the number is out of range ");
        }

        System.out.println("Please Enter your Marks obtained ");
        float marks = scanner.nextFloat();

        if (marks >= 90){
            System.out.println("Congratulation you have got 4.0 gpa");
        } else if (marks >= 80) {
            System.out.println("Congratulation you have got 3.5 gpa");
        } else if (marks >= 70 ) {
            System.out.println("Congratulation you have got 3.0 gpa");
        } else if (marks >= 60) {
            System.out.println("you have got 2.5 gpa");
        } else if (marks >= 50) {
            System.out.println("you have passed your paper");
        } else{
            System.out.println("you have failed your paper please repeat ");
        }

        if ((marks >= 90) && (marks < 100)){
            System.out.println("Congratulation again you have got A+ grade ");
        } else if ((marks >= 80) && (marks < 90)) {
            System.out.println("Congratulation again you have got A grade ");
        } else if ((marks >= 70) && (marks < 80)) {
            System.out.println("Congratulation again you have got B grade ");
        } else if ((marks >= 60) && (marks < 70)) {
            System.out.println("Congratulation again you have got C grade ");
        } else if ((marks >= 50) && (marks < 60 )) {
            System.out.println("try next time to get a grade ");
        }else {
            System.out.println("don't worry try for next exam ");
        }


        System.out.println("Enter value ");
        int value = scanner.nextInt();
        if (value > 100){
            System.out.println(value+" is greater then from 100 ");
        } else if (value == 100) {
                System.out.println(value + " is equal to 100 ");
            } else {
                System.out.println(value + " is less then from 100 ");
            }
*/
        System.out.println("\n create calculator \n");

        System.out.print("Enter number1 operator number2 : ");
        double number1 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double number2 = scanner.nextDouble();

        if (operator == '+'){
            System.out.println((int) (number1 + number2));
        } else if (operator == '-') {
            System.out.println((int) (number1 - number2));
        } else if (operator == '*') {
            System.out.println((int) (number1 * number2));
        } else if (operator == '/') {
            System.out.println(number1 / number2);
        }else {
            System.out.println("You have write invalid Operator ");
        }

    }
}
