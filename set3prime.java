import java.util.Scanner;
	public class set3prime {
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int l =sc.nextInt();
			int r=sc.nextInt();
			int count=0;
		for(int i=l;i<=r;i++)
		{
			count=0;
					for( int j=2;j<=i/2;j++)
				{
				if(i%j == 0){
					count++;
						}
			}if(count==0)
			{
				System.out.println(i);
			}
			}
	}
	}
		
