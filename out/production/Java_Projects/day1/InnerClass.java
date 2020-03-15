package com.itstar.demo1;


/*// �ڲ��ඨ�壺 java���е�һ����������һ���࣬�ͽ��ڲ���

�ڲ�������� 
(1)����ͨ����Ա�ڲ��ࣺ ���Աlevelһ�������ܴ���static�ؼ��֣����ܹ�������̬����
				�����ԡ���̬����飬����ͨ���ڲ���
(2)��̬��Ա�ڲ��ࣺʹ��static ���εĳ�Ա�ڲ���
(3)��ͨ�ֲ��ڲ��ࣺ�ֲ���Χ����Ч���ڲ��ࣨ���緽�����棩
(4) �����ֲ��ڲ��ࣺ û�����ֵľֲ��ڲ���

����ͨ����Ա�ڲ��ඨ�壺
	���壺���Ա����һ�������������������ڳ�Ա�ڲ����п����������Ժͷ���
	���ã���Ա�ڲ�����������Ʒ����ⲿ��ı����ͷ���������private���εģ�
		�ڲ�������ж��
		��Ա�ڲ����������ͬ���ĳ�Ա�����򷽷����������ڲ���
	
	
��Ա�ڲ������ⲿ��ķ��ʣ�
	��1����Ա�ڲ�������ⲿ�࣬������
	��2���ⲿ������ڲ���ĳ�Ա�����������Ƶģ�����Ҫ����һ���ڲ���Ķ���Ȼ��ͨ������������
	
	
��Ա�ڲ���ĳ�ʼ��
	����������������������������Ҫ���ʣ�Ҫ�����ڲ��࣬����ʵ���ⲿ��ʵ����֮����ʵ�����ڲ���
	����1�� ���ⲿ������ʼ������ʱ�г�ʼ���ڲ���
	Outter.Inner inner = outter.new Inner();
	����2��ͨ���ⲿ��ĳ�Ա������ó�Ա�ڲ�����󣬷���������Ա����
	
*/



						
/*��Ա�ڲ������ʾ
 * 
 * */

public class InnerClass {
	// ��Ա����
	private double radius=1;  //��һ��radius
	private static final double PI=3.14;
	
	//����һ���ڲ���
	class Draw{
		//��Ա����
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
			System.out.println("�ⲿ���private���εĳ�Ա������"+InnerClass.this.radius); 
			
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
	public InnerClass() {
		
	}
	// �вι��캯��
	public InnerClass(double radius) {
		 this.radius= radius;
	}
	
	// �ⲿ����ͨ����
	public void showRadius() {
		System.out.println("�ⲿ��İ뾶�ǣ�"+this.radius);
	}
	
	// �ⲿ�� �����ڲ���ĳ�Ա����
	public Draw getDrawInstance() {
		
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
