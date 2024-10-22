// 1 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *****
// *****
// *****
// *****
// *****

// 2 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *
// **
// ***
// ****
// *****

// 3 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// 1
// 12
// 123
// 1234
// 12345

// 4 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// 1
// 22
// 333
// 4444
// 55555

// 5 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *****
// ****
// ***
// **
// *

// 6 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// 12345
// 1234
// 123
// 12
// 1

// 7 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
//     *
//    ***
//   *****
//  *******
// *********

// 8 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *********
//  *******
//   *****
//    ***
//     *

// 9 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

// 10 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
// 11 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1

// 12 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// 1      1
// 12    21
// 123  321
// 12344321

// 13 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

// 14 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// A
// AB
// ABC
// ABCD
// ABCDE

// 15 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// ABCDE
// ABCD
// ABC
// AB
// A

// 16 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// A
// BB
// CCC
// DDDD
// EEEEE

// 17 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
//     A
//    ABA
//   ABCBA
//  ABCDCBA

// 18 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// E 
// D E 
// C D E 
// B C D E 
// A B C D E

// 19 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

// 20 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

// 21 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *****
// *   *
// *   *
// *   *
// *****

// 22 Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5

// package Basics;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scanner.nextInt();

        // pattern1(num);
        // pattern2(num);
        // pattern3(num);
        // pattern4(num);
        // pattern5(num);
        // pattern6(num);
        // pattern7(num);
        // pattern8(num);
        // pattern9(num);
        // pattern10(num);
        // pattern11(num);
        // pattern12(num);
        // pattern13(num);
        // pattern14(num);
        // pattern15(num);
        // pattern16(num);
        // pattern17(num);
        // pattern18(num);
        // pattern19(num);
        // pattern20(num);
        // pattern21(num);
        pattern22(num);

    }

    // pattern 1
    public static void pattern1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // pattern 2
    public static void pattern2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    // pattern 3
    public static void pattern3(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);

            }
            System.out.println();
        }
    }

    // pattern 4
    public static void pattern4(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);

            }
            System.out.println();
        }
    }

    // pattern 5
    public static void pattern5(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 6
    public static void pattern6(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    // pattern 7
    public static void pattern7(int num) {

        for (int i = 0; i < num; i++) {

            // space
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // pattern 8
    public static void pattern8(int num) {

        for (int i = 0; i < num; i++) {

            // This loop will print the spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // This loop will print asterisk.
            for (int j = 0; j < 2 * num - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 9
    public static void pattern9(int num) {

        pattern7(num);
        pattern8(num);
    }

    // pattern 10
    public static void pattern10(int num) {

        pattern2(num);
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 11
    public static void pattern11(int num) {

        // for even it tarts with 1
        for (int i = 0; i < num; i++) {

            int start = 1;
            if (i % 2 == 0) {
                start = 1;

            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start; // for flipping
            }
            System.out.println();
        }
    }

    // pattern 12
    public static void pattern12(int num) {

        // [num space num] n= 4
        // [1, 6, 1] 0(row) 6 = 2*n - 2*i - 2 = 8-2
        // [2, 4, 2] 1(row) 4 = 8- 2 * 1 - 2 = 8-2-2 = 4
        // [3, 4, 3] 1(row) 4 = 8- 2 * 2 - 2 = 8-4-2 = 2
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }

            for (int j = 0; j < 2 * num - 2 * i - 2; j++) {
                System.out.print(" ");

            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    // pattern 13
    public static void pattern13(int n) {
        // starting the number
        int num = 1;

        // Outer loop for the number of rows.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }

            System.out.println();
        }
    }

    // pattern 14
    public static void pattern14(int n) {
        // character .
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // pattern 15
    public static void pattern15(int n) {
        // character .
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    // pattern 16
    public static void pattern16(int n) {
        // character .
        for (int i = 0; i < n; i++) {

            char v = 'A';
            for (char ch = 0; ch <= i; ch++) {

                v = (char) ('A' + i);
                System.out.print(v);
            }
            System.out.println();
        }
    }

    // pattern 17
    public static void pattern17(int n) {
        // [space ,character, space] n=4
        // 0 [3,1,3] .
        for (int i = 0; i < n; i++) {

            // Printing spaces before characters.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Printing characters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // Printing spaces after characters.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line for the next row.
            System.out.println();
        }
    }

    // pattern 18
    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + (n - 1) - i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // pattern 19
    public static void pattern19(int n) {
        // [star space star] n=5
        // 0 [5,0,5] [n, 2i, n]
        // 1[4,2,4] [n, 2i, n]
        // 2 [3,4,3]

        // [1,8,1]
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < 2 * n - i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // pattern 20

    public static void pattern20(int n) {
        // [star space star] n=5
        // 0 [5,0,5] [n, 2i, n]
        // 1[4,2,4] [n, 2i, n]
        // 2 [3,4,3]

        // [1,8,1]

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j < 2 * n - i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern21(int n) {

        // way 1

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i < n - 1; i++) {

            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // way 2

        for (int i = 0; i < n; i++) {

            /*
             * Inner loop for printing
             * the stars at borders only.
             */
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Move to the next row.
            System.out.println();
        }

    }

    // patter 22
    public static  void pattern22(int n) {
        // Outer loop for the rows
        for (int i = 0; i < 2 * n - 1; i++) {
            // Inner loop for the columns
            for (int j = 0; j < 2 * n - 1; j++) {
                
                /* Initialising the top, down, left
                and right indices of a cell.*/
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;
                
                /* Minimum of 4 directions and then we 
                subtract from n because previously we 
                would get a pattern whose border has 0's, 
                but we want with border n's and then
                decreasing inside.*/
                System.out.print((n - Math.min(Math.min(top, bottom), Math.min(left, right))) + " ");
            }
            // Move to the next row
            System.out.println();
        }
    }
}