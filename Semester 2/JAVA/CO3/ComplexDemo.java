class Complex {
double real, imag;
Complex(double r, double i) {
real = r;
imag = i;
}
static Complex add(Complex a, Complex b) {
return new Complex(a.real + b.real, a.imag + b.imag);
}
static Complex sub(Complex a, Complex b) {
return new Complex(a.real - b.real, a.imag - b.imag);
}
static Complex mul(Complex a, Complex b) {
return new Complex(a.real*b.real - a.imag*b.imag,
a.real*b.imag + a.imag*b.real);

}
double magnitude() {
return Math.sqrt(real*real + imag*imag);
}
Complex conjugate() {
return new Complex(real, -imag);
}
void display() {
System.out.println(real + " + i" + imag);
}
}
public class ComplexDemo {
	public static void main(String[] args) {
		Complex c1 = new Complex(3,4);
		Complex c2 = new Complex(2,5);
		Complex sum = Complex.add(c1,c2);
		Complex diff = Complex.sub(c1,c2);
		Complex prod = Complex.mul(c1,c2);
		System.out.print("Sum: ");
		sum.display();
		System.out.print("Difference: ");
		diff.display();
		System.out.print("Product: ");
		prod.display();
		System.out.println("Magnitude of c1: " + c1.magnitude());
		System.out.print("Conjugate of c1: ");
		c1.conjugate().display();
	}
}
