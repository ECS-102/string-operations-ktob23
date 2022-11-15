import java.lang.*;
import java.io.*;
import java.util.*;
public class StringOps {

	//static hello method
	// take a string and print out "Hello string" or "Hello there" if blank
	public static String hello(String name) {
		if (name == "") {
			return "Hello there";
		}
		else {
			return "Hello " + name;
		}
	}

	//static  isPalindrome  
	// write a method to check if the given string is a palindrome
	public static boolean isPalindrome(String word) {
		//StringBuilder input = new StringBuilder();
		//input.append(word);
		//input.reverse();
		//if (word == input.toString()) {
		//	return true;
		//}
		//return false;
		String reversed = "";
		char[] try1 = word.toCharArray();
  
        for (int i = try1.length - 1; i >= 0; i--){
            reversed += try1[i];
		}

		if (word.equals(reversed)) {
			return true;
		}
		return false;
	}

	//instance trimAll
	// return Returns the substring after removing any leading and trailing whitespace from the specified string. 
	public static String trimAll(String word) {
		return word.replaceAll("\\s", "");
	}

}
