public class Hero extends GameObject
{
  private int m_ticks = 0;
  private java.util.Random m_rand = new java.util.Random();

  public Hero(int x, int y, int w, int h, int dX, int dY)
  {
    super("./elf.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    m_ticks++;
    if (m_ticks % 10 == 0)
    {
      m_x = m_rand.nextInt(maxw);
      m_y = m_rand.nextInt(maxh);
    }
  }

}
