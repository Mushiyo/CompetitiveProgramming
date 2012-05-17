//«Øbinary search tree
import java.util.Scanner;

public class d526 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int[] M = new int[N];
			
			for(int i = 0; i < M.length; ++i){
				M[i] = input.nextInt();
			}
			
			inOrder(M, 0);
			System.out.println();
		}
	}
	
	public static void inOrder(int[] tree, int index){
		if(index > tree.length - 1){
			return;
		}
		
		inOrder(tree, 2 * index + 1);//left child
		System.out.print(tree[index] + " ");
		inOrder(tree, 2 * index + 2);//right child
	}

}
