package test;

public class Java_DSA_Day1 {
	static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static int[] removeEvenInt(int[] arr) {
		int oddCount = 0;
		
		for(int i : arr) {
			if(i % 2 != 0) {
				oddCount++;
			}
		}
		
		int[] formattedArr = new int[oddCount];
		
		int index = 0;
		
		for(int i : arr) {
			if(i % 2 != 0) {
				formattedArr[index] = i;
				index++;
			}
		}
		
		return formattedArr;
	}
	
	public static int[] reverseArray(int[] arr) {
		int index = arr.length - 1;
		int[] reversedArr = new int[arr.length];
		for (int i : arr) {
			reversedArr[index] = i;
			index--;
		}
		return reversedArr;
	}
	
	public static int findMin(int[] arr) {
		// edge case
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = arr[0];
		for(int i : arr) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
	
	public static int findSecondMaxValue(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMaxVal = Integer.MIN_VALUE;
		
		for(int i : arr) {
			if(i > secondMaxVal && i < max) {
				secondMaxVal = i;
			}
			if(i > max) {
				secondMaxVal = max;
				max = i;
			}
		}
		return secondMaxVal;
	}
	
	public static int[] moveZeroToEnd(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		for(int i : arr) {
			if(i == 0) {
				result[result.length - 1] = i;
			} else {
				result[index] = i;
				index++;
			}
		}
		return result;
	}
	
	public static int[] resizeArray(int[] arr, int newSize) {
		int[] result = new int[newSize];
		for(int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] numArr = new int[5];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 4;
		numArr[4] = 5;
		printArr(new int[] {3, 2, 1, 10, 9});
		printArr(numArr);
		
		int[] evenNumRemArr = {3, 2, 4, 7, 10, 6, 5};
		int[] result = removeEvenInt(evenNumRemArr);
		int[] numArr2 = {0, 1, 0, 4, 12};
		int[] numArr3 = {8, 1, 0, 2, 1, 0, 3};
		
		
		printArr(result);
		printArr(reverseArray(new int[] {3, 2, 1, 10, 9}));
		printArr(reverseArray(numArr));
		printArr(reverseArray(result));
		printArr(reverseArray(evenNumRemArr));
		
		System.out.println(findMin(numArr));
		// System.out.println(findMin(null));
		
		System.out.println(findSecondMaxValue(numArr));
		System.out.println(findSecondMaxValue(evenNumRemArr));
		System.out.println(findSecondMaxValue(new int[] {3, 2, 1, 10, 9}));
		System.out.println(findSecondMaxValue(new int[] {12, 34, 2, 34, 33, 1}));
		printArr(moveZeroToEnd(numArr2));
		printArr(moveZeroToEnd(numArr3));
		
		numArr3 = resizeArray(numArr3, numArr3.length + 3);
		printArr(numArr3);
	}

}
