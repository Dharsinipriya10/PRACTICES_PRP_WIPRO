public class Smallestelement {
 public static void main(String [] args){
	 Scanner scan= new Scanner (System.in);
	int n= scan.nextInt();
	int num[] = new int [n];
	for(int i=0;i<n;i++){
		num[i]= scan.nextInt();
	}for(int i=0;i<n-1;i++){
		if(num[i]>num[i+1]){
			System.out.println(num[i+1]);
	}
		else
		{
			System.out.println("-1");
		}
}System.out.println("-1");
}
}
