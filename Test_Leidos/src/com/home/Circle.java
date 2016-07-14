package com.home;

public class Circle extends Shape {
	public double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double area = 3.14 * radius * radius;
		return area;

	}

}
