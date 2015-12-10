
public class Person
{
    private String m_first;
    private String m_last;
    private String m_gender;
    private int m_age;
    
    public Person(String first, String last, String gender, int age)
    {
        m_first = first;
        m_last = last;
        m_gender = gender;
        m_age = age;
    }
    
    public String getFirst()
    {
        return m_first;
    }

    public String getLast()
    {
        return m_last;
    }
    
    public String getGender()
    {
        return m_gender;
    }
    
    public int getAge()
    {
        return m_age;
    }
    
    public String toString()
    {
        String t = "%s, %s (%s) - %d";
        return String.format(t, getLast(), getFirst(), getGender(), getAge());
    }
}
