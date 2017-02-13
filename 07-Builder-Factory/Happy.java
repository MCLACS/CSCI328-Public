public class Happy implements IBodyPart
{

    public boolean draw(int x, int y, int w, int h)
    {
        if ((x >= 2) && (x <= (w - 3)) && (y == (h - 3)))
        {
            if (x == 2)
            {
                System.out.print("\\");
                return true;
            }
            else if (x == (w - 3))
            {
                System.out.print("/");
                return true;
            }
            else
            {
                System.out.print("-");
                return true;
            }
        }
        else
            return false;
    }
}
