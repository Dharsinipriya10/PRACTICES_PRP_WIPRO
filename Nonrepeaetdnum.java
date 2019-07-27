 public class Nonrepeaetdnum {
public static void main(String [] args){
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++){
		arr[i]=scan.nextInt();
}
	for (int i = 0; i < n; i++) { 
        int j; 
        for (j = 0; j < n; j++) 
            if (i != j && arr[i] == arr[j]) 
                break; 
        if (j == n) 
          System.out.println(arr[i]); 
	}
   
} 
}
	





 
	





