import java.util.Arrays;


public class StringRev {
	
	private static char[] ch2s;

	public static void main(String[] args) {
		
		String str="abcd";
		rev(str);
	}
	
	public static void rev(String str){
    	
    	StringBuffer sb=new StringBuffer(str);
    	System.out.println(sb.reverse());
	}
	
	public static void rev2(String str){
		char[] ch;
		ch2s = null;
		ch=str.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<ch.length;i++){
			ch2s[j]=ch[i];
			j--;
		}
		for(int i=0;i<j;i++){
			System.out.println();
		}
	}

}

	
