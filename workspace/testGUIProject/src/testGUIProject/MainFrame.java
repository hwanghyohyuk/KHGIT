package testGUIProject;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
//생성자에서는 윈도우에 대한 세팅만 하기로 약속
	
	public MainFrame() {
		super("test GUI");//setTitle 과 같다
		
		//크기 설정
		int frameWidth=800;
		int frameHeight=600;
		double moniterWidth=Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double moniterHeight=Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		//좌표설정
		int frameStartX = (int)(moniterWidth-frameWidth)/2;
		int frameStartY = (int)(moniterHeight-frameHeight)/2;
		
		//틀 설정
		this.setBounds(frameStartX, frameStartY, frameWidth, frameHeight);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		getContentPane().setLayout(null);
		
		//컴포넌트 생성
		JButton btn_login = new JButton("로그인");
		btn_login.setBounds(287, 10, 485, 103);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 123, 760, 428);
		
		String colorList[] = {"Red","Yellow","Green","Blue","Violet"};
		JList list = new JList(colorList);
		scrollPane.setRowHeaderView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(BorderFactory.createLineBorder(Color.CYAN,2));
				
		//컴포넌트 부착, add 메소드 사용
		getContentPane().add(btn_login);
		
		
		getContentPane().add(scrollPane);
		
		JComboBox comboBox = new JComboBox();
		scrollPane.setColumnHeaderView(comboBox);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"java", "oracle", "jdbc", "html5", "css3", "javascript", "jquery", "spring", "android", "php", "mysql", "arduino", "phython"}));
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(85, 50, 97, 23);
		getContentPane().add(btnNewButton);
		
		
		//컴포넌트에 이벤트 연결
		
		
	}
}