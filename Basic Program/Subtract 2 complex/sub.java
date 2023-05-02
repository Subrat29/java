class Complex {
    int real;
    int img;

    // constructor (no setData fn need)
    Complex(int r, int i) {
        real = r;
        img = i;
    }

    void show() {
        System.out.println(real + " + " + img + "i");
    }

    Complex subtract(Complex p) {
        int r = this.real - p.real;
        int i = this.img - p.img;
        return new Complex(r, i);
    }

    public static void main(String s[]) {

        Complex c1 = new Complex(5, 8);
        c1.show();

        Complex c2 = new Complex(2, 5);
        c2.show();

        Complex c3 = c1.subtract(c2);
        c3.show();
    }
}