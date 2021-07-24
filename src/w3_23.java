public class w3_23 {
	static void equalityCheck(int[] myArray1, int[] myArray2) {
		boolean isEqual = true;
		
		if (myArray1.length == myArray2.length) {
			for (int i = 0; i < myArray1.length; i++) {
				if (myArray1[i] != myArray2[i]) {
					isEqual = false;
				}
			}
		} else {
			isEqual = false;
		}
		
		if (isEqual) {
			System.out.println("Two arrays are equal.");
		} else {
			System.out.println("Two arrays are not equal.");
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 2, 5, 7, 9, 11 };
		int[] array2 = { 2, 5, 7, 8, 11 };
		int[] array3 = { 2, 5, 7, 9, 11 };

		equalityCheck(array1, array2);
		equalityCheck(array1, array3);
	}
}

// 23. Write a Java program to test the equality of two arrays. 

