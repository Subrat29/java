import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String Name = obj.nextLine();
        System.out.println(Name);

        obj.close();
    }
}