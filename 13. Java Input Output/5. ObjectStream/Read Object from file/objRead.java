import java.io.*;

class Student implements Serializable {
    String name;
    String id;

    Student(String n, String i) {
        name = n;
        id = i;
    }

    void show() {
        System.out.println(name + ":" + id);
    }
}

public class objRead {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tt.txt"));
            Student obj = null;
            obj = (Student) ois.readObject();
            obj.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
