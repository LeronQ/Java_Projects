package com.itstar.demo1;

import com.itstar.demo1.InnerClass.Draw;

public class StaticInnerClass {
	private double radius=1;  //��һ��radius
	private static final double PI=3.14;
	
	//����һ���ڲ���
	static class Draw{
		//��̬�ڲ����Ա����
		private String type;
		private int a=10;
		private double radius=2; //�ڶ���radius
		// ��Ա�ڲ���Ĺ��췽��
		public Draw() {
			
		}
		
		public Draw(String type) {
			this.type = type;
		}
		
		//��Ա�ڲ������ͨ����
		public void DrawShape() {
			// ��Ա�ڲ�������ⲿ��ĳ�Ա����
			// 1:���ص��ǵڶ���radius
			System.out.println("�ⲿ���private���εĳ�Ա������"+radius);
			
			// 2:���Ҫ�����ⲿ���radius����һ��radius����Ҫ������+this+�ⲿ��ĳ�Ա����
			// ��̬�ڲ��಻�ܷ��ʷǾ�̬����
			//����System.out.println("�ⲿ���private���εĳ�Ա������"+InnerClass.this.radius);
			System.out.println("�ⲿ���private���εĳ�Ա������"+StaticInnerClass.PI); 
			
			// ��Ա�ڲ�������ⲿ��ĳ�Ա����
			showRadius();
			System.out.println("�ڲ���DrawShape����");
			
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
	
	
	// �޲ι��캯��
	public StaticInnerClass() {
		
	}
	// �вι��캯��
	public StaticInnerClass(double radius) {
		 this.radius= radius;
	}
	
	// �ⲿ����ͨ����
	public static void showRadius() {
		System.out.println("�ⲿ��İ뾶�ǣ�"+PI);
	}
	
	// �ⲿ�� �����ڲ���ĳ�Ա����
	public static Draw getDrawInstance() {
		
		return new Draw();
	}
	
	public void getDraw() {
		// ʵ�����ڲ�����
		Draw draw1 = getDrawInstance();
		System.out.println("�ڲ���ĳ�Ա����"+draw1.a);
		
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
