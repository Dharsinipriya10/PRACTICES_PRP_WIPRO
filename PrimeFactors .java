import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactors {
	public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
	    int number= sc.nextInt();
	int count=0,p=0;
	int k[]=new int[number];
		  for(int i = 1; i<= number; i++) {
			
		         if(number%i == 0) {
		        	  count=0;
		        	 for(int j=i;j>=1;j--){
		        		 if(i%j==0)
		        		 count++;
		        	 }
		        	 if(count==2)
		        	 {
		        	 k[p]=i;
		        	 p++;
		        	 }
	  }
		        	}
		  Arrays.sort(k);
		  for(int i=0;i<number;i++){
			  if(k[i]!=0)
			   System.out.println(k[i]);
		  }
	}
}
	

