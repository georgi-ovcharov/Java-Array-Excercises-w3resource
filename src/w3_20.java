import java.util.ArrayList;
import java.util.Arrays;

public class w3_20 {
	public static void main(String[] args) {
		String[] my_array = new String[] { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));

		System.out.println(list);
	}
}

// 20. Write a Java program to convert an array to ArrayList. 