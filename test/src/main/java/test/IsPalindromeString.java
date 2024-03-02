package test;

public class IsPalindromeString {
	static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static boolean isPalindromeStr(String str) {
		String reversedStr = "";
		for (int i = 0; i < str.length(); i++) {
			reversedStr = str.charAt(i) + reversedStr;
		}
		return str.equalsIgnoreCase(reversedStr);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindromeStr("madam"));
		System.out.println(isPalindromeStr("that"));
	}

}
