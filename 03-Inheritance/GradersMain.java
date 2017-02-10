import java.util.*;

public class GradersMain
{
  public static void main(String[] args)
  {
    GradersMain m = new GradersMain();
    m.go();
  }

  private void go()
  {
    List<Grader> graders = getGraders();
    for (Grader g : graders)
    {
      System.out.printf("%s calculates %.2f%n", g, g.calculateGrade());
    }
  }

  private List<Grader> getGraders()
  {
    Integer ary[] = new Integer[]
      {67, 92, 78, 82, 73, 91, 87, 81};
    List<Grader> ret = new ArrayList<Grader>();

    Grader g1 = new Grader(ary);
    ret.add(g1);

    Grader g2 = new CurveGrader(ary, 5);
    ret.add(g2);

    Grader g3 = new MedianGrader(ary);
    ret.add(g3);

    return ret;
  }

  private class Grader
  {
    private Integer m_ary[];
    public Grader(Integer ary[])
    {
      m_ary = ary;
    }

    public double calculateGrade()
    {
      double total = 0.0;
      for (int i : m_ary)
        total += i;
      return total/m_ary.length;
    }

    public Integer[] getGrades()
    { return m_ary; }

    @Override
    public String toString()
    { return "Grader"; }
  }

  private class CurveGrader extends Grader
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

  private class MedianGrader extends Grader
  {
    public MedianGrader(Integer ary[])
    { super(ary); }

    @Override
    public double calculateGrade()
    {
      double ret = 0.0;
      Arrays.sort(getGrades());
      if (getGrades().length % 2 == 1)
      {
        int middle = (getGrades().length/2);
        ret = getGrades()[middle];
      }
      else
      {
        int left = (getGrades().length/2)-1;
        int right = (getGrades().length/2);
        ret = (getGrades()[left] + getGrades()[right])/2.0;
      }
      return ret;
    }

    @Override
    public String toString()
    { return "Median Grader"; }
  }
}
