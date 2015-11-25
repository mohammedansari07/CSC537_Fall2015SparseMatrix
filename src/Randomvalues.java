package sparsematrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Randomvalues {
	/*public static void main(String args[]){
		
		Randomvalues r=new Randomvalues();
		ArrayList al1=new ArrayList();
		al1=r.values(4, 16);
		System.out.println(al1);
		
	}*/
	
	public ArrayList values(int i,int j){
		ArrayList al=new ArrayList();
		boolean nonzero=false;
		Random r=new Random();
		for(int k=0;k<j-i;k++){
			al.add(0);
		}
		for(int k=0;k<i;k++){
			al.add(r.nextInt(500));
		}
		Collections.shuffle(al);
		return al;
		
	}
	
	
}
