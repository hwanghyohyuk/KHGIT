package testProject;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
	
	private JTextField textFieldID;
	private JTextField textFieldPassword;
	public LoginForm() {
		setResizable(false);
		this.setSize(800,600);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\KH_Backup\\KHGIT\\workspace\\testProject\\img\\galgeyo.png"));
		setTitle("갈게요");
		getContentPane().setBackground(new Color(205, 92, 92));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\KH_Backup\\KHGIT\\workspace\\testProject\\img\\logo3.png"));
		lblNewLabel.setBounds(12, 10, 497, 552);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(521, 0, 273, 572);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(12, 346, 249, 42);
		panel.add(btnLogin);
		btnLogin.setBackground(Color.WHITE);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(12, 216, 249, 30);
		panel.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(12, 256, 249, 30);
		panel.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("로그인 유지");
		checkBox.setBounds(12, 292, 100, 20);
		panel.add(checkBox);
		checkBox.setBackground(Color.WHITE);
		
		JLabel lblRegistration = new JLabel("회원가입");
		lblRegistration.setBounds(12, 542, 60, 20);
		panel.add(lblRegistration);
		lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblFindIdPass = new JLabel("아이디 / 패스워드 찾기");
		lblFindIdPass.setBounds(121, 542, 140, 20);
		panel.add(lblFindIdPass);
		lblFindIdPass.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
