
// 1. Write a Java program to get a number from the user and print whether it is
// positive or negative.
// Test Data
// Input number: 35
// Expected Output :
// Number is positive

// 2. Write a Java program to solve quadratic equations (use if, else if and
// else).
// Test Data
// Input a: 1
// Input b: 5
// Input c: 1
// Expected Output :
// The roots are -0.20871215252208009 and -4.7912878474779195

// 3. Write a Java program that takes three numbers from the user and prints the
// greatest number.
// Test Data
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87
// Expected Output :
// The greatest: 87

// 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number

// 5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
// Test Data
// Input number: 3
// Expected Output :
// Wednesday

// 6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
// Test Data
// Input floating-point number: 25.586
// Input floating-point another number: 25.589
// Expected Output :
// They are different

// 7. Write a Java program to find the number of days in a month.
// Test Data
// Input a month number: 2
// Input a year: 2016
// Expected Output :
// February 2016 has 29 days

// 8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
// Test Data
// Input an alphabet: p
// Expected Output :
// Input letter is Consonant

// 9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

// 10. Write a Java program to display the first 10 natural numbers.
// Expected Output :
// The first 10 natural numbers are:                                                
// 1                                                                                
// 2                                                                                
// 3                                                                                
// 4                                                                                
// 5                                                                                
// 6                                                                                
// 7                                                                                
// 8                                                                                
// 9                                                                                
// 10

// 11. Write a Java program to display n terms of natural numbers and their sum.
// Test Data
// Input the number: 2
// Expected Output :
// Input number:                                                                    
// 2                                                                                
// The first n natural numbers are :                                                
// 2                                                                                
// 1                                                                                
// 2                                                                                
// The Sum of Natural Number upto n terms :                                         
// 23

// 12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
// Test Data
// Input the 5 numbers : 1 2 3 4 5
// Expected Output :
// Input the 5 numbers :                                                            
// 1                                                                                
// 2                                                                                
// 3                                                                                
// 4                                                                                
// 5                                                                                
// The sum of 5 no is : 15                                                          
// The Average is : 3.0                          

// 13. Write a Java program to display the cube of the given number up to an integer.
// Test Data
// Input number of terms : 4
// Expected Output :
// Number is : 1 and cube of 1 is : 1                                               
// Number is : 2 and cube of 2 is : 8                                               
// Number is : 3 and cube of 3 is : 27                                              
// Number is : 4 and cube of 4 is : 64

// 14. Write a Java program to display the multiplication table of a given integer.
// Test Data
// Input the number (Table to be calculated) : Input number of terms : 5
// Expected Output :
// 5 X 0 = 0                                                                        
// 5 X 1 = 5                                                                        
// 5 X 2 = 10                                                                       
// 5 X 3 = 15                                                                       
// 5 X 4 = 20                                                                       
// 5 X 5 = 25

// 15. Write a Java program that displays the sum of n odd natural numbers.
// Test Data
// Input number of terms is: 5
// Expected Output :
// The odd numbers are :                                                            
// 1                                                                                
// 3                                                                                
// 5                                                                                
// 7                                                                                
// 9                                                                                
// The Sum of odd Natural Number upto 5 terms is: 25

// 16. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
// Test Data
// Input a number: 7
// Expected Output :
// Number is positive

// 17. Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
// Test Data
// Input a number: -2534
// Expected Output :
// Negative

// 18. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
// Test Data
// Input an integer number less than ten billion: 125463
// Expected Output :
// Number of digits in the number: 6

// 19. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
// Test Data
// Input first number: 2564
// Input second number: 3526
// Input third number: 2456
// Expected Output :
// All numbers are different

// 20. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
// Test Data
// Input first number: 1524
// Input second number: 2345
// Input third number: 3321
// Expected Output :
// Increasing order

package Basics;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        question1(scanner);
        question2(scanner);
        question3(scanner);
        question4(scanner);
        question5(scanner);
        question6(scanner);
        question7(scanner);
        question8(scanner);
        question9(scanner);
        question10();
        question11(scanner);
        question12(scanner);
        question13(scanner);
        question14(scanner);
        question15(scanner);
        question16(scanner);
        question17(scanner);
        question18(scanner);
        question19(scanner);
        question20(scanner);

        scanner.close();
    }

    // Q1: Positive, negative or zero number
    public static void question1(Scanner scanner) {
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

    // Q2: Solve quadratic equations
    public static void question2(Scanner scanner) {
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();
        double discriminant = (b * b) - (4 * a * c);
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is real and equal: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex: " + realPart + " ± " + imaginaryPart + "i");
        }
    }

    // Q3: Find the greatest number among three inputs
    public static void question3(Scanner scanner) {
        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = scanner.nextInt();
        int greatest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The greatest: " + greatest);
    }

    // Q4: Floating-point number evaluation (positive/negative/small/large)
    public static void question4(Scanner scanner) {
        System.out.print("Input a floating-point number: ");
        double num = scanner.nextDouble();
        if (num == 0) {
            System.out.println("Zero");
        } else {
            if (num > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
            if (Math.abs(num) < 1) {
                System.out.println("Small number");
            } else if (Math.abs(num) > 1_000_000) {
                System.out.println("Large number");
            }
        }
    }

    // Q5: Generate weekday from a number
    public static void question5(Scanner scanner) {
        System.out.print("Input number (1-7): ");
        int day = scanner.nextInt();
        String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        if (day >= 1 && day <= 7) {
            System.out.println(weekdays[day - 1]);
        } else {
            System.out.println("Invalid input");
        }
    }

    // Q6: Compare two floating-point numbers up to 3 decimal places
    public static void question6(Scanner scanner) {
        System.out.print("Input first floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input second floating-point number: ");
        double num2 = scanner.nextDouble();
        if (Math.abs(num1 - num2) < 0.001) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }

    // Q7: Find the number of days in a month (consider leap year)
    public static void question7(Scanner scanner) {
        System.out.print("Input a month number: ");
        int month = scanner.nextInt();
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        int daysInMonth = 0;
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                monthName = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                daysInMonth = 30;
                break;
            case 5:
                monthName = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                daysInMonth = 30;
                break;
            case 7:
                monthName = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                daysInMonth = 30;
                break;
            case 10:
                monthName = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysInMonth = 31;
                break;
            default:
                System.out.println("Invalid month");
                return;
        }
        System.out.println(monthName + " " + year + " has " + daysInMonth + " days");
    }

    // Q8: Check if the input character is a vowel or consonant
    public static void question8(Scanner scanner) {
        System.out.print("Input an alphabet: ");
        String input = scanner.next();
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = Character.toLowerCase(input.charAt(0));
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    // Q9: Check if a year is a leap year
    public static void question9(Scanner scanner) {
        System.out.print("Input the year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    // Q10: Display the first 10 natural numbers
    public static void question10() {
        System.out.println("The first 10 natural numbers are:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Q11: Print the sum of the first 10 natural numbers
    public static void question11(Scanner scanner) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }

    // Q12: Display the multiplication table of a given integer
    public static void question12(Scanner scanner) {
        System.out.print("Input a number to display its multiplication table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    // Q13: Reverse an integer
    public static void question13(Scanner scanner) {
        System.out.print("Input an integer to reverse: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Q14: Sum of individual digits of an integer
    public static void question14(Scanner scanner) {
        System.out.print("Input an integer: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // Q15: Find factorial of a number
    public static void question15(Scanner scanner) {
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    // Q16: Check if a number is prime
    public static void question16(Scanner scanner) {
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    // Q17: Find the greatest common divisor (GCD) of two numbers
    public static void question17(Scanner scanner) {
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        System.out.println("GCD: " + num1);
    }

    // Q18: Find the least common multiple (LCM) of two numbers
    public static void question18(Scanner scanner) {
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        int gcd = num1;
        int temp = num2;
        while (gcd != temp) {
            if (gcd > temp) {
                gcd -= temp;
            } else {
                temp -= gcd;
            }
        }
        int lcm = (num1 * num2) / gcd;
        System.out.println("LCM: " + lcm);
    }

    // Q19: Generate the Fibonacci series up to a given number
    public static void question19(Scanner scanner) {
        System.out.print("Input the number of terms: ");
        int terms = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci series: " + first + " " + second);
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Q20: Find the sum of the first n Fibonacci numbers
    public static void question20(Scanner scanner) {
        System.out.print("Input the number of terms: ");
        int terms = scanner.nextInt();
        int first = 0, second = 1;
        int sum = first + second;
        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            sum += next;
            first = second;
            second = next;
        }
        System.out.println("Sum of the first " + terms + " Fibonacci numbers: " + sum);
    }

}
