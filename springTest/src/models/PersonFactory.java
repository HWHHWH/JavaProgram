package models;

import interfaceSet.Person2;

//������
public class PersonFactory {
	public Person2 getPerson(String ethnic){//��ȡ�����Ʒ��ɫʵ��
		if(ethnic.equalsIgnoreCase("japan")){//���ݲ�������person�ӿڵ�ʵ��
			return new Japanese();//����chineseʵ��
		}else{
			return new American();//����americanʵ��
		}
	}

}
