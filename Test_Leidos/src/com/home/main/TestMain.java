package com.home.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.home.Circle;
import com.home.Rectangle;
import com.home.Shape;
import com.home.Square;

public class TestMain {

	public static void main(String[] args) {
		Circle circle = new Circle(2);		
		Square square1 = new Square(4);		
		Rectangle rectangle = new Rectangle(2,3);
		Square square2 = new Square(2);
		
	
		List<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(square2);
		shapeList.add(circle);
		shapeList.add(rectangle);
		shapeList.add(square1);
		System.out.println("Before Sort:");
		for(Shape shape: shapeList){
			System.out.println(shape.calculateArea());
		}
		System.out.println("After Sort:");
		Collections.sort(shapeList);
		for(Shape shape: shapeList){
			System.out.println(shape.calculateArea());
		}
		
		
		
	}

}
