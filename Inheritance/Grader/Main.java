import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Main m = new Main();
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

    Grader g4 = new Top2Grader(ary);
    ret.add(g4);

    return ret;
  }
}
