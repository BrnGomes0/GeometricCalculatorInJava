package SpaceFigures;

import FlatFigures.FlatFigures;

public class Parallelepiped extends SpaceFigures {
    // Attributes
    public double base, height, depth;
    // Constructor
    public Parallelepiped (double baseParallelepiped, double heightParallelepiped, double depthParallelepided) {
        this.base = heightParallelepiped;
        this.height = baseParallelepiped;
        this.depth = depthParallelepided;
    }
    // Methods
    public void calculateVolume() {
        double volumeParallelepiped;
        volumeParallelepiped = this.base * this.height * this.depth;
        System.out.printf("VOLUME PARALLELEPIPED = %.2fm³\n", volumeParallelepiped);

    }
    @Override
    public void calculateSpaceArea(){
        double spaceAreaParallelepiped;
        spaceAreaParallelepiped = 2 * ((this.base * this.depth) + (this.height * this.depth));
        System.out.printf("SPACE AREA PARALLELEPIPED = %.2fm²\n", spaceAreaParallelepiped);
    }
}
