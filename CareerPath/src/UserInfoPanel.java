import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInfoPanel extends JPanel{

	private JTextField firstName;
	private JTextField lastName;
	private JTextField Age;
	private JTextField contact_number;
	private JTextField _gender;
	private JTextField _status;
	private JTextField _education;
	JFrame frame;
	

	
	Image panelBg = new ImageIcon(this.getClass().getResource("/PanelBG.png")).getImage();
	Image scaledImage = panelBg.getScaledInstance(489, 635, Image.SCALE_SMOOTH);
	/**
	 * Create the panel.
	 */
	public UserInfoPanel(JFrame frame) {
		this.frame = frame;
		setBackground(new Color(0x0B132B));
		setSize(1280,750);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(43, 206, 394, 324);
		Image icon = new ImageIcon(this.getClass().getResource("/CareerPathLogo.png")).getImage();
	    lblNewLabel.setIcon(new ImageIcon(icon));
		add(lblNewLabel);
		
		PanelImage panel = new PanelImage(scaledImage);
		panel.setBackground(new Color(0x0B132B));
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(741, 43, 493, 659);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("USER INFO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(170, 34, 138, 28);
		panel.add(lblNewLabel_1);
		
		firstName = new JTextField();
		firstName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		firstName.setBorder(new EmptyBorder(0, 0, 0, 0));
		firstName.setBackground(new Color(192, 192, 192));
		firstName.setBounds(58, 110, 360, 33);
		panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lastName.setBorder(new EmptyBorder(0, 0, 0, 0));
		lastName.setBackground(new Color(192, 192, 192));
		lastName.setBounds(58, 178, 360, 33);
		panel.add(lastName);
		lastName.setColumns(10);
		
		Age = new JTextField();
		Age.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Age.setBorder(new EmptyBorder(0, 0, 0, 0));
		Age.setBackground(new Color(192, 192, 192));
		Age.setBounds(59, 254, 359, 33);
		panel.add(Age);
		Age.setColumns(10);
		
		contact_number = new JTextField();
		contact_number.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contact_number.setBorder(new EmptyBorder(0, 0, 0, 0));
		contact_number.setBackground(new Color(192, 192, 192));
		contact_number.setBounds(58, 320, 360, 33);
		panel.add(contact_number);
		contact_number.setColumns(10);
		
		_gender = new JTextField();
		_gender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		_gender.setBorder(new EmptyBorder(0, 0, 0, 0));
		_gender.setBackground(new Color(192, 192, 192));
		_gender.setBounds(58, 391, 360, 33);
		panel.add(_gender);
		_gender.setColumns(10);
		
		_status = new JTextField();
		_status.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		_status.setBorder(new EmptyBorder(0, 0, 0, 0));
		_status.setBackground(new Color(192, 192, 192));
		_status.setBounds(58, 467, 360, 33);
		panel.add(_status);
		_status.setColumns(10);
		
		_education = new JTextField();
		_education.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		_education.setBorder(new EmptyBorder(0, 0, 0, 0));
		_education.setBackground(new Color(192, 192, 192));
		_education.setBounds(58, 537, 360, 33);
		panel.add(_education);
		_education.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(58, 85, 83, 22);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(58, 154, 83, 22);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Age");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(58, 233, 83, 22);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Contact Number");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(58, 298, 101, 22);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Gender");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(58, 372, 83, 22);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Status");
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_5.setBounds(58, 447, 83, 22);
		panel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Education");
		lblNewLabel_2_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_6.setBounds(58, 519, 83, 22);
		panel.add(lblNewLabel_2_6);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isAnyFieldEmpty()) {
                    // Display an error message if any field is empty
                    JOptionPane.showMessageDialog(UserInfoPanel.this,
                            "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                }else if (!isInteger(Age.getText()) || !isInteger(contact_number.getText())) {
                    // Display an error message if Age or Contact Number is not an integer
                    JOptionPane.showMessageDialog(UserInfoPanel.this,
                            "Please enter a valid integer for Age and Contact Number.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Proceed with saving the information
                    setVisible(false);
                    DisplayInfo display = new DisplayInfo(frame);
                    display.setVisible(true);
                    frame.getContentPane().add(display);

                    display._firstName.setText(firstName.getText());
                    display._lastName.setText(lastName.getText());
                    display._age.setText(Age.getText());
                    display._contact_number.setText(contact_number.getText());
                    display._gender.setText(_gender.getText());
                    display._status.setText(_status.getText());
                    display._education.setText(_education.getText());
                }
            }

            // Helper method to check if any field is empty
            private boolean isAnyFieldEmpty() {
                return firstName.getText().isEmpty() ||
                        lastName.getText().isEmpty() ||
                        Age.getText().isEmpty() ||
                        contact_number.getText().isEmpty() ||
                        _gender.getText().isEmpty() ||
                        _status.getText().isEmpty() ||
                        _education.getText().isEmpty();
            
			}
            private boolean isInteger(String input) {
                try {
                    Integer.parseInt(input);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0xA6D3AA));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(334, 581, 101, 33);
		panel.add(btnNewButton);
		
	}
}
