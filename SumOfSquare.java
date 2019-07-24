public class SumOfSquare {
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,sum=0;
		while(n!=0){
			rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		System.out.println(sum);
	}
	}
