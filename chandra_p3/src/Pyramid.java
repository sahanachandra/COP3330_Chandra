public class Pyramid extends Shape3D {
    private double leng;
    private double wid;
    private double hei;
    public Pyramid(double length, double width, double height) {
        super();
        this.leng = length;
        this.wid = width;
        this.hei = height;
    }
    @Override
    public String getName() {
        return "pyramid";
    }

    @Override
    public double getArea() {
        return (leng * wid) + (leng * Math.sqrt(Math.pow(wid / 2.0, 2) +
                Math.pow(hei, 2))) + (wid * Math.sqrt(Math.pow(leng / 2.0, 2) + Math.pow(hei, 2)));
    }

    @Override
    public double getVolume() {
        return (leng*wid*hei)/(3.0);
    }
}
