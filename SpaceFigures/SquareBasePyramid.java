package SpaceFigures;

import FlatFigures.FlatFigures;

public class SquareBasePyramid extends SpaceFigures {
    // Attributes
    public double base, height;
    // Constructor
    SquareBasePyramid(double baseSquareBasePyramid, double heightSquareBasePyramid) {
        this.base = baseSquareBasePyramid;
        this.height = heightSquareBasePyramid;
    }
    // Methods
    @Override
    public void calculateVolume() {
        double volumeSquareBasePyramid;
        volumeSquareBasePyramid = 1 / 3 * Math.pow(this.base, 2) * this.height;
        System.out.printf("VOLUME SQUARE BASE PYRAMID = %.2f", volumeSquareBasePyramid);
    }
    @Override
    public void calculateSpaceArea(){
        double spaceAreaSquareBasePyramid;
        spaceAreaSquareBasePyramid = Math.pow(this.base, 2)  + 2 * this.base;
        System.out.printf("SPACE AREA SQUARE BASE PYRAMID = %.2fm²", spaceAreaSquareBasePyramid);
    }
}
