# 🔢 Odd or Even

### 💡 Problem Statement:
Given a positive integer `n`, determine whether it is **odd or even**.  
Return `true` if the number is **even**, and `false` if the number is **odd**.

---

### 📥 Input:
- A single positive integer `n`

---

### 📤 Output:
- Return `true` if `n` is even  
- Return `false` if `n` is odd

---

### 🧪 Examples:

#### ✅ Example 1:
Input: n = 15
Output: false
Explanation: The number is not divisible by 2 (odd)


#### ✅ Example 2:
Input: n = 44
Output: true
Explanation: The number is divisible by 2 (even)


---

### 🔒 Constraints:
0 <= n <= 10⁴


---

### 🚀 Expected Time & Space Complexities:
- **Time Complexity:** `O(1)`
- **Auxiliary Space:** `O(1)`

---


## 🧠 Concept / Logic Behind the Program

### 🎯 Goal
Check whether a number is divisible by 2 to determine if it's even.

If the number divides evenly by 2 (no remainder), it’s even.  
If there’s a remainder, it’s odd.

This can be done using:
- Modulo: Check if remainder when divided by 2 is 0
- Bitwise AND: Check if the least significant bit is 0

---

## 💡 Real-World Metaphor

Imagine you're organizing chairs into pairs:

- If every chair gets a buddy and no one’s left out, the number is even.
- If one chair is left alone, the number is odd.

**Example:**
- 10 chairs → Everyone has a pair → Even ✅  
- 11 chairs → 1 chair is left alone → Odd ❌

---

## 🧮 Approaches to Determine If a Number is Even or Odd

| 🔢 Approach         | ✅ Condition                  | ⚙️ Logic Used                             | 🧠 Explanation                                                                 | 🚀 Performance        | 💼 When to Use                    |
|---------------------|-------------------------------|--------------------------------------------|--------------------------------------------------------------------------------|------------------------|-----------------------------------|
| **Modulo Operator** | `n % 2 == 0`                  | Divides number by 2 and checks remainder   | If remainder is 0, it's even. Else, it's odd.                                  | Time: O(1), Space: O(1) | Best for readability & clarity   |
| **Bitwise AND**     | `(n & 1) == 0`                | Checks last binary bit                     | Even numbers end with 0 in binary. Odd ends with 1.                            | Time: O(1), Space: O(1) | Best for optimization & speed    |
| **Division Check**  | `(n / 2) * 2 == n`            | Reverse multiplication check               | Only even numbers return to original value after divide→multiply.              | Time: O(1), Space: O(1) | Alternative math-based approach  |
| **Ternary Logic**   | `n >= 0 && n <= 10000 ? ...`  | Inline logic using ternary operator        | Short-hand logic, same as modulo or bitwise inside a ternary structure.        | Time: O(1), Space: O(1) | One-liners, quick returns        |
| **Exception Check** | Throws for invalid constraint | Defensive programming                      | If number is out of range, throw error. Otherwise, use bitwise or modulo.      | Time: O(1), Space: O(1) | For strict input control         |

---

## 📌 Key Insight:
- **Modulo** is easier to understand, ideal for beginners and interviews.
- **Bitwise** is faster and used in low-level system-level code or optimization scenarios.
- Both return the same result — **use based on context**: clarity vs. performance.

# Takeaways

- Modulo operator is the most intuitive for humans and interviewers.
- Bitwise operator is a neat optimization trick used under the hood in compilers, system code.
- Both methods are constant time and space — no drama, just efficiency.
- Knowing multiple ways to solve a simple problem is a sign of mastery, not overkill.
- Always balance clarity and performance depending on your audience: clarity > optimization in most app dev cases.
- Constraints matter — handle out-of-range inputs if specs demand.

---

# References & Deep Dives (Your go-to geek fuel)

1. [YouTube - Odd or Even Explanation](https://youtu.be/4Dc8KB-fFF4)
2. [GeeksforGeeks - Check Even or Odd](https://www.geeksforgeeks.org/check-whether-given-number-even-odd/)

---

# Tools Used

- Python for implementation (obviously).
- Basic arithmetic & bitwise operations.
- Logical conditionals for return values.

---

# Similar Questions on GeeksforGeeks to Level Up

- [Check whether a given number is even or odd without using % operator](https://www.geeksforgeeks.org/check-whether-a-number-is-even-or-odd-without-using-modulus-operator/)
- [Find if a number is odd or even using bitwise operators](https://www.geeksforgeeks.org/find-if-a-number-is-odd-or-even-using-bitwise-operators/)
- [Sum of even numbers in an array](https://www.geeksforgeeks.org/sum-of-even-numbers-in-an-array/)


