public class GuviRepnum {
 public static void main(String [] args)
 {
	 Scanner sc=new Scanner (System.in);
	 int n=sc.nextInt();
	int  count =0,k=0;
	 int arr[]=new int [n];
	 for(int i=0;i<n;i++){
		  arr[i]=sc.nextInt();
		  
	 }
	 int arr1[]=new int [n*n];
	 for(int i = 0; i < n-1; i++) {  
         for(int j = i + 1; j <n; j++) {  
             if(arr[i] == arr[j]){  
                 arr1[k]=arr[i]; 
                  k++;
                  arr[j]=0;
             }
         }         
	 }
	 for(int i = 0; i < n; i++) {
	      if(arr1[i]!=0){
		 System.out.println(arr1[i]);
	      }
	      else 
	      count ++;
	 }
	 if(count ==n){
		 System.out.println("no match");
	 }
 }
}
