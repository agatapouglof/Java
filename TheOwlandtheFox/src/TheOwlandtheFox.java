import java.util.Scanner;
public class TheOwlandtheFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length,val,temp,index;
		String word,res="";
		boolean test;
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++){
			val = sc.nextInt();
			temp =10;
			test = false;
			while((val % 10) ==0){
				val  = val /10 ;
				temp*=10;
				test =true;
				}
			val--;
			if (test) {	val= val *(temp/10); 	
			}
			System.out.println(val);

			
		}
	}

}
