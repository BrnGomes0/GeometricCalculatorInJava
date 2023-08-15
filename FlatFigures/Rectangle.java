package FlatFigures;

public class Rectangle extends FlatFigures{
    // Attributes
    public double side, base;
    // Constructor
    public Rectangle (double sideRectangle, double baseRectangle) {
        this.side = sideRectangle;
        this.base = baseRectangle;
    }
    // Methods
    @Override
    public void calculateArea() {
        double areaRectangle;
        areaRectangle = this.base * this.side;
        System.out.printf("AREA RECTANGLE = %.2fm²\n", areaRectangle);
    }
    @Override
    public void calculatePerimeter() {
        double perimeterRectangle;
        perimeterRectangle = 2 * this.side + 2 * this.base;
        System.out.printf("PERIMETER RECTANGLE = %.2fm\n", perimeterRectangle);
    }
}
