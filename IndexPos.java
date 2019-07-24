public class IndexPos {
public static void main(String [] args){
 Scanner scan= new Scanner (System.in);
 int n=scan.nextInt();
 int s[]=new int[n];
 int index;
 for(int i=0;i<n;i++){
	 s[i]=scan.nextInt();
 }
for(int i=0;i<n;i++){
	index=i;
	System.out.println(s[i]+"  "+index); 
	 
 }
}
}
