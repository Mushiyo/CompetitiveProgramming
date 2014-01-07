// WA
import java.util.Scanner;
import java.util.ArrayList;

public class UVa458 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Byte> decodeResult = new ArrayList<Byte>();
		
		while(input.hasNext()){
			decodeResult.add((byte)(input.nextByte() - 7));
		}
		
		for(int i = 0; i < decodeResult.size(); ++i){
			System.out.print(decodeResult.get(i));
		}
	}
}
