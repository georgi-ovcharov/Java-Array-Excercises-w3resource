
public class w3_14 {
	public static void main(String[] args) {
		String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if (my_array[i].equals(my_array[j])) {
					System.out.printf("%s%n", my_array[j]);
				}
			}
		}
	}
}

// 14. Write a Java program to find the common elements between two arrays (string values). 

// bcd
// oiu