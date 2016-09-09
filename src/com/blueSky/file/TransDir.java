package com.blueSky.file;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;
import java.io.File;

public class TransDir {
	
	private Frame frame;
	private Button searchBtn;
	private TextField textField;
	private TextArea textArea;
	
	private Dialog dialog;
	private Button okButton;
	private Label label;
	
	//寻找目录
	public void searchDir(){
		frame = new Frame("目录");
		frame.setSize(600, 600);
		frame.setLocation(300, 900);
		frame.setLayout(new FlowLayout());
		setEvent(); 
		frame.setVisible(true);
        
	}
	
	private void setEvent(){
		
		textField = new TextField(60);
		searchBtn = new Button("转到");
		textArea = new TextArea(40,70);
		frame.add(textField);
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == e.VK_ENTER) {
					showText();
				}	
			}
		});
		
		frame.add(searchBtn);
		frame.add(textArea);
		// 转到按钮触发的事件的处理
		searchBtn.addActionListener(new ActionListener() {
			@Override
			// /Users/zhangdongdong/Documents/workspace
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					showText();
			}	
		});	
		// 窗体触发的事件的处理
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
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
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				Window window = e.getWindow();
				frame.setVisible(false);
				window.dispose();//释放窗体所占的资源
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});	
	}
	
	
	private void showText(){

//		textField.setText("");
		String string = textField.getText();				
		File file = new File(string);
//		System.out.println(file);
		if (file.exists() && file.isDirectory()) {
			String[] names = file.list();
			for (String name : names) {
				textArea.append(name+"\r\n");
			}
		}else {
			dialog = new Dialog(frame, "错误提示", true);
			dialog.setBounds(100, 100,500,80);
			dialog.setLayout(new FlowLayout());
			label = new Label();
			label.setText("路径"+string+"无法找到,请确认路径是否正确");
			okButton = new Button("确定");
			dialog.add(label);
			dialog.add(okButton);
			okButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dialog.setVisible(false);
				}
			});
			
			dialog.addWindowListener(new WindowListener() {
				
				@Override
				public void windowOpened(WindowEvent e) {
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
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					// TODO Auto-generated method stub
					Window window = e.getWindow();
					dialog.setVisible(false);
					window.dispose();
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			dialog.setVisible(true);
		}
	}
		
	
	
}
