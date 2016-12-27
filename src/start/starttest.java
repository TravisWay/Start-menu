package start;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class starttest {

	private JFrame frmStartMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					starttest window = new starttest();
					window.frmStartMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws URISyntaxException 
	 */
	public starttest() throws URISyntaxException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws URISyntaxException 
	 */
	private void initialize() throws URISyntaxException 
	
	{
		File helpdeskfolder = new File("//file-server/helpdesk");
		File Fdrive = new File("//ceridian-server/tway");
		File publicdocuments = new File("C:/users/public/Documents");
		File Chrome = new File("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		File Paycom = new File("www.paycom.com");
		File CP = new File("c:/windows/system32/control.exe");
		File AD = new File("C:/Windows/system32/dsa.msc");
		File CMD = new File("C:/Windows/system32/cmd.exe");
		File RDP = new File("C:/Windows/system32/mstsc.exe");
		File Eclipse = new File("C:/Users/tway/Downloads/eclipse/eclipsec.exe");
		File Mail = new File("C:/Program Files/Microsoft Office 15/root/office15/outlook.exe");
		File GA = new File("C:/Users/tway/Desktop/Guardian Angel v1.jar");
		
		
		URI url = new URI("https://www.paycomonline.net/v4/ee/ee-login.php");
		URI url2 = new URI("https://www.mas-bt.com/bugs.aspx");
		
		
		
		
		frmStartMenu = new JFrame();
		frmStartMenu.setTitle("MyStartMenu v1.0");
		frmStartMenu.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmStartMenu.setBounds(100, 100, 365, 179);
		frmStartMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStartMenu.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(487, 363, 4, 1);
		frmStartMenu.getContentPane().add(textArea);
		
		JLabel lblWindowsExplorer = new JLabel("           Drives");			
		lblWindowsExplorer.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWindowsExplorer.setBounds(10, 11, 98, 14);
		frmStartMenu.getContentPane().add(lblWindowsExplorer);
		
		JButton Helpdesk = new JButton("Helpdesk");
			//opens helpdesk folder
			Helpdesk.addActionListener(new ActionListener() {
				
			
				public void actionPerformed(ActionEvent arg0){
			
				try {
					Desktop.getDesktop().open(helpdeskfolder);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				
				}
				
			});
		
		
		Helpdesk.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Helpdesk.setBounds(23, 33, 73, 23);
		frmStartMenu.getContentPane().add(Helpdesk);
		
		JButton fDrive = new JButton("fDrive");
		//opens fdrive folder
		
			fDrive.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0){
			
				
					try {
					Desktop.getDesktop().open(Fdrive);
						} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
						}
				
					}
				
			});
		
		
		fDrive.setFont(new Font("Tahoma", Font.PLAIN, 10));
		fDrive.setBounds(23, 56, 73, 23);
		frmStartMenu.getContentPane().add(fDrive);
		
		JButton Documents = new JButton("Docs");
		//opens documents folder
		Documents.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent arg0){
		
			
					try {
						Desktop.getDesktop().open(publicdocuments);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			
					}
			
			});
			
		
		
		Documents.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Documents.setBounds(23, 78, 73, 23);
		frmStartMenu.getContentPane().add(Documents);
		
		JLabel lblInternet = new JLabel("  Internet");
		lblInternet.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblInternet.setBounds(118, 11, 62, 14);
		frmStartMenu.getContentPane().add(lblInternet);
		
		JButton btnNewButton = new JButton("Google");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(Chrome);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(112, 33, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Paycom");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				try {
				
				Desktop.getDesktop().browse(url);} 
			
			catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
			}
	
	});
				
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.setBounds(112, 56, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Btrack");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				try {
				
				Desktop.getDesktop().browse(url2);} 
			
			catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
			}
	
	});
		
		
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.setBounds(112, 78, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("     System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(190, 11, 68, 14);
		frmStartMenu.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("CP");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(CP);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		
		
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.setBounds(190, 33, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("AD");
		btnNewButton_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(AD);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		
		
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_4.setBounds(190, 56, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CMD");
		btnNewButton_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(CMD);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_5.setBounds(190, 78, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("   Applications");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(263, 11, 73, 14);
		frmStartMenu.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_6 = new JButton("RDP");
		btnNewButton_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(RDP);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_6.setBounds(268, 33, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Eclipse");
		btnNewButton_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(Eclipse);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_7.setBounds(268, 56, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Mail");
		btnNewButton_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(Mail);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_8.setBounds(268, 78, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("GAngel");
		btnNewButton_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					Desktop.getDesktop().open(GA);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		
		});
		
		
		
		
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9.setBounds(190, 102, 68, 23);
		frmStartMenu.getContentPane().add(btnNewButton_9);
	}
}
