//Run the application Guess.java and guess how many elements are in the HashSet. Now, modify
//Guess.java to insert StringBuilder objects (initialized with identical values) instead of String
//objects into the HashSet. Recompile and run the application. How does the output differ? Why?

package ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Guess {
    public static void main(String args[]) throws IOException {
        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = new StringBuilder("abc");
        StringBuilder s3 = new StringBuilder("abcd");

        Set<StringBuilder> mySet = new HashSet<>();
        mySet.add(s1);
        mySet.add(s2);
        mySet.add(s3);

        System.out.print("What is the HashSet size? ");
        BufferedReader buf = new BufferedReader(new InputStreamReader(
                System.in));

        int guess = Integer.parseInt(buf.readLine());

        if (guess == mySet.size()) {
            System.out.println("\nCORRECT!!!\n\nElements: ");
            for (StringBuilder s : mySet) {
                System.out.println("Value: " + s + " Hash Code: "
                        + s.hashCode());
            }
        }
        else {
            System.out.println("I'm sorry. Please try again.");
        }
    }
}
