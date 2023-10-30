package JavaPractice;

public class StringClass {
    public static void main(String[] args) {
        String text = "this is some text ";

        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.toCharArray());
        System.out.println(text.compareToIgnoreCase("s"));
        System.out.println(text.equalsIgnoreCase("this is some text "));
    }
}
