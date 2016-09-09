package com.blueSky.file;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class TransDir {
	
	private Frame frame;
	private Button searchBtn;
	private TextField textField;
	private TextArea textArea;
	
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
		frame.add(searchBtn);
		frame.add(textArea);
		
		searchBtn.addActionListener(new ActionListener() {
			
			@Override
			// /Users/zhangdongdong/Documents/workspace
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText("");
				String string = textField.getText();				
				File file = new File(string);
				System.out.println(file);
				if (file.exists() && file.isDirectory()) {
					String[] names = file.list();
					for (String name : names) {
						textArea.append(name+"\r\n");
					}
				}	
			}
		});
		
		
	}
	
	
	
}
