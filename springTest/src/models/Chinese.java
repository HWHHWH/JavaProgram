package models;

import interfaceSet.Axe;
import interfaceSet.Person;

public class Chinese implements Person{
	private Axe axe;//����ӿڱ�̣������Ǿ����ʵ����
	public Chinese() {//�չ�����

	}
	//��ֵע������Ҫ��setXxx����
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	//ʵ�ֽӿڵķ���
	@Override
	public void useAxe() {
		System.out.println( axe.chop());
	}
}