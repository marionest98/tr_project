package day0223.net;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MultiClient implements ActionListener {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private JFrame jframe; //창
	private JTextField jtf; //한줄 문자열 입력 공간
	private JTextArea jta; //여러줄 문자열 입력 공간
	private JLabel jlb1, jlb2; //고정 문자열 출력
	private JPanel jp1, jp2; //패널
	private String ip;
	private String id;
	private JButton jbtn; //버튼

	public MultiClient(String argIp, String argId) {
		ip = argIp;
		id = argId;
		jframe = new JFrame("Multi Chatting");
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50);
		jlb1 = new JLabel("Usage ID : [[ " + id + "]]");
		jlb2 = new JLabel("IP : " + ip);
		jbtn = new JButton("종료");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jlb1.setBackground(Color.yellow);
		jlb2.setBackground(Color.green);
		jta.setBackground(Color.pink);
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());
		jp1.add(jbtn, BorderLayout.EAST);
		jp1.add(jtf, BorderLayout.CENTER);
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);
		jframe.add(jp1, BorderLayout.SOUTH);
		jframe.add(jp2, BorderLayout.NORTH);
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jsp, BorderLayout.CENTER);
		jtf.addActionListener(this);
		jbtn.addActionListener(this);
		
		jframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					oos.writeObject(id + "#exit");
				} catch (IOException ee) {
					System.out.println(id);
					ee.printStackTrace();
				}
				System.exit(0);
			}

			public void windowOpened(WindowEvent e) {
				jtf.requestFocus();
			}
		});
		jta.setEditable(false);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;
		int screenWidth = d.width;
		jframe.pack();
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2,
				(screenHeight - jframe.getHeight()) / 2);
		jframe.setResizable(false);
		jframe.setVisible(true);
	}
	//이벤트 처리 메서드. Action이벤트가 발생하면 자동 실행
	// - 버튼 클릭, textfield에서 enter입력
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String msg = jtf.getText();
		if (obj == jtf) {
			if (msg == null || msg.length() == 0) {
				JOptionPane.showMessageDialog(jframe, "글을쓰세요", "경고",
						JOptionPane.WARNING_MESSAGE);
			} else {
				try {
					oos.writeObject(id + "#" + msg);
				} catch (IOException ee) {
					ee.printStackTrace();
				}
				jtf.setText("");
			}
		} else if (obj == jbtn) {
			try {
				oos.writeObject(id + "#exit");
			} catch (IOException ee) {
				ee.printStackTrace();
			}
			System.exit(0);
		}
	}

	public void exit() {
		System.exit(0);//시스템 종료
	}

	public void init() throws IOException {
		socket = new Socket(ip, 3333);
		System.out.println("connected...");
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
		MultiClientThread ct = new MultiClientThread(this);
		Thread t = new Thread(ct);
		t.start();
	}

	public static void main(String args[]) throws IOException {
		JFrame.setDefaultLookAndFeelDecorated(true);
		MultiClient cc = new MultiClient(args[0], args[1]);
		cc.init();
	}

	public ObjectInputStream getOis() {
		return ois;
	}

	public JTextArea getJta() {
		return jta;
	}

	public String getId() {
		return id;
	}
}
