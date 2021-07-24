
public class w3_10 {
	static int min = 2147483647;
	static int max = -2147483648;

	public static void minmax(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
	}

	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		minmax(my_array);
		System.out.printf("%d%n", min);
		System.out.printf("%d", max);
	}
}

// 10. Write a Java program to find the maximum and minimum value of an array. 

// 14
// 77