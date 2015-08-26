
public class Main 
{

	public static void main(String[] args) 
	{
		Bottom b = new Bottom();
		Middle m = new Middle();
		Top t = new Top();
		Random r = new Random();

		System.out.println(b.generate(10,  20));
		System.out.println(m.generate(10,  20));
		System.out.println(t.generate(10,  20));	
		System.out.println(r.generate(10,  20));
	}	
}
