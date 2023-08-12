import java.util.Scanner;

public class Q1 {

    void Abbr(String name) {
        System.out.print(name.charAt(0) + ".");

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                System.out.print(name.charAt(i + 1) + ".");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Q1 q = new Q1();
        q.Abbr(name);

        sc.close();
    }
}