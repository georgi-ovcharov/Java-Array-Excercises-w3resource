import java.util.Arrays;

public class w3_8 {
	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] new_array = new int[10];
		
		for (int i = 0; i < my_array.length; i++) {
			new_array[i] = my_array[i];
		}
		System.out.printf("%s%n", Arrays.toString(my_array));
		System.out.printf("%s", Arrays.toString(new_array));
	}
}
