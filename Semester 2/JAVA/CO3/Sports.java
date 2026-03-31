import java.util.*;
class Student {
int mark;
}
class Sports {
int score;
}
class Result extends Student {
void calculate(int score) {
int total = mark + score;
System.out.println("Total = " + total);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Result r = new Result();
System.out.print("Enter academic mark: ");
r.mark = sc.nextInt();
System.out.print("Enter sports score: ");
int s = sc.nextInt();
r.calculate(s);
}
}
