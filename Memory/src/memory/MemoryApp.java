/**
 * 
 */
package memory;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
*Assignment: A05-Memory
*Class: MemoryApp.java
*Programmer: Brandon Robinson
*Date: Mar 21, 2017
*/
public class MemoryApp extends JFrame {
	
	/**
	 * Icon pic1 first picture
	 */
	Icon pic1 = new ImageIcon(getClass().getResource("pic1.jpg"));
	/**
	 * Icon pic2 second picture
	 */
	Icon pic2 = new ImageIcon(getClass().getResource("pic2.jpg"));
	/**
	 * Icon pic3 third picture
	 */
	Icon pic3 = new ImageIcon(getClass().getResource("pic3.jpg"));
	/**
	 * Icon pic4 fourth picture
	 */
	Icon pic4 = new ImageIcon(getClass().getResource("pic4.jpg"));
	/**
	 * Icon pic5 fifth picture
	 */
	Icon pic5 = new ImageIcon(getClass().getResource("pic5.jpg"));
	/**
	 * Icon pic6 sixth picture
	 */
	Icon pic6 = new ImageIcon(getClass().getResource("pic6.jpg"));
	/**
	 * List<Icon> pics a list of all the pictures used for the game
	 */
	List <Icon> pics = new ArrayList<Icon>(Arrays.asList(pic1, pic1 , pic2, pic2, pic3,
			pic3, pic4, pic4, pic5, pic5, pic6, pic6));

	/**
	 * JPanel contentPane
	 */
	private JPanel contentPane;
	

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemoryApp frame = new MemoryApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame.
	 */
	public MemoryApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 682);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemory = new JLabel("Memory");
		createLblMemory(lblMemory);
		
		JPanel panel = new JPanel();
		createPanel(panel);
		
		
	}
	


	/**
	 * creates the label containing the title memory
	 * @param lblMemory
	 * 
	 */
	private void createLblMemory(JLabel lblMemory) {
		lblMemory.setForeground(Color.WHITE);
		lblMemory.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMemory.setBounds(5, 5, 937, 72);
		lblMemory.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMemory);
	}

	/**
	 * creates the game panel with all the buttons
	 * @param panel
	 * 
	 */
	private void createPanel(JPanel panel) {
		panel.setBackground(Color.BLACK);
		panel.setBounds(5, 77, 937, 515);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 4, 8, 8));
		Collections.shuffle(pics);
		
		JButton btnPic = new JButton("");
		createLblPic(panel, btnPic, 0);
		
		JButton btnPic_1 = new JButton("");
		createLblPic(panel, btnPic_1, 1);
		
		JButton btnPic_2 = new JButton("");
		createLblPic(panel, btnPic_2, 2);
		
		JButton btnPic_3 = new JButton("");
		createLblPic(panel, btnPic_3, 3);
		
		JButton btnPic_4 = new JButton("");
		createLblPic(panel, btnPic_4, 4);
		
		JButton btnPic_5 = new JButton("");
		createLblPic(panel, btnPic_5, 5);
		
		JButton btnPic_6 = new JButton("");
		createLblPic(panel, btnPic_6, 6);
		
		JButton btnPic_7 = new JButton("");
		createLblPic(panel, btnPic_7, 7);
		
		JButton btnPic_8 = new JButton("");
		createLblPic(panel, btnPic_8, 8);
		
		JButton btnPic_9 = new JButton("");
		createLblPic(panel, btnPic_9, 9);
		
		JButton btnPic_10 = new JButton("");
		createLblPic(panel, btnPic_10, 10);
		
		JButton btnPic_11 = new JButton("");
		createLblPic(panel, btnPic_11, 11);
	}



	/**
	 * creates the buttons
	 * @param panel
	 * @param lblPic
	 * @param a 
	 * 
	 */
	private void createLblPic(JPanel panel, JButton lblPic, int a) {
		lblPic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(lblPic.getIcon()==pics.get(a)){
					lblPic.setIcon(null);
				}
				else
				lblPic.setIcon(pics.get(a));
				
			}
		});
		lblPic.setOpaque(true);
		lblPic.setBackground(Color.GRAY);
		lblPic.setForeground(Color.BLACK);
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel.add(lblPic);
	}

}
