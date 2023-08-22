import java.io.*;
import java.util.*;

public class Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write something in file : ");
        String text = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("t.txt");
            fw.write(text);
            fw.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}