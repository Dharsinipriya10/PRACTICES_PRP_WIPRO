import java.util.Arrays;
import java.util.Scanner;

public class GuviLarNum {
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int [n];
	int min=1000;
	
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	if(arr[i] < min){
		min=arr[i];
	}
	}System.out.println("minimum element is "+min );
	System.out.println();
	Arrays.sort(arr);
	for(int i=n-1;i>=0;i--){
	System.out.println( "sorting elements " +arr[i]);
	}
	
	}

}
