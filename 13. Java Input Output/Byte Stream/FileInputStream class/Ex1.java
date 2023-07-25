import java.io.FileInputStream;

public class Ex1 {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("t.txt");
            int i = fin.read();

            // This is called casting
            System.out.println((char) i);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
