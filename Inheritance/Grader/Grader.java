class Grader
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