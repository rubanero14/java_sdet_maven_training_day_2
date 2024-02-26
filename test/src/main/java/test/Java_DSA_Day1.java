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
		printArr(result);
	}

}
