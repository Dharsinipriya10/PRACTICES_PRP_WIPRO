public class Swapodeven {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res="";
		for (int i = 0; i<str.length(); i++) {
			if(i%2==0)
			{
				res+=str.charAt(i+1);
			}
			else
			{
				res+=str.charAt(i-1);
			}
		}
		System.out.println(res);
		sc.close();
	}

}
