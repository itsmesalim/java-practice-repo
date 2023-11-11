package JavaPractice;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = scanner.nextInt();

        switch (number){
            case 90 :
                System.out.println("you have got 4.0 gpa ");
                break;
            case 80:
                System.out.println("you have got 3.5 gpa  ");
                break;
            case 70:
                System.out.println("you have got 3.0 gpa  ");
                break;
            case 60:
                System.out.println("you have got 2.5 gpa ");
                break;
            case 50:
                System.out.println("you have passed ");
                break;
            case 40:
                System.out.println("you have failed ");
                break;
            default:
                System.out.println("non of the above ");
        }

        System.out.println("Enter age ");
        int age = scanner.nextInt();

        switch (age){
            case 18:
                System.out.println("play cricket ");
                break;
            case 22:
                System.out.println("play hacky ");
                break;
            case 25:
                System.out.println("play foot ball ");
                break;
            case 28:
                System.out.println("play wali ball ");
                break;
            default:
                System.out.println("you have don't allowed ");
        }

        System.out.println("find Even or Odd ");

        System.out.println("Enter value ");
        int value = scanner.nextInt();

        switch (value % 2){
            case 0:
                System.out.println(value+" is Even");
                break;
            default:
                System.out.println(value+" is Odd ");
        }


        System.out.print("Enter number1 operator number2 : ");
        double number1 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double number2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                System.out.println((int) (number1 + number2));
                break;
            case '-':
                System.out.println((int) (number1 - number2));
                break;
            case '*':
                System.out.println((int) (number1 * number2));
                break;
            case '/':
                System.out.println(number1 / number2);
            default:
                System.out.println("You have write invalid Operator ");
        }
    }
}
