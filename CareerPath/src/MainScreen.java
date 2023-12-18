import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainScreen {

	private JFrame frame;
	String welcomeText = "WELCOME TO CAREER PATH EXPLORER";
    int currentIndex = 0;
    
    JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	
     javax.swing.Timer timer = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (currentIndex < welcomeText.length()) {
                // Display one letter at a time
                lblNewLabel_1.setText(welcomeText.substring(0, currentIndex + 1));
                currentIndex++;
            } else {
                // Stop the timer when all letters are displayed
                timer.stop();
            }
        }
    });
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();	
		timer.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x0B132B));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		frame.setBounds(100, 100, 1280, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		//lblNewLabel.setBackground(Color.WHITE);
		Image icon = new ImageIcon(this.getClass().getResource("/CareerPathLogo.png")).getImage();
	//	Image scaledImage = icon.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(icon));
		lblNewLabel.setBounds(404, 202, 410, 314);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Get Started");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfoPanel user = new UserInfoPanel(frame);
				panel.setVisible(false);
				user.setVisible(true);
				frame.add(user);
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(537, 595, 228, 35);
		panel.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(281, 135, 746, 82);
	    panel.add(lblNewLabel_1);

		
	}
}
