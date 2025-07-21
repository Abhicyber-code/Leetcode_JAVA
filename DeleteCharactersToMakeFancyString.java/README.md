# 1957. Delete Characters to Make Fancy String

🔗 [LeetCode Link](https://leetcode.com/problems/delete-characters-to-make-fancy-string/)

## 📝 Problem Description
A **fancy string** is one where **no three consecutive characters are the same**.  
Given a string `s`, return a version where the **minimum number of characters** are deleted to make it fancy.  
The result will always be unique.

---

## 💡 Approach

We iterate through the string, keeping track of the current character and how many times it has repeated consecutively.  
If the count becomes **3 or more**, we **skip adding** that character to the result.

### Steps:
- Use a `StringBuilder` for efficient string manipulation.
- Keep a counter for repeated characters.
- Append only if the counter is less than 3.

---

## ⏱️ Time and Space Complexity

- **Time:** O(n) — Single pass through the string.
- **Space:** O(n) — For building the resulting string.

---

## ✅ Edge Cases Handled

- Input of length 0 or 1
- Entire string with repeating characters (e.g., `"aaaaa"`)
- Already valid fancy strings (e.g., `"aab"`)

---

## 🚀 Quick Revision Notes

- Use a `count` to track consecutive same characters.
- Reset `count` when a new character is found.
- Append only if `count < 3`.
- Initialize result with first character.

---

## ✅ Summary

Simple one-pass greedy solution using a frequency counter. Very efficient and readable.
