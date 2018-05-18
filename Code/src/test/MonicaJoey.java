package test;



public class MonicaJoey {
	public static void main(String[] args) {
		int inp[] = {1,1,1};

		System.out.println(Calculate.dC(3, 1,1,inp));
		//.--..-, .-.-
	}
}

class Calculate {

	static int dC(int input1, int input2, int input3, int[] input4) {	
		int heighest=-1;
		int lowest=9999999;
		int minmaxdiff = -1;
		int meal=-2;
		for(int i=0;i<input4.length;i++) {
			if(heighest<input4[i]) {
				heighest = input4[i];
			}
		}
		for(int i=0;i<input4.length;i++) {
			if(lowest>input4[i]) {
				lowest = input4[i];
			}
		}
		minmaxdiff = heighest - lowest;
		if(minmaxdiff>input2) {
			return -1;
		}

		if(input3 > input1) {
			return -1;
		}
		int n = input4.length/input3;
		for(int i=0;i<n;i++) {
			for(int j=0;j<input3;j++) {
				int h = -1,l = 99999;
				int tempdiff = -1;
				
				for(int k=0;k<input3;k++) {
					if(h<input4[i]) {
						h = input4[i];
					}
				}
				for(int k=0;k<input3;k++) {
					if(l>input4[i]) {
						l = input4[i];
					}
				}
				tempdiff = h-l;
				if(tempdiff<input2) {
					meal+=1;
				}
				else {
					int counter=0;
					while(tempdiff > input2 && counter<input3) {
						int newh=-123;
						for(int k=0;k<input3;k++) {
							if(newh<input4[i] && newh!=h) {
								newh = input4[i];
							}
						}	
						tempdiff = newh-l;		
						counter++;
					}
					if(tempdiff<=input2) {
						meal+=1;
					}
				}
			}
		}
/*




		System.out.println(heighest);
		System.out.println(lowest);*/
		return meal;		
	}
}