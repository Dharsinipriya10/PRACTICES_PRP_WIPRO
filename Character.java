import java.util.*;
 class Character {
	 public static void main(String [] args){
		Scanner scan= new Scanner (System.in);
		String str= scan.next();
		String str1= scan.next();
		//boolean flag=true;
		if(str.length()==str1.length()){
			for(int i=0;i<str.length();i++){
				for(int j=i;j<str1.length();j++){
				if(str.charAt(i)==str1.charAt(j)){
					System.out.println("yes");
					break;
				}
				else
				{
					System.out.println("no");
					break;
				}
				}
			break;
			}
			}
		
	 }	
	}

		
