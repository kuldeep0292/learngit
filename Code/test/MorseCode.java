package test;
import java.util.Stack
;

public class MorseCode {
	public static void main(String[] args) {
		String inp[] = { ".fgdgdg-"};
		
		System.out.println(Calc.dC(2, inp));
		//.--..-, .-.-
		//..- 
		//.--.-
	}
}

class Calc {

	static int dC(int input1, String input2[]) {		
		int valid = 0;
		try {
			if(input1<=0) {
				return 0;
			}
			for(String str : input2) {
				int counter=0;
				String temp = str;
				if(str.startsWith(".") && str.endsWith("-")) {
					for(int i=0;i<str.length();i++) {
						if(str.charAt(i)!='.' && str.charAt(i)!='-')
						{
							continue;
						}
						else if(str.charAt(i)=='.') {								
							String sub = temp.substring(0, i);
							if(sub.contains("-")) {
								counter =-23123123;
								break;
							}
							counter+=1;
							temp = temp.replaceFirst("-", "*");
						}		
						else if(str.charAt(i)=='-') {
							counter-=1;
						}
					}
					if(counter==0) {
						valid+=1;
					}
				}
			}
		}catch(Exception e) {
			return valid;		
		}
		return valid;		
	}
}