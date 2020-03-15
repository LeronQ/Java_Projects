package com.itstar.demo1;

import com.itstar.demo1.InnerClass.Draw;

public class StaticInnerClass {
	private double radius=1;  //第一个radius
	private static final double PI=3.14;
	
	//声明一个内部类
	static class Draw{
		//静态内部类成员变量
		private String type;
		private int a=10;
		private double radius=2; //第二个radius
		// 成员内部类的构造方法
		public Draw() {
			
		}
		
		public Draw(String type) {
			this.type = type;
		}
		
		//成员内部类的普通方法
		public void DrawShape() {
			// 成员内部类访问外部类的成员变量
			// 1:返回的是第二个radius
			System.out.println("外部类的private修饰的成员变量："+radius);
			
			// 2:如果要访问外部类的radius（第一个radius）需要用类名+this+外部类的成员变量
			// 静态内部类不能访问非静态变量
			//报错：System.out.println("外部类的private修饰的成员变量："+InnerClass.this.radius);
			System.out.println("外部类的private修饰的成员变量："+StaticInnerClass.PI); 
			
			// 成员内部类访问外部类的成员方法
			showRadius();
			System.out.println("内部类DrawShape方法");
			
		}
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		
	}
	
	
	// 无参构造函数
	public StaticInnerClass() {
		
	}
	// 有参构造函数
	public StaticInnerClass(double radius) {
		 this.radius= radius;
	}
	
	// 外部类普通函数
	public static void showRadius() {
		System.out.println("外部类的半径是："+PI);
	}
	
	// 外部类 访问内部类的成员属性
	public static Draw getDrawInstance() {
		
		return new Draw();
	}
	
	public void getDraw() {
		// 实例化内部对象
		Draw draw1 = getDrawInstance();
		System.out.println("内部类的成员变量"+draw1.a);
		
		draw1.DrawShape();
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
}
