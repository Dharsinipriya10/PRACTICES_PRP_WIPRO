public class Revvowelremoval {
public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();
	String repall=str.replaceAll("[AEIOUaeiou]", "");
	System.out.println(repall);
	StringBuffer sb= new StringBuffer(repall);
 System.out.println(sb.reverse());
 }
}
