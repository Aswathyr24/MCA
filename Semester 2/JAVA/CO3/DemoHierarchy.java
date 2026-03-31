class Person {
String name;
int age;
Person(String n,int a){
name=n;
age=a;
}
void display(){
System.out.println("Name: "+name+" Age:"+age);
}
}
class Student extends Person{
int roll;
String branch;
Student(String n,int a,int r,String b){
super(n,a);
roll=r;
branch=b;
}
void display(){
super.display();
System.out.println("Roll:"+roll+" Branch:"+branch);
}
}
class Employee extends Person{
int empId;

Employee(String n,int a,int id){
super(n,a);
empId=id;
}
}
class Staff extends Employee{
Staff(String n,int a,int id){
super(n,a,id);
}
}
class Faculty extends Employee{
String designation;
Faculty(String n,int a,int id,String d){
super(n,a,id);
designation=d;
}
}
public class DemoHierarchy{
public static void main(String args[]){
Student s=new Student("John",20,101,"CSE");
s.display();
Faculty f=new Faculty("Dr.Smith",45,200,"Professor");
f.display();
}
}
