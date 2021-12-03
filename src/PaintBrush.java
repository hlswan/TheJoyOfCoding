import java.awt.*;

public class PaintBrush {

    private static final Color sky = new Color(145, 227, 223);
    private static final Color mountains = new Color(128, 94, 65);

    private Graphics g;

    public PaintBrush(Graphics graphics) {
        g = graphics;
    }
    public void drawSky() {

        g.setColor(sky);
        g.fillRect(0, 0, 900, 220); // makes a light blue sky

        g.setColor(Color.yellow);
        g.fillOval(690, 30, 60, 60); // makes a yellow sun
    }

    public void drawMountains() {
        // draw a mountain
        g.setColor(mountains);
        Polygon triangle = new Polygon();

        triangle.addPoint(15, 450);
        triangle.addPoint(390, 60);
        triangle.addPoint(550, 450);

        g.fillPolygon(triangle);

        //draw jagged peaks
        g.setColor(mountains);
        Polygon jagged = new Polygon();
        jagged.addPoint(280, 445);
        jagged.addPoint(435, 170);
        jagged.addPoint(475, 280);
        jagged.addPoint(580, 120);
        jagged.addPoint(755, 520);
        g.fillPolygon(jagged);

    }
}
