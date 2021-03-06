import java.util.Arrays;
import java.util.regex.Pattern;

public class StringExample {
	public static void main(String[] args) {
		String s1 = new String("Name Apex");
		String s2 = new String("       Extra spaces         ");

		System.out.println("character at index 5 is: " + s1.charAt(5));

		System.out.println("length of the string is: " + s1.length());

		s1 = s1.concat(" Hello World");
		System.out.println(s1);

		System.out.println(s1.replace('e', 'E'));

		System.out.println(s1.substring(3));

		System.out.println(s1.substring(5, 9));

		System.out.println(s1.toLowerCase());

		System.out.println(s1.toUpperCase());

		System.out.println(s2.trim());

		char[] arrayWithChars = s1.toCharArray();
		System.out.println(arrayWithChars);

		System.out.println(s1.contains("Apex"));
		System.out.println(s1.contains("Fremont"));

		StringBuffer sb = new StringBuffer("This is an example of String Buffer");
		System.out.println(sb.append(" from java class"));
		System.out.println(sb.length());
		System.out.println(sb.insert(10, " INSERT"));
		System.out.println(sb.replace(8, 17, "another"));
		System.out.println(sb.delete(8, 15));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());// default capacity is 16, if increase
											// (old capacity*2)+2

		StringBuilder sBuilder = new StringBuilder("Example of String Builder");
		System.out.println(sBuilder.append(". This example is from Java Class"));
		System.out.println(sBuilder.append('!'));
		System.out.println(sBuilder.capacity());

		String name = "julia.pat-USA ~ Fremont";

		// Splitting the string into two parts ilia.pant and USA
		String[] parts = name.split("-");
		System.out.println(Arrays.toString(parts));

		// Splitting by dots
		// java.lang.String.split splits on regular expressions and . in regular
		// expression means "any character
		String[] parts1 = name.split("\\.");
		System.out.println(Arrays.toString(parts1));

		String[] parts3 = name.split(Pattern.quote("."));
		System.out.println(Arrays.toString(parts3));

		String[] parts2;
		if (name.contains("~")) {
			parts2 = name.split("~");
		} else {
			throw new IllegalArgumentException("String" + name + "does not contain ~");
		}
		System.out.println(Arrays.toString(parts2));

		// Keep the split character
		String[] parts4 = name.split("(?<=-)");
		System.out.println(Arrays.toString(parts4));
		// julia.pat-
		// USA

		parts4 = name.split("(?=-)");
		System.out.println(Arrays.toString(parts4));

		String name1 = "690-908=9807-julia pat";
		String[] parts5 = name1.split("=", 2);
		System.out.println(Arrays.toString(parts5));
		// "004-034556-42";
		// 004
		// 034556-42

	}

}
