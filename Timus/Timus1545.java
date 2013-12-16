import java.util.*;

public class Timus1545 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			Map<Character, ArrayList<String>> referenceBook = new HashMap<Character, ArrayList<String>>();
			int N = input.nextInt();

			while (N > 0) {
				String hieroglyph = input.next();

				if (referenceBook.containsKey(hieroglyph.charAt(0))) {
					ArrayList<String> tmp = referenceBook.get(hieroglyph
							.charAt(0));
					tmp.add(hieroglyph);
					referenceBook.put(hieroglyph.charAt(0), tmp);
				} else {
					ArrayList<String> tmp = new ArrayList<String>();
					tmp.add(hieroglyph);
					referenceBook.put(hieroglyph.charAt(0), tmp);
				}

				--N;
			}

			char initialLetter = input.next().charAt(0);
			if (referenceBook.containsKey(initialLetter)) {
				String[] capital = (String[]) referenceBook.get(initialLetter).toArray(new String[0]);

				for (String i : capital) {
					System.out.println(i);
				}
			}

		}
	}

}
