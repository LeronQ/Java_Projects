package com.itstar.demo1;

public class LocalClass1 {
	// ��Ա����
	private String skirt ="�·�";
	private static double apLever=1.99;
	
	public String getSkirt() {
		return skirt;
	}
	public void setSkirt(String skirt) {
		this.skirt = skirt;
	}
	public LocalClass1() {
		
	}
	// LocalClass2 ��̬
	public LocalClass2 getMan() {
		class Other extends LocalClass2{
			// �ֲ��ڲ���ĳ�Ա����
			private String beard;
			public String getBeard() {
				return beard;
			}
			public void setBeard(String beard) {
				this.beard = beard;
			}
			// �ֲ��ڲ��๹�캯��
			public Other() {
			}
			// ��д�ⲿ�෽��
			public void show() {
				// �ֲ��ڲ�����Է����ⲿ��ľ�̬���߷Ǿ�̬����
				System.out.println("----�ֲ��ڲ���----");
				System.out.println("�ⲿ��ĳ�Ա����:"+skirt);
				System.out.println("�ⲿ��ĳ�Ա����:"+apLever);
				
			}
		}
		// ֻ�������Χ�������ã������������������ʶ
		LocalClass2 lc2 = new LocalClass2();
		
		return new Other();
	}
	
/*	�Աȳ�Ա�ڲ��࣬�ɷ�Ҳдһ��������ֱ�ӵ���LocalClass2����
	������ֱ�ӵ��ã���Ϊ���ⲿ��������ط���������ʶLocalClass2
	public LocalClass2 getMan2() {
		
	}*/
	
}
