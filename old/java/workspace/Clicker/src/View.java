import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel implements Observer
{
	private JLabel m_count;
	
	public View()
	{
		m_count = new JLabel("Count: 0");
		add(m_count);
	}

	@Override
	public void update(Observable o, Object arg)
	{
		m_count.setText("Count: " + Model.getInstance().getCount());
	}
}
