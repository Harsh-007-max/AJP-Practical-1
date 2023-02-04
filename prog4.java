import java.awt.*;
import java.applet.Applet;
public class prog4 extends Applet{
    public void paint(Graphics g){
        boolean flag = true;
        int x=10,y=10;
        g.drawRect(x,y,400,400);
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(flag){
                    g.setColor(Color.white);
                    flag = false;
                }
                else{
                    g.setColor(Color.black);
                    flag=true;
                }
                g.fillRect(x,y,50,50);
                x+=50;
            }
            x=10;
            y+=50;
            if(flag)
                flag=false;
            else
                flag=true;
        }

    }
}
//<applet code = "prog4.class" width=400 height=400></applet>