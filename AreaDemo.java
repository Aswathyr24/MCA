import area.Circle;
import area.Rectangle;
import area.Square;
import area.Triangle;
import java.util.Scanner;

public class AreaDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = sc.nextInt();
		System.out.println("Enter the length : ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth : ");
		int b = sc.nextInt();
		System.out.println("Enter the side : ");
		int a = sc.nextInt();
		System.out.println("Enter the base : ");
		int base = sc.nextInt();
		System.out.println("Enter the height : ");
		int h = sc.nextInt();
		
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Square s1 = new Square();
		Triangle t1 = new Triangle();
		
		System.out.println("Area of Circle = " + c1.cir(r));
		System.out.println("Area of Rectangle = " + r1.rec(l, b));
		System.out.println("Area of Square = " + s1.sq(a));
		System.out.println("Area of Triangle = " + t1.tri(base, h));
	}
}
