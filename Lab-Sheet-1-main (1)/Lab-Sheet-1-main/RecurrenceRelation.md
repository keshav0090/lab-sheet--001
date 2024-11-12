## Recurrence Relations in Lab Sheet 1 - Stack Operations
Lab Sheet 1 mainly consists of iterative algorithms, so recurrence relations don't directly apply. However, it’s useful to consider potential recurrence relations for stack operations, particularly in scenarios where recursion might be used.

### Example of Recurrence Relation for Recursive Stack Operations:
- **Recursive String Reversal**:
   - **Recurrence Relation**: \( T(n) = T(n-1) + O(1) \)
   - **Explanation**: In a recursive string reversal algorithm, each call processes a single character in constant time and then recurses on the remaining \( n-1 \) characters.
   - **Solution**: Solving this recurrence relation results in \( T(n) = O(n) \), indicating linear time complexity.

- **Recursive Palindrome Check**:
   - **Recurrence Relation**: \( T(n) = T(n-1) + O(1) \)
   - **Explanation**: Similar to string reversal, this recursive method checks one character from both the start and the end of the string in each call.
   - **Solution**: The recurrence simplifies to \( T(n) = O(n) \).