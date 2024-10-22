package Basics;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        getListOfFilesInDirectory("path_to_directory");
        getFilesWithExtension("path_to_directory", ".txt");
        checkIfFileExists("path_to_file");
        checkReadWritePermissions("path_to_file");
        checkIfDirectoryOrFile("path_to_file");
        readFromConsole();
        readFileIntoByteArray("path_to_file");
        readFileLineByLine("path_to_file");
        readTextFile("path_to_file");
        storeFileInVariable("path_to_file");
        appendToFile("path_to_file", "Some text to append");
        readFirstThreeLines("path_to_file");
        takeInputAndOutput();
    }

    // 1. Get a list of all file/directory names in the given directory
    public static void getListOfFilesInDirectory(String dirPath) {
        File directory = new File(dirPath);
        String[] fileList = directory.list();
        if (fileList != null) {
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        }
    }

    // 2. Get specific files with extensions from a specified folder
    public static void getFilesWithExtension(String dirPath, String extension) {
        File directory = new File(dirPath);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    // 3. Check if a file or directory specified by pathname exists or not
    public static void checkIfFileExists(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File/Directory exists.");
        } else {
            System.out.println("File/Directory does not exist.");
        }
    }

    // 4. Check if a file or directory has read and write permissions
    public static void checkReadWritePermissions(String filePath) {
        File file = new File(filePath);
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }

    // 5. Check if the given pathname is a directory or a file
    public static void checkIfDirectoryOrFile(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("It's a directory.");
        } else if (file.isFile()) {
            System.out.println("It's a file.");
        }
    }

    // 8. Read input from the Java console
    public static void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }

    // 10. Read the contents of a file into a byte array
    public static void readFileIntoByteArray(String filePath) throws IOException {
        File file = new File(filePath);
        byte[] bytes = Files.readAllBytes(file.toPath());
        for (byte b : bytes) {
            System.out.print((char) b);
        }
    }

    // 11. Read file content line by line
    public static void readFileLineByLine(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    // 12. Read a plain text file
    public static void readTextFile(String filePath) throws IOException {
        String content = Files.readString(Paths.get(filePath));
        System.out.println(content);
    }

    // 13. Read a file line by line and store it in a variable
    public static String storeFileInVariable(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }

    // 15. Write and read a plain text file
    public static void writeAndReadFile(String filePath) throws IOException {
        String text = "This is some sample text.";
        Files.writeString(Paths.get(filePath), text);
        String content = Files.readString(Paths.get(filePath));
        System.out.println("File Content: " + content);
    }

    // 16. Append text to an existing file
    public static void appendToFile(String filePath, String text) throws IOException {
        Files.writeString(Paths.get(filePath), text, StandardOpenOption.APPEND);
        System.out.println("Text appended successfully.");
    }

    // 17. Read the first 3 lines of a file
    public static void readFirstThreeLines(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        for (int i = 0; i < 3; i++) {
            String line = reader.readLine();
            if (line != null) {
                System.out.println(line);
            }
        }
        reader.close();
    }

    // Method to take input of various data types and output them
    public static void takeInputAndOutput() {
        Scanner scanner = new Scanner(System.in);

        // Taking input for String
        System.out.print("Enter a String: ");
        String stringInput = scanner.nextLine();

        // Taking input for char
        System.out.print("Enter a char: ");
        char charInput = scanner.next().charAt(0); // Read the next char

        // Taking input for int
        System.out.print("Enter an int: ");
        int intInput = scanner.nextInt();

        // Taking input for boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanInput = scanner.nextBoolean();

        // Taking input for byte
        System.out.print("Enter a byte (between -128 to 127): ");
        byte byteInput = scanner.nextByte();

        // Taking input for float
        System.out.print("Enter a float: ");
        float floatInput = scanner.nextFloat();

        // Taking input for a one-dimensional array
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];

        System.out.println("Enter " + arraySize + " integers:");
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Taking input for a two-dimensional array
        System.out.print("Enter the number of rows for 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for 2D array: ");
        int cols = scanner.nextInt();
        int[][] twoDArray = new int[rows][cols];

        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        // Output the collected data
        System.out.println("\n--- Output ---");
        System.out.println("String: " + stringInput);
        System.out.println("Char: " + charInput);
        System.out.println("Int: " + intInput);
        System.out.println("Boolean: " + booleanInput);
        System.out.println("Byte: " + byteInput);
        System.out.println("Float: " + floatInput);

        // Output the one-dimensional array
        System.out.print("One-dimensional array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Output the two-dimensional array
        System.out.println("Two-dimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
