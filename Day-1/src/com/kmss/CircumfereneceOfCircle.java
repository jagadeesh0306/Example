package com.kmss;

//Program to find area and circumference of circle.

class Circle
{
	public double area(int radius)
	{
		float area = 3.14f * radius * radius;
		
		return area;
	}
	public double circumference(int radius)
	{
		float circumference = 2 * 3.14f * radius;
		
		return circumference;
	}
}

public class CircumfereneceOfCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		//c1.area(5);
		Circle c2 = new Circle();
		//c2.circumference(3);
		System.out.println("Area of circle : "+c1.area(5));
		System.out.println("Circumference of circle : "+c2.circumference(3));
	}
}
