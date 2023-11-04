package JavaPractice;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        System.out.println("\n Increment \n");

        int incNumber1 = 5;
        incNumber1++;
        System.out.println(incNumber1);

        int incNumber2 = 5;
        ++incNumber2;
        System.out.println(incNumber2);

        int i = 1;
        int j = ++i;
        System.out.println("i = : "+i+" j = : "+j+"\n");

        int a = 1;
        int b = a++;
        System.out.println("a = : "+a+" b = : "+b+"\n");

        int c = 1;
        int d = c++ + 4;
        System.out.println("c = : "+c+" d = : "+d+"\n");

        int e = 1;
        int f = ++e + 4;
        System.out.println("e = : "+e+" f = : "+f+"\n");


        System.out.println("\n Decrement \n");

        int z1 = 2;
        z1--;
        System.out.println(z1);

        float z2 = 2.5f;
        --z2;
        System.out.println(z2);

        int y1 = 2;
        int y2 = y1--;
        System.out.println("y1 = : "+y1+" y2 = : "+y2);

        int x1 = 2;
        int x2 = --x1;
        System.out.println("x1 = : "+x1+" x2 = : "+x2);

        int w1 = 5;
        int w2 = --w1 - 2;
        System.out.println("w1 = : "+w1+" w2 = : "+w2);

        int v1 = 5;
        int v2 = v1-- - 2;
        System.out.println("v1 = : "+v1+" v2 = : "+v2);

    }
}
