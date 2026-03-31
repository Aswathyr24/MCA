interface Exam {
int getExamMarks();
}
interface Sports {
int getSportsMarks();
}


class Result implements Exam, Sports {
int examMarks, sportsMarks;
Result(int e, int s) {
examMarks = e;
sportsMarks = s;
}
public int getExamMarks() {
return examMarks;
}
public int getSportsMarks() {
return sportsMarks;
}
void display() {
int total = examMarks + sportsMarks;
System.out.println("Exam Marks: " + examMarks);
System.out.println("Sports Marks: " + sportsMarks);
System.out.println("Total Score: " + total);
}
}
public class InterfaceDemo {
public static void main(String[] args) {
Result r = new Result(80, 15);
r.display();
}
}
