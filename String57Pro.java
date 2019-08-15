public class String57Pro {
public static void main(String [] args){
	Scanner scan = new Scanner (System.in);
	String str= scan.nextLine();
	String str1= scan.nextLine();
	String str2=" ";
	String st=" ";
	boolean flag = false;
	a:
	for(int i=0;i<str.length()-2;i++){
		for(int j=0;j<str1.length()-2;j++){
			st=str.substring(i,i+2);
			str2=str1.substring(j,j+2);
			if(st.equals(str2))
			{ 
				flag= true;
				break a;
			}
		}
	}
	if(flag== true){
				System.out.println("yes");
	}
			else
			{
				System.out.println("no");
			}
			
		
}

}
