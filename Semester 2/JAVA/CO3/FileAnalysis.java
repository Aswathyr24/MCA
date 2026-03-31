import java.io.*;
import java.util.*;
public class FileAnalysis {
public static void main(String[] args) throws Exception {
File file = new File("data.txt");
Scanner sc = new Scanner(file);

int words = 0;
int lines = 0;
int chars = 0;
while(sc.hasNextLine()) {
String line = sc.nextLine();
lines++;
chars += line.length();


String[] w = line.split(" ");
words += w.length;
}
System.out.println("Lines: " + lines);
System.out.println("Words: " + words);
System.out.println("Characters: " + chars);
sc.close();
}
}
