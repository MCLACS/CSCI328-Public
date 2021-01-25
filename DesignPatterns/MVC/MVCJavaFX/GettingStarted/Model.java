public class Model
{
  private String m_userName;
  private String m_password;

  public String getUserName()
  { return m_userName; }
  public void setUserName(String txt)
  { m_userName = txt; }

  public String getPassword()
  { return m_password; }
  public void setPassword(String txt)
  { m_password = txt; }

  public String getMessage()
  { return m_userName + "--" + m_password; }
}
