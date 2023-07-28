import java.io.*;
public class Ex2 {
    public static void main(String[] args)throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter Your Name: ");
        String name = br.readLine();
        System.out.println("Welcome " + name);
        
        br.close();
        r.close();
    }
}
