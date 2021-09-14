import java.util.Scanner;
public class SphereVolume{
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //created a Scanner object
		//print the purpose of the program
		System.out.println("Calculate volume of the sphere");
		
		double diam;    //declare a variable
		double radius=0;  //declare a variable
		double volume;  //declare a variable
		
		//print a prompt asking for the diameter of a sphere
		System.out.println("Please enter the diameter of a sphere: ");
		
		//read the diameter
		diam = input.nextDouble();
		
		//determine if diam is a positive number
		if (diam <= 0) {
			System.out.println("Diameter should be a positive number, please try again.");
		}
		else {
		//calculate the radius as diameter divided by 2
		radius = diam/2; 
		//calculate volume of the sphere using formula
		volume = (4/3.0) * Math.PI * Math.pow(radius, 3); 
		//print the volume
		System.out.println("Volume of sphere with diameter " + diam +" is " + volume);
		}
	}
}
