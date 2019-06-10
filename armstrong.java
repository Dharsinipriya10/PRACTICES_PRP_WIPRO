import java.util.Scanner;
public class armstrong {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int rem;
int sum=0;
		for(int i=n+1;i<n1;i++)
		{
			int temp=i;
			 sum=0;
			while(temp!=0){
			rem=temp%10;
			 
		sum=sum+(rem*rem*rem);
			temp=temp/10;
			}
			if(i==sum)
			{
				System.out.println(i);
				}
	}
	}
}
