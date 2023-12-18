import javax.swing.*;
import java.awt.*;

public class PanelImage extends JPanel {

    private Image backgroundImage;

    public PanelImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Paint the background image
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}