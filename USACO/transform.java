/*
ID: mushiyo1
LANG: JAVA
TASK: transform
*/
import java.util.Scanner;
import java.io.*;

public class transform {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("transform.in"));
		PrintWriter output = new PrintWriter(new File("transform.out"));
		
		while(input.hasNext()){
			int N = input.nextInt();
			input.nextLine();//eat change line
			char[][] before = new char[N][N];
			for(int i = 0; i < before.length; ++i){
				String aLine = input.nextLine();
				for(int j = 0; j < before[0].length; ++j){
					before[i][j] = aLine.charAt(j);
				}
			}
			
			char[][] after = new char[N][N];
			for(int i = 0; i < before.length; ++i){
				String aLine = input.nextLine();
				for(int j = 0; j < before[0].length; ++j){
					after[i][j] = aLine.charAt(j);
				}
			}
			
			output.println(transType(before, after));
		}
		
		input.close();
		output.close();
	}
	
	public static int transType(char[][] before, char[][] after){
		for(int i = 1; i <= 3; ++i){
			before = rotateCW90(before);
			if(isMatch(before,after)){
				return i;
			}
		}
		
		before = rotateCW90(before);
		
		before = reflect(before);
		if(isMatch(before,after)){
			return 4;
		}
		
		for(int i = 1; i <= 3; ++i){
			before = rotateCW90(before);
			if(isMatch(before,after)){
				return 5;
			}
		}
		
		before = rotateCW90(before);
		before = reflect(before);
		
		if(isMatch(before,after)){
			return 6;
		}
		else{
			return 7;
		}
		
	}
	
	public static char[][] rotateCW90(char[][] matrix){
		int size = matrix.length;
		char[][] matrixRCW90 = new char[size][size];
		
		for(int i = 0; i < size; ++i){
			for(int j = 0 ; j < size; ++j){
				matrixRCW90[j][size - 1 - i] = matrix[i][j];
			}
		}
		
		return matrixRCW90;
	}
	
	public static char[][] reflect(char[][] matrix){
		int size = matrix.length;
		char[][] reflectMatrix = new char[size][size];
		
		for(int i = 0; i < size; ++i){
			for(int j = 0 ; j < size; ++j){
				reflectMatrix[i][j] = matrix[i][size - 1 - j];
			}
		}
		
		return reflectMatrix;
	}
	
	public static boolean isMatch(char[][] matrix1, char[][] matrix2){
		for(int i = 0; i < matrix1.length; ++i){
			for(int j = 0; j < matrix1[0].length; ++j){
				if(matrix1[i][j] != matrix2[i][j]){
					return false;
				}
			}
		}
		
		return true;
	}

}
