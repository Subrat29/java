import java.io.*;
// import java.nio.Buffer;

public class Ex1 {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("t.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.println((char) i);
        }

        br.close();
        fr.close();
    }
}
