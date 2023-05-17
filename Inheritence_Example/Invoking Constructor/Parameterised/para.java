class Parent {
    int data;

    // constructor
    Parent() {
        data = 22;
        System.out.println("Default constructor of Parent");
    }

    Parent(int d) {
        data = d;
        System.out.println("Parameterized constructor of Parent");
    }

    void show() {
        System.out.println("Data : " + data);
    }
}

class child extends Parent {
    child() {
        System.out.println("Default constructor of child");
    }

    child(int x) {

        //Method 1
        // data = x;
        
        //Method 2
        super(x);

        System.out.println("Parameterized constructor of child");
    }

    public static void main(String[] args) {

        child c1 = new child();
        c1.show();

        child c2 = new child(3);
        c2.show();

    }
}