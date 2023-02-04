import java.awt.*;
import java.applet.Applet;

public class prog2 extends Applet{
    private String name;
    public void init(){
        name = getParameter("name");

    }
    public void paint(Graphics g){
        g.drawString("Hello "+name,20,20);
    }
}
