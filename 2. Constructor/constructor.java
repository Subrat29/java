class Complex {
    // instance variable
    int real;
    int img;

    // Default constructor
    Complex() {
        System.out.println("Default Constructor");
        real = 0;
        img = 0;
    }

    // parameterized constructor
    Complex(int r, int i) {
        System.out.println("parameterised Constructor by pass 2 values");
        real = r;
        img = i;
    }

    Complex(int p) {
        System.out.println("parameterised Constructor by pass 1 value only");
        real = p;
        img = p;
    }

    Complex(Complex p) {
        System.out.println("parameterised Constructor by pass object");
        real = p.real;
        img = p.img;
    }

    void show() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String[] args) {

        // Object Create For Default Constructor
        Complex c1 = new Complex();
        c1.show();

        // Object Create For Parameterized Constructor

        // pass separate argument for real and img part
        Complex c2 = new Complex(3, 2);
        c2.show();

        // pass only one argument
        Complex c3 = new Complex(10);
        c3.show();

        // pass by object
        Complex c4 = new Complex(c2);
        c4.show();
    }
}