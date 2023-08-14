package FlatFigures;

public class Square extends FlatFigures{
     // Attributes
    public double side; // Side Square
     // Constructor
    public Square(double sideSquare) {
        this.side = sideSquare;
    }
    // Methods
    @Override
    public void calculateArea() {
        double areaSquare;
        areaSquare = Math.pow(this.side, 2);
        System.out.printf("SQUARE AREA = %.2fm²", areaSquare);;
    }

    @Override
    public void calculatePerimeter(){
        double perimeterSquare;
        perimeterSquare = this.side * 4;
        System.out.printf("SQUARE PERIMETER = %.2fm", perimeterSquare);
    }

}
