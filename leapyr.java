import java.util.Scanner;
public class leapyr {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year");
		int num=sc.nextInt();
		if(num%4==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
