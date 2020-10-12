public class Circle extends Shape2D {

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    String getName() {
        return "circle";
    }

    @Override
    double getArea() {
         return 3.141592653589793*radius*radius;
    }

}
