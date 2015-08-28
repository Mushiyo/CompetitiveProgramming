import java.util.Scanner;
import java.util.ArrayList;

public class Timus1654Sol1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String cipheredMessage = input.nextLine();
			decipher(cipheredMessage);
		}
	}

	public static void decipher(String cipheredMessage) {
		MyStack<Character> decipherStack = new MyStack<Character>();

		for (int i = cipheredMessage.length() - 1; i >= 0; --i) {
			if (decipherStack.isEmpty()) {
				decipherStack.push(cipheredMessage.charAt(i));
			}
			else {
				if (cipheredMessage.charAt(i) == decipherStack.peek()) {
					decipherStack.pop();
				}
				else{
					decipherStack.push(cipheredMessage.charAt(i));
				}
			}
		}

		while (!decipherStack.isEmpty()) {
			System.out.print(decipherStack.pop());
		}
		System.out.println();
	}
}

class MyStack<E> {
	ArrayList<E> content = new ArrayList<E>();

	public boolean isEmpty() {
		return content.isEmpty();
	}

	public E peek() {
		return content.get(content.size() - 1);		
	}

	public E push(E e) {
		content.add(e);		
		return e;
	}

	public E pop() {
		E e = content.remove(content.size() - 1);
		return e;
	}
}
