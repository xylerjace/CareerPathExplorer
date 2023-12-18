

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.geom.RoundRectangle2D;

public class TransparentPanel extends JPanel {

    public TransparentPanel() {
        setOpaque(false); // Make the panel itself transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

      //  RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, width, height, 50, 50);

        // Set transparency
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f));

        // Add glass effect (you can customize this with different colors or gradients)
        g2d.setColor(new Color(255, 255, 255,150)); // Adjust the color and alpha as needed
      //  g2d.fill(roundedRectangle);
        
        g2d.dispose();
    }
}