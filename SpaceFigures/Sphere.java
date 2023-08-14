package SpaceFigures;

import FlatFigures.FlatFigures;
import org.w3c.dom.UserDataHandler;

public class Sphere extends SpaceFigures {
    // Attributes
    public final double pi = Math.PI;
    public double radius;
    // Constructor
    public Sphere(double radiusSphere){
        this.radius = radiusSphere;
    }
    // Methods
    @Override
    public void calculateSpaceArea(){
        double sphereSpaceArea;
        sphereSpaceArea = (4 * this.pi * (Math.pow(this.radius, 2)));
        System.out.printf("SPACE AREA SHPERE = %.2fm²", sphereSpaceArea);
    }
    @Override
    public void calculateVolume(){
        double shpereVolume;
        shpereVolume = 4/3 * this.pi * (Math.pow(this.radius, 3));
        System.out.printf("VOLUME SHPERE = %.2fm³", shpereVolume);
    }
}
