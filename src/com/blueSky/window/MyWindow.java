package com.blueSky.window;


import java.awt.*;
import java.awt.event.*;

// 建立我的第一个窗口
public class MyWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("我的窗口");//建立窗体对象
		frame.setSize(400, 300);// 窗体的尺寸
		frame.setLocation(300, 200);//窗体的在父视图上显示的位置
		frame.setVisible(true);//设置窗体可见
		
		MyWindowListener mListener = new MyWindowListener();
		
		frame.addWindowListener(mListener);
		

	}
	
	//
}

class MyWindowListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
		Window window = e.getWindow();//得到正在显示的窗体
		window.setVisible(false); // 设置窗体不可见
        window.dispose();// 释放窗口		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
	}
	
	
	
}

