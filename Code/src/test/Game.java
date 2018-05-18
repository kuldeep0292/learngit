package test;

public class Game {
	public static void main(String[] args) {
		//int inp[] []= {{}};
		int inp[] []= {{1,4,5},{4,10,81},{0,12,2}};

		System.out.println(WhoWins.dC(inp,0,0,5,1,3));
		//.--..-, .-.-
		//..- 
		//.--.-
	}
}


class WhoWins {

	static String dC(int[][] input1, int input2,int input3,int input4,int input5,int input6) {		
	//foruser
		int i = input2,j=input5;
		int usergasreqd=0, cpugasreqd=0;
		if(input1.length<=0 || input2<0 || input3<0 ||input4<0||input5<0||input6<=0) {
			return "Yes "+usergasreqd;
		}
			
		try {
			usergasreqd +=input1[i][j];
			if(usergasreqd!=0) {
				i = j;
				j = input4;
				usergasreqd +=input1[i][j];		
			}
			//for cpu		
			i = input3;
			j = input4;
			cpugasreqd +=input1[i][j];		

			if(cpugasreqd==0) {
				return "Yes "+usergasreqd;
			}
			else if(usergasreqd<=cpugasreqd) {
				return "Yes "+usergasreqd;
			}
			else {
				return "No "+cpugasreqd;
			}
		}
		catch(Exception e) {
			return "Yes "+usergasreqd;
		}
	}
}