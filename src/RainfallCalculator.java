import java.util.Scanner;
public class RainfallCalculator 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the width of the roof: ");
		double width = keyboard.nextDouble();
		System.out.print("Enter the length of the roof: ");
		double length = keyboard.nextDouble();
		System.out.println("Enter the amount of rain in inches that fell: ");
		double rain = keyboard.nextDouble();
		FeetToInches feetToInches = new FeetToInches();
		int convers = feetToInches.getMeas();
		double conWidth = width*convers;
		double conLength = length*convers;
		
		double gallons = (conWidth*conLength*rain)/231;
		System.out.println("The amount of rain that fell is "+gallons+" gallons.");
		
	}
}

