package oops;

public class Triangle  extends Shape{
	String color="Green";
	@Override
	void draw() {
		// TODO Auto-generated method stub
		//super.draw();
		System.out.println(color);
		System.out.println(super.color);
		System.out.println("Drawing triangle...");
	}

}
