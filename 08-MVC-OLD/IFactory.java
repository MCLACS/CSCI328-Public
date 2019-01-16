import java.util.*;

public interface IFactory
{
  public IGameObject createEnemy(int x, int y, int w, int h, int dX, int dY);
  public IGameView createView(List<IGameObject> objects);
  public IGameController createController(int interval, List<IGameObject> objects, IGameView view);
}
