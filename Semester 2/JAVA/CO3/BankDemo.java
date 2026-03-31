import java.util.*;
class Account {
int accNo;
String type;



double balance;
Account(int no, String t, double b) {
accNo = no;
type = t;
balance = b;
}
void deposit(double amt) {
balance += amt;
}
void withdraw(double amt) {
balance -= amt;
}
void display() {
System.out.println("Account No: " + accNo +
" Type: " + type + " Balance: " + balance);

}
}
class Person {
String name;
int age;
ArrayList<Account> accounts = new ArrayList<>();
Person(String n, int a) {
name = n;
age = a;
}
void addAccount(Account a) {
accounts.add(a);
}
void showAccounts() {
System.out.println("Accounts of " + name);



for(Account a : accounts)
a.display();
}
}
public class BankDemo {
public static void main(String[] args) {
Person p = new Person("John", 30);
p.addAccount(new Account(101,"Savings",5000));
p.addAccount(new Account(102,"Current",10000));
p.showAccounts();
}
}
