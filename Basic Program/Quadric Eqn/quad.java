class Quadratic {
    double a;
    double b;
    double c;
    double D;

    // constructor
    Quadratic(Double i, Double j, Double k) {
        a = i;
        b = j;
        c = k;
    }

    void showEqn() {
        System.out.println(a + " X^2 " + " + " + b + " X " + " + " + c);
    }

    void natureOfRoots() {
        D = (b * b) - (4 * a * c);

        if (D == 0)
            System.out.println("Root are real and equal");
        else if (D > 0)
            System.out.println("Root are real and distinct");
        else
            System.out.println("Root are imaginary");
    }

    void findRoots() {

        natureOfRoots();
        if (D >= 0) {

            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Roots are: \n");
            System.out.println("X1 = " + x1 + "\nX2 = " + x2);
        }
    }

    public static void main(String s[]) {
        Quadratic e1 = new Quadratic(1.0, 6.0, 9.0);

        e1.findRoots();
    }
}