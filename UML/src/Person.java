public class Person
{
  // State...
  private String m_name;
  private int m_age;
  private Dog m_dog;

  // Behavior...
  public Person(String name, int age, String dogName)
  {
    m_name = name;
    m_age = age;
    m_dog = new Dog(dogName);
  }

  public String getName()
  { return m_name; }
  public void getOlder()
  { m_age = m_age + 1; }
  public int getAge()
  { return m_age; }
  public Dog getDog()
  { return m_dog; }

}
