import java.util.*;

public class Factory implements IFactory
{
  private static IFactory m_instance;
  public static IFactory getInstance()
  {
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }
  private Factory() {}

  @Override
  public IGameObject createEnemy(int x, int y, int w, int h, int dX, int dY)
  {
    return new Ball(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, IGameView view)
  {
    return new GameController(interval, objects, view);
  }
}
