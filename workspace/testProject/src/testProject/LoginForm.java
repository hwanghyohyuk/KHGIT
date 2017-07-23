package testProject;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
	
	private JTextField textFieldID;
	private JTextField textFieldPassword;
	public LoginForm() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\KH_Backup\\KHGIT\\workspace\\testProject\\img\\galgeyo.png"));
		setTitle("갈게요");
		getContentPane().setBackground(new Color(205, 92, 92));
		setResizable(false);
		getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBackground(new Color(205, 92, 92));
		btnLogin.setBounds(214, 301, 80, 70);
		getContentPane().add(btnLogin);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(45, 301, 150, 30);
		getContentPane().add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(45, 341, 150, 30);
		getContentPane().add(textFieldPassword);
		
		JLabel lblRegistration = new JLabel("회원가입");
		lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistration.setBounds(45, 418, 60, 20);
		getContentPane().add(lblRegistration);
		
		JLabel lblFindIdPass = new JLabel("아이디 / 패스워드 찾기");
		lblFindIdPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblFindIdPass.setBounds(154, 418, 140, 20);
		getContentPane().add(lblFindIdPass);
		
		JCheckBox checkBox = new JCheckBox("로그인 유지");
		checkBox.setBackground(new Color(205, 92, 92));
		checkBox.setBounds(45, 377, 100, 20);
		getContentPane().add(checkBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\KH_Backup\\KHGIT\\workspace\\testProject\\img\\logo2.png"));
		lblNewLabel.setBounds(12, 10, 320, 281);
		getContentPane().add(lblNewLabel);
	}
	
}
