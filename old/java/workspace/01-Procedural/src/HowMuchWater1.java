import java.text.NumberFormat;
import java.util.Scanner;

public class HowMuchWater1 
{	
	// density of water lbs/ft3 at 70 degrees F
	private static final double DENSITY = 62.30;  
					
	private static double getUserInput(String prompt)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println(prompt);
		return in.nextDouble();
	}

	private static double calculateVolume(double w, double h, double d)
	{
		return w * h * d;
	}
	
	private static double calculateWater(double v)
	{
		return v * DENSITY;
	}
	
	private static void output(double water)
	{
		NumberFormat fmt = NumberFormat.getNumberInstance();
		System.out.printf("You will need %s pounds of water.", fmt.format(water));
	}
	
	public static void main(String[] args) 
	{	
		double w = getUserInput("Enter width (ft):");
		double h = getUserInput("Enter height (ft):");
		double d = getUserInput("Enter depth (ft):"); 
		
		double v = calculateVolume(w, h, d);
		double water = calculateWater(v);
		
		output(water);
	}

}
