package FlatFigures;

public class Hexagon extends FlatFigures{
    // Attributes
    public double side;
    // Constructor
    public Hexagon(double sideHexagon) {
        this.side = sideHexagon;
    }
    // Methods
    @Override
    public void calculateArea() {
        double hexagonArea;
        hexagonArea = ((3 * (Math.sqrt(3))) / 2) * (Math.pow(this.side, 2));
        System.out.printf("AREA HEXAGON =  %.2fm²", hexagonArea);
    }
    @Override
    public void calculatePerimeter() {
        double hexagonPerimeter;
        hexagonPerimeter = 6 * this.side;
        System.out.printf("PERIMETER HEXAGON = %.2fm", hexagonPerimeter);
    }
}
