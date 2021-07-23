import java.util.Arrays;

public class w3_17 {
	public static void main(String[] args) {
		int[] my_array = { 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		
		Arrays.sort(my_array);
		for (int i = my_array.length - 2; i < my_array.length - 1; i++) {
			System.out.print(my_array[i]);
		}
		
	}
}
