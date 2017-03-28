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
  private List<IGameView> m_views;

  public GameController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    m_objects = objects;
    m_views = views;
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
      obj.tick(m_views.get(0).getWidth(), m_views.get(0).getHeight());
    }

    for (IGameView obj : m_views)
    {
      obj.tick();
    }
  }
}
