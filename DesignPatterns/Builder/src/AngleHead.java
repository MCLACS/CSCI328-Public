public class AngleHead implements IBodyPart
{

    public boolean draw(int x, int y, int w, int h)
    {
        if (x == 0 || y == 0 || x == (w - 1) || y == (h - 1))
        {
            if (x == 0 && y == 0)
                System.out.print("/");
            else if (x == (w - 1) && y == 0)
                System.out.print("\\");
            else if (x == 0 && y == (h - 1))
                System.out.print("\\");
            else if (x == (w - 1) && y == (h - 1))
                System.out.print("/");
            else
                System.out.print("*");

            return true;
        }
        else
            return false;

    }
}
