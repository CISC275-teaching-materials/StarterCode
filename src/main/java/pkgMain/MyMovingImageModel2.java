package pkgMain;


public class MyMovingImageModel2 {

	private double x = 100;
	private double y = 200;
	private final double BOTTOM = 200;
	
	public double getX() {
		return x;
	}
	public void setX(double d) {
		this.x = d;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = Math.min(y, BOTTOM);
	}
	
	
}
