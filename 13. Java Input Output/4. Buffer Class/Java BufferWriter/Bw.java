import java.io.IOException;
import java.io.RandomAccessFile;
public class Bw {
    static final String Filepath = "myFile.txt";
    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(Filepath, 0, 18)));
            writeToFile(Filepath, "I love you to much say when kab", 31);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String Filepath, int position, int size) throws IOException
    {
        RandomAccessFile file = new RandomAccessFile(Filepath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filepath, String data, int position)
    throws IOException
    {
        RandomAccessFile file = new RandomAccessFile(filepath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
