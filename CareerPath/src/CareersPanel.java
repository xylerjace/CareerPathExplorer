import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CareersPanel extends JPanel  {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	String career1 = "";
	String career2 = "";
	String career3 = "";
	String career4 = "";
	String career5 = "";
	String career6 = "";
	String career7 = "";
	String career8 = "";
	String level = "";
	
	
	JFrame frame;
	public CareersPanel(JFrame frame, String skill, double points) {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		
		this.frame = frame;
		setBackground(new Color(0x0B132B));
		setSize(1280,750);
		setLayout(null);
		
		if(points<=0.50) {
			level = "LEVEL 1";
		}else if(points <= 0.70) {
			level = "LEVEL 2";
		}else {
			level = "LEVEL 3";
		}
		
		if(skill.equals("Programming")) {
			if(points<=0.50) {
				career1 = "Software Developer";
				career2 = "Web Developer";
				career3 = "Mobile Developer";
				career4 = "Full-Stack Engineer";
				career5 = "Front-end Developer";
				career6 = "Back-end Developer";
				career7 = "Systems Analyst";
				career8 = "IT Support Specialist";
			}else if(points<=0.70) {
				career1 = "Software Engineer";
				career2 = "Embedded Systems Developer";
				career3 = "Blockchain Developer";
				career4 = "Cybersecurity Analyst";
				career5 = "Network Engineer";
				career6 = "Automation Engineer";
				career7 = "Game Developer";
				career8 = "Database Administrator";
				
			}else {
				career1 = "Artificial Intelligence Specialist";
				career2 = "DevOps Engineer";
				career3 = "Cloud Solutions Architect";
				career4 = "Machine Learning Engineer";
				career5 = "Robotics Engineer";
				career6 = "Natural Language Processing (NLP) Engineer";
				career7 = "Computer Vision Engineer";
				career8 = "Quantum Computing Engineer";
				
			}
		}
		if (skill.equals("Data Analysis")) {
		    if (points <= 0.50) {
		        career1 = "Data Analyst";
		        career2 = "Operations Analyst";
		        career3 = "Fraud Analyst";
		        career4 = "Social Media Analyst";
		        career5 = "Business Analyst";
		        career6 = "Marketing Analyst";
		        career7 = "Research Analyst";
		        career8 = "Compliance Analyst";
		    } else if (points <= 0.70) {
		        career1 = "Financial Analyst";
		        career2 = "Market Research Analyst";
		        career3 = "Healthcare Data Analyst";
		        career4 = "Government Data Analyst";
		        career5 = "Energy Analyst";
		        career6 = "Environmental Data Analyst";
		        career7 = "Supply Chain Analyst";
		        career8 = "Customer Insights Analyst";
		    } else {
		        career1 = "Data Scientist";
		        career2 = "Machine Learning Engineer";
		        career3 = "Data Architect";
		        career4 = "Deep Learning Engineer";
		        career5 = "Computer Vision Scientist";
		        career6 = "AI Research Scientist";
		        career7 = "Natural Language Processing (NLP) Specialist";
		        career8 = "Big Data Engineer";
		    }
		}
		if (skill.equals("UI/UX Design")) {
		    if (points <= 0.50) {
		        career1 = "Usability Analyst";
		        career2 = "Mobile App Designer";
		        career3 = "Web Designer";
		        career4 = "Usability Tester";
		        career5 = "Junior UX/UI Designer";
		        career6 = "Entry-level Interaction Designer";
		        career7 = "Graphic Designer with UX Skills";
		        career8 = "E-Learning Content Designer";
		    } else if (points <= 0.70) {
		        career1 = "UI/UX Designer";
		        career2 = "Visual Designer";
		        career3 = "User Interface (UI) Designer";
		        career4 = "User Experience (UX) Strategist";
		        career5 = "UX/UI Consultant";
		        career6 = "Service Designer";
		        career7 = "Digital Product Designer";
		        career8 = "Content Strategist";
		    } else {
		        career1 = "Interaction Designer";
		        career2 = "Information Architect";
		        career3 = "User Experience (UX) Researcher";
		        career4 = "User Interface (UI) Developer";
		        career5 = "Product Designer";
		        career6 = "Accessibility Specialist";
		        career7 = "Design Manager";
		        career8 = "UX/UI Design Director";
		    }
		}
		if (skill.equals("Game Development")) {
		    if (points <= 0.50) {
		        career1 = "Game Tester";
		        career2 = "User Interface (UI) Designer for Games";
		        career3 = "Monetization Specialist in Gaming";
		        career4 = "Game QA Tester";
		        career5 = "Junior Game Developer";
		        career6 = "Entry-level Game Designer";
		        career7 = "Game Content Creator";
		        career8 = "Community Manager for Gaming";
		    } else if (points <= 0.70) {
		        career1 = "Game Developer";
		        career2 = "Game Designer";
		        career3 = "Gameplay Programmer";
		        career4 = "Game Writer";
		        career5 = "Sound Designer for Games";
		        career6 = "Multiplayer Game Developer";
		        career7 = "Game Systems Designer";
		        career8 = "UI/UX Designer for Games";
		    } else {
		        career1 = "Game Programmer";
		        career2 = "Game AI Programmer";
		        career3 = "Virtual Reality (VR) Developer";
		        career4 = "Augmented Reality (AR) Developer";
		        career5 = "Lead Game Developer";
		        career6 = "Game Engine Developer";
		        career7 = "Gameplay Architect";
		        career8 = "Simulation Developer";
		    }
		}
		if (skill.equals("Communications")) {
		    if (points <= 0.50) {
		        career1 = "Customer Support Representative";
		        career2 = "Human Resources Specialist";
		        career3 = "Technical Writer";
		        career4 = "Fundraising Coordinator";
		        career5 = "Grant Writer";
		        career6 = "Community Manager";
		        career7 = "Internal Communications Assistant";
		        career8 = "Social Media Coordinator";
		    } else if (points <= 0.70) {
		        career1 = "Marketing Coordinator";
		        career2 = "Social Media Manager";
		        career3 = "Event Planner";
		        career4 = "Copywriter";
		        career5 = "Content Strategist";
		        career6 = "Media Relations Specialist";
		        career7 = "Sales Representative";
		        career8 = "Brand Ambassador";
		    } else {
		        career1 = "Public Relations Specialist";
		        career2 = "Corporate Communications Manager";
		        career3 = "Public Speaker";
		        career4 = "Journalist";
		        career5 = "Radio/TV Presenter";
		        career6 = "Lobbyist";
		        career7 = "Crisis Communications Manager";
		        career8 = "Speechwriter";
		    }
		}
		if (skill.equals("Leadership")) {
		    if (points <= 0.50) {
		        career1 = "Team Leader";
		        career2 = "Manager (in various departments)";
		        career3 = "Team Supervisor";
		        career4 = "Community Organizer";
		        career5 = "Assistant Manager";
		        career6 = "Office Manager";
		        career7 = "Retail Supervisor";
		        career8 = "Program Coordinator";
		    } else if (points <= 0.70) {
		        career1 = "Project Manager";
		        career2 = "Entrepreneur";
		        career3 = "Business Owner";
		        career4 = "Business Development Manager";
		        career5 = "Innovation Manager";
		        career6 = "Strategy Consultant";
		        career7 = "Franchise Owner";
		        career8 = "Market Research Analyst";
		    } else {
		        career1 = "Director of Operations";
		        career2 = "Executive Director";
		        career3 = "Military Officer";
		        career4 = "Police Chief";
		        career5 = "Fire Chief";
		        career6 = "Government Official";
		        career7 = "Chief of Staff";
		        career8 = "School Principal";
		    }
		}
		if (skill.equals("Marketing")) {
		    if (points <= 0.50) {
		        career1 = "Marketing Coordinator";
		        career2 = "Social Media Manager";
		        career3 = "Event Planner";
		        career4 = "Copywriter";
		        career5 = "Sales Representative";
		        career6 = "Media Buyer";
		        career7 = "Customer Relationship Manager";
		        career8 = "Market Research Analyst";
		    } else if (points <= 0.70) {
		        career1 = "Analytics Manager";
		        career2 = "Creative Director in Marketing";
		        career3 = "Influencer Marketing Manager";
		        career4 = "Email Marketing Specialist";
		        career5 = "Social Media Strategist";
		        career6 = "Demand Generation Manager";
		        career7 = "Campaign Manager";
		        career8 = "Market Development Manager";
		    } else {
		        career1 = "Chief Marketing Officer";
		        career2 = "Growth Hacker";
		        career3 = "Product Marketing Manager";
		        career4 = "Content Marketing Strategist";
		        career5 = "Market Research Director";
		        career6 = "Customer Experience Manager";
		        career7 = "E-commerce Manager";
		        career8 = "Marketing Technology (MarTech) Manager";
		    }
		}
		if (skill.equals("Entrepreneurship")) {
		    if (points <= 0.50) {
		        career1 = "Business Owner";
		        career2 = "Small Business Owner";
		        career3 = "Franchise Owner";
		        career4 = "Start-up Founder";
		        career5 = "Online Business Owner";
		        career6 = "Business Development Associate";
		        career7 = "Operations Coordinator";
		        career8 = "Marketing Coordinator";
		    } else if (points <= 0.70) {
		        career1 = "Entrepreneur";
		        career2 = "Startup Founder";
		        career3 = "Founder/CEO of a Non-Tech Startup";
		        career4 = "Social Entrepreneur";
		        career5 = "Incubator Program Manager";
		        career6 = "E-commerce Entrepreneur";
		        career7 = "Sales Manager";
		        career8 = "Business Coach/Mentor";
		    } else {
		        career1 = "CEO (Chief Executive Officer)";
		        career2 = "Founder/CEO of a Tech Startup";
		        career3 = "Venture Capitalist";
		        career4 = "Business Development Manager";
		        career5 = "Innovation Consultant";
		        career6 = "Product Manager";
		        career7 = "Management Consultant";
		        career8 = "Corporate Trainer";
		    }
		}
		if (skill.equals("Graphic Design")) {
		    if (points <= 0.50) {
		        career1 = "Junior Graphic Designer";
		        career2 = "Production Assistant";
		        career3 = "Intern Graphic Designer";
		        career4 = "Graphic Design Assistant";
		        career5 = "Freelance Graphic Designer (Entry-Level)";
		        career6 = "Visual Design Assistant";
		        career7 = "Assistant Web Designer";
		        career8 = "Junior UI/UX Designer";
		    } else if (points <= 0.70) {
		        career1 = "Graphic Designer";
		        career2 = "Brand Identity Designer";
		        career3 = "Visual Designer";
		        career4 = "UI/UX Designer";
		        career5 = "Web Designer";
		        career6 = "Packaging Designer";
		        career7 = "Motion Graphics Designer";
		        career8 = "Illustrator";
		    } else {
		        career1 = "Senior Art Director";
		        career2 = "Creative Director";
		        career3 = "Lead UI/UX Designer";
		        career4 = "Principal Visual Designer";
		        career5 = "Chief Brand Identity Designer";
		        career6 = "Senior Packaging Designer";
		        career7 = "Senior Motion Graphics Designer";
		        career8 = "Master Illustrator";
		    }
		}
		if (skill.equals("Animation")) {
		    if (points <= 0.50) {
		        career1 = "Assistant Animator";
		        career2 = "Storyboard Artist Assistant";
		        career3 = "Junior 3D Modeler";
		        career4 = "Inbetween Animator";
		        career5 = "Motion Graphics Assistant";
		        career6 = "Animation Clean-up Artist";
		        career7 = "Colorist Assistant";
		        career8 = "Layout Assistant";
		    } else if (points <= 0.70) {
		        career1 = "Animator";
		        career2 = "3D Animator";
		        career3 = "Character Animator";
		        career4 = "Motion Graphics Designer";
		        career5 = "Storyboard Artist";
		        career6 = "Concept Artist";
		        career7 = "Visual Effects (VFX) Artist";
		        career8 = "Keyframe Animator";
		    } else {
		        career1 = "Animation Director";
		        career2 = "Rigging Artist";
		        career3 = "Layout Artist";
		        career4 = "Concept Artist";
		        career5 = "Senior Animator";
		        career6 = "Character Design Lead";
		        career7 = "Animation Supervisor";
		        career8 = "Lead VFX Artist";
		    }
		}
		if (skill.equals("Creativity")) {
		    if (points <= 0.50) {
		        career1 = "Junior Content Creator";
		        career2 = "Assistant Photographer";
		        career3 = "Art Assistant";
		        career4 = "Entry-level Copywriter";
		        career5 = "Assistant Animator";
		        career6 = "Social Media Assistant";
		        career7 = "Production Assistant";
		        career8 = "Digital Marketing Assistant";
		    } else if (points <= 0.70) {
		        career1 = "Graphic Designer";
		        career2 = "Illustrator";
		        career3 = "Writer (Creative Writing)";
		        career4 = "Photographer";
		        career5 = "Artist";
		        career6 = "Content Creator";
		        career7 = "Video Editor";
		        career8 = "Animator";
		    } else {
		        career1 = "Lead Game Designer";
		        career2 = "Creative Director (Film/TV)";
		        career3 = "Master Fashion Designer";
		        career4 = "Senior Writer (Creative Writing)";
		        career5 = "Principal Advertising Creative";
		        career6 = "Senior Art Director";
		        career7 = "Film Producer";
		        career8 = "Music Producer";
		    }
		}
		if (skill.equals("Problem Solving")) {
		    if (points <= 0.50) {
		        career1 = "IT Support Specialist";
		        career2 = "Logistics Coordinator";
		        career3 = "Technical Support Engineer";
		        career4 = "Environmental Scientist";
		        career5 = "Healthcare Administrator";
		        career6 = "Legal Analyst";
		        career7 = "Detective/Investigator";
		        career8 = "Crisis Manager";
		    } else if (points <= 0.70) {
		        career1 = "Data Analyst";
		        career2 = "Operations Analyst";
		        career3 = "Financial Analyst";
		        career4 = "Quality Assurance Engineer";
		        career5 = "Process Engineer";
		        career6 = "Risk Analyst";
		        career7 = "Systems Analyst";
		        career8 = "Project Manager";
		    } else {
		        career1 = "Management Consultant";
		        career2 = "Business Analyst";
		        career3 = "Software Engineer";
		        career4 = "Research Scientist";
		        career5 = "Systems Architect";
		        career6 = "Quantitative Analyst (Quant)";
		        career7 = "Intellectual Property (IP) Lawyer";
		        career8 = "Chief Financial Officer (CFO)";
		    }
		}
		if (skill.equals("Analytical")) {
		    if (points <= 0.50) {
		        career1 = "Operations Analyst";
		        career2 = "Market Research Analyst";
		        career3 = "Quality Assurance Analyst";
		        career4 = "Systems Analyst";
		        career5 = "Intelligence Analyst";
		        career6 = "Policy Analyst";
		        career7 = "Supply Chain Analyst";
		        career8 = "Cybersecurity Analyst";
		    } else if (points <= 0.70) {
		        career1 = "Data Analyst";
		        career2 = "Financial Analyst";
		        career3 = "Risk Analyst";
		        career4 = "Quantitative Analyst";
		        career5 = "Operations Research Analyst";
		        career6 = "Investment Analyst";
		        career7 = "Research Scientist";
		        career8 = "Policy Analyst";
		    } else {
		        career1 = "Business Analyst";
		        career2 = "Management Consultant";
		        career3 = "Statistician";
		        career4 = "Data Scientist";
		        career5 = "Actuary";
		        career6 = "Market Research Director";
		        career7 = "Chief Data Officer (CDO)";
		        career8 = "Economist";
		    }
		}
		if (skill.equals("Organizational Skills")) {
		    if (points <= 0.50) {
		        career1 = "Administrative Coordinator";
		        career2 = "Customer Service Manager";
		        career3 = "Program Coordinator";
		        career4 = "Production Supervisor";
		        career5 = "Legal Secretary";
		        career6 = "Public Relations Coordinator";
		        career7 = "Logistics Coordinator";
		        career8 = "Marketing Coordinator";
		    } else if (points <= 0.70) {
		        career1 = "Office Manager";
		        career2 = "Event Planner";
		        career3 = "Human Resources Manager";
		        career4 = "Facilities Manager";
		        career5 = "Financial Analyst";
		        career6 = "Quality Assurance Manager";
		        career7 = "Sales Manager";
		        career8 = "Project Manager";
		    } else {
		        career1 = "Executive Assistant";
		        career2 = "Operations Manager";
		        career3 = "Executive Director";
		        career4 = "Supply Chain Manager";
		        career5 = "Chief Operating Officer (COO)";
		        career6 = "General Manager";
		        career7 = "Director of Operations";
		        career8 = "Strategic Planner";
		    }
		}
		if (skill.equals("Drafting Skills")) {
		    if (points <= 0.50) {
		        career1 = "Civil Drafter";
		        career2 = "Surveying Technician";
		        career3 = "Tool and Die Maker";
		        career4 = "Construction Estimator";
		        career5 = "Drafting Technician";
		        career6 = "Environmental Drafter";
		        career7 = "Aerospace Drafter";
		        career8 = "CAD Operator ";
		    } else if (points <= 0.70) {
		        career1 = "Mechanical Drafter";
		        career2 = "Electrical Drafter";
		        career3 = "CAD Technician";
		        career4 = "Architectural Technologist";
		        career5 = "Structural Drafter";
		        career6 = "Piping Designer";
		        career7 = "Electronics Drafter";
		        career8 = "Interior Designer";
		    } else {
		        career1 = "Architect";
		        career2 = "3D Modeler";
		        career3 = "Computer-Aided Design (CAD) Manager";
		        career4 = "Industrial Designer";
		        career5 = "Landscape Designer";
		        career6 = "Urban Planner";
		        career7 = "Technical Illustrator";
		        career8 = "Exhibit Designer";
		    }
		}
		if (skill.equals("Management")) {
		    if (points <= 0.50) {
		        career1 = "Assistant Manager";
		        career2 = "Team Leader";
		        career3 = "Office Supervisor";
		        career4 = "Shift Supervisor";
		        career5 = "Account Manager";
		        career6 = "Customer Service Supervisor";
		        career7 = "Administrative Assistant";
		        career8 = "Junior Project Coordinator";
		    } else if (points <= 0.70) {
		        career1 = "Human Resources Manager";
		        career2 = "Marketing Manager";
		        career3 = "Sales Manager";
		        career4 = "Financial Manager";
		        career5 = "Supply Chain Manager";
		        career6 = "IT Manager";
		        career7 = "Retail Store Manager";
		        career8 = "Hotel Manager";
		    } else {
		        career1 = "General Manager";
		        career2 = "Operations Manager";
		        career3 = "Project Manager";
		        career4 = "Business Development Manager";
		        career5 = "Chief Executive Officer (CEO)";
		        career6 = "Chief Operating Officer (COO)";
		        career7 = "Senior Product Manager";
		        career8 = "Strategic Planning Manager";
		    }
		}
		if (skill.equals("Economic Skills")) {
		    if (points <= 0.50) {
		        career1 = "Quantitative Analyst";
		        career2 = "Economic Research Assistant";
		        career3 = "Financial Services Representative";
		        career4 = "Data Analyst (Economics)";
		        career5 = "Assistant Economist";
		        career6 = "Economic Policy Assistant";
		        career7 = "Junior Financial Analyst";
		        career8 = "Research Associate (Economics)";
		    } else if (points <= 0.70) {
		        career1 = "Market Research Analyst";
		        career2 = "Budget Analyst";
		        career3 = "Risk Analyst";
		        career4 = "Statistician";
		        career5 = "Economic Development Specialist";
		        career6 = "Pricing Analyst";
		        career7 = "Real Estate Analyst";
		        career8 = "Business Intelligence Analyst";
		    } else {
		        career1 = "Economist";
		        career2 = "Financial Analyst";
		        career3 = "Investment Analyst";
		        career4 = "Actuary";
		        career5 = "Management Consultant";
		        career6 = "Economic Consultant";
		        career7 = "Policy Analyst";
		        career8 = "Corporate Treasurer";
		    }
		}
		if (skill.equals("Teaching")) {
		    if (points <= 0.50) {
		        career1 = "Teaching Assistant";
		        career2 = "Adult Education Instructor";
		        career3 = "Workshop Facilitator";
		        career4 = "Special Education Teacher";
		        career5 = "Substitute Teacher";
		        career6 = "Early Childhood Educator";
		        career7 = "Academic Tutor";
		        career8 = "Education Coordinator";
		    } else if (points <= 0.70) {
		        career1 = "Teacher";
		        career2 = "Trainer";
		        career3 = "Instructional Designer";
		        career4 = "Curriculum Developer";
		        career5 = "Corporate Trainer";
		        career6 = "Training Manager";
		        career7 = "E-Learning Developer";
		        career8 = "Educational Technologist";
		    } else {
		        career1 = "Educational Consultant";
		        career2 = "School Administrator";
		        career3 = "Faculty Development Coordinator";
		        career4 = "Director of Education";
		        career5 = "Education Program Director";
		        career6 = "Principal";
		        career7 = "Dean";
		        career8 = "Education Researcher";
		    }
		}
		if (skill.equals("Coaching")) {
		    if (points <= 0.50) {
		        career1 = "Time Management Coach";
		        career2 = "Mindfulness Coach";
		        career3 = "Goal Setting Coach";
		        career4 = "Behavior Change Coach";
		        career5 = "Diversity and Inclusion Coach";
		        career6 = "Resilience Coach";
		        career7 = "Parenting Coach";
		        career8 = "Technology Coach";
		    } else if (points <= 0.70) {
		        career1 = "Life Coach";
		        career2 = "Career Coach";
		        career3 = "Health and Wellness Coach";
		        career4 = "Sports Coach";
		        career5 = "Communication Skills Coach";
		        career6 = "Academic Coach";
		        career7 = "Sales Coach";
		        career8 = "Conflict Resolution Coach";
		    } else {
		        career1 = "Executive Coach";
		        career2 = "Leadership Coach";
		        career3 = "Personal Development Coach";
		        career4 = "Motivational Speaker";
		        career5 = "Business Coach";
		        career6 = "Performance Coach";
		        career7 = "Relationship Coach";
		        career8 = "Team Building Coach";
		    }
		}
		if (skill.equals("Writing")) {
		    if (points <= 0.50) {
		        career1 = "Editor";
		        career2 = "Copy Editor";
		        career3 = "Marketing Coordinator";
		        career4 = "Proofreader";
		        career5 = "Social Media Writer";
		        career6 = "Research Assistant (Writer)";
		        career7 = "Advertising Copywriter";
		        career8 = "Content Coordinator";
		    } else if (points <= 0.70) {
		        career1 = "Content Writer";
		        career2 = "Copywriter";
		        career3 = "Technical Writer";
		        career4 = "Novelist";
		        career5 = "Blogger";
		        career6 = "Grant Writer";
		        career7 = "Creative Writer";
		        career8 = "Speechwriter";
		    } else {
		        career1 = "Journalist";
		        career2 = "Public Relations Specialist";
		        career3 = "Screenwriter";
		        career4 = "Author";
		        career5 = "Scriptwriter";
		        career6 = "Communications Specialist";
		        career7 = "Proposal Writer";
		        career8 = "Ghostwriter";
		    }
		}
		
		JButton btnNewButton = new JButton(career1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career1);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton.setBackground(new Color(0xA6D3AA));
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(147, 163, 328, 65);
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(career2);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career2);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_1.setBackground(new Color(0xA6D3AA));
		btnNewButton_1.setBounds(147, 297, 328, 65);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(career3);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career3);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_2.setBackground(new Color(0xA6D3AA));
		btnNewButton_2.setBounds(147, 435, 328, 65);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(career4);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career4);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_3.setBackground(new Color(0xA6D3AA));
		btnNewButton_3.setBounds(147, 559, 328, 65);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(career5);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career5);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_4.setBackground(new Color(0xA6D3AA));
		btnNewButton_4.setBounds(774, 163, 328, 65);
		add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton(career6);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career6);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_5.setBackground(new Color(0xA6D3AA));
		btnNewButton_5.setBounds(774, 297, 328, 65);
		add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton(career7);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career7);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_6.setBackground(new Color(0xA6D3AA));
		btnNewButton_6.setBounds(774, 435, 328, 65);
		add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton(career8);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CompaniesPanel companies = new CompaniesPanel(frame,career8);
				companies.setVisible(true);
				frame.getContentPane().add(companies);
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_7.setBackground(new Color(0xA6D3AA));
		btnNewButton_7.setBounds(774, 559, 328, 65);
		add(btnNewButton_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(32, 24, 294, 65);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CAREER LISTS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel(level);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(534, 80, 184, 45);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*Click on the career to see some companies that offer that career");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(424, 136, 425, 14);
		add(lblNewLabel_2);
		
		JButton btnNewButton_8 = new JButton("Exit");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank you for using our application. Have a nice day!");
				System.exit(0);
			}
		});
		btnNewButton_8.setBackground(new Color(0xA6D3AA));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_8.setBounds(566, 651, 130, 36);
		btnNewButton_8.setFocusable(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setBorderPainted(false);
		add(btnNewButton_8);
		
		JLabel lblNewLabel_3 = new JLabel("*Click this button to exit");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(534, 635, 194, 14);
		add(lblNewLabel_3);
		
		
	}
	
}
