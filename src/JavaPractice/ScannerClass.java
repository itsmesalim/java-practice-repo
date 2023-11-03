package JavaPractice;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        System.out.println("give an Inputs\n\n");
//        System.out.println("enter your name: ");
//        System.out.println("Hello "+scanner.next()); // their if I write my string "Salim Ullah" so it's give me the output only "Salim"

        System.out.println("please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        float salary = scanner.nextFloat();

        System.out.println("please enter your land: ");
        long land = scanner.nextLong();

        System.out.println("please enter your favorite number: ");
        int number = scanner.nextInt();


        System.out.println("\n Out Puts \n");
        System.out.println("My name is "+name); // now it's show me the full name
        System.out.println("I am "+age+" years old");
        System.out.println("Salary = "+salary+" pkr");
        System.out.println("I have "+land+" square km Land ");
        System.out.println(number+" is my favorite number");
    }
}
