class Complex {
    // instance variable
    int real;
    int img;

    // constructor
    Complex() {
        real = 0;
        img = 0;
    }

    // constructor
    Complex(int r, int i) {
        real = r;
        img = i;
    }

    void setData(int r, int i) {
        this.real = r;
        this.img = i;
    }

    void show() {
        System.out.println(real + " + " + img + "i");
    }
    
    //by return object directly
    Complex add(Complex a) {
        int r = this.real + a.real;
        int i = this.img + a.img;

        return (new Complex(r, i));
    }

    public static void main(String[] args) {

        Complex c1 = new Complex();
        c1.setData(2, 4);
        c1.show();

        Complex c2 = new Complex();
        c2.setData(3, 5);
        c2.show();

        Complex c3 = c1.add(c2);
        c3.show();
    }
}
