import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        int[] binaryArray = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0};

        Scanner scanner = new Scanner(System.in);

        // user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert the string to a char array
        char[] charArray = input.toCharArray();

        // Print the char array
        System.out.println("The characters in the array are:");
        for (char c : charArray) {
            System.out.print(c + " ");
         }
        }
    }
