public class Main
{
  public static void main(String args[])
  {
    Main m = new Main();
    m.go();
  }

  public void go()
  {
    Square sq = new Square(6);
    Rectangle r = new Rectangle(10, 5);
    Line l = new Line(7);

    sq.draw();
    System.out.println("\n");
    r.draw();
    System.out.println("\n");
    l.draw();
    System.out.println("\n");

  }

  public class Square
  {
    private int m_size;
    public Square(int size)
    { m_size = size; }

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

  public class Rectangle
  {
    private int m_w;
    private int m_h;
    public Rectangle(int w, int h)
    {
      m_w = w;
      m_h = h;
    }

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

  public class Line
  {
    private int m_len;
    public Line(int len)
    {
      m_len = len;
    }

    public void draw()
    {
      for (int x = 0; x < m_len; x++)
        System.out.print("* ");
    }
  }
}
