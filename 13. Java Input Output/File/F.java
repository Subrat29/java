import java.io.*;

public class F {

    // print function
    static void p(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        File fl = new File(args[0]);
        p("FileName :" + fl.getName());
        p("Path :" + fl.getPath());
        p("Abs Path :" + fl.getAbsolutePath());
        p("Parent :" + fl.getParent());
        p("exist :" + (fl.exists() ? "file exist" : " file doesnot exist"));
        p("canWrite :" + (fl.canWrite() ? "yes" : " no "));
        p("canRead :" + (fl.canRead() ? "yes" : " no "));
        p("isDirectory :" + (fl.isDirectory() ? "yes A folder" : "not a folder"));
        p("isFile :" + (fl.isFile() ? "yes a file" : " not a file "));
        p("lastModified :" + fl.lastModified());
        p("Length :" + fl.length());
    }
}
