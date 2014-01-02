/* Filename: Point.java
 * Author: Mushiyo
 */
package ComputationalGeometry;

public class Point implements Comparable {
	static boolean xMajor = true;
	int x;
	int y;

	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public Point(Point p, boolean xMajor){
		this.x = p.x;
		this.y = p.y;
		this.xMajor = xMajor;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean xMajor) {
		this.x = x;
		this.y = y;
		this.xMajor = xMajor;
	}

	public int compareTo(Object p) {
		if (xMajor) { // xMajor order
			if (this.x < ((Point)p).x) {
				return -1;
			} else if (this.x > ((Point)p).x) {
				return 1;
			} else {
				if (this.y < ((Point)p).y) {
					return -1;
				} else if (this.y > ((Point)p).y) {
					return 1;
				} else {
					return 0;
				}
			}
		} else { // yMajor order
			if (this.y < ((Point)p).y) {
				return -1;
			} else if (this.y > ((Point)p).y) {
				return 1;
			} else {
				if (this.x < ((Point)p).x) {
					return -1;
				} else if (this.x > ((Point)p).x) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}
	
	public boolean isXMajor(){
		return xMajor;
	}
	
	public boolean setXMajor(boolean majorOrder){
		xMajor = majorOrder;
		
		return xMajor;
	}
}
