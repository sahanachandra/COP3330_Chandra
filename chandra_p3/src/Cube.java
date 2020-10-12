public class Cube extends Shape3D{

    public Cube(double side){
        this.side = side;
    }

    @Override
    String getName() {
        return "cube";
    }

    @Override
    double getArea() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }
}
