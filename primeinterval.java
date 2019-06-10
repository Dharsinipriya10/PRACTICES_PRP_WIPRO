import java.util.Scanner;
public class primeinterval {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int k=sc.nextInt();
		int count=0;
	for(int i=num;i<=k;i++)
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
	
