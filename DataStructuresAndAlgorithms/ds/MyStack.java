/* Filename: Stack.java
 * Author: Mushiyo
 */
package ds;

import java.util.ArrayList;

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
