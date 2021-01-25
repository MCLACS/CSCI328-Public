import java.util.*;
class MedianGrader extends Grader
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