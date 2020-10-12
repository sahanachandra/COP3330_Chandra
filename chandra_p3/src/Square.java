public class Square extends Shape2D {
    private double side;
    public Square(double sides) {
        super();
        this.side = sides;
    }

    @Override
    public String getName() {

        return "square";
    }

    @Override
    public double getArea() {
        return side*side;
    }


}
