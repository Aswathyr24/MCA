import java.util.*;
class PushThread extends Thread {
Stack<Integer> stack;
PushThread(Stack<Integer> s) {
stack = s;
}
public void run() {
for(int i=1;i<=5;i++) {
stack.push(i);
System.out.println("Pushed: " + i);
}
}
}
class PopThread extends Thread {
Stack<Integer> stack;
PopThread(Stack<Integer> s) {
stack = s;
}
public void run() {
for(int i=1;i<=5;i++) {
if(!stack.empty())
System.out.println("Popped: " + stack.pop());



}
}
}
public class StackThreadDemo {
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
PushThread p1 = new PushThread(stack);
PopThread p2 = new PopThread(stack);
p1.start();
p2.start();
}
}
