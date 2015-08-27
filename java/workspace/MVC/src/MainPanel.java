import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainPanel extends JPanel implements Observer
{
	private Controller m_controller = null;
	private JButton m_playAgain = null;
	private List<JButton> m_buttons = new ArrayList<JButton>();
	
	private class Controller implements ActionListener
	{		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == m_playAgain)
			{				
				updateButtons(true);
				Model.getInstance().reset();
			}
			else
			{
				for (int i = 0; i < m_buttons.size(); i++)
				{
					if (e.getSource() == m_buttons.get(i))
					{
						Model.getInstance().openCurtain(i);							
						updateButtons(false);
						break;
					}
				}
			}
		}		
	}
	
	public MainPanel()
	{		
		m_controller = new Controller();
	
		setLayout(new GridLayout(2, Model.getInstance().getNumCurtains()));
		for (int i = 0; i < Model.getInstance().getNumCurtains(); i++)
		{
			JButton l = new JButton("<html><b>?</b></html>");
			m_buttons.add(l);
			add(l);
			l.addActionListener(m_controller);
		}
		
		m_playAgain = new JButton("Play Again?");
		m_playAgain.addActionListener(m_controller);
		add(new JLabel());
		add(m_playAgain);
		add(new JLabel());
		
		updateButtons(true);
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		for (int i = 0; i < m_buttons.size(); i++)
		{
			if (Model.getInstance().isCurtainVisible(i))
			{
				m_buttons.get(i).setText("<html><b>"+Model.getInstance().getPrize(i)+"</b></html>");
			}
			else
			{
				m_buttons.get(i).setText("<html><b>?</b></html>");
			}
		}
	}
	
	private void updateButtons(boolean b)
	{
		for (JButton btn : m_buttons)
		{
			btn.setEnabled(b);
		}		
		m_playAgain.setEnabled(!b);
	}
}
