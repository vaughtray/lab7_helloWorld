package lab10;
import java.util.Scanner;
import java.lang.Math;
/*************************************************
 * Adding comment block for a second push to git**
 ************************************************/
public class PaintEstimator {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      final double paintNeeded;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();
	      
	      //wallWidth = 10.0;                      // FIXME (1): Prompt user to input wall's width
	      
	      // Calculate and output wall area
	      wallArea = wallHeight * wallWidth;                      // FIXME (1): Calculate the wall's area
	      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
	      paintNeeded = wallArea / 350;
	      System.out.println("Paint needed: " + paintNeeded + " gallons");
	      System.out.println("Cans needed: " + (int)Math.round(paintNeeded) + " can(s)");
	      
	      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
	      
	      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
	   }
}
