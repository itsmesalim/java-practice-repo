

    package JavaPractice;

    public class SecondClass {
        public static void main(String[] args) {

            sayHi(56, 78);
            sayHello("Hi this String Type method ");
        }

        public static void sayHi(int a, int b){
            int c = a+b;

            System.out.println("c = "+c);

        }

        public static String sayHello(String a){
            System.out.println(a);
            return a;
        }
    }


