# Comparative Analysis between Time Complexities of Static Array and Dynamic Array

## Static Array:

### Time Complexity

1. Insert Method ```insert(int value)```:
    - Description: Takes an integer value and adds it to the end of the array.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

2. Delete Method ```delete(int value)```:
    - Description: Takes an integer value and removes its first occurrence from the array.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

3. Traversal ```traverse()```:
    - Description: Traverses through an array and return every element from the array.
    - Worst Case: ```O(n)```


## Dynamic Array:

### Time Complexity

1. Insert Method ```insert(int value)```:
    - Description: Takes an integer value and adds it to the end of the array.If the array is full, it uses the ```resize()``` method to increase the size of the array, hence making it dynamic.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

2. Delete Method ```delete(int value)```:
    - Description: Takes an integer value and removes its first occurrence from the array.
    - Best Case: ```O(1)```
    - Worst Case: ```O(n)```

3. Traversal ```traverse()```:
    - Description: Traverses through an array and return every element from the array.
    - Worst Case: ```O(n)```


## Comparison
### 1. Insertion:

| Operation       | Static Array Insertion (Worst Case) | Dynamic Array Insertion (Worst Case) |
|-----------------|--------------------------------------|---------------------------------------|
| **Time Complexity** | O(1) (Array is full, cannot insert) | O(n) |
| **Reason**      | No resizing; array is full, so insertion fails or triggers an error. | When array is full, resizing is needed, requiring copying of all elements to a new array (O(n)). |

Even if both static and dynamic array has time complexities of O(n), how it achieves O(n) time complexity is different in both the array implementations


### 2. Deletion:

| Operation       | Static Array Deletion (Worst Case) | Dynamic Array Deletion (Worst Case) |
|-----------------|-------------------------------------|--------------------------------------|
| **Time Complexity** | O(n) | O(n) |
| **Reason**      | Element at the end or not found; full traversal and shifting of elements required. | Element at the end or not found; full traversal and shifting of elements required. |


### 3. Traversal

| Operation       | Static Array Traversal (Worst Case) | Dynamic Array Traversal (Worst Case) |
|-----------------|--------------------------------------|---------------------------------------|
| **Time Complexity** | O(n) | O(n) |
| **Reason**      | The entire array must be iterated to access each element, resulting in linear time. | The entire array must be iterated to access each element, resulting in linear time. |