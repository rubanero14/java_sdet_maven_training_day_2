package test;

import java.util.Arrays;

public class FindMissingNumber {
	static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static int findMissingNumP(int[] arr) {
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
	
	public static int findMissingNumM(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		for(int i : arr) {
			sum -= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 7};
		int[] nums2 = {10, 3, 5, 4, 6, 8, 7, 9, 12, 1, 2};
		int[] nums3 = {2, 4, 1, 8, 6, 3, 7};
		int missingNum = findMissingNumP(nums);
		System.out.println(missingNum);
		missingNum = findMissingNumM(nums);
		System.out.println(missingNum);
		missingNum = findMissingNumP(nums2);
		System.out.println(missingNum);
		missingNum = findMissingNumM(nums2);
		System.out.println(missingNum);
		missingNum = findMissingNumP(nums3);
		System.out.println(missingNum);
		missingNum = findMissingNumM(nums3);
		System.out.println(missingNum);
		//printArr();
	}

}
