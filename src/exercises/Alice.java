package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a " +
                "book,' thought Alice ' without pictures or " +
                "conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String searchTerm = input.nextLine().toLowerCase();
        System.out.println(sentence.contains(searchTerm));
        Integer searchIndex = sentence.indexOf(searchTerm);
        Integer searchLength = searchIndex + searchTerm.length();
        System.out.println(searchIndex);
        System.out.println(searchLength - searchIndex);
        String sentenceEdit = sentence.substring(0,searchIndex) + sentence.substring(searchLength);
        System.out.println(sentenceEdit);
    }
}
