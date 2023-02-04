import java.awt.*;
import java.applet.Applet;
public class prog6 extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(50,50,120,120);
        g.setColor(Color.blue);
        g.fillRect(65,70,30,30);
        g.setColor(Color.yellow);
        g.fillRect(95,110,30,60);
        g.setColor(Color.black);
        int[] xpol={50, 110, 170};
        int[] ypol={50, 12, 50};
        g.fillPolygon(xpol,ypol,3);
    }
}
//<applet code = "prog6.class" width="400" height="400"></applet>
//D:\Studies\Sem-6\Advance Java\codes\Practical-1\prog6.java