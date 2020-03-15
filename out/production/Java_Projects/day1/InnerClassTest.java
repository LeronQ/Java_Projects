package com.itstar.demo1;

/* 
 * 	测试在InnerClassTest类中初始化外部类和成员内部类
 
 */

public class InnerClassTest {
	public static void main(String[] args) {
			// 初始化外部类对象
			InnerClass InnerClass1 = new InnerClass(1.2);
			
			// 方法1 
			/* 在外部类初始化之上，再初始化内部类
			 *  格式： 首字母大小写是指类名 小写对象名
			*/
			InnerClass.Draw draw = InnerClass1.new Draw("画圆");
			draw.DrawShape();
			
			// 方法2 通过外部类的方法来调用内部类
			InnerClass.Draw drw2 = InnerClass1.getDrawInstance();
			drw2.DrawShape();
	}

}
