import javax.swing.Timer;
import java.awt.event.*;
import java.awt.Rectangle;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class GameController implements ActionListener, IGameController
{
  private Timer m_timer;
  private List<IGameObject> m_objects;
  private IGameView m_view;

  public GameController(int interval, List<IGameObject> objects, IGameView view)
  {
    m_objects = objects;
    m_view = view;
    m_timer = new Timer(interval, this);
  }

  @Override
  public void startGame()
  {
    m_timer.start();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    for (IGameObject obj : m_objects)
    {
      obj.tick(m_view.getWidth(), m_view.getHeight());
    }

    m_view.tick();
  }
}
