/**
 * 
 */
package search;

import java.util.Scanner;

/**
 * @author A.Ajjarani
 *
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1 Scanner Object Declaration
		Scanner input = new Scanner(System.in);

		// 2 - Length of List : determine
		System.out.println("Enter number of elements");
		int len = input.nextInt();

		// 3 - Declare an Array with the length provided
		int[] array = new int[len];

		// 4 - Fill in the array with each elements
		System.out.println("Enter " + len + " integers");
		for (int i = 0; i < len; i++)
			array[i] = input.nextInt();

		// 5 - Search element should be entered
		System.out.println("Enter value to find");
		int search = input.nextInt();

		// 6 - Linear Search Algorithm runs now
		int i;
		for (i = 0; i < len; i++) {
			if (array[i] == search) /* Searching element is present */
			{
				System.out.println(search + " is present at location " + (i + 1) + ".");
				break;
			}
		}
		if (i == len) /* Searching element is absent */
			System.out.println(search + " is not present in array.");
	}

}
