import java.util.Arrays;
import java.util.Random;
public class q3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] Myarray =new int[50];
        int[] reversedArray = new int[50];

        for (int i = 0; i < 50; i++) {
            Myarray[i] = 1 + random.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(Myarray));

        // Print the original array
        System.out.println("Original Array:");
        for (int num : Myarray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 2: Create a new array and store the values in reverse order
        for (int i = 0; i < 50; i++) {
            reversedArray[i] = Myarray[50 - 1 - i];
        }

        // Print the reversed array
        System.out.println("\nReversed Array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 3: Calculate the probability of getting negative numbers
        int negativeCount = 0;
        for (int num :reversedArray ) {
            if (num < 0) {
                negativeCount++;
            }
        }
        double negativeProbability = (double) negativeCount / 50;

        // Print the probability of negative numbers
        System.out.println("\nProbability of Negative Numbers:");
        System.out.println(negativeProbability);

    }
}
