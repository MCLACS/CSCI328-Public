import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainFrame extends JFrame implements Observer
{		
	public MainFrame()
	{		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel mainPanel = new MainPanel();		
		add(mainPanel, BorderLayout.CENTER);
						
		setSize(600, 300);
		setVisible(true);
	
		updateTitle();
		
		Model.getInstance().addObserver((Observer)mainPanel);
		Model.getInstance().addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) 
	{
		updateTitle();
	}
	
	private void updateTitle()
	{
		int count = Model.getInstance().getResetCount();
		setTitle(String.format("Curtain Game - You have played %d " + 
					((count == 1) ? "time" : "times"), count));
	}
}
