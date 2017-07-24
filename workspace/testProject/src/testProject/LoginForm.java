package testProject;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
	
	private JTextField textFieldID;
	private JTextField textFieldPassword;
	public LoginForm() {
		setResizable(false);
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\KH_Backup\\KHGIT\\workspace\\testProject\\img\\galgeyo.png"));
		setTitle("갈게요");
		getContentPane().setBackground(new Color(205, 92, 92));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\KH_Backup\\KHGIT\\workspace\\testProject\\img\\logo3.png"));
		lblNewLabel.setBounds(12, 10, 532, 552);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(556, 0, 238, 572);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(8, 357, 218, 42);
		panel.add(btnLogin);
		btnLogin.setBackground(Color.WHITE);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(8, 227, 218, 30);
		panel.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(8, 267, 218, 30);
		panel.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("로그인 유지");
		checkBox.setBounds(8, 303, 100, 20);
		panel.add(checkBox);
		checkBox.setBackground(Color.WHITE);
		
		JLabel lblRegistration = new JLabel("회원가입");
		lblRegistration.setBackground(Color.WHITE);
		lblRegistration.setBounds(8, 542, 60, 20);
		panel.add(lblRegistration);
		lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblFindIdPass = new JLabel("아이디 / 패스워드 찾기");
		lblFindIdPass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFindIdPass.setBounds(86, 542, 140, 20);
		panel.add(lblFindIdPass);
	}
}
