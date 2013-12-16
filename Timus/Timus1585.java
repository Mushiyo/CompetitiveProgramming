import java.util.Scanner;

public class Timus1585 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int emperorPenguin = 0;
			int littlePenguin = 0;
			int macaroniPenguin = 0;
			int max = 0;
			String mostNumerousPenguin = "";
			
			int n = input.nextInt();
			input.nextLine();//¦Y±¼´«¦æ²Å¸¹
			while (n > 0) {
				String nameOfPenguin = input.nextLine();

				if (nameOfPenguin.startsWith("E")) {
					++emperorPenguin;
					if(max < emperorPenguin){
						max = emperorPenguin;
						mostNumerousPenguin = "Emperor Penguin";
					}
				}
				else if (nameOfPenguin.startsWith("L")) {
					++littlePenguin;
					if(max < littlePenguin){
						max = littlePenguin;
						mostNumerousPenguin = "Little Penguin";
					}
				}
				else {
					++macaroniPenguin;
					if(max < macaroniPenguin){
						max = macaroniPenguin;
						mostNumerousPenguin = "Macaroni Penguin";
					}
				}
				
				--n;
			}
			
			System.out.println(mostNumerousPenguin);
		}
	}
}
