package com.shape;

public class Rectangle implements Polygon {
	private float length, breadth;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void caluArea() {
		float area = getLength() * getBreadth();
		System.out.println("Area of Rectangle is: "+area);  
	}

	@Override
	public void calcPeri() {
		float perimeter = 2 * (getLength() + getBreadth());
		System.out.println("Perimeter of Rectangle is: "+perimeter);
	}

}
