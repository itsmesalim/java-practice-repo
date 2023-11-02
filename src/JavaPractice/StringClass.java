package JavaPractice;

public class StringClass {
    public static void main(String[] args) {
        String text = "this is  some text ";

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
        System.out.println(text.lastIndexOf("t" )); //their in this text there have multiple 't' but we find the location of last 't' through this method


        char targett = 't';
        char targets = 's';

        int totalOccurrencesT = 0;
        int totalOccurrencesS = 0;
        int currentIndex = -1;

        // Find the total occurrences of the target 't' character
        while ((currentIndex = text.indexOf(targett, currentIndex + 1)) != -1) {
            totalOccurrencesT++;
        }

        currentIndex = -1; // Reset currentIndex to find 's'

        // Find the total occurrences of the target 's' character
        while ((currentIndex = text.indexOf(targets, currentIndex + 1)) != -1) {
            totalOccurrencesS++;
        }

        if (totalOccurrencesT > 0) {
            int middleIndexT = text.indexOf(targett, text.length() / 2);
            System.out.println("Total occurrences of 't': " + totalOccurrencesT);
            System.out.println("Index of the middle 't': " + middleIndexT);
        } else {
            System.out.println("No occurrences of 't' in the text.");
        }

        if (totalOccurrencesS > 0) {
            int middleIndexS = text.indexOf(targets, text.length() / 2);
            System.out.println("Total occurrences of 's': " + totalOccurrencesS);
            System.out.println("Index of the middle 's': " + middleIndexS);
        } else {
            System.out.println("No occurrences of 's' in the text.");
        }

        // Find and print the indices of all occurrences of the target character
        while ((currentIndex = text.indexOf(targett, currentIndex + 1)) != -1) {
            System.out.println("Index of '" + targett + "': " + currentIndex);
        }

        // If there are no occurrences, print a message.
        if (currentIndex == -1) {
            System.out.println("No occurrences of '" + targett + "' in the text.");
        }

    }
}
