import java.util.Comparator;


public class Main2 {

	public static void main(String[] args) 
	{
		String strings[] = { "Tim", "Sammy", "John", "Frederick", "Jane", "ALICE", "Sam", "Alice"};
		
		System.out.println(findMax(strings));
		System.out.println(findMax(strings, StringByLength.getInstance()));
		System.out.println(findMax(strings, StringByASCII.getInstance()));
	}

	public static String findMax(String ary[])
	{
		if (ary.length == 0)
			throw new IllegalAccessError("array cannot be empty");	
		String largest = ary[0]; 
		for (String s : ary)
		{
			largest = s.compareTo(largest) > 0 ? s : largest;
		}
		return largest;
	}


	public static String findMax(String ary[], Comparator<String> comp)
	{
		if (ary.length == 0)
			throw new IllegalAccessError("array cannot be empty");	
		String largest = ary[0]; 
		for (String s : ary)
		{
			largest = comp.compare(s, largest) > 0 ? s : largest; 
		}
		return largest;
	}

}
