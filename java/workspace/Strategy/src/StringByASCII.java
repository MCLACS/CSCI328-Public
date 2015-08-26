import java.util.Comparator;


public class StringByASCII implements Comparator<String> 
{
	private static Comparator<String> m_instance = null;
	private StringByASCII() {}	
	public static Comparator<String> getInstance()
	{
		if (m_instance == null)
			m_instance = new StringByASCII();
		return m_instance;
	}
	
	@Override
	public int compare(String s1, String s2) 
	{
		int ret = 0;
		int total1 = totalASCII(s1);
		int total2 = totalASCII(s2);		
        
		if (total1 == total2)
            ret = 0;
        else if (total1 > total2)
            ret = 1;
        else if (total1 < total2)
            ret = -1;
        
		return ret;
	}	
	
	private int totalASCII(String s)
	{
		int total = 0;
		for (char c : s.toCharArray())
		{
			total += (int)c;
		}		
		return total;
	}
}
