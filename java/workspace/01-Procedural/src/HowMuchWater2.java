import java.text.NumberFormat;
import java.util.Scanner;


public class HowMuchWater2 
{
	// density of water lbs/ft3 at 70 degrees F
	private static final double DENSITY = 62.30;  

	private double m_w = 0.0;
	private double m_h = 0.0;
	private double m_d = 0.0;
	private double m_v = 0.0;
	
	public void readData()
	{
		m_w = getUserInput("Enter width (ft):");
		m_h = getUserInput("Enter height (ft):");
		m_d = getUserInput("Enter depth (ft):"); 
	}

	public void calculateVolume()
	{
		m_v = m_w * m_h * m_d;
	}
	
	public void calculateWater()
	{
		m_w = m_v * DENSITY;
	}
	
	public void output()
	{
		NumberFormat fmt = NumberFormat.getNumberInstance();
		System.out.printf("You will need %s pounds of water.", fmt.format(m_w));
	}
	
	private double getUserInput(String prompt)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println(prompt);
		return in.nextDouble();
	}	
	
	public static void main(String[] args) 
	{
		HowMuchWater2 obj = new HowMuchWater2();
		obj.readData();
		obj.calculateVolume();
		obj.calculateWater();
		obj.output();
	}

}
