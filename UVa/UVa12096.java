// WA
/* Filename: UVa12096.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class UVa12096 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int N = input.nextInt();
				Stack<Integer> setStack = new Stack<Integer>();
				Map<Set<Integer>, Integer> idMap = new HashMap<Set<Integer>, Integer>();
				List<Set<Integer>> setList = new ArrayList<Set<Integer>>();

				while (N > 0) {
					String instruction = input.next();

					if (instruction.equals("PUSH")) {
						int setId = getSetId(idMap, setList, new HashSet<Integer>());
						setStack.push(setId);
					} else if (instruction.equals("DUP")) {
						setStack.push(setStack.peek());
					} else {
						Set<Integer> s1 = setList.get(setStack.pop());
						Set<Integer> s2 = setList.get(setStack.pop());
						if (instruction.equals("UNION")) {
							s1.addAll(s2);
							setStack.push(getSetId(idMap, setList, s1));
						} else if (instruction.equals("INTERSECT")) {
							s1.retainAll(s2);
							setStack.push(getSetId(idMap, setList, s1));
						} else { // ADD
							s2.add(getSetId(idMap, setList, s1));
							setStack.push(getSetId(idMap, setList, s2));
						}
					}

					System.out.println(setList.get(setStack.peek()).size());

					--N;
				}

				System.out.println("***");

				--T;
			}
		}
	}

	private static int getSetId(Map<Set<Integer>, Integer> idMap, List<Set<Integer>> setList, Set<Integer> s) {
		if (idMap.containsKey(s)) {
			return idMap.get(s);
		} else {
			idMap.put(s, setList.size());
			setList.add(s);
			
			return setList.size() - 1;
		}
	}
}
