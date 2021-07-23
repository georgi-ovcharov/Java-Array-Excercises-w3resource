
public class w3_6 {

	public static int index(int[] ar, int ind) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == ind) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.printf("%d", index(my_array, 49));
	}
}
