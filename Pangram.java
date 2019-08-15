public class Pangram {
public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	String s= scan.nextLine();
	s=s.toLowerCase();
	String alpha="abcdefghijklmnopqrstuvwxyz";
	int count=0;
for(int i=0;i<alpha.length();i++){
	   for(int j=0;j<s.length();j++){
		  if(alpha.charAt(i)==s.charAt(j)){
				count++;
				break;
		  }}}
	if(count>=alpha.length()){
		System.out.println("panagram");
	}
	else{
		System.out.println("NO");
	}
}
}
	
	
