public class armstrong1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int rem,sum=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n =n/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
			
		}else
		{
			System.out.println("no");
		}
	}

}
