package com.itstar.demo1;

/* 
 * 	������InnerClassTest���г�ʼ���ⲿ��ͳ�Ա�ڲ���
 
 */

public class InnerClassTest {
	public static void main(String[] args) {
			// ��ʼ���ⲿ�����
			InnerClass InnerClass1 = new InnerClass(1.2);
			
			// ����1 
			/* ���ⲿ���ʼ��֮�ϣ��ٳ�ʼ���ڲ���
			 *  ��ʽ�� ����ĸ��Сд��ָ���� Сд������
			*/
			InnerClass.Draw draw = InnerClass1.new Draw("��Բ");
			draw.DrawShape();
			
			// ����2 ͨ���ⲿ��ķ����������ڲ���
			InnerClass.Draw drw2 = InnerClass1.getDrawInstance();
			drw2.DrawShape();
	}

}
