package sort;

import java.util.Arrays;
/*
 * ð������
 * ÿ�����αȽ�ȡ�������С������
 * j:������
 * i��ÿ�˱ȽϵĴ���
 */

public class Bubble {
	//����
	public static void main(String[] args) {
		int[] arr=new int[]{2,3,4,1,6,7,5};
		sort(arr);
		//Arrays.sort(arr);ʹ��Arrays���鹤��������򷽷�
		System.out.println();
		System.out.println("�������� ��"+Arrays.toString(arr));
   	}
    //ð�������㷨
	public static void sort(int[] arr){
		boolean sorted=true;
		//����
		for(int j=0;j<arr.length-1;j++){
			sorted=true;
			System.out.println("��"+(j+1)+"��");
			//ÿ�˱ȽϵĴ���
			for(int i=0;i<arr.length-1-j;i++){
				System.out.print("��"+(i+1)+"��");
				//�Ƚϴ�С
				if(arr[i]<arr[i+1]){
					//����λ��
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					sorted=false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				System.out.println("-------");
				break;
			
			}
		}
	}
	
}
