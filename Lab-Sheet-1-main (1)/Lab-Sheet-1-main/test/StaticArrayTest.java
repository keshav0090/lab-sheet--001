package test;

import src.StaticArray;

public class StaticArrayTest {
    public static void main(String[] args) {
        StaticArray staticArray = new StaticArray(5);
        staticArray.insert(1);
        staticArray.insert(2);
        staticArray.delete(1);
        staticArray.traverse();
    }
}
