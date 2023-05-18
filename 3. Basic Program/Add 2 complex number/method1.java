class Complex {
    // instance variable
    int real;
    int img;

    // constructor
    Complex() {
        real = 0;
        img = 0;
    }

    void setData(int r, int i) {
        this.real = r;
        this.img = i;
    }

    void show() {
        System.out.println(real + " + " + img + "i");
    }
    
    //by return reference
    Complex add(Complex a, Complex b) {
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.img = a.img + b.img;

        return c;
    }

    public static void main(String[] args) {

        Complex c1 = new Complex();
        c1.setData(2, 4);
        c1.show();

        Complex c2 = new Complex();
        c2.setData(3, 5);
        c2.show();

        Complex c3 = new Complex();
        c3 = c3.add(c1, c2);
        c3.show();
    }
}
