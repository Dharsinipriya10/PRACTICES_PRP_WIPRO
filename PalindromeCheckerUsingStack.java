import java.util.*;
	import java.util.Stack;
	 
	public class PalindromeCheckerUsingStack {
	 
		public static void main(String[] args) {
			checkPalindromeUsingStack();
		}
	 
		public static void checkPalindromeUsingStack() {
			Scanner scan= new Scanner(System.in);
			String stringToCheck = scan.nextLine();
			String palindromeString = "";
			// initialize a stack
	                Stack<Character> stack = new Stack<Character>();
	                // iterate over the string
			for (int i = 0; i < stringToCheck.length(); i++) {
				char character = stringToCheck.charAt(i);
				stack.push(character);
			}
	                // iterate over the stack till it is empty
			while (!stack.isEmpty()) {
	                        // add the character at the top to a string   
				palindromeString = palindromeString + stack.pop();
			}
	                // compare original and reversed strings  
			if (stringToCheck.equals(palindromeString)) {
				System.out.println("String is palindrome");
			} else {
				System.out.println("String is not palindrome");
			}
			scan.close();
		}
	}

