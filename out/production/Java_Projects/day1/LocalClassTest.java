package com.itstar.demo1;

// �ֲ��ڲ����ʵ����
public class LocalClassTest {
	public static void main(String[] args) {
		// ����ʵ�����ⲿ��
		LocalClass1 lc1 = new LocalClass1();
		// Ȼ��ͨ����̬���man����
		LocalClass2 lc2 = lc1.getMan();
		lc2.show();
		
	}
	

}
