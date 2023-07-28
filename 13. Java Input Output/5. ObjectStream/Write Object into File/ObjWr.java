import java.io.*;

class Student implements Serializable {
    String name;
    String sid;

    Student(String n, String id) {
        name = n;
        sid = id;
    }
}

public class ObjWr {
    public static void main(String[] args) {
        try {
            Student obj = new Student("Sumit", "100");
            FileOutputStream fis = new FileOutputStream("tt.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(obj);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
