class Parent {

    void show() {
        System.out.println("Parent wala show fn");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child wala show fn");

        //To execute parent show method then use super keyword
        super.show();

    }
}

class Main {
    public static void main(String[] args) {

        Child obj = new Child();

        //By this only child show method is executed
        obj.show();

    }
}