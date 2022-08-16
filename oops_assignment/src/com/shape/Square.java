package com.shape;

public class Square implements Polygon {
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void caluArea() {
		float area = getSide() * getSide();
		System.out.println("Area of the square=" + area);
	}

	@Override
	public void calcPeri() {
		float perimeter = 4 * getSide();
		System.out.println("perimeter of Square is: " + perimeter);
	}

}
