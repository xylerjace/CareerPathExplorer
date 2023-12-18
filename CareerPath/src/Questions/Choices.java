package Questions;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choices extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    JRadioButton poor;
    JRadioButton average;
    JRadioButton excellent;
    int points;

    public Choices() {
        setLayout(null);
        setBackground(new Color(0x0B132B));

        poor = new JRadioButton("Poor");
        poor.setBackground(new Color(0x0B132B));
        poor.setForeground(Color.WHITE);
        poor.setFont(new Font("Monospaced", Font.BOLD, 15));
        poor.setBounds(16, 7, 140, 33);
        poor.addActionListener(this);
        add(poor);

        average = new JRadioButton("Average");
        average.setBackground(new Color(0x0B132B));
        average.setForeground(Color.WHITE);
        average.setFont(new Font("Monospaced", Font.BOLD, 15));
        average.setBounds(16, 43, 140, 33);
        average.addActionListener(this);
        add(average);

        excellent = new JRadioButton("Excellent");
        excellent.setBackground(new Color(0x0B132B));
        excellent.setForeground(Color.WHITE);
        excellent.setFont(new Font("Monospaced", Font.BOLD, 15));
        excellent.setBounds(16, 79, 140, 33);
        excellent.addActionListener(this);
        add(excellent);

        ButtonGroup group = new ButtonGroup();
        group.add(poor);
        group.add(average);
        group.add(excellent);
    }

    public int getPoints() {
        return points;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == poor) {
            points = 1;
        } else if (e.getSource() == average) {
            points = 2;
        } else if (e.getSource() == excellent) {
            points = 4;
        }
    }
}
