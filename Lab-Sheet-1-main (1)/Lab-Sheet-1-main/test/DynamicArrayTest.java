package test;

import src.DynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        // Testing for insertion
        System.out.println("Inserting Elements: ");
        dynamicArray.insert(1);
        dynamicArray.insert(2);

        // Testing for deletion
        dynamicArray.delete(1);
        dynamicArray.traverse();
    }
}
