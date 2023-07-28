import java.io.*;

public class Fr {

    public static void main(String[] args) throws IOException {

        FileReader sourceStream = null;

        try {
            sourceStream = new FileReader("test.txt");
            // Reading sourcefile and writing content to target file character by character

            int temp;

            // The program enters a while loop that reads characters from the file using the read() method of the FileReader class.
            // The read() method returns the ASCII value of the character, or -1 if the end of the file has been reached.                  
            while ((temp = sourceStream.read()) != -1) {
                System.out.print((char) temp);
            }

        } finally {
            // closing stream as no longer in use

            // sourceStream != null i.e., the file was successfully opened
            if (sourceStream != null) {
                sourceStream.close();
            }
        }
    }

}
