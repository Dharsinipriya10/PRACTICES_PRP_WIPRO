import java.util.Scanner;

public class ReverseOddpos {
public static void main(String [] args){
 Scanner scan= new Scanner (System.in);
 String  str = scan.nextLine();
 String s[]= str.split(" ");
 for(int i=0;i<s.length;i++){
	 if(i%2==0){
 StringBuffer sb= new StringBuffer(s[i]);
 sb.reverse();
 System.out.println(sb);
 }
	 else if(i%2!=0)
	 {
		 System.out.println(s[i]);
	 }
}
}
}
