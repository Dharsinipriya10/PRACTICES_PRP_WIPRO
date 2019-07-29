public class SubsetArray {
public static void main(String [] args){
	Scanner scan= new Scanner (System.in);
	int n=scan.nextInt();
	int num[]=new int [n];
int num1[] = new int [n];
for(int i=0;i<n;i++){num[i]= scan.nextInt();
num1[i]= scan.nextInt();
}
 for(int i=0;i<num.length;i++){
	 for(int j=0;j<num1.length;j++){
		 if(num[i]== num1[j]){ 
		 
			 if(j==num1.length){
				 System.out.println(" does not matched");
			 }
			 }	
		
		 }
	 System.out.println(" true");
	 break;
	 }
 }
}
