package test;
import java.io.*;
import java.util.*;

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode user = new UserMainCode();
		int[] rel = new int[3];
		rel[0] = -1;
		rel[1] = 0;
		rel[2] = 0;
		//rel[3] = 0;
		//	rel[4] = 1;
		System.out.println(user.totalParents(3, 1, rel));

	}

}

// Read only region start
class UserMainCode {

	public int totalParents(int input1, int input2, int[] input3) {
		int counter = 1;
		int temp = input3[0];
		int temp1 = input3[1];
		int pcount = 0;
		HashMap< Integer,Integer> hm = new HashMap< Integer,Integer>();
		int key;
		if(input2==0 && input1==1)
			return -1;

		for (int i = 0; i < input1; i++) {
			temp = input3[i];

			for (int j = i+1; j < input1; j++) {
				temp1 = input3[j];
				if (temp == temp1 && temp != -1) {
					counter++;
				}
			}
			key=temp;
			if (counter > input2) {
				if(!hm.containsKey(key)) {
					hm.put(key, counter);
					pcount += 1;
				}
			}

		}

		return pcount;

	}
}