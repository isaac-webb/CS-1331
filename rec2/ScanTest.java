// Credit where credit is due: thanks to another Stasko TA for writing this!

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner newScan = new Scanner(System.in);

		System.out.println("Enter input here:");
		String firstWord = newScan.next();
		System.out.println(firstWord);

		System.out.println("Enter input here:");
		String firstLine = newScan.nextLine();
		System.out.println(firstLine);

		//System.out.println("Enter input here:");
		//int firstInt = newScan.nextInt();
		//System.out.println(firstInt);

		//System.out.println("Enter input here:");
		//Boolean hasInt = newScan.hasNextInt();
		//System.out.println(hasInt);
	}
}

//Using hasNext() to avoid exceptions
//Newline character
//
