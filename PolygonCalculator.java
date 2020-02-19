
/**
 * This program takes user input of the side lengths of a polygon to output the areas and circumferences
 * of several different types of polygons, as well as the measurements of the angles in a triangle.
 *
 * @author Michael Cummings
 * @version Version 1
 */
import java.util.Scanner;
public class PolygonCalculator {
    public static void main(String args[]) {
        //triangle section
        double triangleSideA;
        double triangleSideB;
        double triangleSideC;
        double triangleAngleA;
        double triangleAngleB;
        double triangleAngleC;
        double trianglePerimeter;
        double triangleArea;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the length of the first side of the triangle: ");
        triangleSideA = input.nextDouble();
        
        System.out.print("Please enter the length of the second side of the triangle: ");
        triangleSideB = input.nextDouble();
        
        System.out.print("Please enter the length of the third side of the triangle: ");
        triangleSideC = input.nextDouble();
        
        System.out.printf("The three side lengths of the triangle are: %.2f, %.2f, and %.2f\n", triangleSideA, triangleSideB, triangleSideC);
        trianglePerimeter = triangleSideA + triangleSideB + triangleSideC;//perimeter of triangle = (sideA + sideB + sideC)
        
        double cosineA = ( Math.pow(triangleSideB, 2) + Math.pow(triangleSideC, 2) - Math.pow(triangleSideA, 2) ) / ( 2 * (triangleSideB * triangleSideC) );
        triangleAngleA = Math.toDegrees(Math.acos(cosineA));
        System.out.printf("Triangle angle A is: %.2f degrees\n", triangleAngleA);
        
        double cosineB = ( Math.pow(triangleSideC, 2) + Math.pow(triangleSideA, 2) - Math.pow(triangleSideB, 2) ) / ( 2 * (triangleSideC * triangleSideA) );
        triangleAngleB = Math.toDegrees(Math.acos(cosineB));
        System.out.printf("Triangle angle B is: %.2f degrees\n", triangleAngleB);
        
        triangleAngleC = 180 - (triangleAngleA + triangleAngleB); //Sum of angles A and B subtracted from 180 can be used to determine angle C
        System.out.printf("Triangle angle C is: %.2f degrees\n", triangleAngleC);
        
        double p = trianglePerimeter / 2;
        triangleArea = Math.sqrt(p * (p - triangleSideA) * (p - triangleSideB) * (p - triangleSideC));
        System.out.printf("The area of the triangle is: %.2f square units\n", triangleArea);
        System.out.printf("The perimeter of the triangle is: %.2f\n", trianglePerimeter);
        System.out.println("------------------------------------------"); 
        //end triangle section
        
        //pentagon section
        double pentagonSideLength; //calculating the side length and area of a REGULAR pentagon, meaning all sides are the same length
        double pentagonPerimeter;
        double pentagonArea;
        
        System.out.print("Please enter the side length of the regular pentagon: ");
        pentagonSideLength = input.nextDouble();
        
        pentagonPerimeter = 5 * pentagonSideLength; //pentagon has 5 sides
        System.out.printf("Side length of the regular pentagon: %.2f\n", pentagonSideLength);
        System.out.printf("Perimeter of the regular pentagon: %.2f\n", pentagonPerimeter);
        
        pentagonArea = 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(pentagonSideLength, 2);
        System.out.printf("The area of the regular pentagon (with side length %.2f units): %.2f square units\n", pentagonSideLength, pentagonArea); 
        System.out.println("------------------------------------------"); 
        //end pentagon section
        
        //hexagon section
        double hexagonSideLength; //regular hexagon, all sides same length
        double hexagonPerimeter;
        double hexagonArea;
        
        System.out.print("Please enter the side length of the regular hexagon: ");
        hexagonSideLength = input.nextDouble();
        
        hexagonPerimeter = 6 * hexagonSideLength; //hexagon has 6 sides
        System.out.printf("Side length of the regular hexagon: %.2f\n", hexagonSideLength);
        System.out.printf("Perimeter of the regular hexagon: %.2f\n", hexagonPerimeter);
        
        hexagonArea = 3.0 * Math.sqrt(3) / 2.0 * Math.pow(hexagonSideLength, 2);
        System.out.printf("The area of the regular hexagon (with side length %.2f units): %.2f square units\n", hexagonSideLength, hexagonArea);
        System.out.println("------------------------------------------"); 
        //end hexagon section
        
        //heptagon section
        double heptagonSideLength; //regular heptagon
        double heptagonPerimeter;
        double heptagonArea;
        
        System.out.print("Please enter the side length of the regular heptagon: ");
        heptagonSideLength = input.nextDouble();
        
        heptagonPerimeter = 7 * heptagonSideLength; //heptagon has 7 sides
        System.out.printf("Side length of the regular heptagon: %.2f\n", heptagonSideLength);
        System.out.printf("Perimeter of the regular heptagon: %.2f\n", heptagonPerimeter);
        
        heptagonArea = 7.0/4.0 * Math.pow(heptagonSideLength, 2) * (1.0 / Math.tan(Math.toRadians(180.0) / 7)); //formula requires cotangent of 180 / 7, so using 1 / tan
        System.out.printf("The area of the regular heptagon (with side length %.2f units): %.2f square units\n", heptagonSideLength, heptagonArea);
        System.out.println("------------------------------------------"); 
        //end heptagon section
        
        //octagon section
        double octagonSideLength; //regular octagon
        double octagonPerimeter;
        double octagonArea;
        
        System.out.print("Please enter the side length of the regular octagon: ");
        octagonSideLength = input.nextFloat();
        
        octagonPerimeter = 8 * octagonSideLength; //octagon has 8 sides
        System.out.printf("Side length of the regular octagon: %.2f\n", octagonSideLength);
        System.out.printf("Perimeter of the regular octagon: %.2f\n", octagonPerimeter);
        
        octagonArea = 2 * (1 + Math.sqrt(2)) * Math.pow(octagonSideLength, 2);
        System.out.printf("The area of the regular octagon (with side length %.2f units): %.2f square units\n", octagonSideLength, octagonArea);
        System.out.println("------------------------------------------");
        //end octagon section
        
        //nonagon section
        double nonagonSideLength; //regular nonagon
        double nonagonPerimeter;
        double nonagonArea;
        
        System.out.print("Please enter the side length of the regular nonagon: ");
        nonagonSideLength = input.nextFloat();
        
        nonagonPerimeter = 9 * nonagonSideLength; //nonagon has 9 sides
        System.out.printf("Side length of the regular nonagon: %.2f\n", nonagonSideLength);
        System.out.printf("Perimeter of the regular nonagon: %.2f\n", nonagonPerimeter);
        
        nonagonArea = (9.0/4.0) * Math.pow(nonagonSideLength, 2) * (1.0 / Math.tan(Math.toRadians(180.0) / 9));
        System.out.printf("The area of the regular nonagon (with side length %.2f units): %.2f square units\n", nonagonSideLength, nonagonArea);
        System.out.println("------------------------------------------"); 
        //end nonagon section
        
        //decagon section
        double decagonSideLength; //regular decagon
        double decagonPerimeter;
        double decagonArea;
        
        System.out.print("Please enter the side length of the regular decagon: ");
        decagonSideLength = input.nextFloat();
        
        decagonPerimeter = 10 * decagonSideLength; //decagon has 10 sides
        System.out.printf("Side length of the regular decagon: %.2f\n", decagonSideLength);
        System.out.printf("Perimeter of the regular decagon: %.2f\n", decagonPerimeter);
        
        decagonArea = (5.0/2.0) * Math.pow(decagonSideLength, 2) * Math.sqrt(5 + 2 * Math.sqrt(5));
        System.out.printf("The are of the regular decagon (with side length %.2f units): %.2f square units\n", decagonSideLength, decagonArea);
        System.out.println("------------------------------------------"); 
        //end decagon section
    }
}
