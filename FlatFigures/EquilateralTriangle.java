package FlatFigures;

public class EquilateralTriangle extends FlatFigures{
    // Attributes
    public double side;
    // Constructor
    public EquilateralTriangle(double sideEquilateralTriangle) {
        this.side = sideEquilateralTriangle;
    }
    // Methods
    @Override
    public void calculateArea(){ // (s ² * raiz 3) / 4
        double areaEquilateral;
        areaEquilateral = (Math.pow(this.side, 2) * Math.sqrt(3)) / 4;
        System.out.printf("AREA TRIANGLE EQUILATERAL = %.2fm²\n", areaEquilateral);
    }
    @Override
    public void calculatePerimeter(){
        double perimeterEquilateral;
        perimeterEquilateral = 3 * this.side;
        System.out.printf("PERIMETER TRIANGLE EQUILATERAL = %.2fm\n", perimeterEquilateral);
    }
}
