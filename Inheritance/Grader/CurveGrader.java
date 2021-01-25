class CurveGrader extends Grader
{
  private int m_curve;
  
  public CurveGrader(Integer ary[], int curve)
  {
    super(ary);
    m_curve = curve;
  }
  
  @Override
  public double calculateGrade()
  {
    double ave = super.calculateGrade();
    return ave + m_curve;
  }
  
  @Override
  public String toString()
  { return String.format("Curve Grader (%d)", m_curve); }
}