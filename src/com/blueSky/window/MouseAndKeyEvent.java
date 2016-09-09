package com.blueSky.window;

import java.awt.*;
import java.awt.event.*;

public class MouseAndKeyEvent {
	
	Frame frame ;
	Button button;
	Button keyBtn;//处理键盘接收的事件
	TextField textField;
	
	public void mouseEvent(){
		frame = new Frame("鼠标键盘事件的接收和处理");//建立窗体对象
		frame.setSize(400, 300);// 窗体的尺寸
		frame.setLocation(300, 200);//窗体的在父视图上显示的位置
		button = new Button("请点击这里");
		textField = new TextField(50);
		textField.setEchoChar('a'); 
		frame.add(button);
		frame.add(textField);
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
			   Window window = e.getWindow();
			   window.dispose();
                 				
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				char ch = e.getKeyChar();
				System.out.println("键入"+ch);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("释放某个键时调用此方法");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			//	按下某个键时调用此方法。
				System.out.println("按下某个键时调用此方法。");
			}
		});
		frame.setLayout(new FlowLayout());
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("鼠标按钮在组件上释放时调用");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("鼠标按键在组件上按下时调用");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("鼠标离开组件时调用");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标进入到组件上时调用");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("鼠标按键在组件上单击（按下并释放）时调用");
				if(e.getClickCount() == 2)
				System.out.println("鼠标按键被双击");
				
			}
		});
        frame.setVisible(true);
	    	   
	}
			
	
}
