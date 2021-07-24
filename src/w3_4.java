
public class w3_4 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 };
		double sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		sum = sum / numbers.length;
		System.out.printf("%.2f", sum);
	}
}

// 4. Write a Java program to calculate the average value of array elements. 
