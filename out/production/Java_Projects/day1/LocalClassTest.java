package com.itstar.demo1;

// 局部内部类的实例化
public class LocalClassTest {
	public static void main(String[] args) {
		// 首先实例化外部类
		LocalClass1 lc1 = new LocalClass1();
		// 然后通过多态获得man对象
		LocalClass2 lc2 = lc1.getMan();
		lc2.show();
		
	}
	

}
