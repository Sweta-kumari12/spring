package com.spring;
public class Triangles implements shape {
private Point pointA;
private Point pointB;
private Point pointC;
public Point getPointA() {
	return pointA;
}
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}
public void setPointB(Point pointB) {
	this.pointB = pointB;
}
public Point getPointC() {
	return pointC;
}
public void setPointC(Point pointC) {
	this.pointC = pointC;
}
public void draw() {
	System.out.println("Drawing triangle");
	System.out.println("PointA= "+getPointA().getX()+" "+getPointA().getY());
	System.out.println("PointB= "+getPointB().getX()+" "+getPointB().getY());
	System.out.println("PointC= "+getPointC().getX()+" "+getPointC().getY());
}
/*
 * @Override public void afterPropertiesSet() throws Exception { // TODO
 * Auto-generated method stub
 * System.out.println("Initializing beans init method called for triangles");
 * 
 * }
 * 
 * @Override public void destroy() throws Exception { // TODO Auto-generated
 * method stub System.out.println("Bean is going to destroy"); }
 */
public void myInit() {
	System.out.println("my init method called for triangles");
}
public void cleanup() {
	System.out.println("cleanup is going to call");
}
}
