import java.util.*;
interface Bill {
void calculate();
}
class Shop implements Bill {
public void calculate() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of items: ");
int n = sc.nextInt();
int total = 0;
for (int i = 0; i < n; i++) {
System.out.print("Enter quantity and price: ");
int q = sc.nextInt();
int p = sc.nextInt();
total += q * p;
}
System.out.println("Net Amount = " + total);
}
public static void main(String args[]) {
Shop s = new Shop();
s.calculate();
}
}
