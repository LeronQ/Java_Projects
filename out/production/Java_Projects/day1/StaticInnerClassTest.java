package com.itstar.demo1;



public class StaticInnerClassTest {
	public static void main(String[] args) {
		// ��ʼ���ⲿ�����
		
		// ����1 
		/* ���ⲿ���ʼ��֮�ϣ��ٳ�ʼ���ڲ���
		 *  ��ʽ�� ����ĸ��Сд��ָ���� Сд������
		*/
		StaticInnerClass.Draw draw = new StaticInnerClass.Draw("��Բ");
		draw.DrawShape();
		
		// ����2 ͨ���ⲿ��ķ����������ڲ���
		StaticInnerClass.Draw draw2 = new StaticInnerClass().getDrawInstance();
		draw2.DrawShape();
}
}
