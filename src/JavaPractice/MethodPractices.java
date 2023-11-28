package JavaPractice;

import java.awt.*;
import java.util.Scanner;

public class MethodPractices {
    public static void main(String[] args) {

        printPrimeBetween(0, 50);

        System.out.println("\n Method Over Loading \n");
        selfInfo("Salim Ullah", "Rahmat Khan", "Sadbarkaly");
        selfInfo("A+", "03078539966", "09/01/2000", 738);

        System.out.println("Please Enter your Name : ");
        System.out.println(getName());
        //System.out.println(getAge());
        getAge();




        Point point = new Point();
        point.x = 1;
        point.y = 2;
        System.out.println("x = "+point.x+" y = "+point.y);


        change(point);
        System.out.println("x = "+point.x+" y = "+point.y);


        int x = 1;
        increment(x);
        System.out.println("x1 = "+x);
        syHi();

        System.out.println("method with parameters");
        System.out.println("sum of: x + y = "+sum(4,9));
        System.out.println("sum of: x + y = "+(sum(5,8)+sum(8, 4)));


    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeBetween(int start, int end){
        for (int i = start; i <= end; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


    public static String selfInfo(String name, String fName, String address){
        System.out.println("Name : "+name);
        System.out.println("FName : "+fName);
        System.out.println("Address : "+address);
        return null;
    }

    public static String selfInfo(String bGroup, String contact, String dob, int marks){
        System.out.println("Blood group : "+bGroup);
        System.out.println("Contact number : "+contact);
        System.out.println("Date Of Birth : "+dob);
        System.out.println("Obtained Marks : "+marks);

        return null;
    }

    public static String getName(){

        return new Scanner(System.in).nextLine();
    }

    public static int getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age : ");

        int age = scanner.nextInt();
        System.out.println(age);

        return age;
    }



    //use pointer in this method
public static void change(Point p){
        p.x = 2;
        p.y = 1;
}
    // sayHi method
    public static void syHi(){
        System.out.println("Hi this is a void method ");

    }

    //addition method
    public static int sum(int x, int y){
        return x+y;
    }

    //increment method
    public static void increment(int x){
        x++;
        System.out.println("xv = "+x);
        }
}
