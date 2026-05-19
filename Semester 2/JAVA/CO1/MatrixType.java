import java.util.Scanner;

class MatrixType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r, c;
        System.out.print("Enter rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        int A[][] = new int[r][c];

        System.out.println("Enter matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int isIdentity = 1, isDiagonal = 1, isSymmetric = 1;

        // Check Identity & Diagonal
        if(r == c) {
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {

                    // Identity check
                    if(i == j && A[i][j] != 1)
                        isIdentity = 0;
                    if(i != j && A[i][j] != 0)
                        isIdentity = 0;

                    // Diagonal check
                    if(i != j && A[i][j] != 0)
                        isDiagonal = 0;
                }
            }
        } else {
            isIdentity = 0;
            isDiagonal = 0;
        }

        // Check Symmetric
        if(r == c) {
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(A[i][j] != A[j][i])
                        isSymmetric = 0;
                }
            }
        } else {
            isSymmetric = 0;
        }

        // Output
        if(isIdentity == 1)
            System.out.println("Identity Matrix");
        else if(isDiagonal == 1)
            System.out.println("Diagonal Matrix");
        else if(isSymmetric == 1)
            System.out.println("Symmetric Matrix");
        else {
            System.out.println("Normal Matrix");

            // MATRIX MULTIPLICATION
            System.out.print("Enter rows and columns of second matrix: ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            if(c != r2) {
                System.out.println("Multiplication not possible");
                return;
            }

            int B[][] = new int[r2][c2];
            int result[][] = new int[r][c2];

            System.out.println("Enter second matrix:");
            for(int i = 0; i < r2; i++) {
                for(int j = 0; j < c2; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Multiplication
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c2; j++) {
                    result[i][j] = 0;
                    for(int k = 0; k < c; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Display result
            System.out.println("Result:");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
