import java.awt.*;
import java.applet.Applet;
public class prog5 extends Applet{
    public void paint(Graphics g){
        int x=50,y=50;
        g.setColor(Color.yellow);
        g.fillOval(x,y,200,200);
        g.setColor(Color.black);
        g.drawOval(x,y,200,200);
        g.setColor(Color.black);
        g.fillOval(x+50,y+60,20,20);
        g.fillOval(x+130,y+60,20,20);
        g.drawLine(x+100,y+100,x+100,y+120);
        g.drawArc(x+80, y+150, 50, 20, 180, 180);

    }
}
//<applet code = "prog5.class" width="400" height="400"></applet>