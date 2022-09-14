import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class RectangleComponent extends JComponent{
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(50, 50, 50, 50);
        Color color = new Color(230, 24,43);
        g2.setColor(color);
        g2.draw(box);
        g2.setColor(Color.BLACK);
        box.translate(50, 50);
        g2.draw(box);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(100, 100, 100, 100);
        g2.draw(ellipse);
        Ellipse2D.Double circle = new Ellipse2D.Double(200, 200, 500, 100);
        g2.draw(circle);
        Line2D.Double line = new Line2D.Double(250, 250, 300, 300);
        g2.draw(line);
        g2.drawString("My String", 60, 60);



    }

}
