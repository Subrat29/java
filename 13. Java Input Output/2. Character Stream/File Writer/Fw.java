import java.io.*;

public class Fw {
    public static void main(String[] args) throws IOException {
        File f = new File("t.txt");

        // Atomically creates a new, empty file named by this abstract pathname if and
        // only if a file with this name does not yet exist.
        f.createNewFile();

        // creates a Filewriter object
        FileWriter fw = new FileWriter(f, null, false);

        // writes content to the file
        fw.write("This is not \n not like fart \n because it is dino fart");
        fw.flush();
        fw.close();

        // creates a FileReader object
        FileReader fr = new FileReader(f);
        char[] a = new char[50];
        fr.read(a);
        // read the content to the array ?? what is measn

        //prints the character one by one 
        for (char c : a) {
            System.out.println(c);
        }

        fr.close();
    }

}
