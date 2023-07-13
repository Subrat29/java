// import java.io.*;

// class Main {
//     public static void main(String[] args)   {

//         FileReader file = new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\Programming Language\\java\\11. Exception Handling\\Checked\\ex1TextFile");
//         // FileReader file = new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\Programming Language\\java\\11. Exception Handling\\Checked\\ex1TextFile.txt");
//         // Mistake: Only fileName not fileName.txt

//         BufferedReader fileInput = new BufferedReader(file);

//         // Print first 3 lines of file "C:\test\a.txt"
//         for (int counter = 0; counter < 3; counter++) {
//             System.out.println(fileInput.readLine());
//         }
//         fileInput.close();
//     }
// }

//FileNotFoundException Why instead i have a real file present but if i use throws then it removes and print output


import java.io.*;

class Main {
    public static void main(String[] args) throws IOException   {

        FileReader file = new FileReader("C:\\Users\\Dell\\OneDrive\\Documents\\Programming Language\\java\\11. Exception Handling\\Checked\\ex1TextFile");

        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }
}


