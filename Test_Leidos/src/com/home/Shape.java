package com.home;

public abstract class Shape implements Comparable<Shape>{

	public abstract double calculateArea();

	@Override
	public int compareTo(Shape o) {
		return (int) (this.calculateArea()-(o.calculateArea()));
	}

}

