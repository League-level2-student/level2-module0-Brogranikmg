package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] listOfSongs = {"a song", "sarcophagus", "too many songs", "worst song made,", "3"};
		//2. print the third element in the array
		System.out.println(listOfSongs[2]);
		//3. set the third element to a different value
		listOfSongs[2] = "rats";
		//4. print the third element again
		System.out.println(listOfSongs[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < listOfSongs.length; i++) {
			System.out.println(listOfSongs[i]);
		}
		
		//6. make an array of 50 integers
		int[] newIntTable = new int[50];
		Random numrand = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for (int e = 0; e < newIntTable.length; e++) {
			newIntTable[e] = numrand.nextInt(99);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 100;
		for (int q = 0; q < newIntTable.length; q++) {
			if (newIntTable[q] < smallest) {
				smallest = newIntTable[q];
			}
		}
		System.out.println(smallest);
		System.out.println("---+|+---");
		//9 print the entire array to see if step 8 was correct
		for (int needle = 0; needle < newIntTable.length; needle++) {
			System.out.print(newIntTable[needle] + " ");
		}
		System.out.println("\n---+|+---");
		//10. print the largest number in the array.
		int largest = 0;
		for (int f = 0; f < newIntTable.length; f++) {
			if (newIntTable[f] > largest) {
				largest = newIntTable[f];
			}
		}
		System.out.println(largest);
	}
}
