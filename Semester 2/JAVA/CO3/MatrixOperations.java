import java.util.Scanner;
class Matrix {

int rows, cols;
int[][] data;
Matrix(int r, int c) {
rows = r;
cols = c;
data = new int[r][c];
}



void readMatrix(Scanner sc) {
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
data[i][j] = sc.nextInt();

}
Matrix add(Matrix m) {
Matrix result = new Matrix(rows, cols);
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
result.data[i][j] = data[i][j] + m.data[i][j];
return result;
}
Matrix multiply(Matrix m) {
Matrix result = new Matrix(rows, m.cols);
for(int i=0;i<rows;i++)
for(int j=0;j<m.cols;j++) {
result.data[i][j] = 0;
for(int k=0;k<cols;k++)
result.data[i][j] += data[i][k] * m.data[k][j];
}

return result;
}
Matrix transpose() {
Matrix t = new Matrix(cols, rows);
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
t.data[j][i] = data[i][j];
return t;
}



void display() {
for(int i=0;i<rows;i++) {
for(int j=0;j<cols;j++)
System.out.print(data[i][j] + " ");
System.out.println();
}
}
}
public class MatrixOperations {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int r = 2, c = 2;
Matrix A = new Matrix(r,c);
Matrix B = new Matrix(r,c);
System.out.println("Enter Matrix A");
A.readMatrix(sc);
System.out.println("Enter Matrix B");
B.readMatrix(sc);
Matrix sum = A.add(B);
Matrix product = A.multiply(B);
Matrix transpose = A.transpose();
System.out.println("Addition:");
sum.display();
System.out.println("Multiplication:");
product.display();
System.out.println("Transpose of Matrix A:");



transpose.display();
}
}
