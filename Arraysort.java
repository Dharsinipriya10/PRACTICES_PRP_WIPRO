public class Arraysort {
	
		public static void main(String [] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int n=sc.nextInt();
			int  a[]=new int[n];
			System.out.println("enter the array elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
				
			}
			Arrays.sort(a);
			for(int i=0;i<n;i++){
				System.out.println(a[i]);
			}}
}
