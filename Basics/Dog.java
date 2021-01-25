public class Dog
{
  // State...
  private String m_name;

  // Behavior...
  public Dog(String name)
  {
    m_name = name;
  }

  public void bark()
  {
    System.out.println(m_name);
  }
}
