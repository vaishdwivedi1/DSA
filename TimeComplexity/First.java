// 1 int a = 0, b = 0;
// for (int i = 0; i < N; i++) {
// a = a + rand(); // rand() is O(1) time and O(1) space
// }
// for (int j = 0; j < M; j++) {
// b = b + rand();
// }
// Time complexity: O(N + M)
// Space complexity: O(1) (constant space)

// 2 int a = 0;
// for (int i = 0; i < N; i++) {
// for (int j = N; j > i; j--) {
// a = a + i + j;
// }
// }
// Time complexity: O(N^2)

// Consider the following for loops:

// A) for(i = 0; i < n; i++)

// B) for(i = 0; i < n; i += 2)

// C) for(i = 1; i < n; i *= 2)

// D) for(i = n; i > -1; i /= 2)
// If n is the size of input(positive), which function is the most efficient? In
// other words, which loop completes the fastest.
// c

// 4 int count = 0;
// for (int i = N; i > 0; i /= 2) {
//     for (int j = 0; j < i; j++) {
//         count += 1;
//     }
// }
// Outer loop: O(log N), Inner loop: O(i), where i reduces by half.
// Time complexity: O(N)

// 5  What does it mean when we say that an algorithm X is asymptotically more efficient than Y?
// When we say algorithm X is asymptotically more efficient than Y, it means that for large input sizes (n → ∞), X will have a lower growth rate in its time complexity compared to Y.

// 6 int j = 0;
// for (int i = 0; i < n; ++i) {
//     while (j < n && arr[i] < arr[j]) {
//         j++;
//     }
// }
// Outer loop runs O(n), inner loop runs O(n).
// Time complexity: O(n)

// 7 The functions in increasing order of complexity:

// f3(n) = n log n
// f2(n) = n^(3/2)
// f4(n) = n^(log n)
// f1(n) = 2^n
// So, the correct order is: f3, f2, f4, f1.

// 8 int gcd(int n, int m) {
//     if (n % m == 0) return m;
//     if (n < m) swap(n, m);
//     while (m > 0) {
//         n = n % m;
//         swap(n, m);
//     }
//     return n;
// }
// Time complexity: O(log n)

// 9 int i, j, k = 0;
// for (i = n / 2; i <= n; i++) {
//     for (j = 2; j <= n; j = j * 2) {
//         k = k + n / 2;
//     }
// }
// Outer loop: O(n), Inner loop: O(log n)
// Time complexity: O(n log n)

// 10 int a = 0, i = N;
// while (i > 0) {
//     a += i;
//     i /= 2;
// }
// Time complexity: O(log N)

// 11 int a = 0, b = 0;
// for (int i = 0; i < N; i++) {
//     for (int j = 0; j < N; j++) {
//         a = a + j;
//     }
// }
// for (int k = 0; k < N; k++) {
//     b = b + k;
// }
// Time complexity: O(N^2 + N) = O(N^2)
// Space complexity: O(1) (constant space)

// 12 int searchNumOccurrence(vector<int> &V, int k, int start, int end) {
//     if (start > end) return 0;
//     int mid = (start + end) / 2;
//     if (V[mid] < k) return searchNumOccurrence(V, k, mid + 1, end);
//     if (V[mid] > k) return searchNumOccurrence(V, k, start, mid - 1);
//     return searchNumOccurrence(V, k, start, mid - 1) + 1 + searchNumOccurrence(V, k, mid + 1, end);
// }
// Worst case: O(n)

// 13 int findMinPath(vector<vector<int> > &V, int r, int c) {
//     int R = V.size();
//     int C = V[0].size();
//     if (r >= R || c >= C) return 100000000; // Infinity
//     if (r == R - 1 && c == C - 1) return 0;
//     return V[r][c] + min(findMinPath(V, r + 1, c), findMinPath(V, r, c + 1));
// }
// Time complexity: O(2^(R + C)) without memoization

// int memo[101][101];
// int findMinPath(vector<vector<int>>& V, int r, int c) {
//     int R = V.size();
//     int C = V[0].size();
//     if (r >= R || c >= C) return 100000000;
//     if (r == R - 1 && c == C - 1) return 0;
//     if (memo[r][c] != -1) return memo[r][c];
//     memo[r][c] = V[r][c] + min(findMinPath(V, r + 1, c), findMinPath(V, r, c + 1));
//     return memo[r][c];
// }
// Time complexity: O(R * C) with memoization