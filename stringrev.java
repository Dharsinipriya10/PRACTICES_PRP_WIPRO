import java.util.Scanner;
public class stringrev {
	public static void main(String []args)
	{
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
