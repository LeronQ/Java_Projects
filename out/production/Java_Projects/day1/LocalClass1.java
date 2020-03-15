package com.itstar.demo1;

public class LocalClass1 {
	// 成员变量
	private String skirt ="衣服";
	private static double apLever=1.99;
	
	public String getSkirt() {
		return skirt;
	}
	public void setSkirt(String skirt) {
		this.skirt = skirt;
	}
	public LocalClass1() {
		
	}
	// LocalClass2 多态
	public LocalClass2 getMan() {
		class Other extends LocalClass2{
			// 局部内部类的成员变量
			private String beard;
			public String getBeard() {
				return beard;
			}
			public void setBeard(String beard) {
				this.beard = beard;
			}
			// 局部内部类构造函数
			public Other() {
			}
			// 重写外部类方法
			public void show() {
				// 局部内部类可以访问外部类的静态或者非静态变量
				System.out.println("----局部内部类----");
				System.out.println("外部类的成员变量:"+skirt);
				System.out.println("外部类的成员变量:"+apLever);
				
			}
		}
		// 只在这个范围内起作用，出了这个方法都不认识
		LocalClass2 lc2 = new LocalClass2();
		
		return new Other();
	}
	
/*	对比成员内部类，可否也写一个方法，直接调用LocalClass2对象
	不可以直接调用，因为在外部类的其他地方，都不认识LocalClass2
	public LocalClass2 getMan2() {
		
	}*/
	
}
