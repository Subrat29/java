class Complex {
    // instance variable
    int real;
    int img;

    // comprator
    Complex() {
        real = 0;
        img = 0;
    }

    void setData(int r, int i) {
        real = r;
        img = i;
    }

    void show() {
        System.out.println(real + " + " + img + "i");
    }

    void twice() {
        real = 2 * real;
        img = 2 * img;
    }

    public static void main(String s[]) {

        Complex c1 = new Complex();
        
        c1.setData(2, 4);
        c1.show();

        c1.twice();
        c1.show();
    }
}