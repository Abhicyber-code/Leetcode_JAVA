# ✅ Leetcode 73: Set Matrix Zeroes

---

## 📌 Quick Notes for Revision

### 🔸 Problem:
- Given `m x n` matrix.
- If any element is `0`, set entire **row** and **column** to `0`.
- Must be done **in-place**.

---

### ❌ Naive Approach:
- Use extra arrays `row[]` and `col[]` to store 0 positions.
- Time: `O(m * n)`
- Space: `O(m + n)` — not optimal.

---

### ✅ Optimized In-Place Approach (Used):

🧠 Trick:  
- Use **first row** and **first column** as **marker arrays**.
- Use 2 booleans:
  - `firstRow`: does the first row contain any `0`?
  - `firstCol`: does the first column contain any `0`?

---

### 🔁 Steps:

1. **Check** if first row & column contain 0 → set `firstRow`, `firstCol`.
2. **Traverse rest of matrix** (`i=1`, `j=1`):
   - If `matrix[i][j] == 0`, mark:
     - `matrix[i][0] = 0`
     - `matrix[0][j] = 0`
3. **Second pass**:
   - For each cell (excluding first row/col), if marker is 0 → set `matrix[i][j] = 0`.
4. **Final pass**:
   - If `firstRow == true` → set all of `matrix[0][j] = 0`
   - If `firstCol == true` → set all of `matrix[i][0] = 0`

---

### ⏱️ Time & Space:

| Metric   | Value    |
|----------|----------|
| Time     | O(m * n) |
| Space    | O(1) ✅   |

---

### 🧪 Example:

#### Input:
