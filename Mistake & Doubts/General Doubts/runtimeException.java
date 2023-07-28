//  Problem: Is arithmetic exception (divide by zero) is also a unchecked exception ?
// soln : Arithmetic exc is both runtime and compile time exc both checked and uncheked exc
import java.util.Scanner;
public class runtimeException {

    public static void main(String[] s) {

        Scanner scanner = new Scanner(System.in);

        // int a = Integer.parseInt(s[0]);
        // int b = Integer.parseInt(s[1]);
        // System.out.println(a/b);

        System.out.println("Enter the values:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x/y);

        scanner.close();
    }
}
