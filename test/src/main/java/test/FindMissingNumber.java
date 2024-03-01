package test;

import java.util.Arrays;

public class FindMissingNumber {
	static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static int findMissingNum(int[] arr) {
		int index = 0, missingNum = 0;
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[index] != 1) {
				missingNum = arr[index] + 1;
			}
			index++;
		}
		return missingNum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 7};
		int[] nums2 = {10, 3, 5, 4, 6, 8, 7, 9, 13};
		int missingNum = findMissingNum(nums);
		System.out.println(missingNum);
		missingNum = findMissingNum(nums2);
		System.out.println(missingNum);
		//printArr();
	}

}
