import java.io.*;

class Q10 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("t1.txt");

            int charCode;
            while ((charCode = fr.read()) != -1) {
                System.out.print((char) charCode);
            }
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// while(fr.read()!= -1){
// charCode = fr.read()

// System.out.print((char)charCode);

// Your code is close to being correct, but you're calling fr.read() twice: once
// in the loop condition and once inside the loop body. This results in reading
// every second character because each call to fr.read() advances the file
// pointer to the next character.