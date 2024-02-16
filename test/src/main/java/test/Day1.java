package test;

public class Day1 extends Day1_Rajaruban_Works {
	public static void main(String[] args) {
		Day1_Rajaruban_Works d1 = new Day1_Rajaruban_Works();
		
		d1.x = 2;
		d1.y = 3;
		
		int x = d1.x;
		int y = d1.y;
		
		System.out.println("Sum of two numbers: " + sumOfTwoNumbers(x, y));
		
		swapTwoNumbers(x, y);
		
		System.out.println(printGrades(81));
		
		printTableOfNine();
		
		launchBrowserUsingSelenium("https://demo.guru99.com/popup.php");
		
		System.out.println(checkIsEvenOrOdd(99));
		
		double[] numArray = {5, 6, 4, 30, 1, 2, 0.5};
		System.out.println(findMinAndMax(numArray));	
		
		System.out.println(checkIsPalindrome("kayak"));
		
		long factorial = 10;
		long result = factorialCalculator(factorial);
		System.out.println("Factorial for " + factorial + " is " + result);	
	}
}
