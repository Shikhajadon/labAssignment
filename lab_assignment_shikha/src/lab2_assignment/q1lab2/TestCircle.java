package q1lab2;

class Circle{
	private double radius=1.0;
	private String color="red";
	
	public Circle() {
		
	}
	public Circle(double r) {
		this.radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
}
public class TestCircle {
	
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println("Radius: "+c.getRadius());
		System.out.println("Area: "+c.getArea());
		
		Circle c1=new Circle(2.0);
		System.out.println("Radius: "+c1.getRadius());
		System.out.println("Area: "+c1.getArea());
	}
		
}
