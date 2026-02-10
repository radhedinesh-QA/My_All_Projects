package stringProgramms;

public class StringMethods {
	public static void main (String[] args)
	{
		
		String s = "Hi i am dinesh";
		String r = "Chigari";
		String n = "CHigari";
	
		//s.chars().forEach(System.out::println);
		
		//length(): Returns the length of the string.
		System.out.println(s.length());
		
		//isEmpty(): Checks if the string is empty (length is 0).
		System.out.println(s.isEmpty());
		
		//isBlank(): Checks if the string is empty or contains only whitespace (Java 11+).
		System.out.println(s);
		System.out.println(r);
		
		//toString(): Returns the string itself.
		System.out.println(s.toString());
		
		//hashCode(): Returns the hash code for the string.
		System.out.println(s.hashCode());
		
		//getBytes(): Encodes the string into a byte array.
		System.out.println(s.getBytes());
		
		//toCharArray(): Converts the string to a new character array. 
		char ch [] = s.toCharArray();
		System.out.println(ch);
		
		//charAt(int index): Returns the character at a specific position.
		System.out.println(s.charAt(5));
		
		//substring(int beginIndex) / substring(int beginIndex, int endIndex): Extracts a portion of the string as a new string.
		System.out.println(s.substring(8));
		System.out.println(s.substring(3, 8));
		
		//concat(String str): Adds another string to the end of the current string.
		System.out.println(s.concat(r));
		
		//indexOf(String str) / indexOf(String str, int fromIndex): Finds the index of the first occurrence of a substring.
		System.out.println(s.indexOf('n'));
		
		//lastIndexOf(String str) / lastIndexOf(String str, int fromIndex): Finds the index of the last occurrence of a substring.
		System.out.println(s.lastIndexOf('i'));
		
		//equals(Object otherObj): Compares two strings for exact character sequence match.
		System.out.println(n.equals(r));
		
		//equalsIgnoreCase(String anotherString): Compares two strings, ignoring case.
		System.out.println(n.equalsIgnoreCase(r));
		
		//compareTo(String anotherString): Compares two strings lexicographically.
		System.out.println(n.compareTo(r));
		
		//compareToIgnoreCase(String str): Compares two strings lexicographically, ignoring case.
		System.out.println(n.compareToIgnoreCase(r));
		
		//toLowerCase(): Converts the string to lowercase.
		System.out.println(s.toLowerCase());
		
		//toUpperCase(): Converts the string to uppercase.
		System.out.println(s.toUpperCase());
		
		//trim(): Removes leading and trailing whitespace. (Java 11+ offers strip(), stripLeading(), stripTrailing()).
		System.out.println(s.trim());
		
		//replace(char oldChar, char newChar) / replace(CharSequence target, CharSequence replacement): Replaces occurrences of characters or sequences.
		System.out.println(s.replace('d', 'H'));
		
		//replaceAll(String regex, String replacement): Replaces all substrings matching a regular expression.
		System.out.println(s.replaceAll("am", "hello"));
		
		//replaceFirst(String regex, String replacement): Replaces the first substring matching a regular expression.
		System.out.println(s.replaceFirst(" i", "we"));
		
		//contains(CharSequence s): Checks if the string contains a specific sequence.
		
		
		//startsWith(String prefix): Checks if the string begins with a specified prefix.
		
		
		//endsWith(String suffix): Checks if the string ends with a specified suffix.
		
		
		//join(CharSequence delimiter, CharSequence... elements): Joins elements with a delimiter.
		
		
		//split(String regex): Splits a string into an array based on a regular expression.
		
		
		//valueOf(): Static methods to get the string representation of various data types.
		
		
		//format(String format, Object... args): Returns a formatted string.
		
		
		//getBytes(): Encodes the string into a byte sequence.
		
		
		//matches(String regex): Checks if the string matches a regular expression.
		
		
		//intern(): Returns the string's canonical representation from the string pool. 
		
		
	}
}
