import java.util.Scanner;

public class UVa1237 {
	static class Record {
		String carMaker;
		int lowestPrice;
		int highestPrice;

		Record(String maker, int l, int h) {
			carMaker = maker;
			lowestPrice = l;
			highestPrice = h;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 0; t < T; ++t) {
				if (t > 0) {
					System.out.println();
				}

				int D = input.nextInt();
				Record[] database = new Record[D];

				for (int d = 0; d < D; ++d) {
					database[d] = new Record(input.next(), input.nextInt(),
							input.nextInt());
				}

				int Q = input.nextInt();
				for (int q = 0; q < Q; ++q) {
					int P = input.nextInt();
					boolean isUndetermined = true;
					String queryResult = "";

					for (int d = 0; d < D; ++d) {
						if (database[d].lowestPrice <= P
								&& P <= database[d].highestPrice) {
							if (queryResult.equals("")) {
								queryResult = database[d].carMaker;
								isUndetermined = false;
							} else {
								isUndetermined = true;
								break;
							}
						}
					}

					if (isUndetermined) {
						System.out.println("UNDETERMINED");
					} else {
						System.out.println(queryResult);
					}
				}
			}
		}
	}

}
