package com.home;

public class Square extends Rectangle {

	public double side;

	public Square(double side) {
		super(side, side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
