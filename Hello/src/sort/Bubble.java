package sort;

import java.util.Arrays;
/*
 * 冒泡排序
 * 每趟依次比较取出最大（最小）的数
 * j:趟数；
 * i：每趟比较的次数
 */

public class Bubble {
	//主类
	public static void main(String[] args) {
		int[] arr=new int[]{2,3,4,1,6,7,5};
		sort(arr);
		//Arrays.sort(arr);使用Arrays数组工具类的排序方法
		System.out.println();
		System.out.println("最终排序 ："+Arrays.toString(arr));
   	}
    //冒泡排序算法
	public static void sort(int[] arr){
		boolean sorted=true;
		//趟数
		for(int j=0;j<arr.length-1;j++){
			sorted=true;
			System.out.println("第"+(j+1)+"趟");
			//每趟比较的次数
			for(int i=0;i<arr.length-1-j;i++){
				System.out.print("第"+(i+1)+"次");
				//比较大小
				if(arr[i]<arr[i+1]){
					//互换位置
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
