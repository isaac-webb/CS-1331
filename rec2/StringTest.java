// Credit where credit is due: thanks to another Stasko TA for writing this!

public class StringTest {
	public static void main(String[] args) {
		//Following lines are equivalent:
		String oneString = "to rule them all";
		String twoString = new String("to rule them all");
		//System.out.println("oneString: " + oneString);

		//Following lines are equivalent:
		String threeString = "";
		String fourString = new String();

		//strings are immutable!!!!
		//Concatenation: merging strings
		String fiveString = oneString + twoString;
		System.out.println(fiveString + "\n");

		//charAt: get character at an index
		char newChar = oneString.charAt(3);
		System.out.println("newChar: " + newChar + "\n");

		//equals: boolean declaring whether two strings are equal
		boolean areEqual = oneString.equals(twoString);
		System.out.println("areEqual: " + areEqual + "\n");

		//length: pretty self explanatory
		System.out.println(oneString.length());
	}
}
