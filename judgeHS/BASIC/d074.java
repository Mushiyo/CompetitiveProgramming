package BASIC;

import java.util.Scanner;

public class d074 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalClass = input.nextInt();
		int[] student = new int[totalClass];

		for (int i = 0; i < student.length; ++i) {
			student[i] = input.nextInt();
		}

		java.util.Arrays.sort(student);

		System.out.println(student[student.length - 1]);
	}

}
