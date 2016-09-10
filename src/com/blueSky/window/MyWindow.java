package com.blueSky.window;

import java.awt.*;
import java.awt.event.*;

import com.blueSky.file.TransDir;

// 建立我的第一个窗口
public class MyWindow {

	private static Menu menu,submenu;
	private  static MenuBar menuBar;
	private  static MenuItem menuItem,submenuItem;
	private static Frame frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    frame = new Frame("我的窗口");//建立窗体对象
		frame.setSize(400, 300);// 窗体的尺寸
		frame.setLocation(300, 200);//窗体的在父视图上显示的位置
		Button button = new Button("退出");
		Button openBtn = new Button("打开");
		Button transBtn = new Button("目录");
		frame.add(button);
		frame.add(openBtn);
		frame.add(transBtn);
		frame.setLayout(new FlowLayout());
		 
	    addMenu();
		
        MyWindowListener mListener = new MyWindowListener();
		frame.addWindowListener(mListener);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(" 按钮被点击 窗口即将关闭");
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		transBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TransDir dir = new TransDir();
				dir.searchDir();
				
			}
		});
		
		openBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(" 打开按钮被点击 窗口即将打开");
				MouseAndKeyEvent event = new MouseAndKeyEvent();
				event.mouseEvent();
				
			}
		});
		
		
		frame.setVisible(true);//设置窗体可见
		
	}
	
	
	// 添加菜单到任务栏上
		private static void addMenu(){

		menuBar = new MenuBar();
		menu = new Menu("文件");
		submenu = new Menu("打开");
		menuItem = new MenuItem("下一集");
		submenuItem = new MenuItem("第二级");
		
		menuBar.add(menu);
		menuBar.add(submenu);
		
		menu.add(menuItem);
        submenu.add(submenuItem);
		
		frame.setMenuBar(menuBar);
//		frame.add("开始", menuBar);
		
		
			
		}
	
	//
}

class MyWindowListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("windowOpened  窗口打开");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(" windowClosing  窗口将要关闭 ");
//		Window window = e.getWindow();//得到正在显示的窗体
//		window.setVisible(false); // 设置窗体不可见
//        window.dispose();// 释放窗口
        System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("windowClosed  窗口已经关闭 ");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("windowIconified 窗口图标化 ");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("windowDeiconified 窗口取消图标化  ");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("windowActivated   窗口活跃状态");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("windowDeactivated  窗口非活跃状态");
	}
	
	
	
	
}

