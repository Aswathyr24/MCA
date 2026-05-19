import arithmetic.Addition;
import arithmetic.Subtraction;
import arithmetic.Multiplication;
import arithmetic.Division;

public class ArithmeticDemo{
	public static void main(String[] args){
		int a = 5;
		int b = 2;
		
		Addition obj1 = new Addition();
		Subtraction obj2 = new Subtraction();
		Multiplication obj3 = new Multiplication();
		Division obj4 = new Division();
		
		System.out.println("Addition = " + obj1.add(a, b));
		System.out.println("Subtraction = " + obj2.sub(a, b));
		System.out.println("Multiplication = " + obj3.mul(a, b));
		System.out.println("Division = " + obj4.div(a, b));
	}
}
		
