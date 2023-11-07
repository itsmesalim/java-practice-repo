package JavaPractice;

import java.util.Scanner;

public class IfConditions {
    public static <b> void main(String[] args) {

        if (true)
            System.out.println("this statement is the part of if condition");


        if (true){
            System.out.println("My Name is salim ullah ");
            System.out.println("and I am from sadbarkaly "); //this both statement are the part of if condition

        }
        System.out.println("this statement is not the part of if condition");

        if (false)
            System.out.println("this statement is the part of if condition ");
        System.out.println("this statement is not the part of if condition  ");


        if (false){
            System.out.println("I have graduated from AUKUM Tmg Campus ");
            System.out.println("in 4th year from 2019 to 2023 ");      //this both statement are the part of if condition

            int a = 6;
            int b = 10;

            if (a < b){
                System.out.println("a is less then b ");
            }
        }

        // Nested if conditions

        if (true){

            int a = 6;
            int b = 10;

            if (a < b){
                System.out.println("a is less then b ");

                int c = 90;
                int d = 238;
                float navidSalary  = 455988;
                float aslamSalary = 83666;

                if ((navidSalary > aslamSalary) && (c < d)){
                    System.out.println("the salary of navid is maximum from aslam salary ");
                    System.out.println("So navid is responsible of home expenses");
                    System.out.println("c is less then d ");

                    int x = 67;
                    int y = 89;

                    if (y > x){
                        System.out.println("the "+y+"is maximum from "+x);

                        if (x > y ){
                            System.out.println("the "+x+"is maximum from "+y);
                        }

                        if (x < y ){
                            System.out.println("the "+x+"is minimum from "+y);
                        }

                    }
                }


            }

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number: ");
            int number = scanner.nextInt();

            if (number%2 == 0){
                System.out.println("the "+number+" is Even");
            }

            if (number%2 == 1){
                System.out.println("the "+number+" is odd");
            }




        }


    }
}
