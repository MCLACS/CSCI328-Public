import java.util.List;
import java.util.ArrayList;

public class Main
{
  public static void main(String args[])
  {
    Main m = new Main();
    m.go();
  }

  public void go()
  {
    List<IShape> shapes = makeShapes();
    for (IShape s : shapes)
    {
      s.draw();
      System.out.println("\n");
    }
  }

  public List<IShape> makeShapes()
  {
    List<IShape> shapes = new ArrayList<IShape>();
    shapes.add(new Square(6));
    shapes.add(new Rectangle(10,5));
    shapes.add(new Line(7));
    return shapes;
  }

  public interface IShape
  {
      public void draw();
  }

  public class Square implements IShape
  {
    private int m_size;
    public Square(int size)
    { m_size = size; }

    @Override
    public void draw()
    {
      for (int y = 0; y < m_size; y++)
      {
        for (int x = 0; x < m_size; x++)
          System.out.print("* ");
        System.out.println();
      }
    }
  }

  public class Rectangle implements IShape
  {
    private int m_w;
    private int m_h;
    public Rectangle(int w, int h)
    {
      m_w = w;
      m_h = h;
    }

    @Override
    public void draw()
    {
      for (int y = 0; y < m_h; y++)
      {
        for (int x = 0; x < m_w; x++)
          System.out.print("* ");
        System.out.println();
      }
    }
  }

  public class Line implements IShape
  {
    private int m_len;
    public Line(int len)
    {
      m_len = len;
    }

    @Override
    public void draw()
    {
      for (int x = 0; x < m_len; x++)
        System.out.print("* ");
    }
  }
}
