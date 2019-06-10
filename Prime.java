import java.util.Scanner;
public class Prime {
		public static void main(String [] args)
		{
			int ok = 0;
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		for(int i=2;i<=num-1;i++){
			if(num % i == 0){
				ok =1;
				break;
			}
		}
		if(ok==1) System.out.println("not a prime");
		else System.out.println("prime");
		}
}

