import java.util.*;
public class MapStudent {
public static void main(String[] args) {
HashMap<Integer,String> map = new HashMap<>();
map.put(101,"Alice");
map.put(102,"Bob");
map.put(103,"Charlie");
System.out.println("Student List:");
for(Map.Entry<Integer,String> e : map.entrySet())
System.out.println(e.getKey()+" "+e.getValue());
System.out.println("Search ID 102: " + map.get(102));
}
}
