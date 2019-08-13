import java.util.Arrays;
import java.util.Scanner;

public class revserseStringword {
public static void main(String [] args){

	Scanner scan = new Scanner (System.in);
	String str= scan.nextLine();
	String str1[]= str.split(" ");
	for(int i= str1.length-1;i>=0;i--){
		StringBuffer sb=new StringBuffer(str1[i]);
		System.out.println(sb.reverse());
	}
	}
}
