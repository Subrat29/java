class Cylinder {
    double r;
    double h;

    // constructor
    Cylinder(double radius, double height) {
        r = radius;
        h = height;
    }

    void printDimensions() {
        System.out.println("\nRadius = " + r + "\nHeight = " + h);
    }

    void curverdSA() {
        double csa = 2 * Math.PI * r * h;
        System.out.println("Curved Surface Area = " + csa);
    }

    void TotalSA() {
        double tsa = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
        System.out.println("Total Surface Area = " + tsa);
    }

    void Volume() {
        double vol = Math.PI * r * r * h;
        System.out.println("Volume = " + vol);
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(5, 10);

        c1.printDimensions();
        c1.curverdSA();
        c1.TotalSA();
        c1.Volume();

    }

}