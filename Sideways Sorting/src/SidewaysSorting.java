import java.util.Arrays;
import java.util.Scanner;
public class SidewaysSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c;
		r=sc.nextInt();
		c=sc.nextInt();
		String val,aff="";
		while(r!=0 && c!=0){
			sc.nextLine();
			String [] tab  = new String[c];
			for (int i = 0; i < tab.length; i++) {
				tab[i] = "";
			}
			for (int i = 0; i < r; i++) {
				val = sc.nextLine();
				for (int j = 0; j < c; j++) {
					tab[j]+= val.charAt(j); 
				}
			}
			Arrays.sort(tab, String.CASE_INSENSITIVE_ORDER);
			for (int i = 0; i < r; i++) {
				aff = "";
				for (int j = 0; j < c; j++) {
					aff+=tab[j].charAt(i);
				}
				System.out.println(aff);
			}


			r=sc.nextInt();
			c=sc.nextInt();
		}
		
	}

}
