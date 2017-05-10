import java.util.Arrays;
import java.util.Scanner;
/*
 * author : agatapouglof 10/05/2017
 * get the result in int and verify if % 6
 * link openkattis : https://open.kattis.com/problems/timebomb
 * in
 * 	
 * 
 * 
 * 
 *  ***   * * * *** *** *** ***
 *  * *   * * *   *   *   * *  
 *  * *   * *** *** *** *** ***
 *  * *   *   * *     * *   * *
 *  ***   *   * *** *** *** ***
 *  
 *  out 
 *  
 *  BEER!!

 *  
 */

public class Timebomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String val,res="";
		int render;
		
		//String[][][] vals = new String [10][5][3] ;
		String[][][] vals = { // the format of data input each number in tab[i] on 5 lines and  columns
				{{"*","*","*"},{"*"," ","*"},{"*"," ","*"},{"*"," ","*"},{"*","*","*"}},
				{{" "," ","*"},{" "," ","*"},{" "," ","*"},{" "," ","*"},{" "," ","*"}},
				{{"*","*","*"},{" "," ","*"},{"*","*","*"},{"*"," "," "},{"*","*","*"}},
				{{"*","*","*"},{" "," ","*"},{"*","*","*"},{" "," ","*"},{"*","*","*"}},
				{{"*"," ","*"},{"*"," ","*"},{"*","*","*"},{" "," ","*"},{" "," ","*"}},
				{{"*","*","*"},{"*"," "," "},{"*","*","*"},{" "," ","*"},{"*","*","*"}},
				{{"*","*","*"},{"*"," "," "},{"*","*","*"},{"*"," ","*"},{"*","*","*"}},
				{{"*","*","*"},{" "," ","*"},{" "," ","*"},{" "," ","*"},{" "," ","*"}},
				{{"*","*","*"},{"*"," ","*"},{"*","*","*"},{"*"," ","*"},{"*","*","*"}},
				{{"*","*","*"},{"*"," ","*"},{"*","*","*"},{" "," ","*"},{"*","*","*"}}
				};
//		for (int k = 0; k < vals.length; k++) {
//			for (int i = 0; i < 5; i++) {
//				for (int j = 0; j < 3; j++) {
//					System.out.print(vals[k][i][j]);
//				}
//				//System.out.println();
//				System.out.println();
//			}
//			System.out.println();
//		}
		val = sc.nextLine();
		int temp = taille(val.length());
		int length = val.length();
		//System.out.println("length : "+ length+" temp : "+ temp);
		int  index = 0; 
		String[][][] tab = new String[temp][5][3];
		for(int k=0;k<5;k++){// read input and set in table
			for (int i = 0; i < temp; i++) {
			  	for (int j = 0; j < 3; j++) {
				  tab[i][k][j] = ""+val.charAt(index);
					index++;
			  }
			  	index++;
			}
			index = 0;
			if(k<4){
			val = sc.nextLine();}

		}
		for (int j = 0; j < temp; j++) {// compare each  input whith format table
			for (int i = 0; i < 10; i++) {
				if(compare(vals[i], tab[j])){
				res+= i;
				}
			}
		}
	    render = Integer.parseInt(res);
	    if(render % 6 == 0){
	    	System.out.println("BEER!!");
	    }else{
	    	System.out.println("BOOM!!");
	    }
	}
	static int taille(int val){//return the number of int in input to create table for input
		switch(val){
		case 7: return 2;
		case 11: return 3;
		case 15: return 4;
		case 19: return 5;
		case 23: return 6;
		case 27: return 7;
		default : return 8;
		
		}
	}
	static boolean compare(String[][] tab1,String[][] tab2){// compare if input equals dataset
		boolean test = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if(!tab1[i][j].equals(tab2[i][j])){
					test = false;
				}
			}
		}
		return test;
	}

}
