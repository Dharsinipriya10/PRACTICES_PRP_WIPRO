import java.util.Scanner;

public class ArrayMin {
public static void main(String [] args){
 Scanner sc= new Scanner (System.in);
 int n=sc.nextInt();
 
int num[]= new int[n]; 
int min=100000;
 for(int i=0;i<num.length;i++){
	 num[i]=sc.nextInt();
	 if(min > num[i]){
		 min =num[i];
	 }
 }
 System.out.println(min);
 
}
}
