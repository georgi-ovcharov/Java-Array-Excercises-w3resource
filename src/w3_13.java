import java.util.HashSet;

public class w3_13 {
	public static void main(String[] args) {
		String[] array1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };
		String[] array2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					{
						set.add(array1[i]);
					}
				}
			}
		}
		System.out.printf("%s", set);
	}
}

// 13. Write a Java program to find the duplicate values of an array of string values. 

// [JAVA, SQL]