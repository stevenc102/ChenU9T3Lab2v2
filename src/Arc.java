import java.awt.Graphics;
import java.awt.Color;
public class Arc extends Shape {
    int startAngle;
    int arcAngle;


    public Arc(){
        super();
        startAngle = 30;
        arcAngle = 70;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
