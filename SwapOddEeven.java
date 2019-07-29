 public class SwapOddEeven {
public static void main(String [] args){
	Scanner scan= new Scanner (System.in);
	String res =" ";
	System.out.println(" enter the numbers");
String  num = scan.nextLine();
	
	for(int i=0;i<num.length();i++){
		if(num.length()%2==0){
			if(i%2==0){
		res += num.charAt(i+1);
		}
			
		else{
			res += num.charAt(i-1);
	}
		}
else
	{
		System.out.println(" do not match");
	}
		
	}
	System.out.print(res);
}
}
