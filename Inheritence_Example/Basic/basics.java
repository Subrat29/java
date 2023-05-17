// package java.Inheritence_Example.Basic; it gives error in compile time

class Parent {
    int data;

    void show() {
        System.out.println("Data : " + data);
    }
}

class children extends Parent {
    int child_data;

    void child_show() {
        System.out.println("Child data : " + child_data);
    }

    public static void main(String[] args) {

        children ch = new children();
        ch.data = 11;
        ch.child_data = 20;

        ch.show();
        ch.child_show();

        // System.out.println("Child data : " + child_data);
        // mark child_data as static;
    }
}
