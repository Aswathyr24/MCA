import java.util.*;
public class MathExceptionDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Division: " + (a/b));
System.out.println("Square Root: " + Math.sqrt(a));
System.out.println("Log: " + Math.log(a));
}
catch(ArithmeticException e) {
System.out.println("Division by zero not allowed");
}
catch(Exception e) {
System.out.println("Invalid input");
}
}
}
