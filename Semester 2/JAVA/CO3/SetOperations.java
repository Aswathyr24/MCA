import java.util.*;
public class SetOperations {
public static void main(String[] args) {
HashSet<Integer> s1 = new HashSet<>();
HashSet<Integer> s2 = new HashSet<>();
s1.add(1); s1.add(2); s1.add(3);
s2.add(2); s2.add(3); s2.add(4);
HashSet<Integer> union = new HashSet<>(s1);
union.addAll(s2);
HashSet<Integer> inter = new HashSet<>(s1);
inter.retainAll(s2);
System.out.println("Union: " + union);
System.out.println("Intersection: " + inter);
}
}
