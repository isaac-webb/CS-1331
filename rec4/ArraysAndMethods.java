// Import statements for both the Random and Arrays utility classes
// Don't worry about Arrays, it's just to make printing arrays pretty
import java.util.Random;
import java.util.Arrays;

public class ArraysAndMethods {
	public static void main(String[] args) {
		// Dummy "passcodes"
		int[] arr = {1234, 5678, 9101};

		// Create a "deep copy" of our passcodes array so it is not modified
		int[] copy = new int[3];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}

		// Scramble the codes and save the result
		int[] modified = obfuscate(copy);

		// Print for our reference
		System.out.print("Original numbers: ");
		System.out.println(Arrays.toString(arr));
		System.out.print("copy array: ");
		System.out.println(Arrays.toString(copy));
		System.out.print("modified array: ");
		System.out.println(Arrays.toString(modified));
	}

	// A method that "scrambles" an array of 4 digit passcodes
	public static int[] obfuscate(int[] arr) {
		// Create the random number generator, no seed
		Random rand = new Random();

		// Use a traditional for loop because for each loops don't let you
		// modify the contents of the array (at least very easily)
		for (int i = 0; i < arr.length; i++) {
			// Simple math for scrambling the codes
			arr[i] *= rand.nextInt(9) + 1;
			arr[i] %= 10000;
		}

		// Experiment with this line and notice how modified changes
		// but copy still contains scrambled codes
		// arr = new int[3];

		// Return the array
		return arr;
	}
}
