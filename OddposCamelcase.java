package pk;

import java.util.Arrays;
import java.util.Scanner;

public class OddposCamelcase{
public static void main(String [] args){

	Scanner scan = new Scanner (System.in);
	String str= scan.nextLine();
	String str1[]= str.split(" ");
	for(int i= 0;i<str1.length;i++){
		for(int j=0;j<str1[i].length();j++){
		if(j%2==0){

			System.out.print(str1[i].substring(j,j+1).toUpperCase());
	
	}
	}
}
}
}
