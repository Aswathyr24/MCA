import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length
        System.out.println("Length: " + str.length());

        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Reverse
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed: " + rev);

        // Concatenation
        System.out.println("After Concatenation: " + str.concat(" Java"));

        sc.close();
    }
}
