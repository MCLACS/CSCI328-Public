import java.util.Comparator;

public class StringByLength implements Comparator<String>
{
	private static Comparator<String> m_instance = null;
	private StringByLength() {};
	public static Comparator<String> getInstance()
	{
		if (m_instance == null)
			m_instance = new StringByLength();
		return m_instance;
	}

    @Override
    public int compare(String s1, String s2)
    {
        int ret = 0;
        
        if (s1.length() == s2.length())
            ret = 0;
        else if (s1.length() > s2.length())
            ret = 1;
        else if (s1.length() < s2.length())
            ret = -1;
        
        return ret;
    }
}
