package SpaceFigures;

public class Cone extends SpaceFigures {
    // Attributes
    public final double pi = Math.PI;
    public double radius, height, apothem;
    // Constructor
    public Cone(double radiusCone, double heightCone){
        this.radius = radiusCone;
        this.height = heightCone;
        this.apothem = Math.sqrt(Math.pow(this.radius, 2) + Math.pow(this.height, 2));
        System.out.println(apothem);
    }
    // Methods
    @Override
    public void calculateVolume(){
        double volumeCone;
        volumeCone = 1 / 3 * (this.pi * (Math.pow(this.radius, 2)) * this.height);
        System.out.printf("VOLUME CONE = %.2fm³", volumeCone);
    }
    @Override
    public void calculateSpaceArea(){
        double coneSpaceArea;
        coneSpaceArea = (this.pi * (Math.pow(this.radius, 2))) + (this.pi * this.radius * this.apothem);
        System.out.printf("SPACE AREA CONE = %.2fm²", coneSpaceArea);
    }
}
