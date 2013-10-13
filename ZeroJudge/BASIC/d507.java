package BASIC;

import java.util.Arrays;
import java.util.Scanner;

public class d507 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] triSide = new int[3];
		
		for(int i = 0; i < triSide.length; ++i){
			triSide[i] = input.nextInt();
		}
				
		Arrays.sort(triSide);
		
		if(Math.pow(triSide[0], 2) + Math.pow(triSide[1], 2) > Math.pow(triSide[2], 2)){
			System.out.println("acute triangle");
		}
		else if(Math.pow(triSide[0], 2) + Math.pow(triSide[1], 2) < Math.pow(triSide[2], 2)){
			System.out.println("obtuse triangle");
		}
		else{
			System.out.println("right triangle");
		}
	}

}
