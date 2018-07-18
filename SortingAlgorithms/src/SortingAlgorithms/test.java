package SortingAlgorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Base {
	private static void display() {
		System.out.println("Static or class method from Base");
	}
	
	public void print() {
		System.out.println("Non-static or instance method from Base");
	}
}

class Derived extends Base {
	private static void display() {
		System.out.println("Static or class method from Derived");
	}
	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
}

public class test {
	
	public static void line(int x, char ch) {
		for(int i = 0; i < x; i++) {
			System.out.printf("%c", ch);
		}
	}
	
	public static void drawTopT(int x) {
		for(int j = 0; j < x; j++) {
			line(2*j+1, '*');
			System.out.print("\n");
		}
	}
	
	public static void drawBottomT(int x) {
		for(int j = x; j > 0; j--) {
			line(2*j-x, '*');
			System.out.print("\n");
		}
	}
	
	public static String reverse(String word) {
		if (word == null || word.isEmpty()) return "";
		else return reverse(word.substring(1)) + (word.charAt(0));
	}
	
	public static boolean isUnique(String phrase) {
		boolean result = true;
		Set<Character> set = new HashSet();
		
		char characters[] = phrase.toCharArray();
		
		
		for(Character letter: characters) {
			if (!set.add(letter)) {
		        result = false;
		        break;
		    }
		}
		
		
		return result;
	}
	
	
	public static int getMinIndex(int[] array) {
		int minIndex = 0;
		String str = "";
				
		for(int i = 1; i < array.length; i++) {
			if(array[minIndex] > array[i]) {
				minIndex = i;
			}
		}
			
		
		return minIndex;
	}
	
	public static int countOccurence(String str) {
		int count = 0;
		
		Pattern pattern = Pattern.compile("([a-zA-Z0-9-]+)");
		Matcher matcher = pattern.matcher(str);
		
		while (matcher.find()) {
			System.out.println(matcher.group());			
		}
		
		return count;
	}
	
	public static void main(String args[])
	{
		countOccurence("str asdfsa flk asdst rsad fs-str");
	}
	
}