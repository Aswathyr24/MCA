import java.io.*;
import java.util.*;
public class MergeFiles {
public static void main(String[] args) throws Exception {
Scanner f1 = new Scanner(new File("file1.txt"));
Scanner f2 = new Scanner(new File("file2.txt"));
ArrayList<Integer> list = new ArrayList<>();
while(f1.hasNextInt())
list.add(f1.nextInt());
while(f2.hasNextInt())
list.add(f2.nextInt());
Collections.sort(list);
PrintWriter out = new PrintWriter("merged.txt");
for(int n : list) {
out.println(n);



System.out.println(n);
}
out.close();
}
}
