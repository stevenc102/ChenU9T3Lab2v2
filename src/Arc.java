import java.awt.Graphics;
public class Arc extends Shape {
    int startAngle;
    int arcAngle;


    public Arc(){
        super();
        startAngle = 30;
        arcAngle = 70;
    }

    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
