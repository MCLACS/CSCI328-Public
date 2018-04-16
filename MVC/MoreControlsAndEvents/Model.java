public class Model
{
  private double m_value1 = 0;
  private double m_value2 = 0;
  private double m_value3 = 0;
  private double m_value4 = 0;

  private String m_units1 = "Feet";
  private String m_units2 = "Inches";
  private String m_units3 = "Meters";
  private String m_units4 = "Centimeters";

  public double getValue1()
  { return m_value1;}
  public double getValue2()
  { return m_value2;}
  public double getValue3()
  { return m_value3;}
  public double getValue4()
  { return m_value4;}

  public void setValue1(double d)
  { m_value1 = d; recalc(1);}
  public void setValue2(double d)
  { m_value2 = d; recalc(2);}
  public void setValue3(double d)
  { m_value3 = d; recalc(3);}
  public void setValue4(double d)
  { m_value4 = d; recalc(4);}


  public String getUnits1()
  { return m_units1;}
  public String getUnits2()
  { return m_units2;}
  public String getUnits3()
  { return m_units3;}
  public String getUnits4()
  { return m_units4;}

  public void setUnits1(String d)
  { m_units1 = d; recalc(1);}
  public void setUnits2(String d)
  { m_units2 = d; recalc(2);}
  public void setUnits3(String d)
  { m_units3 = d; recalc(3);}
  public void setUnits4(String d)
  { m_units4 = d; recalc(4);}

  private void recalc(int num)
  {
    if (num == 1)
    {
      m_value2 = fromBase(m_units2, toBase(m_units1, m_value1));
      m_value3 =fromBase(m_units3, toBase(m_units1, m_value1));
      m_value4 = fromBase(m_units4, toBase(m_units1, m_value1));
    }
    else if (num == 2)
    {
      m_value1 = fromBase(m_units1, toBase(m_units2, m_value2));
      m_value3 =fromBase(m_units3, toBase(m_units2, m_value2));
      m_value4 = fromBase(m_units4, toBase(m_units2, m_value2));
    }
    else if (num == 3)
    {
      m_value1 = fromBase(m_units1, toBase(m_units3, m_value3));
      m_value2 =fromBase(m_units2, toBase(m_units3, m_value3));
      m_value4 = fromBase(m_units4, toBase(m_units3, m_value3));
    }
    else if (num == 4)
    {
      m_value1 = fromBase(m_units1, toBase(m_units4, m_value4));
      m_value2 =fromBase(m_units2, toBase(m_units4, m_value4));
      m_value3 = fromBase(m_units3, toBase(m_units4, m_value4));
    }
  }

  private double fromBase(String to, double value)
  {
    if (to.equals("Feet"))
    {
      return value*5280;
    }
    else if (to.equals("Inches"))
    {
      return value*5280*12;
    }
    else if (to.equals("Meters"))
    {
      return value*1609.34;
    }
    else if (to.equals("Centimeters"))
    {
      return value*1609.34*100;
    }
    else
    {
      return 0;
    }
  }

  private double toBase(String from, double value)
  {
    if (from.equals("Feet"))
    {
      return value/5280;
    }
    else if (from.equals("Inches"))
    {
      return value/(5280*12);
    }
    else if (from.equals("Meters"))
    {
      return value/1609.34;
    }
    else if (from.equals("Centimeters"))
    {
      return value/(1609.34*100);
    }
    else
    {
      return 0;
    }
  }

}
