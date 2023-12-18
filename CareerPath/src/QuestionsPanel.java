import java.awt.*;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.swing.*;
import Questions.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class QuestionsPanel extends JPanel {
	ProgrammingQuestions programming = new ProgrammingQuestions();
	DataAnalysisQuestions data= new DataAnalysisQuestions();
	UIUXQuestions uiux = new UIUXQuestions();
	GameDevQuestions game = new GameDevQuestions();
	CommunicationsQuestions communication = new CommunicationsQuestions();
	LeadershipQuestions leadership = new LeadershipQuestions();
	MarketingQuestions marketing = new MarketingQuestions();
	EntrepreneurshipQuestions entrep = new EntrepreneurshipQuestions();
	ProblemSolvingQuestions psq = new ProblemSolvingQuestions();
	AnalyticalQuestions analytical = new AnalyticalQuestions();
	OrganizationalQuestions organizational = new OrganizationalQuestions();
	DraftingQuestions drafting = new DraftingQuestions();
	GraphicDesignQuestions graphicDesign = new GraphicDesignQuestions();
	AnimationQuestions animation = new AnimationQuestions();
	CreativityQuestions creativity = new CreativityQuestions();
	ManagementQuestions management = new ManagementQuestions();
	EconomicQuestions economic = new EconomicQuestions();
	FinanceQuestions finance = new FinanceQuestions();
	Teaching teaching = new Teaching();
	CoachingQuestions coaching = new CoachingQuestions();
	WritingQuestions writing = new WritingQuestions();
	
	Map<String, QuestionPanel> skillQuestionPanelMap;
	

	JFrame frame;
	String highSkill = "";
	
	public QuestionsPanel(JFrame frame, Set<String> addedSkills) {
		this.frame = frame;
		setBackground(new Color(0x0B132B));
		setSize(1280,750);
		
		skillQuestionPanelMap = new HashMap<>();
        skillQuestionPanelMap.put("Programming", programming);
        skillQuestionPanelMap.put("Data Analysis", data);
        skillQuestionPanelMap.put("UI/UX Design", uiux);
        skillQuestionPanelMap.put("Game Development", game);
        skillQuestionPanelMap.put("Communications", communication);
        skillQuestionPanelMap.put("Leadership", leadership);
        skillQuestionPanelMap.put("Marketing", marketing);
        skillQuestionPanelMap.put("Entrepreneurship", entrep);
        skillQuestionPanelMap.put("Problem Solving", psq);
        skillQuestionPanelMap.put("Analytical Skills", analytical);
        skillQuestionPanelMap.put("Organizational Skills", organizational);
        skillQuestionPanelMap.put("Drafting Skills", drafting);
        skillQuestionPanelMap.put("Graphic Design", graphicDesign);
        skillQuestionPanelMap.put("Animation Skills", animation);
        skillQuestionPanelMap.put("Creativity", creativity);
        skillQuestionPanelMap.put("Management", management);
        skillQuestionPanelMap.put("Economic Skills", economic);
        skillQuestionPanelMap.put("Finance", finance);
        skillQuestionPanelMap.put("Teaching", teaching);
        skillQuestionPanelMap.put("Coaching", coaching);
        skillQuestionPanelMap.put("Writing", writing);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(new Color(0x0B132B));

		
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(66, 105, 1184, 530);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        setLayout(null);
        scrollPane.setBackground(new Color(0x0B132B));
		add(scrollPane);
		
		
		JLabel lblNewLabel = new JLabel("SKILLS PROFICIENCY QUESTIONS");
		lblNewLabel.setBounds(143, 54, 394, 45);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setForeground(Color.WHITE);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
				    int maxPoints = Integer.MIN_VALUE;
				    String skillWithMaxPoints = null;
				    int totalPoints = 0;
			        int perfectScore = 0;
			        double percentage = 0;

				    for (String skill : addedSkills) {
				        QuestionPanel questionPanel = skillQuestionPanelMap.get(skill);
				        if (questionPanel != null) {

				            questionPanel.updatePoints();
				            int points = questionPanel.getPoints();
				          //  System.out.println(skill + " Points: " + points);
				            
				            totalPoints += points;
				            perfectScore = addedSkills.size() * 30;
				            percentage = ((double) totalPoints / perfectScore);
				            // Update skillWithMaxPoints if current skill has higher points
				           
				            if (points > maxPoints) {
				                maxPoints = points;
				                skillWithMaxPoints = skill;
				            }
				        }
				    }

				    // Print the skill with the highest points
				    if (skillWithMaxPoints != null) {
				       // System.out.println("Skill with the highest points: " + skillWithMaxPoints);
				    }
				   // System.out.println("Overall Score"+ totalPoints);
				  //  System.out.println("Perfect Score: " + perfectScore);
				  //  System.out.println("Decimal percentage is "+ percentage);
				    
				    CareersPanel career = new CareersPanel(frame,skillWithMaxPoints, percentage);
				    setVisible(false);
				    career.setVisible(true);
				    frame.add(career);
			}
			}
		});
	
		btnNewButton.setBounds(1114, 675, 112, 35);
		add(btnNewButton);
		
		if(addedSkills.contains("Programming")) {
			programming.setBackground(Color.white);
			programming.setPreferredSize(new Dimension(5000, 1650));
			panel.add(programming);
		}
		
		if(addedSkills.contains("Data Analysis")) {
			
			data.setBackground(Color.white);
			data.setPreferredSize(new Dimension(5000, 1650));
			panel.add(data);
		}
		if(addedSkills.contains("UI/UX Design")) {
			uiux.setBackground(Color.white);
			uiux.setPreferredSize(new Dimension(5000, 1650));
			panel.add(uiux);
		}
		if(addedSkills.contains("Game Development")) {
			
			game.setBackground(Color.white);
			game.setPreferredSize(new Dimension(5000, 1650));
			panel.add(game);
		}
		
		if(addedSkills.contains("Communications")) {
			communication.setBackground(Color.white);
			communication.setPreferredSize(new Dimension(5000, 1650));
			panel.add(communication);
		}
		if(addedSkills.contains("Leadership")) {
			leadership.setBackground(Color.white);
			leadership.setPreferredSize(new Dimension(5000, 1650));
			panel.add(leadership);
		}
		if(addedSkills.contains("Marketing")) {
			marketing.setBackground(Color.white);
			marketing.setPreferredSize(new Dimension(5000, 1650));
			panel.add(marketing);
		}
		if(addedSkills.contains("Entrepreneurship")) {
			entrep.setBackground(Color.white);
			entrep.setPreferredSize(new Dimension(5000, 1650));
			panel.add(entrep);
		}
		if(addedSkills.contains("Problem Solving")) {
			psq.setBackground(Color.white);
			psq.setPreferredSize(new Dimension(5000, 1650));
			panel.add(psq);
		}
		if(addedSkills.contains("Analytical Skills")) {
			analytical.setBackground(Color.white);
			analytical.setPreferredSize(new Dimension(5000, 1650));
			panel.add(analytical);
		}
		if(addedSkills.contains("Organizational Skills")) {
			organizational.setBackground(Color.white);
			organizational.setPreferredSize(new Dimension(5000, 1650));
			panel.add(organizational);
		}
		if(addedSkills.contains("Drafting Skills")) {
			drafting.setBackground(Color.white);
			drafting.setPreferredSize(new Dimension(5000, 1650));
			panel.add(drafting);
		}
		if(addedSkills.contains("Graphic Design")) {
			graphicDesign.setBackground(Color.white);
			graphicDesign.setPreferredSize(new Dimension(5000, 1650));
			panel.add(graphicDesign);
		}
		if(addedSkills.contains("Animation Skills")) {
			animation.setBackground(Color.white);
			animation.setPreferredSize(new Dimension(5000, 1650));
			panel.add(animation);
		}
		if(addedSkills.contains("Creativity")) {
			creativity.setBackground(Color.white);
			creativity.setPreferredSize(new Dimension(5000, 1650));
			panel.add(creativity);
		}
		if(addedSkills.contains("Management")) {
			management.setBackground(Color.white);
			management.setPreferredSize(new Dimension(5000, 1650));
			panel.add(management);
		}
		if(addedSkills.contains("Economic Skills")) {
			economic.setBackground(Color.white);
			economic.setPreferredSize(new Dimension(5000, 1650));
			panel.add(economic);
		}
		if(addedSkills.contains("Finance")) {
			finance.setBackground(Color.white);
			finance.setPreferredSize(new Dimension(5000, 1650));
			panel.add(finance);
		}
		if(addedSkills.contains("Teaching")) {
			teaching.setBackground(Color.white);
			teaching.setPreferredSize(new Dimension(5000, 1650));
			panel.add(teaching);
		}
		if(addedSkills.contains("Coaching")) {
			coaching.setBackground(Color.white);
			coaching.setPreferredSize(new Dimension(5000, 1650));
			panel.add(coaching);
		}
		if(addedSkills.contains("Writing")) {
			writing.setBackground(Color.white);
			writing.setPreferredSize(new Dimension(5000, 1650));
			panel.add(writing);
		}
		
		
		SwingUtilities.invokeLater(() -> {
            JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
            verticalScrollBar.setValue(verticalScrollBar.getMinimum());

            scrollPane.revalidate();
            scrollPane.repaint();
        });
		
	}


}
