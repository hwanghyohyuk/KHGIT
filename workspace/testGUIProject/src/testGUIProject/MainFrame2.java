package testGUIProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame2 extends JFrame implements ActionListener, KeyListener{

	private JPanel northPane, southPane, eastPane;
	private JLabel lblEventPrint;
	private JTextField idTf, pwdTf, msgTf;
	private JTextArea content;
	private JButton loginBtn, sendBtn;
	private JList<String> userList;
	private JTextField tfID;
	private JTextField tfPWD;
	private JTextField tfINPUT;
	private JPanel panel_1;
	
	private boolean logInOut=false;
	
	public MainFrame2() {
		super("test GUI2");
		this.setBounds(new Rectangle(100, 100, 600, 400));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		northPane = new JPanel();
		northPane.setBackground(Color.WHITE);
		getContentPane().add(northPane, BorderLayout.NORTH);
		northPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		northPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblId = new JLabel("아이디 : ");
		panel_4.add(lblId);
		
		tfID = new JTextField();
		panel_4.add(tfID);
		tfID.setColumns(10);
		tfID.addKeyListener(this);
		
		JLabel lblPwd = new JLabel("패스워드 : ");
		panel_4.add(lblPwd);
		
		tfPWD = new JTextField();
		panel_4.add(tfPWD);
		tfPWD.setColumns(10);
		tfPWD.addKeyListener(this);
		
		panel_1 = new JPanel();
		northPane.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		loginBtn = new JButton("로그인");
		panel_1.add(loginBtn);
		loginBtn.addActionListener(this);
		
		loginBtn.setBackground(Color.WHITE);
		
		eastPane = new JPanel();
		eastPane.setBackground(Color.WHITE);
		getContentPane().add(eastPane, BorderLayout.EAST);
		eastPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("사용자 리스트");
		lblNewLabel_2.setBackground(Color.WHITE);
		eastPane.add(lblNewLabel_2, BorderLayout.NORTH);
		
		userList = new JList<String>();
		userList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		userList.setEnabled(false);
		eastPane.add(userList, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		content = new JTextArea();
		content.setEditable(false);
		scrollPane.setViewportView(content);
		
		JPanel panel = new JPanel();
		panel_2.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		tfINPUT = new JTextField();
		tfINPUT.setEditable(false);
		panel.add(tfINPUT, BorderLayout.CENTER);
		tfINPUT.setColumns(10);
		tfINPUT.addKeyListener(this);
		
		sendBtn = new JButton("보내기");
		sendBtn.setEnabled(false);
		sendBtn.addActionListener(this);
		panel.add(sendBtn, BorderLayout.EAST);
		
		southPane = new JPanel();
		southPane.setBackground(Color.WHITE);
		getContentPane().add(southPane, BorderLayout.SOUTH);
		southPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("이벤트 : ");
		southPane.add(lblNewLabel_3);
		
		lblEventPrint = new JLabel("");
		southPane.add(lblEventPrint);
		
		makeComponent();
		
		setVisible(true);
	}

	private void makeComponent() {

		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(loginBtn)&& !logInOut){//로그인
			if(!tfID.getText().equals("") && !tfPWD.getText().equals("")){				
				LogIn();
			}else if(tfID.getText().equals("")) {
				lblEventPrint.setText("아이디를 입력하세요");
			}else if(tfPWD.getText().equals("")) {
				lblEventPrint.setText("비밀번호를 입력하세요");
			}else{
				lblEventPrint.setText("아이디와 비밀번호를 입력하세요");
			}
		}else if(e.getSource().equals(loginBtn)&& logInOut){//로그아웃
			LogOut();
		}
		if(!tfINPUT.getText().equals("")&&e.getSource().equals(sendBtn)){
			content.append(tfID.getText()+"\t"+tfINPUT.getText()+"\n");
			content.setCaretPosition(content.getDocument().getLength());
			tfINPUT.setText("");
			tfINPUT.requestFocusInWindow();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(!tfINPUT.getText().equals("")&&arg0.getKeyCode()==10){
			if(tfINPUT.getText().equals("logout")){
				tfINPUT.setText("");
				LogOut();
				return;
			}
			content.append(tfID.getText()+"\t"+tfINPUT.getText()+"\n");
			content.setCaretPosition(content.getDocument().getLength());
			tfINPUT.setText("");
			tfINPUT.requestFocusInWindow();
			lblEventPrint.setText("문장이 입력되었습니다.");
		}
		if(!tfID.getText().equals("")&&!tfPWD.getText().equals("")&&arg0.getKeyCode()==10){
			if(!logInOut)
			LogIn();
		}else if(tfID.getText().equals("")&&tfPWD.getText().equals("")&&arg0.getKeyCode()==10){
			lblEventPrint.setText("아이디를 입력하세요");
			tfID.requestFocusInWindow();
		}else if(!tfID.getText().equals("")&&tfPWD.getText().equals("")&&arg0.getKeyCode()==10){
			lblEventPrint.setText("비밀번호를 입력하세요");
			tfPWD.requestFocusInWindow();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	private void LogIn() {
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement(tfID.getText());
		userList.setModel(listModel);
		lblEventPrint.setText(tfID.getText()+"님이 로그인하셨습니다");
		loginBtn.setText("로그아웃");
		logInOut = true;
		tfID.setEnabled(false);
		tfPWD.setEnabled(false);
		tfINPUT.setEditable(true);
		tfINPUT.setText("");
		sendBtn.setEnabled(true);
		tfINPUT.requestFocusInWindow();
	}
	private void LogOut() {
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		tfID.setEnabled(true);
		tfPWD.setEnabled(true);
		tfINPUT.setEditable(false);
		sendBtn.setEnabled(false);
		listModel.removeElement(tfID.getText());
		userList.setModel(listModel);
		loginBtn.setText("로그인");
		lblEventPrint.setText(tfID.getText()+"님이 로그아웃하셨습니다");
		content.setText("");
		tfID.setText("");
		tfPWD.setText("");
		tfID.requestFocusInWindow();
		logInOut = false;
	}
}
