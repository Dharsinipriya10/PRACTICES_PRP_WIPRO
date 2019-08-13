public class StringReverseword {
public static void main(String [] args){
	Scanner scan= new Scanner (System.in);
	String str = scan.nextLine();
	String  str1[] = str.split(" ");
	for(int i=str1.length-1;i>=0;i--){
		System.out.println(str1[i]);
	}
}
}
