public class MrPotatoHead
{
    private IBodyPart m_head;
    private IBodyPart m_eyes;
    private IBodyPart m_nose;
    private IBodyPart m_mouth;
    private int m_w = 0;
    private int m_h = 0;
    
    public MrPotatoHead(int w, int h, IBodyPart head, IBodyPart eyes,
            IBodyPart nose, IBodyPart mouth)
    {
        m_head = head;
        m_eyes = eyes;
        m_nose = nose;
        m_mouth = mouth;
        m_w = w;
        m_h = h;
    }

    public void draw()
    {
        for (int y = 0; y < m_h; y++)
        {
            for (int x = 0; x < m_w; x++)
            {
                if (!m_head.draw(x, y, m_w, m_h))
                    if (!m_eyes.draw(x, y, m_w, m_h))
                        if (!m_nose.draw(x, y, m_w, m_h))
                            if (!m_mouth.draw(x, y, m_w, m_h))
                                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
