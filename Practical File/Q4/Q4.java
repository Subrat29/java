class Complex {
    int real = 0;
    int img = 0;

    // constructors
    Complex() {
    }

    Complex(int r, int i) {
        real = r;
        img = i;
    }

    void incr() {
        real++;
        img++;
    }

    void display() {
        System.out.println("real = " + real + ", img = " + img);
    }

    void setData(int r, int i) {
        real = r;
        img = i;
    }

    Complex add(Complex c) {
        this.real = c.real;
        this.img = c.img;
        return this;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(5, 10);

        c1.display();
        c2.display();

        c1.incr();
        c2.incr();

        c1.display();
        c2.display();

        c1.setData(2, 4);
        c2.setData(9, 3);

        c1.display();
        c2.display();

        c1.add(c2);
        c2.add(c1);

        c1.display();
        c2.display();

    }

}
