package JavaPractice;

public class Variable {
    public static void main(String[] args) {
        String myName = "Salim Ullah ";
        String myJob = "Java Programmer ";
        String myNameCopy = myName;
        myName = "Aayan ";
        final String myCompneyName = "Neso Academy";
        int p78 = 56;
        String $ = "hi";

        System.out.println(myName);
        System.out.println(myJob);
        System.out.println(myNameCopy);
        System.out.println(myCompneyName);
        System.out.println(p78);
        System.out.println($);


        variableName("John", 30);
    }

    public static void variableName(String name, int age){

        String Sname = name;
        int myAge = age;

        System.out.println(Sname);
        System.out.println(myAge);
    }
}
