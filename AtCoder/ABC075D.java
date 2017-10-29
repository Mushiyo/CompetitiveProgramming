import java.util.Scanner;

public class ABC075D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int K = input.nextInt();
			Point[] p = new Point[N];
			
			for(int i = 0; i < p.length; ++i){
				p[i] = new Point(input.nextInt(), input.nextInt());
			}
			
			long minRectangle = Long.MAX_VALUE;
			for(int x1 = 0; x1 < p.length; ++x1){
				for(int x2 = x1 + 1; x2 < p.length; ++x2){
					for(int y1 = 0; y1 < p.length; ++y1){
						for(int y2 = y1 + 1; y2 < p.length; ++y2){
							long MAX_X = Math.max(p[x1].x, p[x2].x);
							long MIN_X = Math.min(p[x1].x, p[x2].x);
							long MAX_Y = Math.max(p[y1].y, p[y2].y);
							long MIN_Y = Math.min(p[y1].y, p[y2].y);
							
							int countInside = 0;
							for(int i = 0; i < p.length; ++i){
								if(MIN_X <= p[i].x && p[i].x <= MAX_X && MIN_Y <= p[i].y && p[i].y <= MAX_Y){
									++countInside;
								}
								
								if(countInside > K){
									break;
								}
							}

							if(countInside == K){
								minRectangle = Math.min(minRectangle, (MAX_X - MIN_X) * (MAX_Y - MIN_Y));
							}
						}
					}
				}
			}
			
			System.out.println(minRectangle);
		}
	}
	
	private static class Point {
		int x;
		int y;
		
		Point (int x, int y){
			this.x = x;
			this.y = y;
		}
	}

}
