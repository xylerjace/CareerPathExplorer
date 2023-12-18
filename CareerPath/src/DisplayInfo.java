import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayInfo extends JPanel {
	
	
	String first_name = "";
	String last_name = "";
	String age = "";
	String contact_number = "";
	String gender = "";
	String status = "";
	String education = "";
    JTextField _firstName;
    JTextField _lastName;
	JTextField _age;
	JTextField _contact_number;
	JTextField _gender;
	JTextField _status;
	JTextField _education;
	JLabel lblNewLabel_1;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JFrame frame;
	
	Image panelBg = new ImageIcon(this.getClass().getResource("/PanelBG.png")).getImage();
	Image scaledImage = panelBg.getScaledInstance(3000, 2000, Image.SCALE_SMOOTH);
	/**
	 * Create the panel.
	 */
	public DisplayInfo(JFrame frame) {
		this.frame = frame;
		setBackground(new Color(0x0B132B));
		setSize(1280,750);
		setLayout(null);
		
		PanelImage panel = new PanelImage(scaledImage);
		panel.setBackground(new Color(0x0B132B));
		panel.setBounds(131, 45, 1093, 665);
		add(panel);
		panel.setLayout(null);
		
		_firstName = new JTextField();
		_firstName.setBackground(new Color(192, 192, 192));
		_firstName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		_firstName.setHorizontalAlignment(SwingConstants.CENTER);
		_firstName.setText(first_name);
		_firstName.setFocusable(false);
		_firstName.setEditable(false);
		_firstName.setBorder(new EmptyBorder(0, 0, 0, 0));
		_firstName.setBounds(400, 168, 313, 30);
		panel.add(_firstName);
		_firstName.setColumns(10);
		
		_lastName = new JTextField();
		_lastName.setBackground(new Color(192, 192, 192));
		_lastName.setText(last_name);
		_lastName.setHorizontalAlignment(SwingConstants.CENTER);
		_lastName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		_lastName.setFocusable(false);
		_lastName.setEditable(false);
		_lastName.setColumns(10);
		_lastName.setBorder(new EmptyBorder(0, 0, 0, 0));
		_lastName.setBounds(400, 218, 313, 30);
		panel.add(_lastName);
		
		_age = new JTextField();
		_age.setBackground(new Color(192, 192, 192));
		_age.setText(age);
		_age.setHorizontalAlignment(SwingConstants.CENTER);
		_age.setFont(new Font("Times New Roman", Font.BOLD, 20));
		_age.setFocusable(false);
		_age.setEditable(false);
		_age.setColumns(10);
		_age.setBorder(new EmptyBorder(0, 0, 0, 0));
		_age.setBounds(400, 270, 313, 30);
		panel.add(_age);
		
		_contact_number = new JTextField();
		_contact_number.setBackground(new Color(192, 192, 192));
		_contact_number.setText(contact_number);
		_contact_number.setHorizontalAlignment(SwingConstants.CENTER);
		_contact_number.setFont(new Font("Times New Roman", Font.BOLD, 20));
		_contact_number.setFocusable(false);
		_contact_number.setEditable(false);
		_contact_number.setColumns(10);
		_contact_number.setBorder(new EmptyBorder(0, 0, 0, 0));
		_contact_number.setBounds(400, 327, 313, 30);
		panel.add(_contact_number);
		
		_gender = new JTextField();
		_gender.setBackground(new Color(192, 192, 192));
		_gender.setText(gender);
		_gender.setHorizontalAlignment(SwingConstants.CENTER);
		_gender.setFont(new Font("Times New Roman", Font.BOLD, 20));
		_gender.setFocusable(false);
		_gender.setEditable(false);
		_gender.setColumns(10);
		_gender.setBorder(new EmptyBorder(0, 0, 0, 0));
		_gender.setBounds(400, 380, 313, 30);
		panel.add(_gender);
		
		_status = new JTextField();
		_status.setBackground(new Color(192, 192, 192));
		_status.setText(status);
		_status.setHorizontalAlignment(SwingConstants.CENTER);
		_status.setFont(new Font("Times New Roman", Font.BOLD, 20));
		_status.setFocusable(false);
		_status.setEditable(false);
		_status.setColumns(10);
		_status.setBorder(new EmptyBorder(0, 0, 0, 0));
		_status.setBounds(400, 432, 313, 30);
		panel.add(_status);
		
		_education = new JTextField();
		_education.setBackground(new Color(192, 192, 192));
		_education.setText(education);
		_education.setHorizontalAlignment(SwingConstants.CENTER);
		_education.setFont(new Font("Times New Roman", Font.BOLD, 20));
		_education.setFocusable(false);
		_education.setEditable(false);
		_education.setColumns(10);
		_education.setBorder(new EmptyBorder(0, 0, 0, 0));
		_education.setBounds(400, 485, 313, 30);
		panel.add(_education);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(117, 36, 143, 131);
		Image icon = new ImageIcon(this.getClass().getResource("/Face.png")).getImage();
		Image scaledImage = icon.getScaledInstance(143, 131, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(scaledImage));
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("CHECK INFO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1.setBounds(279, 36, 150, 37);
		panel.add(lblNewLabel_1);
		
		btnNewButton = new JButton("EDIT INFO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UserInfoPanel user = new UserInfoPanel(frame);
				user.setVisible(true);
				frame.getContentPane().add(user);
		
			}
		});
		btnNewButton.setBackground(new Color(0xA6D3AA));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(205, 550, 143, 43);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				SkillOps skills = new SkillOps(frame);
				skills.setVisible(true);
				frame.add(skills);
			}
		});
		btnNewButton_1.setBackground(new Color(0xA6D3AA));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(766, 550, 143, 43);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(400, 145, 83, 22);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(400, 198, 83, 22);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Age");
		lblNewLabel_2_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(400, 247, 83, 22);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Gender");
		lblNewLabel_2_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(400, 300, 83, 22);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Contact Number");
		lblNewLabel_2_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(400, 357, 109, 22);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Status");
		lblNewLabel_2_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_5.setBounds(400, 411, 83, 22);
		panel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Education");
		lblNewLabel_2_6.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_6.setBounds(400, 463, 83, 22);
		panel.add(lblNewLabel_2_6);
	}
}
