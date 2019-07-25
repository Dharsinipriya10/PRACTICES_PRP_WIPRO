public class IndexPosValue {
public static void main(String [] args){
Scanner scan= new Scanner (System.in);
int n= scan.nextInt();
int num[]= new int[n];
int index1;
for(int i=0;i<n;i++){
	num[i]= scan.nextInt();
}
for(int i=0;i<n;i++){
	if(i==num[i]){
		System.out.print(num[i]  );
	}
	}
}
}
