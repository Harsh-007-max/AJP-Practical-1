import java.awt.*;
import java.applet.Applet;
public class prog3 extends Applet{
    public void paint(Graphics g){
        int x =20, y=20, width=260, height=100, startAngle=0, arcAngle=180;
        g.setColor(Color.red);
        g.fillArc(x,y,width,height,startAngle,arcAngle);
        g.setColor(Color.orange);
        g.fillArc(x,y+10,width,height,startAngle,arcAngle);
        g.setColor(Color.yellow);
        g.fillArc(x,y+20,width,height,startAngle,arcAngle);
        g.setColor(Color.green);
        g.fillArc(x,y+30,width,height,startAngle,arcAngle);
        g.setColor(Color.blue);
        g.fillArc(x,y+40,width,height,startAngle,arcAngle);
        g.setColor(new Color(75, 0, 130));
        g.fillArc(x,y+50,width,height,startAngle,arcAngle);
        g.setColor(new Color(238, 130, 238));
        g.fillArc(x,y+60,width,height,startAngle,arcAngle);
        g.setColor(Color.white);
        g.fillArc(x,y+70,width,height,startAngle,arcAngle);
    }
}
//<applet code = "prog3.class" width=400 height=200></applet>