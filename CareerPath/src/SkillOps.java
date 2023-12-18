import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.util.HashSet;
import java.util.Set;

public class SkillOps extends JPanel implements ActionListener{

	JFrame frame;
	String[] skills = {"Programming", "Data Analysis","UI/UX Design","Game Development",
					   "Communications","Leadership","Marketing","Entrepreneurship",
					   "Problem Solving","Analytical Skills","Organizational Skills","Drafting Skills",
					   "Graphic Design","Animation Skills","Creativity",
					   "Management","Economic Skills", "Finance",
					   "Teaching","Coaching","Writing"};
	Image panelBg = new ImageIcon(this.getClass().getResource("/Brain.png")).getImage();
	JComboBox comboBox;
	TransparentPanel panel_1;
	SkillsPanel skillsPanel = new SkillsPanel();
	 Set<String> addedSkills = new HashSet<>();
	/**
	 * Create the panel.
	 */
	public SkillOps(JFrame frame) {
		this.frame = frame;
		setBackground(new Color(0x0B132B));
		setSize(1280,750);
		setLayout(null);
		
		PanelImage panel = new PanelImage(panelBg);
		panel.setBackground(new Color(0x0B132B));
		panel.setBounds(101, 78, 1135, 598);
		add(panel);
		panel.setLayout(null);
		
		comboBox = new JComboBox(skills);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 20));
		comboBox.setForeground(Color.GRAY);
		comboBox.addActionListener(this);
		comboBox.setBounds(132, 173, 872, 34);
		panel.add(comboBox);
		
		panel_1 = new TransparentPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(132, 218, 872, 275);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("SKILL OPTIONS");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(132, 124, 182, 34);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(new Color(0xA6D3AA));
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(62, 538, 120, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				QuestionsPanel question = new QuestionsPanel(frame,addedSkills);
				question.setVisible(true);
				frame.getContentPane().add(question);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0xA6D3AA));
		btnNewButton_1.setBounds(961, 538, 120, 34);
		panel.add(btnNewButton_1);
	}
	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            String selectedSkill = (String) comboBox.getSelectedItem();

            // Check if the skill is not already added
            if (!addedSkills.contains(selectedSkill)) {
                addedSkills.add(selectedSkill);
                skillsPanel.addSkillPanel(selectedSkill);

                // Check if skillsPanel is not already added
                if (!containsSkillPanel()) {
                    panel_1.add(skillsPanel);
                }

                // Repaint the panel
                revalidate();
                repaint();
            }
        }
    }

	private boolean containsSkillPanel() {
	    Component[] components = getComponents();
	    for (Component component : components) {
	        if (component.equals(skillsPanel)) {
	            return true;
	        }
	    }
	    return false;
	}
}
