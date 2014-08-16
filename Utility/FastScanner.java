/* Filename: FastScanner.java
 * Source: http://dom8a.ru/java/template/A.java
 */

/* known issue
 * 1. The BufferReader.readLine() behaves differently with
 *    Scanner.nextLine(), thus the nextLine() method must fixed 
 */
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FastScanner {
	BufferedReader br;
	StringTokenizer st;

	public FastScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public FastScanner(InputStream is) {
		br = new BufferedReader(new InputStreamReader(is));
	}

	public FastScanner(File f) {
		try {
			br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// source: http://codeforces.ru/blog/entry/7805#comment-134954
	public boolean hasNext() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				String line = br.readLine();
				if (line == null) {
					return false;
				}
				st = new StringTokenizer(line);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}	
		return true;
	}

	public String nextLine() {
		String ret = null;
		try {
			ret = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ret;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int size) {
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = nextInt();
		}

		return array;
	}

	public long[] nextLongArray(int size) {
		long[] array = new long[size];

		for (int i = 0; i < size; i++) {
			array[i] = nextLong();
		}

		return array;
	}

	public BigInteger nextBigInteger() {
		return new BigInteger(next());
	}

	public Point nextIntPoint() {
		int x = nextInt();
		int y = nextInt();
		return new Point(x, y);
	}

	public Point[] nextIntPointArray(int size) {
		Point[] array = new Point[size];

		for (int index = 0; index < size; ++index) {
			array[index] = nextIntPoint();
		}

		return array;
	}

	public List<Integer>[] readGraph(int vertexNumber, int edgeNumber,
			boolean undirected) {
		List<Integer>[] graph = new List[vertexNumber];

		for (int index = 0; index < vertexNumber; ++index) {
			graph[index] = new ArrayList<Integer>();
		}

		while (edgeNumber-- > 0) {
			int from = nextInt() - 1;
			int to = nextInt() - 1;

			graph[from].add(to);

			if (undirected)
				graph[to].add(from);
		}

		return graph;
	}
}
