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
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY)
  {
    return new Hero(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
    return new StatusView(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
}
