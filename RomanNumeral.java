public class RomanNumeral {
	public static void main(String [] args){
		Scanner scan= new Scanner (System.in);
		int decimal=0;
		String romanNumeral=scan.next();
		System.out.println(romanNumeral.toUpperCase());
		for(int i=0;i<romanNumeral.length();i++){
			char choice = romanNumeral.charAt(i);
		switch(choice){
		case 'M':
            decimal += 1000;
            break;

        case 'D':
            decimal += 500;
            break;

        case 'C':
            decimal += 100;
            break;

        case 'L':
            decimal += 50;
            break;

        case 'X':
            decimal += 10;
            break;

        case 'V':
            decimal += 5;
            break;

        case 'I':
            decimal += 1;
            break;
        }
    }
    if (romanNumeral.contains("IV"))
    {
        decimal-=2;
    }
    if (romanNumeral.contains("IX"))
    {
        decimal-=2;
    }
    if (romanNumeral.contains("XL"))
    {
        decimal-=10;
    }
    if (romanNumeral.contains("XC"))
    {
        decimal-=10;
    }
    if (romanNumeral.contains("CD"))
    {
        decimal-=100;
    }
    if (romanNumeral.contains("CM"))
    {
        decimal-=100;
    }
    System.out.println(decimal);
}
}


