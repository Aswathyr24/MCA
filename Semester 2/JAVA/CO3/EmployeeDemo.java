import java.util.*;
class Employee {
int code;
String name;
float salary;



Employee(int c,String n,float s){
code=c;
name=n;
salary=s;
}
}
public class EmployeeDemo {
public static void main(String[] args) {
ArrayList<Employee> list=new ArrayList<>();
list.add(new Employee(1,"A",20000));
list.add(new Employee(2,"B",35000));
list.add(new Employee(3,"C",30000));
Employee max=list.get(0);
for(Employee e:list){
if(e.salary>max.salary)
max=e;
}
System.out.println("Highest salary:"+max.name);
}
}
