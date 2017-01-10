import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	private View m_v1 = new View();
	private View m_v2 = new View();
	private View m_v3 = new View();
	private View m_v4 = new View();
	private JButton m_btn = new JButton("Click");

	public MainFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		Model.getInstance().addObserver(m_v1);
		Model.getInstance().addObserver(m_v2);
		Model.getInstance().addObserver(m_v3);
		Model.getInstance().addObserver(m_v4);
		
		add(m_v1, BorderLayout.NORTH);
		add(m_v2, BorderLayout.SOUTH);
		add(m_v3, BorderLayout.WEST);
		add(m_v4, BorderLayout.EAST);
		add(m_btn, BorderLayout.CENTER);
		
		m_btn.addActionListener(new Controller());
		pack();
		setVisible(true);
		
	}
	
	
	private class Controller implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Model.getInstance().incCount();
		}	
	}
}
