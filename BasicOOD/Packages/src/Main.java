import utilities.*;

public class Main
{
    public static void main (String[] args) 
    {
        Main m = new Main();
        m.go();
    }

    public void go()
    {
        AreaCalc c = AreaCalc.getInstance();
        System.out.println(c.squareArea(10.4));
        System.out.println(c.rectArea(6.1, 3.2));
    }
}
