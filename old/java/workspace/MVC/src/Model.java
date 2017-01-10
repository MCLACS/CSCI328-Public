import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

public class Model extends Observable 
{
	private static Model m_instance = null;
	public static Model getInstance()
	{
		if (m_instance == null)
			m_instance = new Model();
		return m_instance;
	}
	
	private static class Curtain
	{
		String m_prize = "";
		boolean m_visible = false;
	}	
	
	private Curtain[] m_curtains = new Curtain[3];
	private int m_resetCount = -1;
	
	private Model()
	{
		reset();
	}
	
	public void reset()
	{
		BufferedReader in = null; 
		try
		{
			List<String> prizes = new ArrayList<String>();
			in = new BufferedReader(new FileReader("prizes.txt"));
			String line = in.readLine();
			while (line != null)
			{
				prizes.add(line);
				line = in.readLine();
			}
			if (prizes.size() < m_curtains.length)
				throw new IllegalStateException
					("There must be at least " + m_curtains.length + 
							" prizes in the file prizes.txt!");
			
			Collections.shuffle(prizes);							
			
			for (int i = 0; i < m_curtains.length; i++)
			{
				m_curtains[i] = new Curtain();
				m_curtains[i].m_prize = prizes.remove(0);
			}
		}
		catch (IOException e)
		{
			throw new IllegalStateException(e);
		}
		finally
		{
			m_resetCount++;
			setChanged();			
			notifyObservers("Model reset");
			
			try 
			{
				if (in != null)				
					in.close();
			} 
			catch (IOException e) 
			{
				throw new IllegalStateException(e);					
			}
		}		
	}
	
	public int getResetCount()
	{
		return m_resetCount;
	}
	
	public int getNumCurtains()
	{
		return m_curtains.length;
	}
	
	public String getPrize(int i)
	{
		return m_curtains[i].m_prize;
	}

	public boolean isCurtainVisible(int i)
	{
		return m_curtains[i].m_visible;
	}
	
	public void openCurtain(int i)
	{
		m_curtains[i].m_visible = true;
		setChanged();
		notifyObservers("Curtain opened");		
	}

}
