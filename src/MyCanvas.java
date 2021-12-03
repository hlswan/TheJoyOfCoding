import javax.swing.*;
import java.awt.*;
public class MyCanvas extends JPanel {

    public MyCanvas() {
        setPreferredSize(new Dimension(900, 600));

        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        PaintBrush myBrush = new PaintBrush(g);

        myBrush.drawSky();
        myBrush.drawMountains();
    }
}