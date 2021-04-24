package com.TestLaravel;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import org.testng.TestNG;

public class MainFrame {

	private JFrame frame;
	public static boolean userAdd = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn_execute = new JButton("Execute Script");
		btn_execute.setBounds(100, 200, 150, 50);
		frame.getContentPane().add(btn_execute);

		final JCheckBox checkbox_addUser = new JCheckBox("Add User");
		checkbox_addUser.setBounds(20, 30, 140, 40);
		frame.getContentPane().add(checkbox_addUser);
		
		btn_execute.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (checkbox_addUser.isSelected())
				{
					userAdd = true;
				}
				
				TestNG testSuite = new TestNG();
				testSuite.setTestClasses(new Class[] {testngMain.class});
				testSuite.run();
				
			}
		});
	}

}
