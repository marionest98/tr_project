package day0214.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousTest {

	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Button b = new Button("Button");
		b.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("클릭했습니다.");
					}
				}
		);
		
		
		f.add(b);
		
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);		
	}
}


/*
 * class ClickEvent implements ActionListener{ //연결된 객체에 이벤트가 발생하면 자동으로 호출됨
 * 
 * @Override public void actionPerformed(ActionEvent e) {
 * System.out.println("클릭했습니다."); }
 * }
 */