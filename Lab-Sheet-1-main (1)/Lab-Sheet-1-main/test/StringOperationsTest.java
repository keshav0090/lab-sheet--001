package test;

import src.StringOperations;

public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations strOps = new StringOperations();

        System.out.println("Concatenation: " + strOps.concatenate("hello", "world"));
        System.out.println("Substring: " + strOps.substring("hello", 2, 4));
        System.out.println("Comparison: " + strOps.compareStrings("hello", "world"));
        System.out.println("Character Frequency: " + strOps.characterFrequency("hello"));
    }
}
