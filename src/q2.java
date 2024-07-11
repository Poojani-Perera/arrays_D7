import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create and fill the array with random numbers between 1 and 100
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = 1 + random.nextInt(100);
        }

        // Print the array
        System.out.println("Array: " + Arrays.toString(array));

        // Count odd numbers at odd indices
        int oddCount = 0;
        for (int i = 1; i < size; i += 2) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Number of odd numbers at odd indices: " + oddCount);

        // Search for the number 100 in the array
        boolean contains100 = false;
        for (int num : array) {
            if (num == 100) {
                contains100 = true;
                break;
            }
        }
        System.out.println("Array contains 100: " + contains100);

        // Find the maximum and minimum values in the array
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
