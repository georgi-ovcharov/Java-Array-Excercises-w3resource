
public class w3_5 {

	public static boolean contains(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
		
		System.out.printf("%s%n", contains(my_array1, 2222));
		System.out.printf("%s", contains(my_array1, 1458));
	}
}
