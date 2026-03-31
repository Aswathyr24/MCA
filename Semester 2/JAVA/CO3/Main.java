import java.util.*;
class Book {
String title, publisher;
Book(String t, String p) {
title = t;
publisher = p;
}
}
class Literature extends Book {

Literature(String t, String p) {
super(t, p);
}
void display() {
System.out.println("Literature: " + title);
}
}
class Fiction extends Book {
Fiction(String t, String p) {
super(t, p);
}
void display() {
System.out.println("Fiction: " + title);
}
}
public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("1.Literature 2.Fiction");
int ch = sc.nextInt();
sc.nextLine();
System.out.print("Enter title: ");
String t = sc.nextLine();
System.out.print("Enter publisher: ");
String p = sc.nextLine();
if (ch == 1)
new Literature(t, p).display();
else
new Fiction(t, p).display();
}
}
