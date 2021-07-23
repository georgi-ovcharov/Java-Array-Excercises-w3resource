import java.util.Arrays;

public class w3_24 {
	public static void main(String[] args) {
		int[] a = new int[] { 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18 };
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] - a[i+1] != -1 ) {
				System.out.print(a[i] + 1 + " ");
			}
		}
		
	}
}
