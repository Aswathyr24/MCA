import java.util.*;
class Employee {
int id;
String name;
double salary;
String address;
Employee(int id, String name, double salary, String address) {
this.id = id;
this.name = name;
this.salary = salary;
this.address = address;
}
}
class Teacher extends Employee {
String dept, subject;
Teacher(int id, String name, double salary, String address,
String dept, String subject) {
super(id, name, salary, address);
this.dept = dept;
this.subject = subject;
}
void display() {
System.out.println(id + " " + name + " " + dept + " " + subject);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of teachers: ");
int n = sc.nextInt();
sc.nextLine();
Teacher t[] = new Teacher[n];
for (int i = 0; i < n; i++) {
System.out.println("Enter details:");
int id = sc.nextInt(); sc.nextLine();

String name = sc.nextLine();
double sal = sc.nextDouble(); sc.nextLine();
String addr = sc.nextLine();
String dept = sc.nextLine();
String sub = sc.nextLine();
t[i] = new Teacher(id, name, sal, addr, dept, sub);
}
for (Teacher x : t)
x.display();
}
}
