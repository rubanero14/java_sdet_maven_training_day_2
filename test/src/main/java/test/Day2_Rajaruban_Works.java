package test;
import java.io.BufferedReader;
import java.io.FileReader;

public class Day2_Rajaruban_Works {
	protected static int divideByZero(int val) {
		int result = val;
		
		if(result <= 0) {
			return 0;
		}
		
		try {
			result = val / divideByZero(val - 1);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return result;
	}
	
	protected static int[] deleteByIndexOnArray(int[] arr, int indexToDelete) {
		int arrLength = arr.length;
		int[] newArr = new int[arrLength - 1];
		int newArrIndex = 0;
		
		try {
			for(int i = 0; i < arrLength; i++) {
				if(i != indexToDelete) {
					newArr[newArrIndex] = arr[i];
					newArrIndex++;
					System.out.println("Added into newArray: " + arr[i]);
				} else {
					System.out.println("Removed: " + arr[i] + " from index: " + indexToDelete);
				}
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e);
		}
		
		return newArr;
	}
	
	@SuppressWarnings("resource")
	protected static void readFileContents(String fileAbsolutePath) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileAbsolutePath));
			System.out.println(reader.readLine());
		} catch(Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
