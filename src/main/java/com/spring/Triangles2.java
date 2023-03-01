package com.spring;

import java.util.List;

public class Triangles2 {
private List<Point> points;

public List<Point> getPoint() {
	return points;
}

public void setPoint(List<Point> point) {
	this.points = point;
}
void draw() {
	for(Point point: points)
	{
	System.out.println("PointA= "+point.getX()+" "+point.getY());
		}
}

}
