import java.util.Arrays;

public class w3_9 {
	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int newEl = 44;
		int newPos = 2;
		for (int i = newPos; i < my_array.length - 1; i++) {
			my_array[i] = my_array[i + 1];
		}
		my_array[newPos] = newEl;
		System.out.printf("%s", Arrays.toString(my_array));
	}
}

// 9. Write a Java program to insert an element (specific position) into an array. 

// 44 has become the 2nd element.
// [25, 14, 44, 36, 56, 77, 18, 29, 49, 49]