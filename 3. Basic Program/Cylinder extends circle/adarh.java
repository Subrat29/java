import java.util.*;

class circle {
    double r;
    double area;

    circle() {
        r = 1;
    }

    circle(double ra) {
        r = ra;
    }

    double doubleA() {
        // double area;
        area = Math.PI * r * r;
        return area;
    }
}

class cylinder extends circle {

    double h;

    cylinder() {
        r = 1;
        h = 1;
    }

    cylinder(double rr, double hh) {
        super(rr);
        h = hh;
    }

    double DoubleCSA() {
        double Csa;
        Csa = Math.PI * r * h * 2;
        System.out.println("Curved Surface area of Cylinder:" + Csa);
        return Csa;
    }

    void DoubleV() {
        double V;
        // Note: yha dikkat thi bhai hm log area ko call krrhe the jabki hme area ke fn
        // ko call krna tha matlab doubleA()....aur ha sabuddin ki lena mat boolna aaj
        // raat:)
        // V = area * h;
        V = doubleA() * h;
        System.out.println("Volume of Cylinder:" + V);
    }

    void Tsa() {
        double T;
        // T = area * 2 + DoubleCSA();
        T = doubleA() * 2 + DoubleCSA();
        System.out.println("Total surface area of Cylinder:" + T);
    }

    public static void main(String s[]) {
        System.out.println("Radius:");
        Scanner obj5 = new Scanner(System.in);
        double a = obj5.nextDouble();
        System.out.println("Height:");
        Scanner obj6 = new Scanner(System.in);
        double b = obj6.nextDouble();
        System.out.println("Result");
        cylinder obj = new cylinder(a, b);
        cylinder obj1 = new cylinder();

        obj.DoubleCSA();
        obj.DoubleV();
        obj.Tsa();

        // cylinder c = new cylinder(4, 5);
        // System.out.println("Area: " + c.doubleA());
    }
}
