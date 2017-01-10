import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) 
	{
		String strings[] = { "Tim", "Sammy", "John", "Frederick", "Jane", "ALICE", "Sam", "Alice"};
		
		Arrays.sort(strings);
		printArray(strings);
		
		Arrays.sort(strings, StringByLength.getInstance());
		printArray(strings);

		Arrays.sort(strings, StringByASCII.getInstance());
		printArray(strings);
	}
	
	private static void printArray(String ary[])
	{
		for (String s : ary)
			System.out.println(s);
		System.out.println();
	}

}
