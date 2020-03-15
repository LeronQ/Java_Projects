package com.itstar.demo1;



public class StaticInnerClassTest {
	public static void main(String[] args) {
		// 初始化外部类对象
		
		// 方法1 
		/* 在外部类初始化之上，再初始化内部类
		 *  格式： 首字母大小写是指类名 小写对象名
		*/
		StaticInnerClass.Draw draw = new StaticInnerClass.Draw("画圆");
		draw.DrawShape();
		
		// 方法2 通过外部类的方法来调用内部类
		StaticInnerClass.Draw draw2 = new StaticInnerClass().getDrawInstance();
		draw2.DrawShape();
}
}
