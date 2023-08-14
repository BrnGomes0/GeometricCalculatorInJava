package SpaceFigures;

public class Cylinder extends SpaceFigures {
    // Attributes
    public final double pi = Math.PI;
    public double radius, height;
    // Constructor
    public Cylinder(double radiusCylinder, double heightCylinder) {
        this.radius = radiusCylinder;
        this.height = heightCylinder;
    }
    // Methods
    @Override
    public void calculateVolume() {
        double volumeCylinder;
        volumeCylinder = this.pi * Math.pow(this.radius, 2) * this.height;
        System.out.printf("VOLUME CYLINDER = %.2fm³", volumeCylinder);
    }

    @Override
    public void calculateSpaceArea(){
        double spaceAreaCylinder;
        spaceAreaCylinder = 2 * this.pi * this.radius * (this.radius + this.height);
        System.out.printf("SPACE AREA CYLINDER = %.2fm²", spaceAreaCylinder);
    }
}
