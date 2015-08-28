/* Filename: PointComparator.java
 * Author: Mushiyo
 */
package geometry;

import java.util.Comparator;
import java.awt.Point;

public class PointComparator implements Comparator<Point> {
	boolean xMajor = true;
	boolean aScendingOrder = true;
	
	PointComparator(boolean majorAxis){
		xMajor = majorAxis;
	}
	
	PointComparator(boolean majorAxis, boolean isAscending){
		xMajor = majorAxis;
		aScendingOrder = isAscending;
	}

	@Override
	// compare p1 & p2, the result can vary depending the major axis and
	// sorting order
	public int compare(Point p1, Point p2) {
		if (aScendingOrder) {
			if (xMajor) {
				if (p1.x != p2.x) {
					return p1.x > p2.x ? 1 : -1;
				} else {
					if (p1.y != p2.y) {
						return p1.y > p2.y ? 1 : -1;
					} else {
						return 0;
					}
				}
			} else { // yMajor
				if (p1.y != p2.y) {
					return p1.y > p2.y ? 1 : -1;
				} else {
					if (p1.x != p2.x) {
						return p1.x > p2.x ? 1 : -1;
					} else {
						return 0;
					}
				}
			}
		}
		else{
			if (xMajor) {
				if (p1.x != p2.x) {
					return p1.x < p2.x ? 1 : -1;
				} else {
					if (p1.y != p2.y) {
						return p1.y < p2.y ? 1 : -1;
					} else {
						return 0;
					}
				}
			} else { // yMajor
				if (p1.y != p2.y) {
					return p1.y < p2.y ? 1 : -1;
				} else {
					if (p1.x != p2.x) {
						return p1.x < p2.x ? 1 : -1;
					} else {
						return 0;
					}
				}
			}
		}

	}

	// set the majorAxis, true for x major order, false for y major order
	public boolean setXMajor(boolean majorAxis) {
		xMajor = majorAxis;

		return xMajor;
	}

	// set to sort in ascending order (true) or descending order (false)
	public boolean setAsending(boolean isAscending) {
		aScendingOrder = isAscending;

		return aScendingOrder;
	}
}
