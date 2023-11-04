package JavaPractice;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n in addition, operator we can add two numbers let see below in different manner \n");
        System.out.print("Enter two numbers for addition: ");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();

        int addition = number1 + number2;
        System.out.println("number1 + number2 = "+addition);

        System.out.println("the addition of two numbers: "+(5+9));
        System.out.println("the addition of three numbers: "+(67+34+98));

        System.out.println("\n in subtraction, operator we can subtract two numbers let see below in different manner \n");

        System.out.print("Enter two numbers for subtraction: ");
        int number3 = scanner.nextInt(), number4 = scanner.nextInt();

        int subtraction = number3 - number4;
        System.out.println("number3 + number4 = "+subtraction);

        System.out.println("\n in multiplication, operator we can multiply two numbers let see below in different manner \n");

        System.out.print("enter two value for multiplication:  ");
        int value1 = scanner.nextInt(), value2 = scanner.nextInt();

        int multiplication = value1 * value2;
        System.out.println("value1 * value2 = "+multiplication);

        System.out.println("\n in division, operator we can divide two numbers let see below in different manner \n");

        System.out.print("Enter two integer to divide by each other: ");
        int integer1 = scanner.nextInt(), integer2 = scanner.nextInt();

        int division = integer1/integer2;
        System.out.println("integer1 / integer2 = "+division);

        System.out.print("Enter two floats value to find division: ");
        float float1 = scanner.nextFloat(), float2 = scanner.nextFloat();

        float division2 = float1 / float2;
        System.out.println("float1 / float2 = "+division2);

        System.out.println("the division of two numbers is: "+90/6);

        System.out.println("\n in modulo, operator we can find the reminder numbers let see below in different manner \n");

        System.out.print("Enter two numbers to find the reminder: ");
        int modolo1 = scanner.nextInt(), modolo2 = scanner.nextInt();

        int modolus = modolo1 % modolo2;
        System.out.println("the reminder is: "+modolus);

        System.out.print("Enter a number to find that is even or odd: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("the number is Even ");
        }else {
            System.out.println("the number is Odd");
        }


        System.out.println("\n After that we talk about Precedence all operation can be done from left to right let see below in different manner \n");

        System.out.println(98+(4-3)+8*6-(29+8)+72/8+45-(78+34));
    }
}
