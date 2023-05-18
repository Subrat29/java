class Complex_Multiply {
    // instances variable
    int real;
    int img;

    // constructor
    Complex_Multiply(int r, int i) {
        real = r;
        img = i;
    }

    Complex_Multiply Multiply(Complex_Multiply c2) {

        int r = (this.real * c2.real) - (this.img * c2.img);
        int i = (this.real * c2.img) + (this.img * c2.real);
        return new Complex_Multiply(r, i);

    }

    void show() {
        System.out.println(real + " + " + img + "i");
    }

    public static void main(String s[]) {

        Complex_Multiply c1 = new Complex_Multiply(2, 4);
        c1.show();

        Complex_Multiply c2 = new Complex_Multiply(3, 5);
        c2.show();

        Complex_Multiply c3 = c1.Multiply(c2);
        c3.show();

    }

}