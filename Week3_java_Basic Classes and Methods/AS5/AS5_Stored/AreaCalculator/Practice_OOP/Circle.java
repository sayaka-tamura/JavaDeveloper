public class Circle extends Shape{
	protected double radius;
	protected final double PI = 3.14159;
	
	public Circle() {
		this.radius = 0;
	}
	
	public Circle setRadius(double radius) {
		this.radius = radius;
		onAreaChange();
		return this;
	}
	
	public void onAreaChange() {
		this.area = this.radius * this.radius * PI;
	}
}
