import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompaniesPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	String comp1 = "";
	String comp2 = "";
	String comp3 = "";
	JFrame frame;
	public CompaniesPanel(JFrame frame, String career) {
		this.frame = frame;
		setBackground(new Color(0x0B132B));
		setSize(1280,750);
		setLayout(null);
		
		// Level 1 Programming Skills (Careers)
		if(career.equals("Software Developer")) {
		   comp1 = "Vauldex Technologies Inc.";
		   comp2 = "TimeRiver Design Inc.";
		   comp3 = "Cerenimbus";
		}

		else if(career.equals("Web Developer")) {
		   comp1 = "Ameeratel";
		   comp2 = "Virginia Food, Inc";
		   comp3 = "JK Network Services";
		}

		else if(career.equals("Mobile App Developer")) {
		   comp1 = "iScale Solutions";
		   comp2 = "RippedBoxStation";
		   comp3 = "Xynapx";
		}

		else if(career.equals("Full-stack Developer")) {
		   comp1 = "CodingChiefs";
		   comp2 = "Hawodtechsolutions";
		   comp3 = "Hawodtechsolutions";
		}

		else if(career.equals("Front-end Developer")) {
		   comp1 = "BPO Seats";
		   comp2 = "iScale Solutions";
		   comp3 = "IntelliPro";
		}

		else if(career.equals("Back-end Developer")) {
		   comp1 = "BPO Seats";
		   comp2 = "AMCS Group";
		   comp3 = "Sun Asterisk Software Developoment Inc.";
		}

		else if(career.equals("Systems Analyst")) {
		   comp1 = "Qualfon";
		   comp2 = "Accenture";
		   comp3 = "Forty Degrees Celsius Inc";
		}

		else if(career.equals("IT Support Specialist")) {
		   comp1 = "Accenture";
		   comp2 = "Go-VA";
		   comp3 = "MySource BPO Solutions Phils Inc.";
		}

		// Level 2 Programming Skills (Careers)
		else if(career.equals("Software Engineer")) {
		   comp1 = "AMCS Group";
		   comp2 = "AmeeraTel";
		   comp3 = "Abstract Digital";
		}

		else if(career.equals("Embedded Systems Developer")) {
		   comp1 = "FPT Software";
		   comp2 = "Staffing Ninja";
		   comp3 = "Flextronics";
		}

		else if(career.equals("Blockchain Developer")) {
		   comp1 = "LARUS Limited";
		   comp2 = "Xurpas Enterprise Inc";
		   comp3 = "AltPayNet";
		}

		else if(career.equals("Cybersecurity Analyst")) {
		   comp1 = "QBE Insurance";
		   comp2 = "Advanced World Systems Inc.";
		   comp3 = "JobTarget";
		}

		else if(career.equals("Network Engineer")) {
		   comp1 = "Trinity Workforce";
		   comp2 = "ABS-CBN Corporation Solutions";
		   comp3 = "Accenture";
		}

		else if(career.equals("Automation Engineer")) {
		   comp1 = "AMCS Group";
		   comp2 = "RipeConcepts Inc";
		   comp3 = "QBE Insurance";
		}

		else if(career.equals("Game Developer")) {
		   comp1 = "Arcanys";
		   comp2 = "GHS Inc.";
		   comp3 = "Solidleisure Solutions Inc.";
		}

		else if(career.equals("Database Administrator")) {
		   comp1 = "Metrobank";
		   comp2 = "Ameeratel";
		   comp3 = "Teradyne";
		}

		// Level 3 Programming Skills (Careers)
		else if(career.equals("Artificial Intelligence Specialist")) {
		   comp1 = "Grundfos";
		   comp2 = "OpenText";
		   comp3 = "ITWORKS GLOBAL SOLUTIONS";
		}

		else if(career.equals("DevOps Engineer")) {
		   comp1 = "Arcanys";
		   comp2 = "VISEO";
		   comp3 = "AMCS Group";
		}

		else if(career.equals("Cloud Solutions Architect")) {
		   comp1 = "G-Xchange";
		   comp2 = "IBM";
		   comp3 = "SM Supermalls";
		}

		else if(career.equals("Machine Learning Engineer")) {
		   comp1 = "Kwanii";
		   comp2 = "BreederDAO";
		   comp3 = "Hammoq";
		}

		else if(career.equals("Robotics Engineer")) {
		   comp1 = "Cloud Employee";
		   comp2 = "Dyson";
		   comp3 = "Eastvantage";
		}

		else if(career.equals("Natural Language Processing (NLP) Engineer")) {
		   comp1 = "IBM";
		   comp2 = "Lifewood";
		   comp3 = "QBE";
		}

		else if(career.equals("Computer Vision Engineer")) {
		   comp1 = "Viecne";
		   comp2 = "Agoda";
		   comp3 = "Optimum Source Inc";
		}

		else if(career.equals("Quantum Computing Engineer")) {
		   comp1 = "IBM";
		   comp2 = "Arcanys";
		   comp3 = "CoDev";
		}

		// Level 1 Data Analysis (Careers)
		else if(career.equals("Data Analyst")) {
		   comp1 = "Chong Hua Hospital";
		   comp2 = "Cyberbacker Careers";
		   comp3 = "HomeSourced, Inc";
		}

		else if(career.equals("Operations Analyst")) {
		   comp1 = "Accenture";
		   comp2 = "CONDUENT";
		   comp3 = "TTEC";
		}

		else if(career.equals("Fraud Analyst")) {
		   comp1 = "Wishland Software Technology Inc";
		   comp2 = "NCR Voyix";
		   comp3 = "AXA Group";
		}

		else if(career.equals("Social Media Analyst")) {
		   comp1 = "GrowthAssistant";
		   comp2 = "VCC Link, Inc.";
		   comp3 = "LexisNexis Risk Solutions";
		}

		else if(career.equals("Business Analyst")) {
		   comp1 = "Qualfon Philippines Incorporated";
		   comp2 = "Accenture";
		   comp3 = "GO-VA";
		}

		else if(career.equals("Marketing Analyst")) {
		   comp1 = "GHD";
		   comp2 = "GoTeam";
		   comp3 = "System Soft Technologies";
		}

		else if(career.equals("Compliance Analyst")) {
		   comp1 = "Marcura";
		   comp2 = "Remitly";
		   comp3 = "Zepz";
		}

		else if(career.equals("Compliance Analyst")) {
		   comp1 = "Marcura";
		   comp2 = "Remitly";
		   comp3 = "Zepz";
		}

		// Level 2 Data Analysis (Careers)
		else if(career.equals("Financial Analyst")) {
		   comp1 = "NL Business Solutions";
		   comp2 = "Aces Call Center Jobs Inc.";
		   comp3 = "Teradyne";
		}

		else if(career.equals("Market Research Analyst")) {
		   comp1 = "Smartsourcing";
		   comp2 = "NielsenIQ";
		   comp3 = "Afuze Collezioni";
		}

		else if(career.equals("Healthcare Data Analyst")) {
		   comp1 = "UST Logistical Systems";
		   comp2 = "FarOut Scout";
		   comp3 = "Dexcom";
		}

		else if(career.equals("Government Data Analyst")) {
		   comp1 = "World Food Programme Philippines";
		   comp2 = "Polestrom";
		   comp3 = "Hitachi Solutions Asia Pacific";
		}

		else if(career.equals("Energy Analyst")) {
		   comp1 = "Metro Manila";
		   comp2 = "Depsey Resource Management Inc.";
		   comp3 = "WHR Global Consulting";
		}

		else if(career.equals("Environmental Data Analyst")) {
		   comp1 = "ISS ESG";
		   comp2 = "CACI";
		   comp3 = "Ventura Foods";
		}

		else if(career.equals("Supply Chain Analyst")) {
		   comp1 = "CEMEX";
		   comp2 = "Pilmico Foods Corporation";
		   comp3 = "Accenture";
		}

		else if(career.equals("Customer Insights Analyst")) {
		   comp1 = "S&P Global";
		   comp2 = "Blue Spark Solutions, Inc.";
		   comp3 = "JPMorgan Chase & Co.";
		}

		// Level 3 Data Analysis (Careers)
		else if(career.equals("Data Scientist")) {
		   comp1 = "Kalibrr";
		   comp2 = "World Vision";
		   comp3 = "Qualfon";
		}

		else if(career.equals("Machine Learning Engineer")) {
		   comp1 = "Michael Page Philippines Philippines";
		   comp2 = "Kwanii";
		   comp3 = "Staffing Ninja";
		}

		else if(career.equals("Data Architect")) {
		   comp1 = "Accenture";
		   comp2 = "Questronix Corporation";
		   comp3 = "Collabera Digital Philippines";
		}

		else if(career.equals("Deep Learning Engineer")) {
		   comp1 = "Likha Careers";
		   comp2 = "neoalpha global";
		   comp3 = "Accenture";
		}

		else if(career.equals("Computer Vision Scientist")) {
		   comp1 = "Kwanii";
		   comp2 = "MedGrocer";
		   comp3 = "CrewBloom";
		}

		else if(career.equals("AI Research Scientist")) {
		   comp1 = "Esco Philippines, Inc.";
		   comp2 = "Esco Lifesciences Group";
		   comp3 = "Renesas Electronics";
		}

		else if(career.equals("Natural Language Processing (NLP) Specialist")) {
		   comp1 = "IBM";
		   comp2 = "Lifewood";
		   comp3 = "QBE";
		}

		else if(career.equals("Big data Engineer")) {
		   comp1 = "Quantrics Enterprises Inc.";
		   comp2 = "IBM";
		   comp3 = "Dexcom Philippines";
		}

		// Level 1 Communication Skills (Careers)
		else if(career.equals("Customer support representative")) {
		   comp1 = "iPloy, OPC";
		   comp2 = "TDCX";
		   comp3 = "NEZDA Technologies, Inc.";
		}

		else if(career.equals("Human Resources Specialist")) {
		   comp1 = "Glophics Web Design and Advertising Inc.";
		   comp2 = "Interactech Solution Inc.";
		   comp3 = "Technology Recruiters Inc.";
		}

		else if(career.equals("Technical Writer")) {
		   comp1 = "Lanex Philippines";
		   comp2 = "HawodTech Solutions Inc.";
		   comp3 = "Onsource Inc.";
		}

		else if(career.equals("Fundraising Coordinator")) {
		   comp1 = "PETA Asia";
		   comp2 = "World Vision";
		   comp3 = "CURE international Children’s Hospitals";
		}

		else if(career.equals("Grant Writer")) {
		   comp1 = "Level up Philippines";
		   comp2 = "Rare";
		   comp3 = "International committee of the red cross Philippines";
		}

		else if(career.equals("Community Manager")) {
		   comp1 = "M.LHUILLIER FINANCIAL SERVICES";
		   comp2 = "Meraki.Biz OPC";
		   comp3 = "Feed the children Philippines Inc.";
		}

		else if(career.equals("Internal Communications Assistant")) {
		   comp1 = "The Islands Group";
		   comp2 = "VBP";
		   comp3 = "Philip Morris International";
		}

		else if(career.equals("Social Media Coordinator")) {
		   comp1 = "Lunarspace Co.";
		   comp2 = "OptiBPO";
		   comp3 = "BSA Solutions Inc.";
		}

		// Level 2 Communication Skills (Careers)
		else if(career.equals("Marketing Coordinator")) {
		   comp1 = "Staff Outsourcing Solutions";
		   comp2 = "Dempsey";
		   comp3 = "Toyota";
		}

		else if(career.equals("Social Media Manager")) {
		   comp1 = "Strategic office support";
		   comp2 = "Meraki.biz OPC";
		   comp3 = "BPO seats";
		}

		else if(career.equals("Event Planner")) {
		   comp1 = "Unboxing";
		   comp2 = "Premier Islands Management Corporation";
		   comp3 = "M Lhuillier cebu safari";
		}

		else if(career.equals("Copywriter")) {
		   comp1 = "AZOVA BP";
		   comp2 = "Staffing ninja";
		   comp3 = "Medspecialized Inc.";
		}

		else if(career.equals("Content Strategist")) {
		   comp1 = "codingchiefs";
		   comp2 = "Corebridge solutions";
		   comp3 = "Inquirer interactive Inc.";
		}

		else if(career.equals("Media Relations Specialist")) {
		   comp1 = "Firstsource";
		   comp2 = "M2.0 Communications Inc.";
		   comp3 = "AboitizPower";
		}

		else if(career.equals("Sales Representative")) {
		   comp1 = "Apeak Philippines Inc";
		   comp2 = "E-copy cebu corporation";
		   comp3 = "Innocentrix Philippines";
		}

		else if(career.equals("Brand Ambassador")) {
		   comp1 = "Jobnet HR Solutions Inc.";
		   comp2 = "SWIYC dba Knowtice";
		   comp3 = "ActiveAsia Inc.";
		}

		// Level 3 Communication Skills (Careers)
		else if(career.equals("Public relations specialist")) {
		   comp1 = "TalentKompass Deutschland";
		   comp2 = "Media.Xchange PR";
		   comp3 = "Vitalstrats creative solutions";
		}

		else if(career.equals("Corporate Communications Manager")) {
		   comp1 = "Cebu pacific air";
		   comp2 = "Dynnino Group";
		   comp3 = "QBE Insurance";
		}

		else if(career.equals("Public Speaker")) {
		   comp1 = "Scentful natures spa";
		   comp2 = "Mad monkey hostels";
		   comp3 = "Neksjob Philippines";
		}

		else if(career.equals("journalist")) {
		   comp1 = "OptiBPO";
		   comp2 = "The Sebuana Group corp.";
		   comp3 = "High leap shared services corp.";
		}

		else if(career.equals("Radio/TV Presenter")) {
		   comp1 = "Cebu Broadcasting Company";
		   comp2 = "Far East Broadcasting Company";
		   comp3 = "Broadcast Enterprises and Affiliated Media";
		}

		else if(career.equals("Lobbyist")) {
		   comp1 = "International Training Center";
		   comp2 = "Arangkada Philippines";
		   comp3 = "ACCRA Law Offices";
		}

		else if(career.equals("Crisis Communications Manager")) {
		   comp1 = "Philippines AirAsia Inc.";
		   comp2 = "Roche";
		   comp3 = "Aboitiz Equity Ventures";
		}

		else if(career.equals("Speechwriter")) {
		   comp1 = "WITZ Communications ";
		   comp2 = "PRWorks";
		   comp3 = "Ayala Corporation";
		}

		// Level 1 Leadership Skills (Careers)
		else if(career.equals("Team Leader")) {
		   comp1 = "Wipro Philippines Inc.";
		   comp2 = "Nations info corp.";
		   comp3 = "Holiday factory tour package Inc.";
		}

		else if(career.equals("Manager (in various departments)")) {
		   comp1 = "No.1 GPT Inc";
		   comp2 = "Tech Mahindra";
		   comp3 = "Bluewater resorts";
		}

		else if(career.equals("Team Supervisor")) {
		   comp1 = "San jose bakeshop";
		   comp2 = "Virginia food Inc.";
		   comp3 = "Gelatissimo";
		}

		else if(career.equals("Community Organizer")) {
		   comp1 = "M lhuillier cebu safari";
		   comp2 = "350 org.";
		   comp3 = "Salt+fin";
		}

		else if(career.equals("Assistant Manager")) {
		   comp1 = "Bluewater resorts";
		   comp2 = "Jollibee group of companies";
		   comp3 = "Mercedes-benz group services phils., Inc.";
		}

		else if(career.equals("Office Manager")) {
		   comp1 = "Dynamic technologies";
		   comp2 = "TAHCHE outsourcing services Inc.";
		   comp3 = "ACEcelent Education and Migration";
		}

		else if(career.equals("Retail Supervisor")) {
		   comp1 = "Visor resources";
		   comp2 = "Gardenia bakeries (phils.) Inc";
		   comp3 = "Prince retail group of companies";
		}

		else if(career.equals("Program Coordinator")) {
		   comp1 = "Raytheon";
		   comp2 = "Qualfon";
		   comp3 = "Health business solutions";
		}

		// Level 2 Leadership Skills (Careers)
		else if(career.equals("Project manager")) {
		   comp1 = "Ripeconcepts Inc.";
		   comp2 = "Accenture";
		   comp3 = "Global star motors corporation";
		}

		else if(career.equals("Entrepreneur")) {
		   comp1 = "Carbon6";
		   comp2 = "Premier media";
		   comp3 = "IntouchCX";
		}

		else if(career.equals("Business owner")) {
		   comp1 = "Bold business";
		   comp2 = "NCR";
		   comp3 = "Promet source";
		}

		else if(career.equals("Business development manager")) {
		   comp1 = "CSV Now";
		   comp2 = "Multitude";
		   comp3 = "Webcast technologies Inc.";
		}

		else if(career.equals("Innovation manager")) {
		   comp1 = "Accenture";
		   comp2 = "Seabu digital";
		   comp3 = "IntouchCX";
		}

		else if(career.equals("Strategy consultant")) {
		   comp1 = "IBM";
		   comp2 = "Sprout solutions";
		   comp3 = "NCR";
		}

		else if(career.equals("Franchise owner")) {
		   comp1 = "The generics pharmacy";
		   comp2 = "GENERIKA DRUGSTORE";
		   comp3 = "Julie’s franchise corporation";
		}

		else if(career.equals("Market research analyst")) {
		   comp1 = "Smartsourcing";
		   comp2 = "Bold business";
		   comp3 = "QBE insurance";
		}

		// Level 3 Leadership Skills (Careers)
		else if(career.equals("Director of operations")) {
		   comp1 = "TTEC";
		   comp2 = "Seabu Digital";
		   comp3 = "Hawodtech solutions";
		}

		else if(career.equals("Executive director")) {
		   comp1 = "Corebridge solutions";
		   comp2 = "Michael page philippines";
		   comp3 = "Cebu country club, Inc.";
		}

		else if(career.equals("Military officer")) {
		   comp1 = "Gaprotec security Inc.";
		   comp2 = "Eagle corinthians integrated security Inc.";
		   comp3 = "Philippine Military Academy (PMA)";
		}

		else if(career.equals("Police chief")) {
		   comp1 = "ARTA";
		   comp2 = "Philippine Drug Enforcement Agency (PDEA)";
		   comp3 = "National Bureau of Investigation (NBI)";
		}

		else if(career.equals("Fire chief")) {
		   comp1 = "Dusit thani mactan cebu";
		   comp2 = "Philippine Association of Fire Chiefs (PAFC)";
		   comp3 = "Bureau of Fire Protection (BFP)";
		}

		else if(career.equals("Government official")) {
		   comp1 = "Philippine Ports Authority (PPA)";
		   comp2 = "Civil Service Commission (CSC)";
		   comp3 = "Philippine Postal Corporation (PHLPost)";
		}

		else if(career.equals("Chief of staff")) {
		   comp1 = "St. Anthony mother and child hospital";
		   comp2 = "Choobi choobi flavors corp.";
		   comp3 = "Majesty pharma";
		}

		else if(career.equals("School principal")) {
		   comp1 = "University of visayas";
		   comp2 = "Cebu globalization ESL Inc.";
		   comp3 = "Cebu english learning language academy";
		}

		// Level 1 Marketing  Skills (Careers)
		else if(career.equals("Marketing coordinator")) {
		   comp1 = "Staff outsourcing solutions";
		   comp2 = "Toyota cebu city Inc.";
		   comp3 = "Corebridge solutions";
		}

		else if(career.equals("Social media manager")) {
		   comp1 = "Contactpoint 360";
		   comp2 = "Howdy lemon japan incorporated";
		   comp3 = "BPO seats";
		}

		else if(career.equals("Event planner")) {
		   comp1 = "The abaca group";
		   comp2 = "Cloudstaff";
		   comp3 = "Unboxing";
		}

		else if(career.equals("Copywriter")) {
		   comp1 = "Proweaver Inc.";
		   comp2 = "AmeeraTel";
		   comp3 = "Cenix web development services";
		}

		else if(career.equals("Sales representative")) {
		   comp1 = "Geneplanet";
		   comp2 = "Phyllis song consulting";
		   comp3 = "Oro china group of companies";
		}

		else if(career.equals("Media buyer")) {
		   comp1 = "Dynata";
		   comp2 = "Lunarspace Co.";
		   comp3 = "Advanzweb media";
		}

		else if(career.equals("Customer relationship manager")) {
		   comp1 = "Security banks careers";
		   comp2 = "ZigZag Careers";
		   comp3 = "Intro Recruitment Asia";
		}

		else if(career.equals("Market research analyst")) {
		   comp1 = "Smartsourcing";
		   comp2 = "Bold business";
		   comp3 = "Qualfon philippines incorporated";
		}

		// Level 2 Marketing  Skills (Careers)
		else if(career.equals("Analytics manager")) {
		   comp1 = "Infotrust";
		   comp2 = "Pilmico foods corporation";
		   comp3 = "J plazo staffing corp";
		}

		else if(career.equals("Creative director in marketing")) {
		   comp1 = "Creative cuisine group";
		   comp2 = "Ayala land malls Inc.";
		   comp3 = "IntouchCX";
		}

		else if(career.equals("Influencer marketing manager")) {
		   comp1 = "Staff domain Inc.";
		   comp2 = "Go-VA";
		   comp3 = "Cares summit corporation";
		}

		else if(career.equals("Email marketing specialist")) {
		   comp1 = "Staff outsourcing solutions";
		   comp2 = "Teleforce global services corporations";
		   comp3 = "Unilab Inc.";
		}

		else if(career.equals("Social media strategist")) {
		   comp1 = "Inquirer interactive Inc.";
		   comp2 = "Ideahub it solutions provider Inc.";
		   comp3 = "Staff domain Inc.";
		}

		else if(career.equals("Demand generation manager")) {
		   comp1 = "Community brands";
		   comp2 = "DNA micro";
		   comp3 = "Staff domain Inc.";
		}

		else if(career.equals("Campaign manager")) {
		   comp1 = "Exdigita";
		   comp2 = "Ameeratel";
		   comp3 = "Community brands";
		}

		else if(career.equals("Market development manager")) {
		   comp1 = "Multitude";
		   comp2 = "Mec networks corporation";
		   comp3 = "King properties";
		}

		// Level 3 Marketing  Skills (Careers)
		else if(career.equals("Chief marketing officer")) {
		   comp1 = "Corebridge solutions";
		   comp2 = "Ayala land malls Inc.";
		   comp3 = "Vibo group of companies";
		}

		else if(career.equals("Growth hacker")) {
		   comp1 = "GrowthAssistant";
		   comp2 = "ConnectOS";
		   comp3 = "RemoteVA";
		}

		else if(career.equals("Product marketing manager")) {
		   comp1 = "PL international";
		   comp2 = "Vismotor corporation";
		   comp3 = "Seabu digital";
		}

		else if(career.equals("Content marketing strategist")) {
		   comp1 = "Corebridge solutions";
		   comp2 = "Jk network services";
		   comp3 = "SVCPH Inc.";
		}

		else if(career.equals("Market research director")) {
		   comp1 = "Bold business";
		   comp2 = "Smartsourcing";
		   comp3 = "Jk network services";
		}

		else if(career.equals("Customer experience manager")) {
		   comp1 = "Neksjob corporation";
		   comp2 = "CONDUENT";
		   comp3 = "TTEC";
		}

		else if(career.equals("E-commerce manager")) {
		   comp1 = "BSA solutions Inc.";
		   comp2 = "DNA micro";
		   comp3 = "Philippines estates corporation";
		}

		else if(career.equals("Marketing technology(MarTech) manager")) {
		   comp1 = "Seabu digital";
		   comp2 = "Corebridge solutions";
		   comp3 = "Ayala land malls Inc.";
		}
		else if(career.equals("Business Owner")) {
			   comp1 = "CoreBridge Solutions";
			   comp2 = "Accenture";
			   comp3 = "Rural Net Inc.";
			}

			else if(career.equals("Small Business Owner")) {
			   comp1 = "411 BPO India";
			   comp2 = "The Pack Solutions Inc.";
			   comp3 = "TaskUs";
			}

			else if(career.equals("Franchise Owner")) {
			   comp1 = "McDonald's Philippines (Golden Arches Development Corporation)";
			   comp2 = "GENERIKA Drugstore";
			   comp3 = "3MHE Snack House - Franchise of Mr. Potato";
			}

			else if(career.equals("Start-up Founder")) {
			   comp1 = "Block Dojo";
			   comp2 = "iLoveMathBooks";
			   comp3 = "ENGIE Factory Asia-Pacific";
			}

			else if(career.equals("Online Business Owner")) {
			   comp1 = "ENGIE Factory Asia-Pacific";
			   comp2 = "Shipmates";
			   comp3 = "MYCAREERSDB";
			}

			else if(career.equals("Business Development Associate")) {
			   comp1 = "Extenteam";
			   comp2 = "Inteluck Corporation";
			   comp3 = "SOFIA";
			}

			else if(career.equals("Operations Coordinator")) {
			   comp1 = "REVAstaff";
			   comp2 = "CardMasters PH";
			   comp3 = "Trax Technologies";
			}

			else if(career.equals("Marketing Coordinator")) {
			   comp1 = "Dempsey";
			   comp2 = "Staff Outsourcing Solutions";
			   comp3 = "Benchmark 365";
			}

			// Level 2 Entrepreneurship Skills (Careers)
			else if(career.equals("Entrepreneur")) {
			   comp1 = "Academy of Entrepreneurs";
			   comp2 = "Lamudi";
			   comp3 = "WEN- Women Entrepreneur Network";
			}

			else if(career.equals("Startup Founder")) {
			   comp1 = "Lamudi";
			   comp2 = "iLoveMathBooks";
			   comp3 = "Block Dojo";
			}

			else if(career.equals("Founder/CEO of Non-Tech Startup")) {
			   comp1 = "The Generics Pharmacy";
			   comp2 = "Potato Corner";
			   comp3 = "Happy Skin Cosmetics";
			}

			else if(career.equals("Social Entrepreneur")) {
			   comp1 = "Pure Oceans";
			   comp2 = "Angage Inc.";
			   comp3 = "EDAYA";
			}

			else if(career.equals("Incubator Program Manager")) {
			   comp1 = "TikTok";
			   comp2 = "eData Services Phils. Inc.";
			   comp3 = "BytedaDance";
			}

			else if(career.equals("E-commerce Entrepreneur")) {
			   comp1 = "SellerX";
			   comp2 = "Premier Media";
			   comp3 = "Premier Media (TikTok Shop Specialist PH)";
			}

			else if(career.equals("Sales Manager")) {
			   comp1 = "Shang Properties Inc.";
			   comp2 = "Michael page Philippines";
			   comp3 = "Lamudi";
			}

			else if(career.equals("Business Coach/Mentor")) {
			   comp1 = "Business Consultant Lead";
			   comp2 = "Agile Coach(Hybrid)";
			   comp3 = "Agile Coach";
			}

			// Level 3 Entrepreneurship Skills (Careers)
			else if(career.equals("CEO (Chief Executive Officer)")) {
			   comp1 = "DNO FOOD VENTURES CORP";
			   comp2 = "Experientiality";
			   comp3 = "Dempsey Resource Management Inc.";
			}

			else if(career.equals("Founder/CEO of a Tech Startup")) {
			   comp1 = "bigDAWGS promotions inc";
			   comp2 = "TechnologyAdvice";
			   comp3 = "Enter-Tech";
			}

			else if(career.equals("Venture Capitalists")) {
			   comp1 = "FTR Sourcing Corporation";
			   comp2 = "FactSet";
			   comp3 = "Block Dojo";
			}

			else if(career.equals("Business Development Manager")) {
			   comp1 = "Multitude";
			   comp2 = "Monroe Consulting Phils Inc.";
			   comp3 = "CVS Now";
			}

			else if(career.equals("Innovation Consultant")) {
			   comp1 = "IBM";
			   comp2 = "AIA Philippines Life and General Insurance Company Inc";
			   comp3 = "Concentrix";
			}

			else if(career.equals("Product Manager")) {
			   comp1 = "HawodTech Solutions";
			   comp2 = "EMAPTA";
			   comp3 = "Kuubiik";
			}

			else if(career.equals("Management Consultant")) {
			   comp1 = "Metacom Solutions Inc.";
			   comp2 = "IBM";
			   comp3 = "NCR";
			}

			else if(career.equals("Corporate Trainer")) {
			   comp1 = "Concentrix";
			   comp2 = "TTEC";
			   comp3 = "TechMahindra"; 
			}

			// Level 1 Graphic Design
			if(career.equals("Junior Graphic Designer")) {
			   comp1 = "Greenlink Solutions, Inc.";
			   comp2 = "Tahche Outsourcing Services Inc.";
			   comp3 = "Cyberbacker Careers";
			}

			else if(career.equals("Production Assistant")) {
			   comp1 = "ALTERNATIVES FOOD CORP";
			   comp2 = "LightUpToys.com";
			   comp3 = "GrowthAssistant";
			}

			else if(career.equals("Intern Graphic Designer")) {
			   comp1 = "GO-VA";
			   comp2 = "Confidential";
			   comp3 = "PUNX.AI";
			}

			else if(career.equals("Graphic Design Assistant")) {
			   comp1 = "GrowthAssistant";
			   comp2 = "HBC Recruitment Specialists";
			   comp3 = "TALENTS.FIT";
			}

			else if(career.equals("Freelance Graphic Designer")) {
			   comp1 = "Circa Logica Group";
			   comp2 = "Unspecified";
			   comp3 = "txtmeQuick";
			}

			else if(career.equals("Visual Design Assistant")) {
			   comp1 = "GrowthAssistant";
			   comp2 = "HBC";
			   comp3 = "TALENTS.FIT";
			}

			else if(career.equals("Assistant Web Designer")) {
			   comp1 = "GrowthAssistant";
			   comp2 = "The Elite Job";
			   comp3 = "Right Customer";
			}

			else if(career.equals("Junior UI/UX Designer")) {
			   comp1 = "HawodTech Solutions";
			   comp2 = "GrowthAssistant";
			   comp3 = "We Are Unity";
			}

			// Level 2 Graphic Design
			else if(career.equals("Graphic Designer")) {
			   comp1 = "Blueberry Digital Labs";
			   comp2 = "Tessie Health & Beauty Products Shop";
			   comp3 = "MedsSpecialized";
			}

			else if(career.equals("Brand Identity Designer")) {
			   comp1 = "RemoteVA";
			   comp2 = "AHGLAB Consultancy Services INC.";
			   comp3 = "MedsSpecialiezed Inc.";
			}

			else if(career.equals("Visual Designer")) {
			   comp1 = "MedsSpecialized Inc.";
			   comp2 = "Blueberry Digital Labs";
			   comp3 = "RealPage Inc.";
			}

			else if(career.equals("UI/UX Designer")) {
			   comp1 = "GLOPHICS WEB DESIGN AND ADVERTISING INC.";
			   comp2 = "Hawodtech Solutions Inc";
			   comp3 = "Soun Connection Philippines Inc.";
			}

			else if(career.equals("Web Designer")) {
			   comp1 = "Brooks Software Development Services";
			   comp2 = "Cenix Web Development Services";
			   comp3 = "Newfold Digital";
			}

			else if(career.equals("Packaging Designer")) {
			   comp1 = "Addiction Pet Foods";
			   comp2 = "Elite Talent Recruitment";
			   comp3 = "Dyson Electronics Pte Ltd Philippine Branch";
			}

			else if(career.equals("Motion Graphic Designer")) {
			   comp1 = "Logics BPS";
			   comp2 = "5BDF corporation";
			   comp3 = "Confidential";
			}

			else if(career.equals("Illustrator")) {
			   comp1 = "Svan Cosmetics Corporation";
			   comp2 = "Kwanii";
			   comp3 = "Center for Premier International Language Studies";
			}

			// Level 3 Graphic Design
			else if(career.equals("Senior Art Director")) {
			   comp1 = "Publicis Groupe";
			   comp2 = "Ogilvy";
			   comp3 = "SAGA PH";
			}

			else if(career.equals("Creative Director")) {
			   comp1 = "Icon Executive Asia";
			   comp2 = "Staffing Ninja";
			   comp3 = "Bonavita Philippine";
			}

			else if(career.equals("Lead UI/UX Designer")) {
			   comp1 = "EISENBACH CONSULTING LLC";
			   comp2 = "MAS Global Consulting";
			   comp3 = "DNA Micro Software Inc.";
			}

			else if(career.equals("Principal Visual Designer")) {
			   comp1 = "JoyRide PH";
			   comp2 = "MPT Mobility";
			   comp3 = "GoTeam";
			}

			else if(career.equals("Chief Brand Identity Designer")) {
			   comp1 = "Accupower Distributors Inc.";
			   comp2 = "Newstars Solutions Inc.";
			   comp3 = "Accor";
			}

			else if(career.equals("Senior Packaging Designer")) {
			   comp1 = "Personal Collection Direct Selling Inc";
			   comp2 = "AlteNew";
			   comp3 = "RAD Innovations Inc.";
			}

			else if(career.equals("Senior Motion Graphics Designer")) {
			   comp1 = "Staff Domain Pty Ltd";
			   comp2 = "GoTeam";
			   comp3 = "Booth & Partners";
			}

			else if(career.equals("Master Illustrator")) {
			   comp1 = "The Intelligent Publishing Inc.";
			   comp2 = "Vibal Group Inc.";
			   comp3 = "KoreanLearning";
			}

			// Level 1 Animation
			if(career.equals("Assistant Animator")) {
			   comp1 = "Zvoid Philippines";
			   comp2 = "HCM Nexus Consulting";
			   comp3 = "Ogilvy";
			}

			else if(career.equals("Storyboard Artist Assistant")) {
			   comp1 = "Quipper Limited Philippine Branch";
			   comp2 = "Studia Sekai Inc.";
			   comp3 = "The Simple Sum.";
			}

			else if(career.equals("Junior 3D Modeler")) {
			   comp1 = "GMA New Media Inc.";
			   comp2 = "Cloudstaff Philippine Inc.";
			   comp3 = "Saudi Aramco";
			}

			else if(career.equals("Inbetween Animator")) {
			   comp1 = "Studio Sekai Inc.";
			   comp2 = "Manulife";
			   comp3 = "Eight Clients";
			}

			else if(career.equals("Motion Graphics Assistant")) {
			   comp1 = "GrowthAssistant";
			   comp2 = "Ng Khai Development Corp.";
			   comp3 = "Ogilvy";
			}

			else if(career.equals("Animation Clean-up Artist")) {
			   comp1 = "Studio Sekai Inc.";
			   comp2 = "White Box Builders and Supply Inc.";
			   comp3 = "Top Draw Animation Inc.";
			}

			else if(career.equals("Colorist Assistant")) {
			   comp1 = "BuddyBoss";
			   comp2 = "Studio Sekai";
			   comp3 = "Simpletrade Ventures OPC";
			}

			else if(career.equals("Layout Assistant")) {
			   comp1 = "GrowthAssistant";
			   comp2 = "optiBPO";
			   comp3 = "Accor";
			}

			// Level 2 Animation
			else if(career.equals("Animator")) {
			   comp1 = "Nagarro";
			   comp2 = "23point5";
			   comp3 = "RemoteVA";
			}

			else if(career.equals("3D Animator")) {
			   comp1 = "Navarro";
			   comp2 = "Support Shepherd";
			   comp3 = "Confidential";
			}

			else if(career.equals("Character Animator")) {
			   comp1 = "TADApix Animation";
			   comp2 = "Assassin's Creed";
			   comp3 = "Ubisoft";
			}

			else if(career.equals("Motion Graphics Designer")) {
			   comp1 = "Logix BPO";
			   comp2 = "5BDF Corporation";
			   comp3 = "Confidential";
			}

			else if(career.equals("Storyboard Artist")) {
			   comp1 = "Quipper Limited Philippine Branch";
			   comp2 = "Studio Sekai Inc.";
			   comp3 = "GrowthAssistant";
			}

			else if(career.equals("Concept Artist")) {
			   comp1 = "Kwanii";
			   comp2 = "Mino games";
			   comp3 = "Ubisoft";
			}

			else if(career.equals("Visual Effects (VFX) Artist")) {
			   comp1 = "Gamigo AG";
			   comp2 = "Orc Chop Games";
			   comp3 = "GrowthAssistant";
			}

			else if(career.equals("Keyframe Animator")) {
			   comp1 = "Studio Sekai";
			   comp2 = "Mploy Oursourcing Solutions Inc.";
			   comp3 = "Eight Clients";
			}

			// Level 3 Animation
			else if(career.equals("Animation Director")) {
			   comp1 = "Ubisoft";
			   comp2 = "RemoteVA";
			   comp3 = "Assassin's Creed";
			}

			else if(career.equals("Rigging Artist")) {
			   comp1 = "Confidential";
			   comp2 = "Studio Sekai";
			   comp3 = "Salad Ventures Limited";
			}

			else if(career.equals("Layout Artist")) {
			   comp1 = "Asia's Best Industrial Corporation";
			   comp2 = "MedsSpecialized Inc.";
			   comp3 = "HBC Recruitment Specialists";
			}

			else if(career.equals("Concept Artist")) {
			   comp1 = "Kwanii";
			   comp2 = "Mino Games";
			   comp3 = "LightUpToys.com";
			}

			else if(career.equals("Senior Animator")) {
			   comp1 = "N-able";
			   comp2 = "Arcadian Design & Dev LLC";
			   comp3 = "Studio Sekai";
			}

			else if(career.equals("Character Design Lead")) {
			   comp1 = "Keywords Studios";
			   comp2 = "Panoptik Digital";
			   comp3 = "Emerge Digital Agency";
			}

			else if(career.equals("Animation Supervisor")) {
			   comp1 = "Ubisoft";
			   comp2 = "Assassin's Creed";
			   comp3 = "Top Draw Animation";
			}

			else if(career.equals("Lead VFX Artist")) {
			   comp1 = "Snaphunt";
			   comp2 = "Magic Media";
			   comp3 = "Studio Sekai";
			}


			// Level 1 Creative Skills Careers
			if (career.equals("Junior Content Creator")) {
			    comp1 = "Inquirer.net";
			    comp2 = "Konstant Kreative";
			    comp3 = "Phoenix Support Services Inc.";
			   
			} else if (career.equals("Assistant Photographer")) {
			    comp1 = "Clix and Blinx";
			    comp2 = "J-bgood";
			    comp3 = "Shutter Panda Photography";
			    
			} else if (career.equals("Art Assistance")) {
			    comp1 = "Tham Surigao";
			    comp2 = "Dempsey Resource Management";
			    comp3 = "SNS Beauty Corp";
			    
			} else if (career.equals("Entry-level Copywriter")) {
			    comp1 = "Start-Up Digital";
			    comp2 = "Neksjob Corporation";
			    comp3 = "Jerry";
			    
			} else if (career.equals("Assistant Animator")) {
			    comp1 = "iLathys Pte Ltd";
			    comp2 = "Assassin’s Creed";
			    comp3 = "Inkify Labs";
			    
			} else if (career.equals("Social Media Assistance")) {
			    comp1 = "Finberty";
			    comp2 = "LVNA";
			    comp3 = "optiBPO";
			    
			} else if (career.equals("Production Assistance")) {
			    comp1 = "Probe";
			    comp2 = "StonePro Trading corporation";
			    comp3 = "Caritas et Labora Human Resource Service Cooperative";
			    
			} else if (career.equals("Digital Marketing Assistance")) {
			    comp1 = "Celestial Meadows Developers Corp.";
			    comp2 = "EMPREGO";
			    comp3 = "Rankignite Digital Marketing";
			 }

			// Level 2 Creative Skills Careers
			else if (career.equals("Graphic design")) {
			    comp1 = "Tessie Health & Beauty Production";
			    comp2 = "Blueberry Digital Labs";
			    comp3 = "Cyberbacker Inc";

			} else if (career.equals("Illustrator")) {
			    comp1 = "My Story animated";
			    comp2 = "Support Sheperd";
			    comp3 = "Deer Designer";
			   
			} else if (career.equals("Writer (Creative writings)")) {
			    comp1 = "Brighttank Inc";
			    comp2 = "TALENTS.FIT";
			    comp3 = "AlwaysNow";
			   
			} else if (career.equals("Photographer")) {
			    comp1 = "Innocentrix Philippines";
			    comp2 = "Great Image Services Corp.";
			    comp3 = "Teem";
			   
			} else if (career.equals("Artist")) {
			    comp1 = "Smart Sourcing";
			    comp2 = "Staff Out Sourcing Solution";
			    comp3 = "G Angle Entertaiment Cebu Inc";
			    
			} else if (career.equals("Content Creator")) {
			    comp1 = "Howdy lemon Japan Inc";
			    comp2 = "Brighttank Inc";
			    comp3 = "Inquirer Interactive Inc";
			    
			} else if (career.equals("Video Editor")) {
			    comp1 = "Strategic Office Support";
			    comp2 = "Nabepero Philippines Inc";
			    comp3 = "CyberBacker Careers";
			   
			} else if (career.equals("Animator")) {
			    comp1 = "Nagarro";
			    comp2 = "Ubisoft";
			    comp3 = "Skillsearch";
			}

			// Level 3 Creative Skills Careers
			else if (career.equals("Lead Game Designer")) {
			    comp1 = "Play’n GO";
			    comp2 = "FunGuy Studio Philippines";
			    comp3 = "Breeder DAO";
			   
			} else if (career.equals("Creative Director (Film/TV)")) {
			    comp1 = "SAGA PH";
			    comp2 = "Rumble Royale Collective Corporation";
			    comp3 = "VaynerMedia";
			   
			} else if (career.equals("Master Fashion Designer")) {
			    comp1 = "Badomoda";
			    comp2 = "Activate Talent";
			    comp3 = "Straightforward Fashion Merchandising";
			   
			} else if (career.equals("Senior Writer (Creative Writing)")) {
			    comp1 = "Activation Machine, Inc.";
			    comp2 = "Bright Tank Inc.";
			    comp3 = "Assist Asia";
			    
			} else if (career.equals("Principal Advertising Creative")) {
			    comp1 = "Posh Peanut";
			    comp2 = "The Idea Laboratory";
			    comp3 = "Creative Cranker, Inc.";
			    
			} else if (career.equals("Senior Art Director")) {
			    comp1 = "Ogilvy";
			    comp2 = "Publicis Groupe";
			    comp3 = "FP&A";
			   
			} else if (career.equals("Film Producer")) {
			    comp1 = "Rumble Royale Collective Corporation";
			    comp2 = "The Idea Laboratory";
			    comp3 = "Creative Cranker, Inc.";
			    
			} else if (career.equals("Music Producer")) {
			    comp1 = "HogaM2.0 Communications Inc.";
			comp2 = "Sony Music Entertainmenrth";
			comp3 = "Hogarth";
			}
			// Level 1 Problem Solving Skills Careers
			if (career.equals("IT Support Specialist")) {
			    comp1 = "MySource BPO Solutions Inc.";
			    comp2 = "EPG Group";
			    comp3 = "PCCW Global";
			} else if (career.equals("Logistics Coordinator")) {
			    comp1 = "Rex ADB STORIES & SERVICES INC.";
			    comp2 = "Gardenia Bakeries(Phils.) Inc.";
			    comp3 = "Cold Link Asia Logistic Corporation";
			} else if (career.equals("Technical Support Engineer")) {
			    comp1 = "Crossover";
			    comp2 = "Supporting Enterprises";
			    comp3 = "LENET";
			} else if (career.equals("Environmental Scientist")) {
			    comp1 = "Jacobs";
			    comp2 = "Department of Toxic Substances Control";
			    comp3 = "Department of Fish and Wildlife";
			} else if (career.equals("Healthcare Administrator")) {
			    comp1 = "Microsourcing Philippines Inc.";
			    comp2 = "WTW";
			    comp3 = "Hirebiz Inc.";
			} else if (career.equals("Legal Analyst")) {
			    comp1 = "RELX";
			    comp2 = "Lexisnexis Risk Solutions";
			    comp3 = "Relx";
			} else if (career.equals("Detective/Investigator")) {
			    comp1 = "Ninja Van";
			    comp2 = "Security Bank Corp.";
			    comp3 = "CEED Marketing Corp.";
			} else if (career.equals("Crisis Manager")) {
			    comp1 = "Trinity Workforce Solutions";
			    comp2 = "Ring Central";
			    comp3 = "CLBPTS";
			}
			// Level 2 Problem Solving Skills Careers
			else if (career.equals("Data Analyst")) {
			    comp1 = "Qualfon";
			    comp2 = "Consullant";
			    comp3 = "Chong Hua Hospital";
			} else if (career.equals("Operations Analyst")) {
			    comp1 = "Accenture";
			    comp2 = "TTEC";
			    comp3 = "CONDUENT";
			} else if (career.equals("Financial Analyst")) {
			    comp1 = "Teradyne";
			    comp2 = "OP360";
			    comp3 = "We Are Unity";
			} else if (career.equals("Quality Assurance Engineer")) {
			    comp1 = "MinebeaMitsumi Cebu";
			    comp2 = "Hadwodtech Solutions Inc.";
			    comp3 = "AMCS group";
			} else if (career.equals("Process Engineer")) {
			    comp1 = "SAWO Incorporated";
			    comp2 = "Passepartout Phils. Inc.";
			    comp3 = "Flour Corporation";
			} else if (career.equals("Risk Analyst")) {
			    comp1 = "GO-VA";
			    comp2 = "QBE Insurance";
			    comp3 = "Interactech Solution inc.";
			} else if (career.equals("Systems Analyst")) {
			    comp1 = "Qualfon";
			    comp2 = "Rise Internet";
			    comp3 = "MinebeaMitsumi  Cebu";
			} else if (career.equals("Project Manager")) {
			    comp1 = "Accenture";
			    comp2 = "Greentech Land Development Corporation";
			    comp3 = "VBP";
			}

			// Level 3 Problem Solving Skills Careers
			else if (career.equals("Management Consultant")) {
			    comp1 = "Accenture Company";
			    comp2 = "Indra Philippines, Inc";
			    comp3 = "IDM";
			} else if (career.equals("Business Analyst")) {
			    comp1 = "RecruitePH";
			    comp2 = "Wipro";
			    comp3 = "McKinsey & Company";
			} else if (career.equals("Software Engineer")) {
			    comp1 = "AMCS Group";
			    comp2 = "Abstract Digital";
			    comp3 = "Synacy";
			} else if (career.equals("Research Scientist")) {
			    comp1 = "MD Anderson Cancer Center";
			    comp2 = "Temple University";
			    comp3 = "1Globe Health Institute";
			} else if (career.equals("Systems Architect")) {
			    comp1 = "CS Modern Workforce, Inc";
			    comp2 = "Thakral One";
			    comp3 = "P&A Grant Thornton";
			} else if (career.equals("Quantitative Analyst (Quant")) {
			    comp1 = "JP Morgan Chase Bank, N.A.";
			    comp2 = "Egan-jones";
			    comp3 = "Xelure Technologies";
			} else if (career.equals("Intellectual Property (IP) Lawyer")) {
			    comp1 = "Delphiventures";
			    comp2 = "Clark Outsourcing";
			    comp3 = "I21 Recruitment";
			} else if (career.equals("Chief Financial Officer (CFO)")) {
			    comp1 = "optiBPO";
			    comp2 = "Michael Page";
			    comp3 = "Monroe Consulting Group";
			}

			// Level 1 Analytical Skills Careers
			if (career.equals("Operations Analyst")) {
			    comp1 = "Accenture";
			    comp2 = "CODUENT";
			    comp3 = "TTEC";
			} else if (career.equals("Market Research Analyst")) {
			    comp1 = "Smartsourcing";
			    comp2 = "NielsenIQ";
			    comp3 = "Emapta";
			} else if (career.equals("Quality Assurance Analyst")) {
			    comp1 = "Accenture";
			    comp2 = "Kwanii";
			    comp3 = "Clark Outsourcing";
			} else if (career.equals("Systems Analyst")) {
			    comp1 = "Qualfon";
			    comp2 = "RISE Internet";
			    comp3 = "Metro bank";
			} else if (career.equals("Intelligence Analyst")) {
			    comp1 = "GoTeam";
			    comp2 = "OP360";
			    comp3 = "All System Plus";
			} else if (career.equals("Policy Analyst")) {
			    comp1 = "Saudi Aramco";
			    comp2 = "World Vision";
			    comp3 = "Extend Your Team";
			} else if (career.equals("Supply Chain Analyst")) {
			    comp1 = "Fly Ace Corporation";
			    comp2 = "PGBPGNGLOBAL";
			    comp3 = "Cargill";
			} else if (career.equals("Cybersecurity Analyst")) {
			    comp1 = "GHD";
			    comp2 = "Dempsey Resources Management Inc.";
			    comp3 = "PeoplePlus Tech Inc.";
			}

			// Level 2 Analytical Skills Careers
			else if (career.equals("Data Analyst")) {
			    comp1 = "J Plazo Staffing Corp";
			    comp2 = "Cyberbacker Careers";
			    comp3 = "MyPass Global";
			} else if (career.equals("Financial Analyst")) {
			    comp1 = "Teradyne";
			    comp2 = "OP360";
			    comp3 = "opentext";
			} else if (career.equals("Risk Analyst")) {
			    comp1 = "GO-VA";
			    comp2 = "QBE Insurance";
			    comp3 = "CityState Savings Bank Inc.";
			} else if (career.equals("Quantitative Analyst")) {
			    comp1 = "JP Morgan Chase Bank, N.A.";
			    comp2 = "Egan-jones";
			    comp3 = "Xelure Technologies";
			} else if (career.equals("Operations Research Analyst")) {
			    comp1 = "Energy Development Corporation";
			    comp2 = "ebxr/CX_1/";
			    comp3 = "Reed Elsevier Philippines";
			} else if (career.equals("Investment Analyst")) {
			    comp1 = "FTR Sourcing Corporation";
			    comp2 = "BPI AIA Life Assurance Corporation";
			    comp3 = "Divergence HR Consulting Philippines";
			} else if (career.equals("Research Scientist")) {
			    comp1 = "MD Anderson Cancer Center";
			    comp2 = "Temple University";
			    comp3 = "1Globe Health Institute";
			} else if (career.equals("Policy Analyst")) {
			    comp1 = "Saudi Aramco";
			    comp2 = "World Vision";
			    comp3 = "Extend Your Team";
			}

			// Level 3 Analytical Skills Careers
			else if (career.equals("Business Analyst")) {
			    comp1 = "Arcayns";
			    comp2 = "RecruitePH";
			    comp3 = "BDO Unibank";
			} else if (career.equals("Management Consultant")) {
			    comp1 = "Metacom Solution Inc";
			    comp2 = "Accenture";
			    comp3 = "O&B";
			} else if (career.equals("Statistician")) {
			    comp1 = "St. Anthony Mother And Child Hospital";
			    comp2 = "PwC";
			    comp3 = "CEBU INSTITUTE OF MEDICINE";
			} else if (career.equals("Data Scientist")) {
			    comp1 = "Qualfon";
			    comp2 = "Reeracoen Philippines";
			    comp3 = "Manulife";
			} else if (career.equals("Actuary")) {
			    comp1 = "Viventis Search Asia";
			    comp2 = "Robert Walters";
			    comp3 = "FWD Group management Holdings Limited";
			} else if (career.equals("Market Research Director")) {
			    comp1 = "Curran Daly + Associate";
			    comp2 = "BC Manila";
			    comp3 = "Gardenia Bakeries Phils., Inc.";
			} else if (career.equals("Chief Data Officer (CDO)")) {
			    comp1 = "HCM Nexus Consulting";
			    comp2 = "KSearch Asia Consulting";
			    comp3 = "Career Shepherd";
			} else if (career.equals("Economist")) {
			    comp1 = "BDO Unibank";
			    comp2 = "Department of transportation";
			    comp3 = "Asian Institute of management";
			}

			// Level 1 Organizational Skills Careers
			else if (career.equals("Administrative Coordinator")) {
			    comp1 = "Ateneo de Manila University";
			    comp2 = "optiBPO";
			    comp3 = "Jetfuel";
			   }
			 else if (career.equals("Customer Service Manager")) {
			    comp1 = "Empower Energy Solutions, LLC";
			    comp2 = "ICHS - Hire";
			    comp3 = "VGW";
			} 
			else if (career.equals("Program Coordinator")) {
			    comp1 = "Ateneo de Manila University";
			    comp2 = "RTX";
			    comp3 = "MakerState";
			  
			} else if (career.equals("Production Supervisor")) {
			    comp1 = "Autoliv Philippines";
			    comp2 = "Teradyne";
			    comp3 = "Gardenia Bakeries (Phils.) Inc.";
			   
			} else if (career.equals("Legal Secretary")) {
			    comp1 = "Doxa7 Solutions, Inc.";
			    comp2 = "Out of the Box Practices, Inc.";
			    comp3 = "Du-Balabad and Associates";

			} else if (career.equals("Public Relations Coordinator")) {
			    comp1 = "Quantum Media Group, LLC";
			comp2 = "Fairy Skin Beauty Products Corp";
			 comp3 = "Du-Balabad and Associates";

			} else if (career.equals("Logistics Coordinator")) {
			    comp1 = "Rex ADB Stores and Services";
			    comp2 = "Inteluck Corporation";
			    comp3 = "Cold Link Asia Logistics Corporation";
			 
			} else if (career.equals("Marketing Coordinator")) {
			    comp1 = "Staff Outsourcing Solutions";
			    comp2 = "Benchmark 365";
			    comp3 = "Dempsey";
			}

			// Level 2 Organizational Skills Careers
			else if (career.equals("Office Manager")) {
			    comp1 = "Dynamic Technologists";
			comp2 = "Golden Prince Hotel & Suites";
			comp3 = "Blueberry Digital Labs";
			   
			} else if (career.equals("Event Planner")) {
			    comp1 = "Staffking PTE LTD";
			    comp2 = "EMRG";
			    comp3 = "LXV.ph";
			   
			} else if (career.equals("Human Resources Manager")) {
			    comp1 = "HM Premier Group of Companies";
			    comp2 = "Moder Solutions, Inc.";
			    comp3 = "Blueberry Digital Labs";
			    
			} else if (career.equals("Facilities Manager")) {
			    comp1 = "CBRE";
			    comp2 = "JLL";
			    comp3 = "Michael Page Philippines";
			    
			} else if (career.equals("Financial Analyst")) {
			    comp1 = "Autoliv Philippines";
			    comp2 = "Aces Call Center Jobs Inc.";
			    comp3 = "NL Business Solutions";
			    
			} else if (career.equals("Quality Assurance Manager")) {
			    comp1 = "CONDUENT";
			    comp2 = "Foundever";
			    comp3 = "TaskPro Outsourcing";
			   
			} else if (career.equals("Sales Manager")) {
			    comp1 = "Signature Lines, Inc.";
			    comp2 = "Nestle";
			    comp3 = "ABC Prime, Inc.";
			    
			} else if (career.equals("Project Manager")) {
			    comp1 = "Accenture";
			    comp2 = "Global Star Motors Corporation";
			    comp3 = "RipeConcepts, Inc.";
			}

			// Level 3 Organizational Skills Careers
			else if (career.equals("Executive Assistant")) {
			    comp1 = "GoTeam";
			    comp2 = "Linked Helpers";
			    comp3 = "Responsible Internet Sustainability Effort Inc.";
			   
			} else if (career.equals("Operations Manager")) {
			    comp1 = "Empower Energy Solutions, LLC";
			    comp2 = "The Plusgroup PH";
			    comp3 = "Qualfon";
			 
			} else if (career.equals("Executive Director")) {
			    comp1 = "Curran Daily + Associates";
			    comp2 = "JPMC Candidate Experience";
			    comp3 = "JPMorgan Chase";
			   
			} else if (career.equals("Supply Chain Manager")) {
			    comp1 = "SplashEZ";
			    comp2 = "Rose Pharmacy, Inc.";
			    comp3 = "Savers Depot";
			    
			} else if (career.equals("Chief Operating Officer (COO)")) {
			    comp1 = "DNO Food Ventures Corporations";
			    comp2 = "Wonita International Inc.";
			    comp3 = "Elevate and Delegate";
			   
			} else if (career.equals("General Manager")) {
			    comp1 = "Cebu Country Club";
			    comp2 = "Divergence HR Consulting Philippines";
			    comp3 = "Viva International Food & Restaurant, Inc.";
			   
			} else if (career.equals("Director of Operations")) {
			    comp1 = "Tech Mahindra";
			    comp2 = "HawodTech Solutions";
			    comp3 = "Cyfle";
			    
			} else if (career.equals("Strategic Planner")) {
			    comp1 = "International Pharmaceuticals, Inc.";
			    comp2 = "Bonsey Jaden Philippines";
			    comp3 = "M2.0 Communications Inc.";
			    
			}
			// Level 1 Drafting Skills (Careers)
			else if(career.equals("Civil Drafter")) {
			   comp1 = "GHD";
			   comp2 = "KTP Consultants PL-PH";
			   comp3 = "Malachite Value Builders Inc.";
			}

			else if(career.equals("Surveying Technician")) {
			   comp1 = "Tache Outsourcing Services Inc.";
			   comp2 = "Curran Daly & Associates";
			   comp3 = "The VITO Consulting Group Inc.";
			}

			else if(career.equals("Tool and Die Maker")) {
			   comp1 = "RJD Technologies";
			   comp2 = "Support Sheperd";
			   comp3 = "Monarch Engineering Precision Tooling and General Machining";
			}

			else if(career.equals("Construction Estimator")) {
			   comp1 = "Ideal Builders Development, Corp.";
			   comp2 = "GO-VA";
			   comp3 = "Supportware Philippines";
			}

			else if(career.equals("Drafting Technician")) {
			   comp1 = "AECOM";
			   comp2 = "KZA Singapore";
			   comp3 = "Rich Axxess Distribution Inc.";
			}

			else if(career.equals("Environmental Drafter")) {
			   comp1 = "Elv8 Holdings Inc.";
			   comp2 = "ShoreAgents";
			   comp3 = "Remoteva.ph";
			}

			else if(career.equals("Aerospace Drafter")) {
			   comp1 = "Moog Inc.";
			   comp2 = "National Aerospace Solutions";
			   comp3 = "Amphenol Aerospace";
			}

			else if(career.equals("CAD Operator")) {
			   comp1 = "Tamiya Philippines Inc.";
			   comp2 = "Mehitabel Inc.";
			   comp3 = "Tomorrow, Creation";
			}

			// Level 2 Drafting Skills (Careers)
			else if(career.equals("Mechanical Drafter")) {
			   comp1 = "StaffBerry";
			   comp2 = "RemoteVA";
			   comp3 = "Pandora Outsourcing";
			}

			else if(career.equals("Electrical Drafter")) {
			   comp1 = "GHD";
			   comp2 = "Sourcefit";
			   comp3 = "Black & Veatch";
			}

			else if(career.equals("CAD Technician")) {
			   comp1 = "Tamiya Philippines Inc.";
			   comp2 = "AECOM";
			   comp3 = "Seapac Philippines Inc.";
			}

			else if(career.equals("Architectural Technologies")) {
			   comp1 = "Emapta";
			   comp2 = "Solaire Resort North";
			   comp3 = "Sun Life of Canada (Philippines) Inc.";
			}

			else if(career.equals("Structural Drafter")) {
			   comp1 = "Black and Veatch";
			   comp2 = "Horizon Engineers";
			   comp3 = "Microsourcing";
			}

			else if(career.equals("Piping Designer")) {
			   comp1 = "Flour Corporation";
			   comp2 = "TecSurge";
			   comp3 = "CONNECTe International Pte Ltd";
			}

			else if(career.equals("Electronics Drafter")) {
			   comp1 = "Black and Veatch";
			   comp2 = "Oncor Electric Delivery";
			   comp3 = "CDI Engineering Services";
			}

			else if(career.equals("Interior Designer")) {
			   comp1 = "Cebu Home Builders and Centre";
			   comp2 = "Emperial Trading";
			   comp3 = "Fortune Builders Inc.";
			}

			// Level 3 Drafting Skills (Careers)
			else if(career.equals("Architect")) {
			   comp1 = "Cocos Tierra Development Corporation";
			   comp2 = "Trends Group Inc.";
			   comp3 = "Cebu Home Builders Centre";
			}

			else if(career.equals("3D Modeler")) {
			   comp1 = "Creadits";
			   comp2 = "GHD";
			   comp3 = "Salad Ventures Limited";
			}

			else if(career.equals("Computer Aided Design (CAD) Manager ")) {
			   comp1 = "Jairsoft Inc.";
			   comp2 = "Based on Scentia Inc.";
			   comp3 = "Go-VA";
			}

			else if(career.equals("Industrial Designer")) {
			   comp1 = "Design Center of the Philippines";
			   comp2 = "Confidential";
			   comp3 = "Rural Net Inc.";
			}

			else if(career.equals("Landscape Designer")) {
			   comp1 = "BPO Seats";
			   comp2 = "Mace";
			   comp3 = "Terrarium Design Studio";
			}

			else if(career.equals("Urban Planner")) {
			   comp1 = "Cozy Haus";
			   comp2 = "SM Prime Holdings";
			   comp3 = "DMC Urban Property Developers Inc.";
			}

			else if(career.equals("Technical Illustrator")) {
			   comp1 = "Kwanii";
			   comp2 = "HCM Nexus Consulting";
			   comp3 = "Snaphunt";
			}

			else if(career.equals("Exhibit Designer")) {
			   comp1 = "AvePoint";
			   comp2 = "Sharesource";
			   comp3 = "GoTeam";
			}

			// Management Skills
			// Level 1 (Entry - Mid Level Careers)
			if (career.equals("Assistant Manager")) {
			    comp1 = "Qualfon";
			    comp2 = "Kuehne Nagel";
			    comp3 = "First Source";
			} 
			else if (career.equals("Team Leader")) {
			    comp1 = "Concentrix";
			    comp2 = "BPO Seats";
			    comp3 = "Guesty";
			} 
			else if (career.equals("Office Supervisor")) {
			    comp1 = "Sotogrande Hotel";
			    comp2 = "Conrad Manila";
			    comp3 = "Dream Catcher Beach Resort and Spa";
			} 
			else if (career.equals("Shift Supervisor")) {
			    comp1 = "Visum Ventures Inc.";
			    comp2 = "The Coffee Bean and Tea Leaf PH";
			    comp3 = "Pepsi Cola Products Philippines";
			} 
			else if (career.equals("Account Manager")) {
			    comp1 = "Ogilvy";
			    comp2 = "F & E Enterprises Inc.";
			    comp3 = "Foodpanda Philippines";
			} 
			else if (career.equals("Customer Service Supervisor")) {
			    comp1 = "Empower Energy Solutions, LLC";
			    comp2 = "ICHS - Hire";
			    comp3 = "VGW";
			} 
			else if (career.equals("Administrative Assistant")) {
			    comp1 = "Bridge of Hope Cebu";
			    comp2 = "Concentrix";
			    comp3 = "Security Bank Careers";
			} 
			else if (career.equals("Junior Project Coordinator")) {
			    comp1 = "Kinettix";
			    comp2 = "Accenture";
			    comp3 = "Primus@ Knowledge Specialists Inc.";
			} 
			// Level 2 (Average Careers)
			else if (career.equals("Human Resources Manager")) {
			    comp1 = "HM Premier Group of Companies";
			    comp2 = "Moder Solutions, Inc.";
			    comp3 = "Blueberry Digital Labs";
			} 
			else if (career.equals("Marketing Manager")) {
			    comp1 = "Savers Depot";
			    comp2 = "Vienovo Philippines Inc.";
			    comp3 = "Dusit Thani Mactan Cebu";
			} 
			else if (career.equals("Sales Manager")) {
			    comp1 = "Signature Lines, Inc.";
			    comp2 = "Nestle";
			    comp3 = "ABC Prime, Inc.";
			} 
			else if (career.equals("Financial Manager")) {
			    comp1 = "Cebu Pacific Catering Services, Inc.";
			    comp2 = "Ayala Land Malls Inc.";
			    comp3 = "Synthech Properties Inc.";
			} 
			else if (career.equals("Supply Chain Manager")) {
			    comp1 = "SplashEZ";
			    comp2 = "Rose Pharmacy, Inc.";
			    comp3 = "Savers Depot";
			} 
			else if (career.equals("IT Manager")) {
			    comp1 = "Qualfon";
			    comp2 = "NYGCI Philippines";
			    comp3 = "Vienovo Philippines";
			} 
			else if (career.equals("Retail Store Manager")) {
			    comp1 = "JBW Floor Center";
			    comp2 = "PUMA Group";
			    comp3 = "The VITO Consulting Group Inc.";
			} 
			else if (career.equals("Hotel Manager")) {
			    comp1 = "Luo City Spa Club";
			    comp2 = "Robinsons Hotel and Resorts";
			    comp3 = "Go Hotels";
			} 

			// Level 3 (Excellent Careers)
			else if (career.equals("General Manager")) {
			    comp1 = "Cebu Country Club";
			    comp2 = "Divergence HR Consulting Philippines";
			    comp3 = "Viva International Food & Restaurant, Inc.";
			} 
			else if (career.equals("Operations Manager")) {
			    comp1 = "The Plusgroup PH";
			    comp2 = "Empower Energy Solutions, LLC";
			    comp3 = "Qualfon";
			} 
			else if (career.equals("Project Manager")) {
			    comp1 = "Accenture";
			    comp2 = "Global Star Motors Corporation";
			    comp3 = "RipeConcepts, Inc.";
			} 
			else if (career.equals("Business Development Manager")) {
			    comp1 = "Multitude";
			    comp2 = "King Properties";
			    comp3 = "MEC Networks Corporation";
			} 
			else if (career.equals("Chief Executive Officer (CEO)")) {
			    comp1 = "Michael Page Philippines";
			    comp2 = "Sheryl Ayuste";
			} 
			else if (career.equals("Chief Operating Officer (COO)")) {
			    comp1 = "DNO Food Ventures Corporations";
			    comp2 = "Wonita International Inc.";
			    comp3 = "Elevate and Delegate";
			} 
			else if (career.equals("Senior Product Manager")) {
			    comp1 = "Hawodtech Solutions Inc";
			    comp2 = "Binance";
			    comp3 = "Crossover";
			} 
			else if (career.equals("Strategic Planning Manager")) {
			    comp1 = "Intro Recruitment Asia ADA";
			    comp2 = "Generali Philippines";
			    comp3 = "Nearform";
			}
			//Economic Skills
			// Level 1 (Entry Level Careers)
			if (career.equals("Quantitative Analyst")) {
			    comp1 = "Copeland";
			    comp2 = "Xelure Technologies";
			    comp3 = "HawodTech Solutions Inc.";
			} 
			else if (career.equals("Economic Research Assistant")) {
			    comp1 = "Dempsey Resource Management, Inc.";
			    comp2 = "Metrobank";
			    comp3 = "Smartsourcing";
			} 
			else if (career.equals("Financial Services Representative")) {
			    comp1 = "Wells Fargo";
			    comp2 = "The Probe Group";
			    comp3 = "ResultsCX";
			} 
			else if (career.equals("Data Analyst (Economics)")) {
			    comp1 = "GHD Group";
			    comp2 = "Virtual Staff 365";
			    comp3 = "Staff Outsourcing Solutions";
			} 
			else if (career.equals("Assistant Economist")) {
			    comp1 = "First Standard Finance Corporation";
			    comp2 = "TecSurge";
			    comp3 = "Asian Institute of Management";
			} 
			else if (career.equals("Economic Policy Assistant")) {
			    comp1 = "Allianz PNB Life Insurance Inc.";
			    comp2 = "Metrobank";
			    comp3 = "Recruiter PH";
			} 
			else if (career.equals("Junior Financial Analyst")) {
			    comp1 = "QBE Insurance";
			    comp2 = "CGI - Taguig";
			    comp3 = "MetroMart Technologies Inc";
			} 
			else if (career.equals("Research Associate (Economics)")) {
			    comp1 = "Asian Institute of Management";
			    comp2 = "RepRisk";
			    comp3 = "Dexcom";
			} 

			// Level 2 (Average Careers)
			else if (career.equals("Market Research Analyst")) {
			    comp1 = "Smartsourcing";
			    comp2 = "NielsenIQ";
			    comp3 = "Emapta";
			} 
			else if (career.equals("Budget Analyst")) {
			    comp1 = "Snaphunt";
			    comp2 = "Mabuhay Vinyl Corporation";
			    comp3 = "Bounty Fresh Group";
			} 
			else if (career.equals("Risk Analyst")) {
			    comp1 = "Global Payments Inc.";
			    comp2 = "TaskUs";
			    comp3 = "Manulife";
			} 
			else if (career.equals("Statistician")) {
			    comp1 = "Allegro MicroSystems";
			    comp2 = "Cebu Institute of Medicine";
			    comp3 = "Runningman Corporation";
			} 
			else if (career.equals("Economic Development Specialist")) {
			    comp1 = "National Economic and Development Authority";
			    comp2 = "Dempsey Resource Management, Inc.";
			    comp3 = "Staff Domain Inc.";
			} 
			else if (career.equals("Pricing Analyst")) {
			    comp1 = "Accenture";
			    comp2 = "Monroe Consulting Phils., Inc.";
			    comp3 = "Reed Elsevier Philippines";
			} 
			else if (career.equals("Real Estate Analyst")) {
			    comp1 = "Interlink Global Talent";
			    comp2 = "The VITO Consulting Group";
			    comp3 = "Monroe Consulting Phils., Inc.";
			} 
			else if (career.equals("Business Intelligence Analyst")) {
			    comp1 = "Qualfon Philippines Inc.";
			    comp2 = "Monroe Consulting Phils., Inc.";
			    comp3 = "Littelfuse";
			} 

			// Level 3 (Excellent Careers)
			else if (career.equals("Economist")) {
			    comp1 = "Metrobank";
			    comp2 = "Asian Institute of Management";
			    comp3 = "Department of Foreign Affairs";
			} 
			else if (career.equals("Financial Analyst")) {
			    comp1 = "Interlink Global Talent";
			    comp2 = "Manulife";
			    comp3 = "Monroe Consulting Phils., Inc.";
			} 
			else if (career.equals("Investment Analyst")) {
			    comp1 = "WTW";
			    comp2 = "Manulife";
			    comp3 = "JPMorgan Chase & Co.";
			} 
			else if (career.equals("Actuary")) {
			    comp1 = "AXA";
			    comp2 = "Dempsey Resource Management Inc.";
			    comp3 = "Polytechnic University of the Philippines";
			} 
			else if (career.equals("Management Consultant")) {
			    comp1 = "Neksjob Corporation Philippines";
			    comp2 = "Accenture";
			    comp3 = "Eastvantage Business Solutions Inc.";
			} 
			else if (career.equals("Economic Consultant")) {
			    comp1 = "ING Business Shared Servics B.V.";
			    comp2 = "TransUnion";
			    comp3 = "Boston Consulting Group (Manila)";
			} 
			else if (career.equals("Policy Analyst")) {
			    comp1 = "Accenture";
			    comp2 = "ING Business Shared Services B.V.";
			    comp3 = "UnitedHealth Group";
			} 
			else if (career.equals("Corporate Treasurer")) {
			    comp1 = "Azeus Systems Limited";
			    comp2 = "Partners Group";
			    comp3 = "Dempsey Resource Management, Inc.";
			} 
			//Finance Skills
			// Level 1 (Entry Level Careers)
			if (career.equals("Financial Planner")) {
			    comp1 = "TOA Global";
			    comp2 = "Activate Talent";
			    comp3 = "Northstar";
			} 
			else if (career.equals("Commercial Banker")) {
			    comp1 = "Security Bank Careers";
			    comp2 = "Michael Page Philippines";
			    comp3 = "JPMorgan Chase & Co.";
			} 
			else if (career.equals("Compliance Officer")) {
			    comp1 = "AXA Group";
			    comp2 = "Outsourced";
			    comp3 = "Knauf Philippines";
			} 
			else if (career.equals("Auditor")) {
			    comp1 = "Mandarin Plaza Hotel";
			    comp2 = "Games and Gadgets";
			    comp3 = "Bestank Manufacturing Corporation";
			} 
			else if (career.equals("Insurance Underwriter")) {
			    comp1 = "Accenture";
			    comp2 = "BDO Unibank";
			    comp3 = "QBE Insurance";
			} 
			else if (career.equals("Wealth Manager")) {
			    comp1 = "Security Bank Careers";
			    comp2 = "East West Banking Corporation";
			    comp3 = "JPMorgan Chase & Co.";
			} 
			else if (career.equals("Financial Consultant")) {
			    comp1 = "Far Eastern University";
			    comp2 = "Sunlife of Canada Philippines Inc.";
			    comp3 = "Maxeon";
			} 
			else if (career.equals("Quantitative Analyst")) {
			    comp1 = "Copeland";
			    comp2 = "Xelure Technologies";
			    comp3 = "HawodTech Solutions Inc.";
			} 
			// Level 2 (Average Careers)
			else if (career.equals("Financial Analyst")) {
			    comp1 = "Chevron Corporation";
			    comp2 = "Aces Call Center Jobs Inc.";
			    comp3 = "Michael Page Philippines";
			} 
			else if (career.equals("Corporate Treasurer")) {
			    comp1 = "Azeus Systems Limited";
			    comp2 = "Partners Group";
			    comp3 = "Dempsey Resource Management, Inc";
			} 
			else if (career.equals("Financial Controller")) {
			    comp1 = "STAFFVIRTUAL Careers";
			    comp2 = "Crossover - Philippines";
			    comp3 = "Foodpanda";
			} 
			else if (career.equals("Risk Analyst")) {
			    comp1 = "GO-VA";
			    comp2 = "JPMorgan Chase & Co";
			    comp3 = "Cobden & Carter International";
			} 
			else if (career.equals("Actuary")) {
			    comp1 = "AXA";
			    comp2 = "Dempsey Resource Management Inc.";
			    comp3 = "Polytechnic University of the Philippines";
			} 
			else if (career.equals("Credit Analyst")) {
			    comp1 = "BDO Unibank";
			    comp2 = "Pilmico";
			    comp3 = "Bank of the Philippines Islands (BPI)";
			} 
			else if (career.equals("Hedge Fund Manager")) {
			    comp1 = "Northern Trust Corporation";
			    comp2 = "ACCA Careers";
			    comp3 = "Infinit-O Manila Inc";
			} 
			else if (career.equals("Mergers and Acquisitions Analyst")) {
			    comp1 = "ConnectOS";
			    comp2 = "San Miguel Corporation";
			    comp3 = "NetSuite";
			} 
			// Level 3 (Excellent Careers)
			else if (career.equals("Investment Banker")) {
			    comp1 = "Security Bank";
			    comp2 = "JPMorgan Chase Bank";
			    comp3 = "East West Banking Corporation";
			} 
			else if (career.equals("Portfolio Manager")) {
			    comp1 = "AXA Group";
			    comp2 = "Citi";
			    comp3 = "Wells Fargo";
			} 
			else if (career.equals("Chief Financial Officer")) {
			    comp1 = "Emapta";
			    comp2 = "Michael Page Philippines";
			    comp3 = "OptiBPO";
			} 
			else if (career.equals("Private Equity Analyst")) {
			    comp1 = "Arch Capital Management";
			    comp2 = "Michael Page Philippines";
			    comp3 = "Support Shepherd";
			} 
			else if (career.equals("Tax Manager")) {
			    comp1 = "Raytheon Missiles & Defense";
			    comp2 = "Union Galvasteel Corporation";
			    comp3 = "Wilcon Depot, Inc.";
			} 
			else if (career.equals("Chief Investment Officer")) {
			    comp1 = "ExecThread";
			    comp2 = "ACCA Careers";
			    comp3 = "Ebm Talent Bucket Inc.";
			} 
			else if (career.equals("Asset Management Manager")) {
			    comp1 = "Curran Daly & Associates";
			    comp2 = "Acquisition Outsourcing Incorporated";
			    comp3 = "Neksjob Corporation";
			} 
			else if (career.equals("Treasury Manager")) {
			    comp1 = "Nizza Recruitment Services";
			    comp2 = "Michael Page Philippines";
			    comp3 = "Zendesk";
			} 
			//Teaching/Training Skills
			// Level 1 (Entry Level Teaching/Training Skills)
			else if (career.equals("Teaching Assistant")) {
			    comp1 = "ERRX Recruitment Consulting";
			    comp2 = "Younghomes Learning Center Inc.";
			    comp3 = "Wesley Primrose Academy, The British Curriculum School";
			} 
			else if (career.equals("Adult Education Instructor")) {
			    comp1 = "BrainRx Learning Plus, Inc.";
			    comp2 = "Makati Hope Christian School";
			    comp3 = "Timedoor";
			} 
			else if (career.equals("Workshop Facilitator")) {
			    comp1 = "CURE International";
			    comp2 = "ADP";
			    comp3 = "HSBC";
			} 
			else if (career.equals("Special Education Teacher")) {
			    comp1 = "linxprovi8";
			    comp2 = "Department of Education";
			    comp3 = "InterCare Life Skills Center";
			} 
			else if (career.equals("Substitute Teacher")) {
			    comp1 = "Singapore School Cebu";
			    comp2 = "Saint Louis College Cebu";
			    comp3 = "ACCEL Schools";
			} 
			else if (career.equals("Early Childhood Educator")) {
			    comp1 = "Confidential";
			    comp2 = "MapleBear Canadian School";
			    comp3 = "Oxbridge International School";
			} 
			else if (career.equals("Academic Tutor")) {
			    comp1 = "Course Hero";
			    comp2 = "Educify Inc.";
			    comp3 = "Phil-Chi Class International Corp";
			} 
			else if (career.equals("Education Coordinator")) {
			    comp1 = "Qualfon";
			    comp2 = "WorldStrides";
			    comp3 = "AMA EDUCATION SYSTEM";
			}

			// Level 2 (Average Teaching/Training Skills)
			else if (career.equals("Teacher")) {
			    comp1 = "Singapore School Cebu";
			    comp2 = "Cebu Globalization ESL Center Inc.";
			    comp3 = "InterCare Life Skills Center";
			} 
			else if (career.equals("Trainer")) {
			    comp1 = "Concentrix";
			    comp2 = "RealPage Inc.";
			    comp3 = "Snaphunt";
			} 
			else if (career.equals("Instructional Designer")) {
			    comp1 = "Cebu e-Learning and Training Solutions";
			    comp2 = "Learning Curve";
			    comp3 = "Virtual Innovators";
			} 
			else if (career.equals("Curriculum Developer")) {
			    comp1 = "XtendOps";
			    comp2 = "Oracle";
			    comp3 = "GO-VA";
			} 
			else if (career.equals("Corporate Trainer")) {
			    comp1 = "Concentrix";
			    comp2 = "TechMahindra";
			    comp3 = "TTEC";
			} 
			else if (career.equals("Training Manager")) {
			    comp1 = "Qualfon";
			    comp2 = "Snaphunt";
			    comp3 = "Wipro Philippines Inc.";
			} 
			else if (career.equals("E-learning Developer")) {
			    comp1 = "XtendOps";
			    comp2 = "IWG";
			    comp3 = "Henkel";
			} 
			else if (career.equals("Educational Technologist")) {
			    comp1 = "De La Salle University";
			    comp2 = "CCF Life Academy";
			    comp3 = "United Marine Training Center";
			} 
			// Level 3 (Excellent Teaching/Training Skills)
			else if (career.equals("Educational Consultant")) {
			    comp1 = "Acecelent Education and Migration Australia";
			    comp2 = "VM Consultancy and Visa Services Inc.";
			    comp3 = "Conversational Learning Solution";
			} 
			else if (career.equals("School Administrator")) {
			    comp1 = "Confidential";
			    comp2 = "Technical Education And Skills Development";
			    comp3 = "Feu Alabang Inc.";
			} 
			else if (career.equals("Faculty Development Coordinator")) {
			    comp1 = "CIIT College of Arts and Technology";
			    comp2 = "Ateneo de Manila University";
			    comp3 = "Upright Education";
			} 
			else if (career.equals("Director of Education")) {
			    comp1 = "Operation Smile";
			    comp2 = "NEOM";
			    comp3 = "Michael Page Philippines";
			} 
			else if (career.equals("Education Program Director")) {
			    comp1 = "Operation Smile";
			    comp2 = "Education Development Center";
			    comp3 = "Islamic Relief";
			} 
			else if (career.equals("Principal")) {
			    comp1 = "University of the Visayas";
			    comp2 = "Wesley Primrose Academy, The British Curriculum School";
			    comp3 = "Schaumburg School District 54";
			} 
			else if (career.equals("Dean")) {
			    comp1 = "AMA EDUCATION SYSTEM";
			    comp2 = "University of the Philippines";
			    comp3 = "iACADEMY Cebu";
			} 
			else if (career.equals("Education Researcher")) {
			    comp1 = "UCP";
			    comp2 = "RTI International";
			    comp3 = "Gamot Cogon Waldorf School";
			} 
			//Coaching Skills
			// Coaching Skills Level 1

			// Time Management Coach
			else if (career.equals("Time Management Coach")) {
			    comp1 = "FranklinCovey";
			    comp2 = "ActionCOACH";
			    comp3 = "John Clements Consultants Inc.";
			} 
			// Mindfulness Coach
			else if (career.equals("Mindfulness Coach")) {
			    comp1 = "Mindful Society Global Institute";
			    comp2 = "Mindfulness Institute";
			    comp3 = "NobleProg";
			} 
			// Goal Setting Coach
			else if (career.equals("Goal Setting Coach")) {
			    comp1 = "Goalcast";
			    comp2 = "Nezda Tech Inc";
			    comp3 = "SmartSourcing";
			} 
			// Behavior Change Coach
			else if (career.equals("Behavior Change Coach")) {
			    comp1 = "SunLife";
			    comp2 = "PowerVision EAP";
			    comp3 = "ActionCOACH";
			} 
			// Diversity and Inclusion Coach
			else if (career.equals("Diversity and Inclusion Coach")) {
			    comp1 = "Accenture Philippines";
			    comp2 = "Teleperformance Philippines";
			    comp3 = "Convergys Philippines";
			} 
			// Resilience Coach
			else if (career.equals("Resilience Coach")) {
			    comp1 = "Cebu Doctors’ University Hospital";
			    comp2 = "Aboitiz Equity Ventures";
			    comp3 = "University of Cebu Medical Center";
			} 
			// Parenting Coach
			else if (career.equals("Parenting Coach")) {
			    comp1 = "Save the Children Philippines – Cebu";
			    comp2 = "Cebu City Health Department";
			    comp3 = "Department of Social Welfare and Development (DSWD) – Cebu City";
			} 
			// Technology Coach
			else if (career.equals("Technology Coach")) {
			    comp1 = "IACADEMY Cebu (Training Programs)";
			    comp2 = "TESDA (Technical Education and Skills Development Authority) (Training Programs)";
			    comp3 = "Cebu Chamber of Commerce and Industry (CCCI) (Training Programs)";
			} 

			// Level 2

			// Life Coach
			else if (career.equals("Life Coach")) {
			    comp1 = "Mindful Living, Inc.";
			    comp2 = "Cebu Counseling Center";
			    comp3 = "Thrive Global Inc.";
			} 
			// Career Coach
			else if (career.equals("Career Coach")) {
			    comp1 = "Cebu Jobs and Careers Center";
			    comp2 = "Cebu Workforce Development Center";
			    comp3 = "Cebu Institute for Career Advancement";
			} 
			// Health and Wellness Coach
			else if (career.equals("Health and Wellness Coach")) {
			    comp1 = "Cebu Health and Wellness Coaching";
			    comp2 = "HealthHub Cebu";
			    comp3 = "Cebu Wellness Institute";
			} 
			// Sports Coach
			else if (career.equals("Sports Coach")) {
			    comp1 = "Cebu Sports Academy";
			    comp2 = "Cebu City Sports Institute";
			    comp3 = "Private Sports Academy";
			} 
			// Communication Skills Coach
			else if (career.equals("Communication Skills Coach")) {
			    comp1 = "Convergys Philippines";
			    comp2 = "Qualfon";
			    comp3 = "Teleperformance Philippines";
			} 
			// Academic Coach
			else if (career.equals("Academic Coach")) {
			    comp1 = "Cebu Academic Coaching Center";
			    comp2 = "Academic Edge";
			    comp3 = "Tutorial and Academic Support Center";
			} 
			// Sales Coach
			else if (career.equals("Sales Coach")) {
			    comp1 = "SalesBoost";
			    comp2 = "SalesPro";
			    comp3 = "Cebu Sales Training Hub";
			} 
			// Conflict Resolution Coach
			else if (career.equals("Conflict Resolution Coach")) {
			    comp1 = "Center for Dispute Resolution (CDR)";
			    comp2 = "Asian Institute of Management (AIM)";
			    comp3 = "Process Facilitation Institute (PFI)";
			} 

			// Level 3

			// Executive Coach
			else if (career.equals("Executive Coach")) {
			    comp1 = "Accenture";
			    comp2 = "Mercer";
			    comp3 = "FranklinCovey";
			} 
			// Leadership Coach
			else if (career.equals("Leadership Coach")) {
			    comp1 = "Aboitiz Equity Ventures";
			    comp2 = "Accenture";
			    comp3 = "Ayala Corp.";
			} 
			// Personal Development Coach
			else if (career.equals("Personal Development Coach")) {
			    comp1 = "LifeLabs";
			    comp2 = "Life Skills Development Center";
			    comp3 = "Personal Empowerment Institute";
			} 
			// Motivational Speaking
			else if (career.equals("Motivational Speaking")) {
			    comp1 = "The Motivation Company (TMC™)";
			    comp2 = "Motivational Speaking Academy";
			    comp3 = "InspireU Cebu – Motivational Speaking Workshops";
			} 
			// Business Coaching
			else if (career.equals("Business Coaching")) {
			    comp1 = "ActionCoach";
			    comp2 = "E-Myth";
			    comp3 = "ProfitMax";
			} 
			// Performance Coach
			else if (career.equals("Performance Coach")) {
			    comp1 = "Performance Coaching Center";
			    comp2 = "John Clements Consultants, Inc.";
			    comp3 = "Glints Philippines";
			} 
			// Relationship Coach
			else if (career.equals("Relationship Coach")) {
			    comp1 = "Dr. Joyce Piap Go Counseling Center";
			    comp2 = "Marriage Counseling";
			    comp3 = "Cebu Counseling and Relationship Support";
			} 
			// Team Building Coach
			else if (career.equals("Team Building Coach")) {
			    comp1 = "Cebu Holdings Inc.";
			    comp2 = "Teleperformance Philippines";
			    comp3 = "CEBU LEVEL UP TEAMBUILDING & TRAININGS SERVICES";
			}
			//Writing Skills
			// Writing Skills (Careers) - Level 3
			else if (career.equals("Journalist")) {
			    comp1 = "Zywave";
			    comp2 = "Ideahub It Solutions Provider Inc.";
			    comp3 = "optiBPO";
			} else if (career.equals("Public Relation Specialist")) {
			    comp1 = "Ideahub It Solutions Provider Inc.";
			    comp2 = "TeamRidemax Philippines";
			    comp3 = "GoTeam";
			} else if (career.equals("Screenwriter")) {
			    comp1 = "Cyberbacker Careers";
			    comp2 = "360 Digital Agency";
			    comp3 = "Inquirer Interactive Inc.";
			} else if (career.equals("Author")) {
			    comp1 = "Inquirer Interactive Inc.";
			    comp2 = "Alliance Recruitment Agency";
			    comp3 = "iOPEX Technologies Philippines Inc.";
			} 
			else if (career.equals("Scriptwriter")) {
			    comp1 = "Solis Aurora Inc.";
			    comp2 = "Cashflow Channels";
			    comp3 = "Estra Finance";
			} else if (career.equals("Communications Specialist")) {
			    comp1 = "People Center";
			    comp2 = "Aces Call Center Jobs Inc.";
			    comp3 = "VCC Link, Inc.";
			} else if (career.equals("Proposal Writer")) {
			    comp1 = "Turnitin";
			    comp2 = "Citco";
			    comp3 = "Adec-Innovations";
			} else if (career.equals("Ghostwriter")) {
			    comp1 = "Redline Digital";
			    comp2 = "INQUIRER.net";
			    comp3 = "Straive";
			} 

			// Level 2
			else if (career.equals("Content Writer")) {
			    comp1 = "Alliance Recruitment Agency";
			    comp2 = "iOPEX Technologies Philippines Inc.";
			    comp3 = "VirtuallyinCredible Careers Hub";
			} else if (career.equals("Copywriter")) {
			    comp1 = "Canva - Manila";
			    comp2 = "Bluetell Solutions";
			    comp3 = "iOPEX Technologies Philippines Inc.";
			} else if (career.equals("Technical Writer")) {
			    comp1 = "Cognizant Philippines";
			    comp2 = "CrewBloom";
			    comp3 = "MEGAXCESS IT SOLUTIONS INC.";
			} else if (career.equals("Novelist")) {
			    comp1 = "Alliance Recruitment Agency";
			    comp2 = "iOPEX Technologies Philippines Inc.";
			    comp3 = "VirtuallyinCreible Careers Hub";
			} 
			else if (career.equals("Blogger")) {
			    comp1 = "Dempsey Resource Management Inc.";
			    comp2 = "RemoteVA";
			    comp3 = "Unity Network";
			} else if (career.equals("Grant Writer")) {
			    comp1 = "Education Development Center, Inc.";
			    comp2 = "De La Salle Medical & Health Sciences Institute";
			    comp3 = "Department of Social Welfare and Development Central Office – Government";
			} else if (career.equals("Creative Writer")) {
			    comp1 = "Brighttank Inc.";
			    comp2 = "Proweaver PH";
			    comp3 = "Azeus Systems Limited";
			} else if (career.equals("Speechwriter")) {
			    comp1 = "Ideahub It Solutions Provider Inc.";
			    comp2 = "TeamRidemax Philippines";
			    comp3 = "GoTeam";
			} 

			// Level 1
			else if (career.equals("Editor")) {
			    comp1 = "Inquirer Interactive Inc.";
			    comp2 = "Smarter Good Philippines";
			    comp3 = "Local Engagement Outsourcing Services Inc.";
			} else if (career.equals("Copy Editor")) {
			    comp1 = "Local Engagement Outsourcing Services Inc.";
			    comp2 = "INQUIRER.net";
			    comp3 = "Outsource Philippines";
			} else if (career.equals("Marketing Coordinator")) {
			    comp1 = "Primal Enterprises Corporation";
			    comp2 = "Booth & Partners";
			    comp3 = "Activate Talent";
			} else if (career.equals("Proofreader")) {
			    comp1 = "iOPEX Technologies Philippines Inc.";
			    comp2 = "Polytechnic University of the Philippines";
			    comp3 = "Manulife";
			} 

			 else if (career.equals("Receptionist")) {
			    comp1 = "Triplex Enterprises, Inc.";
			    comp2 = "Avon River Ventures";
			    comp3 = "IOPEX Technologies";
			} else if (career.equals("Administrative Assistant")) {
			    comp1 = "Vicente Sotto Memorial Medical Center";
			    comp2 = "Stradcom Corporation";
			    comp3 = "Security Bank Careers";
			} else if (career.equals("Telemarketer")) {
			    comp1 = "Central One Bataan Ph Inc.";
			    comp2 = "Eteam Workforce Private Corporation";
			    comp3 = "APPTechnology Experts Inc.";
			} else if (career.equals("Data Entry Clerk")) {
			    comp1 = "SMDigital Partners";
			    comp2 = "Tower Health";
			    comp3 = "HelloConnect, Inc.";
			}

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0xA6D3AA));
		panel.setBounds(499, 154, 343, 89);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel(comp1);
		lblNewLabel.setBackground(new Color(0xA6D3AA));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0xA6D3AA));
		panel_1.setBounds(499, 304, 343, 89);
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel(comp2);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		panel_1.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0xA6D3AA));
		panel_2.setBounds(499, 462, 343, 89);
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel(comp3);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		panel_2.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(31, 32, 249, 58);
		add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("COMPANIES");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_3.setForeground(Color.WHITE);
		panel_3.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("These are some companies that are in  need of new workers in this career");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(360, 76, 687, 58);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("*For more info about their companies you can visit them in their own respective websites");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(443, 589, 490, 14);
		add(lblNewLabel_5);
		
		JButton btnNewButton_8 = new JButton("Exit");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank you for using our application. Have a nice day!");
				System.exit(0);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_8.setFocusable(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBackground(new Color(166, 211, 170));
		btnNewButton_8.setBounds(607, 634, 130, 36);
		add(btnNewButton_8);
	}
}
