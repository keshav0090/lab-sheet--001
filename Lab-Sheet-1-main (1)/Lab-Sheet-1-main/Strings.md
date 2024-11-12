# Time and Space Complexity Analysis of String Operations

| Operation                | Time Complexity (Big O) | Space Complexity (Big O) | Reason for Time Complexity                           | Reason for Space Complexity                           |
|--------------------------|-------------------------|---------------------------|------------------------------------------------------|-------------------------------------------------------|
| **Concatenate**          | O(n + m)                | O(n + m)                  | Concatenation requires copying both strings `str1` and `str2`, where `n` and `m` are their lengths. | A new string of size `n + m` is created to store the result. |
| **Substring**            | O(k)                    | O(k)                      | Extracting a substring of length `k` requires copying `k` characters. | Space is required to store the new substring of length `k`. |
| **Compare Strings**      | O(min(n, m))            | O(1)                      | Comparison stops at the first differing character or at the end of the shorter string, where `n` and `m` are lengths. | Only constant space is used for comparison. |
| **Character Frequency**  | O(n)                    | O(n)                      | Iterating through the string `str` of length `n` and updating a `HashMap` takes linear time. | The space required for the `HashMap` can be up to `O(n)` if all characters are unique. |

## Explanation:
1. **Concatenate**:
   - **Time Complexity**: `O(n + m)` due to copying both strings to a new string.
   - **Space Complexity**: `O(n + m)` for creating a new string that combines `str1` and `str2`.

2. **Substring**:
   - **Time Complexity**: `O(k)` for copying `k` characters from the original string.
   - **Space Complexity**: `O(k)` for storing the new substring.

3. **Compare Strings**:
   - **Time Complexity**: `O(min(n, m))`, as the comparison stops at the first non-matching character or at the end of the shorter string.
   - **Space Complexity**: `O(1)` because no additional data structures are used.

4. **Character Frequency**:
   - **Time Complexity**: `O(n)` because it iterates through the string once, updating the `HashMap` for each character.
   - **Space Complexity**: `O(n)` in the worst case, as the `HashMap` may need to store up to `n` unique characters.
