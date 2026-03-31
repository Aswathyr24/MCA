import java.util.*;
public class ListProcessing {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();
list.add(10);



list.add(20);
list.add(30);

int sum = 0;
for(int n : list)
sum += n;
System.out.println("Sum: " + sum);
System.out.println("Average: " + sum/list.size());
System.out.println("Max: " + Collections.max(list));
System.out.println("Min: " + Collections.min(list));
}
}
