package JavaPractice;

public class TypeCasting {
    public static void main(String[] args) {

        System.out.println("\n Implicit Type Casting \n");

        int a = 78;
        float b = a;
        System.out.println(b);


        int number1 = 59;
        System.out.println((float) number1);


        float num1 = 56.4f;
        double num2 = num1;
        System.out.println(num2);

        float num3 = 87.98f;
        System.out.println((double) num3);

        System.out.println("\n Explicit Type Casting \n");

        float h1 = (float) 89.67;
        System.out.println(h1);

        int h2 = (int) 76.45f;
        System.out.println(h2);

        double h3 = 56.7 + 3;
        System.out.println(h3);

        double h4 = 78.4;
        int h5 = (int)h4;
        System.out.println(h4);
        System.out.println(h5);

    }
}
