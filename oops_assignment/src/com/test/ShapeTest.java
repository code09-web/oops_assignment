package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(5);
		rectangle.setBreadth(3);
		rectangle.caluArea();
		rectangle.calcPeri();

       //		Square 
		Square square = new Square();
		square.setSide(3);
		square.caluArea();
		square.calcPeri();

	}
}
