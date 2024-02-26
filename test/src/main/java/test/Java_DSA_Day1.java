package test;

public class Java_DSA_Day1 {
	static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] numArr = new int[5];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 4;
		numArr[4] = 5;
		
		printArr(numArr);
	}

}
