import java.util.Scanner;

class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class Maintain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex sum = new Complex(c1.real + c2.real, c1.imag + c2.imag);

        sum.display();

        sc.close();
    }
}



