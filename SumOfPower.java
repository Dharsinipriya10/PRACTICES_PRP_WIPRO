import java.util.Scanner;

public class SumOfPower {
public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	int num= scan.nextInt();
	int number=0;
	String str= String.valueOf(num);
	for(int i=0;i<str.length()-1;i++){
		number +=(int )Math.pow(Integer.parseInt(str.substring(i,i+1)), (Integer.parseInt(str.substring(i+1,i+2))));
		}
	number+=Integer.parseInt(str.substring(str.length()-1));
	System.out.println(number);
	}
}
