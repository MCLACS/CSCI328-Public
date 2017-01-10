import java.util.Observable;

public class Model extends Observable
{
	private static Model m_instance;
	public static Model getInstance()
	{
		if (m_instance == null)
		{
			m_instance = new Model();
		}
		return m_instance;
	}
	private Model() {};
	
	private int m_count = 0;
	
	public void incCount()
	{ 
		m_count++; 
		setChanged();
		notifyObservers();
	}
	
	public int getCount()
	{ return m_count;	}
}	
