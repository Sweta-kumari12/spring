package com.spring;

public class circle implements shape{
	private Point center;
	@Override
	
public void draw() {
		System.out.println("Drawing circle");
	System.out.println("Circle point is"+ center.getX()+","+ center.getY());
}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
}
