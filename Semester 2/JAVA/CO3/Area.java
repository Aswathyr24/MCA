import java.util.*;
class Area {
void area(int side) {
System.out.println("Square Area = " + (side * side));
}
void area(int l, int b) {
System.out.println("Rectangle Area = " + (l * b));
}
void area(double r) {
System.out.println("Circle Area = " + (3.14 * r * r));
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Area obj = new Area();
System.out.println("1.Square 2.Rectangle 3.Circle");
int ch = sc.nextInt();
if (ch == 1) {
System.out.print("Enter side: ");
obj.area(sc.nextInt());
} else if (ch == 2) {
System.out.print("Enter length & breadth: ");
obj.area(sc.nextInt(), sc.nextInt());
} else {
System.out.print("Enter radius: ");
obj.area(sc.nextDouble());
}
}
}
