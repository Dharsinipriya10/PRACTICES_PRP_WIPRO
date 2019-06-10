import java.util.Scanner;
public class palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num= sc.nextInt();
		int temp= num;
		int sum=0,r;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
		}
		else
			
		{
			System.out.println("no");
		}
	}
