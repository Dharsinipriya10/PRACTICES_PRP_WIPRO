import java.util.Scanner;
public class naturalnum {
	public static void main(String []args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
			System.out.println(sum);
		}
}
