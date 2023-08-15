interface Shape {
    public final double pi = 22 / 7;

    public void perimeter();

    public double area();
}

class Circle implements Shape {
    int rad = 0;

    Circle(int r) {
        rad = r;
    }

    public void perimeter() {
        System.out.println("Perimeter : " + 2 * pi * this.rad);
    }

    public double area() {
        return pi * rad * rad;
    }

    public static void main(String[] args) {
        Circle c = new Circle(4);

        c.perimeter();

        System.out.println("Area : " + c.area());

    }

}