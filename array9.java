import java.util.Scanner;
public class array9 {
	public static void main(String[]args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(i<k)
			{
				sum +=arr[i];
			}
		}
		System.out.println(sum);
		}
    }
