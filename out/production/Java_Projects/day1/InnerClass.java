package com.itstar.demo1;


/*// 内部类定义： java当中的一个类中声明一个类，就叫内部类

内部类分来： 
(1)（普通）成员内部类： 与成员level一样，不能存在static关键字，不能够声明静态方法
				、属性、静态代码块，最普通的内部类
(2)静态成员内部类：使用static 修饰的成员内部类
(3)普通局部内部类：局部范围内有效的内部类（例如方法里面）
(4) 匿名局部内部类： 没有名字的局部内部类

（普通）成员内部类定义：
	定义：与成员变量一样，可以声明类名，在成员内部类中可以声明属性和方法
	作用：成员内部类可以无限制访问外部类的变量和方法（包括private修饰的）
		内部类可以有多个
		成员内部类如果存在同名的成员变量或方法，优先是内部类
	
	
成员内部类与外部类的访问：
	（1）成员内部类访问外部类，无限制
	（2）外部类访问内部类的成员，不是无限制的，首先要创建一个内部类的对象，然后通过对象来访问
	
	
成员内部类的初始化
	不是在类里面操作，如果是其他类要访问，要访问内部类，首先实现外部类实例化之后再实例化内部类
	方法1： 在外部类对象初始化基础时尚初始化内部类
	Outter.Inner inner = outter.new Inner();
	方法2：通过外部类的成员方法获得成员内部类对象，饭后访问其成员变量
	
*/



						
/*成员内部类的演示
 * 
 * */

public class InnerClass {
	// 成员变量
	private double radius=1;  //第一个radius
	private static final double PI=3.14;
	
	//声明一个内部类
	class Draw{
		//成员变量
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
			System.out.println("外部类的private修饰的成员变量："+InnerClass.this.radius); 
			
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
	public InnerClass() {
		
	}
	// 有参构造函数
	public InnerClass(double radius) {
		 this.radius= radius;
	}
	
	// 外部类普通函数
	public void showRadius() {
		System.out.println("外部类的半径是："+this.radius);
	}
	
	// 外部类 访问内部类的成员属性
	public Draw getDrawInstance() {
		
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
