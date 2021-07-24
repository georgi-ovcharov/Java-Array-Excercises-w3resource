
public class w3_22b {
	public static void main(String[] args) {
		int[] a1 = { 2, 7, 4, -5, 11, 5, 20 };
		int[] a2 = { 14, -15, 9, 16, 25, 45, 12, 8 };
		int num1 = 15;
		int num2 = 30;

		for (int i = 0; i <= a1.length - 1; i++) {
			for (int j = i + 1; j <= a1.length - 1; j++) {
				if (a1[i] + a1[j] == num1) {
					System.out.println(a1[i] + " + " + a1[j] + " = " + num1);
				}
			}
		}
		
		for (int i = 0; i <= a2.length - 1; i++) {
			for (int j = i + 1; j <= a2.length - 1; j++) {
				if (a2[i] + a2[j] == num2) {
					System.out.println(a2[i] + " + " + a2[j] + " = " + num2);
				}
			}
		}
	}
}

// 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number. 

/*
4 + 11 = 15
-5 + 20 = 15
14 + 16 = 30
-15 + 45 = 30
*/