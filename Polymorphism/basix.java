// package java.Polymorphism;

class Alfa {
    void show() {
        System.out.println("Alfa");
    }
}

class Beta extends Alfa{
    void show() {
        System.out.println("Beta");
    }
}

class Gamma extends Beta{
    void show() {
        System.out.println("Gamma");
    }
}

class Main
{
    public static void main(String[] args) {

        Alfa A = new Alfa();
        Beta B = new Beta();
        Gamma G = new Gamma();

        // A.show();
        // B.show();
        // G.show();

        //or

        A = B;
        A.show();
        B = G;
        B.show();

    }
}