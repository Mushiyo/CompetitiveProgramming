import java.util.Scanner;

public class u11498 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int K = input.nextInt();
			
			if(K == 0){
	    		break;
	    	}

	        int N = input.nextInt();
	        int M = input.nextInt();
	        
	        for(int i = 0; i < K; ++i){
	        	int X = input.nextInt();
	        	int Y = input.nextInt();

	        	if(X == N || Y == M){
	        		System.out.println("divisa");
	        	}
	        	else if(X > N && Y > M){
	        		System.out.println("NE");
	        	}
	        	else if(X < N && Y > M){
	        		System.out.println("NO");
	        	}
	        	else if(X < N && Y < M){
	        		System.out.println("SO");
	        	}
	        	else{
	        		System.out.println("SE");
	        	}
	        }
		}
	}
}
