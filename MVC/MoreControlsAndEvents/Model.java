public class Model
{
  private String m_text = "High";
  private String m_choice = "High";

  public String getText()
  { return m_text;}

  public void setText(String t)
  {
    m_text = t;
    if (goodChoice(t))
      m_choice = t;
  }

  public String getChoice()
  { return m_choice;}

  public void setChoice(String c)
  {
    m_choice = c;
    m_text = c;
  }

  private boolean goodChoice(String c)
  {
    return c.equals("High") || c.equals("Medium") || c.equals("Low") || c.equals("Very Low");
  }
}
