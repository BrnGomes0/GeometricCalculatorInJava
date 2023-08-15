import java.util.Locale;
import java.util.Scanner;
import java.lang.Thread;

// Imports Class Figures

import FlatFigures.Square;
import FlatFigures.Hexagon;
import FlatFigures.Circle;
import FlatFigures.Rectangle;
import FlatFigures.EquilateralTriangle;

import SpaceFigures.Cone;
import SpaceFigures.SquareBasePyramid;
import SpaceFigures.Parallelepiped;
import SpaceFigures.Sphere;
import SpaceFigures.Cylinder;

public class Main{
    public static void main(String[] args)  throws InterruptedException {

        // Scanner for user interaction
        Scanner scan = new Scanner(System.in); // Create a new Scanner object
        Locale.setDefault(Locale.US);

        // Variable for user input
        String inputUser;
        double parameterOneOfConstructor;
        double parameterDoubleOfConstructor;
        double parameterThreeOfConstructor;

        // Menu
        while (true) {
            System.out.println("Choose de type figures [S]paceFigures or [F]latFigures: ");
            inputUser = scan.nextLine();
            if (inputUser.equalsIgnoreCase("s") || inputUser.equals("f")) {
                if (inputUser.equalsIgnoreCase("f")) {
                    System.out.println("Choose the FlatFigures:");
                    System.out.println("[C]ircle - [E]quilateralTriangle - [H]exagon - [R]ectangle - [S]quare:");
                    inputUser = scan.nextLine();
                    if (inputUser.equalsIgnoreCase("c")) {
                        System.out.println("You chose the Circle Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the radius of circle in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        Circle circle = new Circle(parameterOneOfConstructor);
                        Thread.sleep(4000);
                        circle.calculateArea();
                        circle.calculatePerimeter();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("e")) {
                        System.out.println("You chose the EquilateralTriangle Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the side of EquilateralTriangle in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(parameterOneOfConstructor);
                        Thread.sleep(4000);
                        equilateralTriangle.calculateArea();
                        equilateralTriangle.calculatePerimeter();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("h")) {
                        System.out.println("You chose the Hexagon Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the side of Hexagon in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        Hexagon hexagon = new Hexagon(parameterOneOfConstructor);
                        Thread.sleep(4000);
                        hexagon.calculateArea();
                        hexagon.calculatePerimeter();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("r")) {
                        System.out.println("You chose the Rectangle Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the side of Rectangle in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        Thread.sleep(1000);
                        System.out.println("Pass the base of Rectangle in [m]: ");
                        parameterDoubleOfConstructor = scan.nextDouble();
                        Rectangle rectangle = new Rectangle(parameterOneOfConstructor, parameterDoubleOfConstructor);
                        Thread.sleep(4000);
                        rectangle.calculateArea();
                        rectangle.calculatePerimeter();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("s")) {
                        System.out.println("You chose the Square Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the side of Square in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        Square square = new Square(parameterOneOfConstructor);
                        Thread.sleep(4000);
                        square.calculateArea();
                        square.calculatePerimeter();
                        break;
                    }
                }
                if (inputUser.equals("s")) {
                    System.out.println("Choose the SpaceFigures:");
                    System.out.println("[C]one - [Cy]linder - [P]arallelepipied - [S]phere - [Sq]uareBasePyramid");
                    inputUser = scan.next();
                    if (inputUser.equalsIgnoreCase("c")) {

                        System.out.println("You chose the Cone Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the side of Cone in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        System.out.println("Pass the height of Cone in [m]: ");
                        parameterDoubleOfConstructor = scan.nextDouble();
                        Cone cone = new Cone(parameterOneOfConstructor, parameterDoubleOfConstructor);
                        Thread.sleep(4000);
                        cone.calculateSpaceArea();
                        cone.calculateVolume();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("cy")) {
                        System.out.println("You chose the Cylinder Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the radius of Cylinder in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        System.out.println("Pass the height of Cylinder in [m]: ");
                        parameterDoubleOfConstructor = scan.nextDouble();
                        Cylinder cylinder = new Cylinder(parameterOneOfConstructor, parameterDoubleOfConstructor);
                        Thread.sleep(4000);
                        cylinder.calculateSpaceArea();
                        cylinder.calculateVolume();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("p")) {
                        System.out.println("You chose the Parallelepiped Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the base of Parallelepiped in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        System.out.println("Pass the height of Parallelepiped in [m]: ");
                        parameterDoubleOfConstructor = scan.nextDouble();
                        System.out.println("Pass the depth of Parallelepiped in [m]: ");
                        parameterThreeOfConstructor = scan.nextDouble();
                        Parallelepiped parallelepiped = new Parallelepiped(parameterOneOfConstructor, parameterDoubleOfConstructor, parameterThreeOfConstructor);
                        Thread.sleep(4000);
                        parallelepiped.calculateSpaceArea();
                        parallelepiped.calculateVolume();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("s")) {
                        System.out.println("You chose the Shpere Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the radius of Shpere in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        Sphere sphere = new Sphere(parameterOneOfConstructor);
                        Thread.sleep(4000);
                        sphere.calculateSpaceArea();
                        sphere.calculateVolume();
                        break;
                    }
                    if (inputUser.equalsIgnoreCase("sq")) {
                        System.out.println("You chose the SquareBasePyramid Figure...");
                        Thread.sleep(3000);
                        System.out.println("Pass the base of SquareBasePyramid in [m]: ");
                        parameterOneOfConstructor = scan.nextDouble();
                        System.out.println("Pass the height of SquareBasePyramid in [m]: ");
                        parameterDoubleOfConstructor = scan.nextDouble();
                        SquareBasePyramid squareBasePyramid = new SquareBasePyramid(parameterOneOfConstructor, parameterDoubleOfConstructor);
                        Thread.sleep(4000);
                        squareBasePyramid.calculateSpaceArea();
                        squareBasePyramid.calculateVolume();
                        break;
                    }

                } else {
                    System.out.println("INVALID SINTAXE!");
                    continue;
                }
            }

        }
    }
}