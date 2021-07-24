import java.util.Arrays;

public class w3_1 {
	public static void main(String[] args) {

		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		String[] my_array2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };

		System.out.printf("Original numeric array : %s%n", Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.printf("Sorted numeric array : %s%n", Arrays.toString(my_array1));
		
		System.out.printf("Original string array: %s%n", Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.printf("Sorted string array  : %s%n", Arrays.toString(my_array2));

	}
}

// 1. Write a Java program to sort a numeric array and a string array

/*
Original numeric array : [1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
Sorted numeric array : [1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013, 2035, 2165, 2365, 2456, 2458]
Original string array: [Java, Python, PHP, C#, C Programming, C++]
Sorted string array  : [C Programming, C#, C++, Java, PHP, Python]
*/