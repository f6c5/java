import javax.swing.*;

import java.awt.*;

public class snow extends JApplet{

	public void init() {}
	
	public void paint(Graphics g) {
	
	final int mid=150,top=50;
	g.setColor(Color.green);
	g.fillRect(0, 175, 300, 50);
	
	g.setColor(Color.yellow);
	g.fillOval(-40, -40, 80, 70);
	
	g.setColor(Color.LIGHT_GRAY);
	g.fillOval(mid-20, top, 40, 40);
	g.fillOval(mid-35, top+35, 70, 50);
	g.fillOval(mid-50, top+80, 100, 80);
	
	g.setColor(Color.black);
	g.fillOval(mid-10, top+10, 5, 5);
	g.fillOval(mid+10, top+10, 5, 5);
	
	g.drawArc(mid-10, top+10, 20, 10, 190, 160);
	g.drawLine(mid-25, top+60, mid-50, top+40);
	g.drawLine(mid+25, top+60, mid+50, top+40);
	
	}
}
