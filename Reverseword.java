public class Reverseword {
public static void main(String [] args){
	Scanner scan= new Scanner (System.in);
	String str = scan.nextLine();
	String  str1[] = str.split(" ");
	for(int i=0;i<str1.length;i++){
	StringBuffer sb= new StringBuffer(str1[i]);
 System.out.print(sb.reverse()+" ");
}
}
}
