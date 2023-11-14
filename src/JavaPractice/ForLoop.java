package JavaPractice;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++){
            System.out.println("this is for loops "+i);
        }

        System.out.print("\n List of all numbers : ");
        for (int i = 0; i <= 50; i++){
            System.out.print(" "+i);
        }

        System.out.print("\n List of Odd numbers : ");
        for (int i = 0; i <= 50; i++){
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\n List of Even numbers : ");
        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n Table \n");

        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <= 10; j++){
                System.out.printf("%d * %d = %d \n", j, i, j * i);
                //System.out.println(j+" x "+i+" = "+(j * i));
            }
        }

        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 10; j++){
                System.out.print(j * i+" ");
            }
            System.out.println();
        }

        int k;
        for (k = 0; k <= 5; k++){
            System.out.println("k = "+k);
        }
        System.out.println("k = "+k);
        System.out.println("k = "+k);

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
