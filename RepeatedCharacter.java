public class  RepeatedCharacter {
public static void main(String [] args){
	Scanner sc= new Scanner (System.in);
	String str= sc.nextLine();
    char ch[]=str.toCharArray();
    int count=1;
    for(int i=0;i<ch.length;i++){
    	for(int j=i+1;j<ch.length;j++){
    	if(ch[i]==ch[j]){
    		count++;
    		System.out.println(ch[i]);
    	}
    	
}sc.close();
}
}
}
