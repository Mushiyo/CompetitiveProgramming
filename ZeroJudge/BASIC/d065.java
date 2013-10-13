package BASIC;

import java.util.Scanner;

public class d065 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] solvedProblem = new int[3];
		
		solvedProblem[0] = input.nextInt();
		solvedProblem[1] = input.nextInt();
		solvedProblem[2] = input.nextInt();
		
		java.util.Arrays.sort(solvedProblem);
		System.out.println(solvedProblem[2]);
	}

}
