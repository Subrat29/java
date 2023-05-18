abstract class Alfa {
    Alfa() {
        System.out.println("Alfa constructor");
    }

    final int display() {
        return 1;
    }

    void show(int i) {
        System.out.println(i);
    }

    abstract void show();
}

//The type Beta must implement the inherited abstract method Alfa.show()
class Beta extends Alfa {

    Beta()
    {
        System.out.println("Beta constructor");
    }

    void show() {
        System.out.println("Alfa show() fn implemented");
    }
}

class Main {
    public static void main(String[] args) {

        // Alfa a = new Alfa();  Cannot instantiate the type Alfa

        Beta b = new Beta();
        b.show();
        // b.show(3);
        // b.display();

    }
}