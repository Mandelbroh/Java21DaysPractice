package com.java21days;

import java.awt.Point;

class RefTester {
	public static void main(String[] args) {
		Point pt1, pt2;
		pt1 = new Point(100, 190);
		pt2 = new Point(200, 290);
		
		pt1.y = 290;
		System.out.println("Point 1: " + pt1.x + ", " + pt1.y);
		System.out.println("Point 2: " + pt2.x + ", " + pt2.y);
		
	}

}
