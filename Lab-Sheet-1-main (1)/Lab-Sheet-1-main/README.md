# Data Structures Lab Sheet 1

## How to Run the Code

1. **Clone the repository**:
    On the terminal, copy and paste the following command

   ```bash
   git clone https://github.com/Aryan-Dot-Dev/Lab-Sheet-1
   ```

2. **Go to the Lab Sheet 1 directory**
    Navigate to ```Lab-Sheet-1 ```
    ```
    cd .\Lab-Sheet-1
    ```
   
3. **Compile the Code**:
    Use javac to create Class Files for all Java files.
    All the code is compiled in out/src and out/test directories
    ```bash
    javac -d out src/StaticArray.java test/StaticArrayTest.java
    javac -d out src/DynamicArray.java test/DynamicArrayTest.java
    javac -d out src/StringOperations.java test/StringOperationsTest.java
    ```

4. **Run the Code**:
    Use java command to run files individually.
    ```bash
    java -cp out test.StaticArrayTest
    java -cp out test.DynamicArrayTest
    java -cp out test.StringOperationsTest
    ```

## Repository Overview

1.  All the Java Class files are stored in the ```src``` directory

2. All the TestFiles which will be used to run the program to check test-cases are stored in ```test``` directory

3. After all the javac commands have been executed, all new files will be stored in ```out/src``` and ```out/test``` directory, and will be used to execute the program.