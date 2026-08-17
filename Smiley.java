import java.applet.Applet;
import java.awt.*;

/* <applet code="Smiley.class" width="300" height="300"></applet> */

public class Smiley extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 30, 30);
        g.fillOval(180, 100, 30, 30);

        g.drawArc(100, 150, 100, 50, 0, -180);
    }
}
