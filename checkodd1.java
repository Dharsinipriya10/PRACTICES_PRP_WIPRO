import java.util.Scanner;
public class checkodd1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=n;i<=k;i++)
		{
			if(i%2==1 ){
					System.out.println(i);
				}
			}
		}
	}

