import java.util.*;
public class SimonSays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nbr = sc.nextInt();
		sc.skip("[\r\n]+");
		String test;
		String phrase;
//		sc.nextLine();
		for(int i=0;i<nbr;i++){
			phrase = sc.nextLine();
			if(phrase.length() >10){
				test = phrase.substring(0,10);
//				System.out.println(test);
				if(test.equals("simon says")){
					phrase = phrase.substring(11,phrase.length());
					System.out.println(phrase);
				}else{
					System.out.println();
				}
				
			}else{
				System.out.println();
			}

		}
	}

}
