public class ConvertibleStrings {
	public int leastRemovals(String A, String B) {
		int[] charCountA = new int['I' - 'A' + 1];
		for (int i = 0; i < A.length(); ++i) {
			++charCountA[A.charAt(i) - 'A'];
		}
		
		for (int i = 0; i < 'I' - 'A'; ++i) {
			System.out.print(charCountA[i] + " ");
		}
		System.out.println();

		int[] charCountB = new int['I' - 'A' + 1];
		for (int i = 0; i < B.length(); ++i) {
			++charCountB[B.charAt(i) - 'A'];
		}
		
		for (int i = 0; i < 'I' - 'A'; ++i) {
			System.out.print(charCountB[i] + " ");
		}
		System.out.println();

		int leastRemoval = 0;

		return leastRemoval;
	}

}
