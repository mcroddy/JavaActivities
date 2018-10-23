//package activity7;
//now it is activity 8

import java.awt.*;
public class Shape {

	private double width, height;
	Color color;


	
	public Shape(double w, double h) {
		
		width = w;
		height = h;
		color = new Color(255,127,80);

	}

	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getWidth() {
		return width;
	}
	
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	

	public static double findArea(Shape shape) {
		double area = shape.getHeight() * shape.getWidth();
	
		return area;
	
	}
	
	public String toString() {
		String msg1 = "The width is " + width + " and the height is " + height;
		String msg2 = ". Color: " + color;
		String msg = msg1 + msg2;
		return msg;
		
	}
	
	public boolean equals(Shape shape) 
	{
		//check if shapes are the same
		if(getHeight() == shape.getHeight() && getWidth() == shape.getWidth())
		{
			System.out.println("true");
			return true;
		}
		else
		{
			System.out.println("false");
			return false;
		}
	}
	
	public Shape(Shape shape)
	{
		width = shape.width;
		height = shape.height;
		color = shape.color;
	}
	
	public static void main(String[] args) {
		Shape rectangle = new Shape(5.5,5.5);
		Shape square = new Shape(5.5,5.5);
	//	System.out.println(findArea(rectangle));  test code
	//	System.out.println(findArea(square));    test code

		//display information
		System.out.println(rectangle.toString());
		System.out.println(square.toString());
		
		square.equals(rectangle);
		
		Shape newSquare = new Shape(square);
		System.out.println(newSquare.toString());
		
		System.out.println(findArea(square));
		
	}

}
