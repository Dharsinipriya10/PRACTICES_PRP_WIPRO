import java.util.Scanner;

public class SumOfPOwerCount {
public static void main(String [] args)	{
	Scanner scan = new Scanner (System.in);
	int n= scan.nextInt();
	int number=0;
 String str= String .valueOf(n);
 int n1= str.length();
 for(int i=0;i<str.length();i++){
number +=(int)Math.pow(Integer.parseInt(str.substring(i,i+1)),n1);
	}
System.out.println(number);
}
}
 
 

