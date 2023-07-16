import java.io.*;

public class th1 {
    public static void main(String[] args) throws IOException   {

        //this file present
        // FileReader file = new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\Programming Language\\java\\11. Exception Handling\\Checked Exception(Throws eg)\\ex1TextFile");

        //this file not present
        FileReader file = new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\Programming Language\\java\\11. Exception Handling\\Checked Exception(Throws eg)\\ex1TextFilexx");

        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }
}

//my conclude that : 
// if i simply compile it without using the throws keyword then it give exception during compile that "FileNotFound"
// but i use throws then it smoothly compile but give exception during runtime
