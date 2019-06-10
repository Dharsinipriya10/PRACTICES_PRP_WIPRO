import java.util.Scanner;
public class appendstring {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		StringBuilder sbl=new StringBuilder(str);
		sbl.append('.');
		System.out.println(sbl);
	}
}
