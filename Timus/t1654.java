import java.util.Scanner;
import java.util.Stack;

public class t1654 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String cipheredMessage = input.nextLine();

			decipher(cipheredMessage);
		}
	}

	public static void decipher(String cipheredMessage) {
		Stack<Character> decipherMachine = new Stack<Character>();
		
		for(int i = cipheredMessage.length() - 1; i >= 0; --i){
			if(!decipherMachine.empty()){
				if(decipherMachine.peek().equals(cipheredMessage.charAt(i))){
					decipherMachine.pop();
				}
				else{
					decipherMachine.push(cipheredMessage.charAt(i));
				}
			}
			else{
				decipherMachine.push(cipheredMessage.charAt(i));
			}
		}
		
		
		while(!decipherMachine.empty()){
			System.out.print(decipherMachine.pop());
		}
		
		System.out.println();
	}

}
