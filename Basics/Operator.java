package Basics;

public class Operator {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        int c = 5;
        System.out.println("Initial value of c: " + c);
        System.out.println("Post-increment: " + (c++)); // Prints 5, then increments
        System.out.println("Value after post-increment: " + c); // Prints 6
        System.out.println("Pre-increment: " + (++c)); // Increments first, then prints 7

        int largest = (a > b) ? a : b;
        System.out.println("The largest number is: " + largest);
    }
}

class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}

class RelationalOperators {
    public static void main(String[] args) {
        int a = 15, b = 20;
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " and " + b + " are equal");
        }
    }
}

class LogicalOperators {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even");
        } else {
            System.out.println(num + " does not satisfy the conditions");
        }
    }
}

class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011
        System.out.println("a & b: " + (a & b)); // Binary: 0001 -> 1
        System.out.println("a | b: " + (a | b)); // Binary: 0111 -> 7
        System.out.println("a ^ b: " + (a ^ b)); // Binary: 0110 -> 6
    }
}

class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        a += 5; // a = a + 5
        System.out.println("a after += 5: " + a);
        a *= 2; // a = a * 2
        System.out.println("a after *= 2: " + a);
    }
}

class TernaryOperator {
    public static void main(String[] args) {
        int a = 8, b = 12;
        int largest = (a > b) ? a : b;
        System.out.println("The largest number is: " + largest);
    }
}

class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial value of a: " + a);
        System.out.println("Post-increment: " + (a++)); // Prints 5, then increments
        System.out.println("Value after post-increment: " + a); // Prints 6
        System.out.println("Pre-increment: " + (++a)); // Increments first, then prints 7
    }
}
