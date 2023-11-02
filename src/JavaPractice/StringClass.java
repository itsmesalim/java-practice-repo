package JavaPractice;

public class StringClass {
    public static void main(String[] args) {
        String text = "this is some text ";

        System.out.println(text);
        System.out.println(text.toUpperCase());      //that converts all the text to UpperCase
        System.out.println(text.toLowerCase());     //that converts all the text to LowerCase
        System.out.println(text.toCharArray());
        System.out.println(text.compareToIgnoreCase("s"));
        System.out.println(text.length());
        System.out.println(text.isEmpty());   //if we have some text in the string then the form of isempty() method result will be falls otherwise true
        System.out.println(text.isBlank());   //in isempty() method the spaces also count but their not counted only the text is counted.
        System.out.println(text.charAt(8));   //it's define the character in a mention specific location
        System.out.println(text.indexOf('t'));  //that shows that my character is store in which location


    }
}
