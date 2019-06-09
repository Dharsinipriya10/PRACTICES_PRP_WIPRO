import java.util.Scanner;
public class count {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;n>0;i++) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
