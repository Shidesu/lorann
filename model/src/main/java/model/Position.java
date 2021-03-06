package model;

public class Position {

	private double x;
	private double y;
	
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	public Position(Position position) {
		this.x = position.getX();
		this.y = position.getY();
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
