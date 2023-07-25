class Alpha {
    protected void show() {
        System.out.println("Hello java");
    }
}
//Here M is subclass
public class M extends Alpha {
    void show() {
        System.out.println("Hello java");
    }// C.T.Error

    public static void main(String args[]) {
        M obj = new M();
        obj.show();
    }
}