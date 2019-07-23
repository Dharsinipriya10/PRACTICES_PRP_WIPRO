import java.util.Scanner;

public class ArrayMax {
public static void main(String [] args){
 Scanner sc= new Scanner (System.in);
 int n=sc.nextInt();
 
int num[]= new int[n]; 
int max=num[0];
 for(int i=0;i<num.length;i++){
	 num[i]=sc.nextInt();
	 if(max < num[i]){
		 max =num[i];
	 }
 }
 System.out.println(max);
 
}
}
