package encoder.view;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.*;
import javax.swing.table.*;

public class EncoderView extends JFrame implements DropTargetListener {

	private JFileChooser jfc = new JFileChooser("D:\\");
	private JTable tb_fileList;
	private DefaultTableModel dtm = new DefaultTableModel(new Object[][] {},
			new String[] { "File Name", "Size", "File Path" });
	private DropTarget target;
	private String[][] type = { { "SQL(*.sql)", "sql" }, { "Java(*.java)", "java" }, { "HTML(*.html)", "html" },
			{ "JavaScript(*.js)", "js" }, { "CSS(*.css)", "css" }, { "JSP(*.jsp)", "jsp" }, { "PHP(*.php)", "php" },
			{ "Text(*.txt)", "txt" } };
	private String[] encodingType = { "MS949", "UTF-8" };

	public EncoderView() {
		setTitle("UTF-8 Encoder");
		getContentPane().setBackground(Color.WHITE);
		setSize(600, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		jfc.setMultiSelectionEnabled(true);
		jfc.setFileFilter(new FileNameExtensionFilter(type[0][0], type[0][1]));
		jfc.setFileFilter(new FileNameExtensionFilter(type[1][0], type[1][1]));
		jfc.setFileFilter(new FileNameExtensionFilter(type[2][0], type[2][1]));
		jfc.setFileFilter(new FileNameExtensionFilter(type[3][0], type[3][1]));
		jfc.setFileFilter(new FileNameExtensionFilter(type[4][0], type[4][1]));
		jfc.setFileFilter(new FileNameExtensionFilter(type[5][0], type[5][1]));
		jfc.setFileFilter(new FileNameExtensionFilter(type[6][0], type[6][1]));
		jfc.setFileFilter(new FileNameExtensionFilter(type[7][0], type[7][1]));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 430, 272);
		getContentPane().add(scrollPane);

		tb_fileList = new JTable();
		tb_fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tb_fileList.setBackground(Color.WHITE);
		tb_fileList.setModel(dtm);
		tb_fileList.getTableHeader().setReorderingAllowed(false); // 이동 불가
		tb_fileList.getTableHeader().setResizingAllowed(false); // 크기 조절 불가
		scrollPane.setViewportView(tb_fileList);
		tb_fileList.getColumn("File Name").setPreferredWidth(300);
		tb_fileList.getColumn("Size").setPreferredWidth(200);
		tb_fileList.getColumn("File Path").setPreferredWidth(500);

		target = new DropTarget(scrollPane, DnDConstants.ACTION_COPY_OR_MOVE, (DropTargetListener) this, true, null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(442, 10, 140, 252);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btn_addFile = new JButton("Add Files");
		btn_addFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int status = jfc.showOpenDialog(null);
				int count = 0;
				if (status == JFileChooser.APPROVE_OPTION) {
					File selectedFiles[] = jfc.getSelectedFiles();
					for (int i = 0, n = selectedFiles.length; i < n; i++) {
						long fileSizeByte = selectedFiles[i].length();
						long fileSizeKbyte = fileSizeByte / 1024;
						String printFileSize = String.valueOf(fileSizeKbyte) + "KB";
						Object[] row = { selectedFiles[i].getName(), printFileSize, selectedFiles[i].getParent() };
						for (int j = 0; j < dtm.getRowCount(); j++) {
							if (dtm.getValueAt(j, 0).equals(selectedFiles[i].getName())) {
								count++;
								break;
							}
						}
						if (count > 0) {
							JOptionPane.showMessageDialog(null, selectedFiles[i].getName() + " 파일이 중복됩니다.", "파일 중복 오류",
									JOptionPane.ERROR_MESSAGE);
							continue;
						} else {
							dtm.addRow(row);
						}
					}
				}
			}
		});
		btn_addFile.setBounds(0, 0, 140, 30);
		panel.add(btn_addFile);

		JButton btn_deleteFile = new JButton("Delete File");
		btn_deleteFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tb_fileList.getSelectedRow();
				dtm.removeRow(selectedRow);
			}
		});
		btn_deleteFile.setBounds(0, 40, 140, 30);
		panel.add(btn_deleteFile);

		JButton btn_deleteAll = new JButton("Delete All");
		btn_deleteAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
					dtm.removeRow(i);
				}
			}
		});
		btn_deleteAll.setBounds(0, 80, 140, 30);
		panel.add(btn_deleteAll);

		JButton btn_startEncode = new JButton("Start Encoding");
		btn_startEncode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int startingCount = dtm.getRowCount();
				if(startingCount==0){
					JOptionPane.showMessageDialog(null, "인코딩할 파일이 존재하지 않습니다.", "File does not exist", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				try {
					for (int i = (startingCount - 1); i >= 0; i--) {
						File readFile = new File(String.valueOf(dtm.getValueAt(i, 2)),
								String.valueOf(dtm.getValueAt(i, 0)));
						File writeFile = new File(String.valueOf(dtm.getValueAt(i, 2)),
								String.valueOf(dtm.getValueAt(i, 0)));
						BufferedReader br = null;
						StringBuilder sb = new StringBuilder();
						try {
							br = new BufferedReader(new InputStreamReader(new FileInputStream(readFile), "MS949"));
							String line;
							while ((line = br.readLine()) != null) {
								sb.append(line + "\r\n");
							}
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						} finally {
							if (br != null)
								try {
									br.close();
								} catch (IOException e1) {
								}
						}
						BufferedWriter bw = null;
						try {
							bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writeFile), "UTF-8"));
							bw.flush();
							bw.write(sb.toString());
							bw.flush();
						} catch (IOException e1) {
							e1.printStackTrace();
						} finally {
							if (bw != null)
								try {
									bw.close();
								} catch (IOException e1) {
								}
						}
						dtm.removeRow(i);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "인코딩 실패.", "Encoding Fail", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				JOptionPane.showMessageDialog(null, "인코딩 성공.", "Success", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn_startEncode.setBounds(0, 222, 140, 30);
		panel.add(btn_startEncode);

		setVisible(true);
	}

	/* DropTargetListener 인터페이스 구현을 위한 부분 */
	public void dragEnter(DropTargetDragEvent dtde) {
	}

	public void dragExit(DropTargetEvent dtde) {
	}

	public void dragOver(DropTargetDragEvent dtde) {
	}

	public void drop(DropTargetDropEvent dtde) {
		// 액션이 copy or move인 경우에 읽어들인다.
		if ((dtde.getDropAction() & DnDConstants.ACTION_COPY_OR_MOVE) != 0) {
			dtde.acceptDrop(dtde.getDropAction());
			Transferable tr = dtde.getTransferable();
			// 전달되는 파일을 리스트형태로 변환
			// 파일리스트의 DataFlavor를 이용하여 tr에 저장
			java.util.List list = null;
			try {
				list = (java.util.List) tr.getTransferData(DataFlavor.javaFileListFlavor);
			} catch (UnsupportedFlavorException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 리스트를 파일로 읽어들인다.
			for (int i = 0; i < list.size(); i++) {
				int count = 0;
				File file = (File) list.get(i);
				String fileName = file.getName();
				try {
					String data[] = fileName.split("[.]");
					for (int j = 0; j < type.length; j++) {
						if (data[1].equals(type[j][1])) {
							count = 1;
						}
					}
					if (count == 0) {
						JOptionPane.showMessageDialog(null, data[1] + " 형식은 지원하지 않습니다.", "파일 형식 오류",
								JOptionPane.ERROR_MESSAGE);
						continue;
					} else {
						count = 0;
						long fileSizeByte = file.length();
						long fileSizeKbyte = fileSizeByte / 1024;
						String printFileSize = String.valueOf(fileSizeKbyte) + "KB";
						Object[] rowData = { file.getName(), printFileSize, file.getParentFile() };
						for (int k = 0; k < dtm.getRowCount(); k++) {
							if (dtm.getValueAt(k, 0).equals(file.getName())) {
								count++;
								break;
							}
						}
						if (count > 0) {
							JOptionPane.showMessageDialog(null, file.getName() + " 파일이 중복됩니다.", "파일 중복 오류",
									JOptionPane.ERROR_MESSAGE);
							continue;
						} else {
							dtm.addRow(rowData);
						}
					}

				} catch (ArrayIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null, "지원하지 않는 형식입니다.", "파일 형식 오류", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

	public void dropActionChanged(DropTargetDragEvent dtde) {
	}

}
