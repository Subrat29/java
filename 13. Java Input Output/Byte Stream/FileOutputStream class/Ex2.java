import java.io.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("Ofile.txt");
        fo.write(84);
        String str = "his is a string";
        byte b[] = str.getBytes();

        for (int i = 0; i < b.length; i++) {
            fo.write(b[i]);
            // System.out.println(b[i]);
        }

        fo.write(90);
        fo.write(10);
        fo.write(b);
        fo.close();
    }
}
