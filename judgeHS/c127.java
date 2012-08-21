import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class c127 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pattern condPat = Pattern.compile("[PUI]=.+?[WVA]");
		int totalProbNum = input.nextInt();  
		input.nextLine();// eat the new Line character
		int probNum = 1;
		
		while(probNum <= totalProbNum){
			String probStatement = input.nextLine();
			Matcher matchCond = condPat.matcher(probStatement);
			String[] cond = new String[2];
			
			for(int i = 0; matchCond.find() && (i < cond.length); ++i){
				cond[i] = matchCond.group();
			}
			
			System.out.println("Problem #" + probNum);
			calculateSol(cond[0], cond[1]);
			if(probNum < totalProbNum){
				System.out.println();
			}
			
			++probNum;
		}
	}
	
	public static void calculateSol(String cond1, String cond2){
		boolean isCalculateP = false;
		boolean isCalculateU = false;
		boolean isCalculateI = false;
		
		if(cond1.matches("[UI].*") && cond2.matches("[UI].*")){
			isCalculateP = true;
		}
		
		if(cond1.matches("[PI].*") && cond2.matches("[PI].*")){
			isCalculateU = true;
		}
		
		if(cond1.matches("[PU].*") && cond2.matches("[PU].*")){
			isCalculateI = true;
		}
		
		if(isCalculateP){
			System.out.printf("P=%.2fW\n", calculateP(cond1, cond2));
		}
		
		if(isCalculateU){
			System.out.printf("U=%.2fV\n", calculateU(cond1, cond2));
		}
		
		if(isCalculateI){
			System.out.printf("I=%.2fA\n", calculateI(cond1, cond2));
		}
		
	}
	
	public static double calculateP(String cond1, String cond2){
		double mag1 = orderOfMag(cond1.charAt(cond1.length() - 2));
		double mag2 = orderOfMag(cond2.charAt(cond2.length() - 2));
		double U,I;
		double num1, num2;
		if(mag1 == 1){
			num1 = Double.valueOf(cond1.substring(2, cond1.length() - 1));
		}
		else{
			num1 = Double.valueOf(cond1.substring(2, cond1.length() - 2));
		}
		
		if(mag2 == 1){
			num2 = Double.valueOf(cond2.substring(2, cond2.length() - 1));
		}
		else{
			num2 = Double.valueOf(cond2.substring(2, cond2.length() - 2));
		}
		
		if(cond1.charAt(0) == 'U'){
			U = num1;
			I = num2;
		}
		else{
			I = num1;
			U = num2;
		}
		
		return I * U * mag1 * mag2;
	}
	
	public static double calculateU(String cond1, String cond2){
		double mag1 = orderOfMag(cond1.charAt(cond1.length() - 2));
		double mag2 = orderOfMag(cond2.charAt(cond2.length() - 2));
		double P, I, mag;
		double num1, num2;
		if(mag1 == 1){
			num1 = Double.valueOf(cond1.substring(2, cond1.length() - 1));
		}
		else{
			num1 = Double.valueOf(cond1.substring(2, cond1.length() - 2));
		}
		
		if(mag2 == 1){
			num2 = Double.valueOf(cond2.substring(2, cond2.length() - 1));
		}
		else{
			num2 = Double.valueOf(cond2.substring(2, cond2.length() - 2));
		}
		
		if(cond1.charAt(0) == 'P'){
			P = num1;
			I = num2;
			mag = mag1 / mag2;
		}
		else{
			I = num1;
			P = num2;
			mag = mag2 / mag1;
		}
		
		return (P / I) * mag;
	}

	public static double calculateI(String cond1, String cond2){
		double mag1 = orderOfMag(cond1.charAt(cond1.length() - 2));
		double mag2 = orderOfMag(cond2.charAt(cond2.length() - 2));
		double P, U, mag;
		double num1, num2;
		if(mag1 == 1){
			num1 = Double.valueOf(cond1.substring(2, cond1.length() - 1));
		}
		else{
			num1 = Double.valueOf(cond1.substring(2, cond1.length() - 2));
		}
		
		if(mag2 == 1){
			num2 = Double.valueOf(cond2.substring(2, cond2.length() - 1));
		}
		else{
			num2 = Double.valueOf(cond2.substring(2, cond2.length() - 2));
		}
		
		if(cond1.charAt(0) == 'U'){
			U = num1;
			P = num2;
			mag = mag2 / mag1;
		}
		else{
			P = num1;
			U = num2;
			mag = mag1 / mag2;
		}
		
		return (P / U) * mag;
	}
	
	public static double orderOfMag(char c){
		switch(c){
		case 'm':
			return 0.001;
		case 'k':
			return 1000;
		case 'M':
			return 1000000;
		default:
			return 1;
		}
	}
}
