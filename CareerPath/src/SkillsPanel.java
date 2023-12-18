import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SkillsPanel extends TransparentPanel {
    private List<JPanel> panelList;

    public SkillsPanel() {
        initialize();
    }

    public void addSkillPanel(String str) {
        TransparentPanel panel = new TransparentPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEtchedBorder());

        JLabel label = new JLabel(str);
        label.setForeground(Color.white);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removePanel(panel);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.add(removeButton, BorderLayout.EAST);

        panel.add(label, BorderLayout.WEST);
        panel.add(buttonPanel, BorderLayout.EAST);

        // Set the fixed height to 100 pixels
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        panel.setPreferredSize(new Dimension(100, 100));

        panelList.add(panel);
        add(panel);

        revalidate();	
        repaint();
    }

    private void removePanel(JPanel panel) {
        panelList.remove(panel);
        remove(panel);

        revalidate();
        repaint();
    }

    private void initialize() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        panelList = new ArrayList<>();
    }
}