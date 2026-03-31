import java.util.*;
class NegativeThread extends Thread {
int[] a;
NegativeThread(int[] x) { a = x; }
public void run() {
for(int n : a)
if(n < 0)
System.out.println("Negative: " + n);

}
}
class EvenThread extends Thread {
int[] a;
EvenThread(int[] x) { a = x; }



public void run() {
for(int n : a)
if(n > 0 && n % 2 == 0)
System.out.println("Positive Even: " + n);

}
}
class OddThread extends Thread {
int[] a;
OddThread(int[] x) { a = x; }
public void run() {
for(int n : a)
if(n > 0 && n % 2 != 0)
System.out.println("Positive Odd: " + n);

}
}
public class NumberThreads {
public static void main(String[] args) {
Random r = new Random();
int[] arr = new int[10];
for(int i=0;i<10;i++)
arr[i] = r.nextInt(40)-20;
new NegativeThread(arr).start();
new EvenThread(arr).start();
new OddThread(arr).start();
}
}
