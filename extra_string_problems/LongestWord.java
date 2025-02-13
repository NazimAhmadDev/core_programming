package week1_ExtraQuestions1;

import java.util.*;

public class LongestWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a sentence: ");
        String[] words = sc.nextLine().split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Longest Word: " + longest);

	}

}
