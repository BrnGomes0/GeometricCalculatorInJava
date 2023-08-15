package FlatFigures;

public class Circle extends FlatFigures{
    // Attributes
    public double radius;
    final public double pi = Math.PI;
    // Constructor
    public Circle(double radiusCircle) {
        this.radius = radiusCircle;
    }
    // Methods
    @Override
    public void calculateArea(){ // pi * r²
        double areaCircle;
        areaCircle = this.pi * (Math.pow(this.radius, 2));
        System.out.printf("AREA CIRCLE = %.2fm²\n", areaCircle);
    }
    @Override
    public void calculatePerimeter(){ // 2 * pi * r
        double perimeterCircle;
        perimeterCircle = 2 * this.pi * this.radius;
        System.out.printf("PERIMETER CIRCLE = %.2fm\n", perimeterCircle);
    }
}
