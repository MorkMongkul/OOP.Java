import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tp3_pr7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the letter(s) to find in words: ");
        String letters = scanner.nextLine();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a list to store words containing the specified letter(s)
        List<String> wordsContainingLetter = new ArrayList<>();

        // Iterate through each word and check if it contains the specified letter(s)
        for (String word : words) {
            if (word.contains(letters)) {
                wordsContainingLetter.add(word);
            }
        }

        // Print the list of words containing the specified letter(s)
        System.out.println("List of words containing letter(s) " + letters + ":");
        for (String word : wordsContainingLetter) {
            System.out.print("|" + word + "|");
        }

        // Print the count of words containing the specified letter(s)
        System.out.println("\nThere are " + wordsContainingLetter.size() + " words containing letter(s) \"" + letters + "\"");
    }
}

