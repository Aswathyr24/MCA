import java.util.*;
class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}
}
class Employee extends Person {
int empid;
double salary;
Employee(String name, int age, int empid, double salary) {
super(name, age);
this.empid = empid;
this.salary = salary;
}
}
class Teeacher extends Employee {
String subject;
Teeacher(String name, int age, int empid, double salary, String subject) {

super(name, age, empid, salary);
this.subject = subject;
}
void display() {
System.out.println(name + " " + subject + " " + salary);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter name: ");
String name = sc.nextLine();
System.out.print("Enter age: ");
int age = sc.nextInt();
System.out.print("Enter empid: ");
int id = sc.nextInt();
System.out.print("Enter salary: ");
double sal = sc.nextDouble();
sc.nextLine();
System.out.print("Enter subject: ");
String sub = sc.nextLine();
Teeacher t = new Teeacher(name, age, id, sal, sub);
t.display();
}
}
