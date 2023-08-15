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
}

class AdvanceComplex extends Complex {

    //Constructor
    AdvanceComplex(int r, int i) {
        real = r;
        img = i;
    }

    Complex multi(Complex c) {
        this.real = (this.real * c.real) - (this.img * c.img);
        this.img = (this.real * c.img) + (this.img * c.real);
        return this;
    }

    public static void main(String[] args) {
        AdvanceComplex c1 = new AdvanceComplex(1, 2);
        AdvanceComplex c2 = new AdvanceComplex(3, 4);

        c1.display();
        c2.display();

        c1.multi(c2);

        c1.display();
    }
}
