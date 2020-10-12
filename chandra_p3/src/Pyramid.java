public class Pyramid extends Shape3D {

    public Pyramid(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    String getName() {
        return "pyramid";
    }

    @Override
    double getArea() {
        return (length * width) + (length * Math.sqrt(Math.pow(width / 2.0, 2) +
                Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2.0, 2) + Math.pow(height, 2)));
    }

    @Override
    double getVolume() {
        return (length*width*height)/(3.0);
    }
}
