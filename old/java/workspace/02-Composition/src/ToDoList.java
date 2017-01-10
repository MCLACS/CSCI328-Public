import java.util.ArrayList;
import java.util.Collections;

public class ToDoList 
{
	private ArrayList<String> m_high = new ArrayList<String>();
	private ArrayList<String> m_med = new ArrayList<String>();
	private ArrayList<String> m_low = new ArrayList<String>();

	public void addHighPriorityItem(String item)
	{
		m_high.add(item);
	}
	
	public void addMedPriorityItem(String item)
	{
		m_med.add(item);
	}
	
	public void addLowPriorityItem(String item)
	{
		m_low.add(item);
	}
	
	@Override
	public String toString()
	{
		Collections.sort(m_high);
		Collections.sort(m_med);
		Collections.sort(m_low);
		
		StringBuffer sb = new StringBuffer();
		sb.append("High Priority:\n");
		for (String item : m_high)
			sb.append(item+"\n");
		sb.append("\nMedium Priority:\n");
		for (String item : m_med)
			sb.append(item+"\n");
		sb.append("\nLow Priority:\n");
		for (String item : m_low)
			sb.append(item+"\n");
		return sb.toString();
	}
	
}
