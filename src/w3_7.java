import java.util.Arrays;

public class w3_7 {

	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int remInd = 4;
		for (int i = remInd; i < my_array.length - 1; i++) {
			my_array[i] = my_array[i + 1];
		}
		System.out.printf("%s", Arrays.toString(my_array));
	}
}

// 7. Write a Java program to remove a specific element from an array. 

// [25, 14, 56, 15, 56, 77, 18, 29, 49, 49] The 4th element 36 has been removed.