package src;
public class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    // Constructor to initialize the dynamic array
    public DynamicArray() {
        capacity = 2;
        array = new int[capacity];
        size = 0;
    }

    // Method to add an element to the array
    public void insert(int value) {
        if (size == capacity) {
            resize();
        }
        array[size] = value;
        size++;
    }

    // Method to resize the array
    private void resize() {
        capacity += 1;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Method to delete an element from the array
    public void delete(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                break;
            }
        }
    }

    // Method to traverse the array
    public void traverse() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}