package test;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

class Day1_Rajaruban_Works {
	int x, y;
	
	protected static int sumOfTwoNumbers(int x, int y) {
		return x + y;
	}
	
	protected static void swapTwoNumbers(int x, int y) {
		int z = y;
		y = x;
		x = z;
		System.out.println("Value of X: " + x + " and value of Y: " + y);
	}
	
	protected static String printGrades(int percentage) {
		String grade;
		if(percentage > 80) {
			grade = "Distiction";
		} else if(percentage >= 60 && percentage <= 80) {
			grade = "Good";
		} else if(percentage >= 40 && percentage < 60) {
			grade = "Pass";
		} else {
			grade = "Fail";
		}
		
		return grade;
	}
	
	protected static String showDayName(int number1) {
		String day;
		switch(number1) {
			case 1:
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tueday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 7:
				day = "Saturday";
				break;
			default:
				day = "Please enter correct value";
				
		}
		return day;
	}
	
	protected static void printTableOfNine() {
		boolean keepCounting = true;
		while(keepCounting) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(i);
				if(i == 9) {
					keepCounting = false;
				}
			}
		};
	}
	
	protected static void launchBrowserUsingSelenium(String url) {
		// Launch Chrome browser using Selenium
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
 
        // Maximize the browser
        driver.manage().window().maximize();
	 
        // Launch Website
        driver.get(url);
        
// 		// for facebook.com - input value injection and form action performing     
//        WebElement userName = driver.findElement(By.id("email"));
//        userName.sendKeys("DDFJOSDHFS");
//        driver.findElement(By.id("pass")).sendKeys("FSDGWERTW2313234");
//        driver.findElement(By.name("login")).click();
//        
//        String error;
//        
//        try {
//        	error = driver.findElement(By.className("_9ay7")).getText();
//        } catch(Exception e) {
//        	error = "Success.";
//        }
//        
//        System.out.println(error);
//        
//        String user;
//        
//    	  if(error.contains("The email address")) {
//    		System.out.println("Login failed.");
//        } else {
//        	user = driver.findElement(By.cssSelector(".x1lliihq.x6ikm8r.x10wlt62.x1n2onr6")).getText();
//        	System.out.println("Login passed: Logged in as " + user);
//        }
//    	
//		// for https://demo.guru99.com/test/radio.html - Clicking of radio and checkbox element
//    	List<WebElement> inputs = driver.findElements(By.name("webform"));
//    	for (WebElement input : inputs) {
//    		input.click();
//    		System.out.println(input);
//    	}
//    	
//        // for https://demo.guru99.com/test/newtours/register.php - selecting select element
//        // clicking link element
//        // performing actions sequentially
//        Select select = new Select(driver.findElement(By.name("country")));
//        select.selectByVisibleText("UNITED STATES");
//        driver.findElement(By.linkText("Home")).click();
//        Actions actions = new Actions(driver);
//        actions.build().perform();
        
        // for https://demo.guru99.com/popup.php
        // alert and pop up handling
        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();
        String MainWindow = driver.getWindowHandle();
        
        // to handle all new opened windows
        Set<String> Windows = driver.getWindowHandles();
        Iterator<String> Iterator = Windows.iterator();
        System.out.println(MainWindow);
        while(Iterator.hasNext()) {
        	String ChildWindow = Iterator.next();  
        	System.out.println(ChildWindow);
        	if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
        		// Switching to child window
        		driver.switchTo().window(ChildWindow);                                                                                       
                driver.findElement(By.name("emailid")).sendKeys("googool@gmail.com");                			
                driver.findElement(By.name("btnLogin")).click();
                
            	// Closing the Child Window.
                driver.close();		
        	}
        }
     	// Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
	}
	
	protected static String checkIsEvenOrOdd(int val) {
		return val + " is " + (val % 2 == 0 ?  "Even" : "Odd") + " number.";
	}
	
	protected static String findMinAndMax(double[] numArray) {
		double minValue = numArray[0];
		double maxValue = numArray[0];
		
		for (double num : numArray) {
			if(num > maxValue) {
				maxValue = num;
			}
			
			if(num < minValue) {
				minValue = num;
			}
		}
		
		return "Max value is: " + maxValue + ", \nMin value is: " + minValue;
	}
	
	protected static String checkIsPalindrome(String str) {
		String regex = "[^a-zA-Z]";
		String formattedStr = str.replaceAll(regex, "").toLowerCase();
		String[] strArr = formattedStr.split("");
		String[] reversedArr = new String[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
            reversedArr[i] = strArr[strArr.length - 1 - i];
        }
		
		formattedStr = String.join("", strArr);
		String reversedStr = String.join("", reversedArr);

		return str + (formattedStr.contentEquals(reversedStr) ? " is " : " not ") + "a Palindrome string";
	}
	
	
	protected static long factorialCalculator(long val) {
		if(val <= 0 || val > 20) {
			return 1;
		}

		return val * factorialCalculator(val - 1);
	}	
}

