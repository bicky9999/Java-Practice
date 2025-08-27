

package abstraction;

public class Main {

	public static void main (String [] args) {
		
		// abstract = used to define abstract classes and methods.
		// 			  Abstraction is the process of hiding implementation details
		//			  and showing only the essential features.
		//			  Abstract classes can't be instantiated directly.
		//			  can contain 'abstract' methods ( which must be implemented)
		//			  can contain 'concrete' methods ( (which are inherited)
		
		Circle circle = new Circle(3);
		Triangle triangle = new Triangle(4, 5);
		Rectangle rectangle = new Rectangle(6, 7);
		
		System.out.println(circle.area());
		System.out.println(triangle.area());
		System.out.println(rectangle.area());
		
		circle.display();
		rectangle.display();
		triangle.display();
	}
}


package abstraction;

public abstract class Shape {

	abstract double area(); //abstract method
	
	
	//Concrete method
	void display() { 
		System.out.println("This is a shape.");
	}
}



package abstraction;

public class Rectangle extends Shape{
	
	double width;
	double length;
	
	Rectangle(double width, double height){
		this.width = width;
		this.length = length;
	}
	
	@Override
	double area() {
	return length * width;
	}
}



package abstraction;

public class Triangle extends Shape{

	double base;
	double height;
	
	Triangle(double base, double height){	
		this.base = base;
		this.height = height;
	}
	@Override
	double area() {
	return 0.5 * base * height;
	}
}


package abstraction;

public class Circle extends Shape{

	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double area() {
	return Math.PI * radius * radius;
	}
	}
