import java.util.*;
class Substr{
	public static void main(String args[]){
		String str="abc";
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				String s=str.substring(i,j);
				System.out.println(s);
			}
		}
	}
}