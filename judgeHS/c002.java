import java.util.Scanner;

public class c002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		while( n != 0){
			System.out.println("f91(" + n + ") = " + f91(n));
			n = input.nextInt();
		}
	}
	
	public static int f91(int n){
		if(n >= 101){
			return n - 10;
		}
		else{
			int[] nTerm = new int[n];
			return f91Helper(n, nTerm);
		}
	}
	
	public static int f91Helper(int n, int[] nTerm){
		int index = f91(n + 11);
		
		if(f91(index) != 0){
			return f91(index);
		}
		else{
			nTerm[index] = f91(index);
			return nTerm[index];		
		}
	}

}
