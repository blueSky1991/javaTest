package com.blueSky.window;

import java.awt.*;
import java.awt.event.*;

public class MouseAndKeyEvent {
	
	public void mouseEvent(){
		Frame frame = new Frame("测试鼠标的点击");//建立窗体对象
		frame.setSize(400, 300);// 窗体的尺寸
		frame.setLocation(300, 200);//窗体的在父视图上显示的位置
		Button button = new Button("请点击这里");
		frame.add(button);
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
