/**
 * 
 */
package search;

import java.util.Scanner;

/**
 * Implementation for Binary Search
 * 
 * Assumptions : 
 * 1) Only Integers are allowed 
 * 2) Entered list is in ascending
 * order only .. i,e sorted ascending
 * 
 * @author A.Ajjarani
 *
 */
public class BinarySearch {

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

		// 4 - Fill in the array with each elements - only ascending order allowed
		System.out.println("Enter " + len + " integers");
		for (int i = 0; i < len; i++)
			array[i] = input.nextInt();
		
		// 5 - Search element should be entered
		System.out.println("Enter value to find");
		int search = input.nextInt();

		// 6 - Binary Search Algorithm runs now
		int first = 0;
		int last = len - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " is not present in the list.\n");
	}

}
