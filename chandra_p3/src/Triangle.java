public class Triangle extends Shape2D {
    private double base;
    private double height;
    public Triangle(double b, double h) {
        super();
        this.base =b;
        this.height = h;
    }

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public double getArea() {
        double area = 0.5* base* height;
        return area;
    }
}
