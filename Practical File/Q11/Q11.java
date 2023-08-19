import java.io.*;

class Q11 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("t1.txt");
            FileWriter fw = new FileWriter("t2.txt");

            int charCode;
            while ((charCode = fr.read()) != -1) {
                fw.write((char) charCode);
            }

            fr.close();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
