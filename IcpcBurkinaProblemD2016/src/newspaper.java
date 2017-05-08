import java.util.*;
public class newspaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Numberpages;
		int cas;
		int tab[] = new int [3];
		String res ="";
		Numberpages = sc.nextInt();
		while(Numberpages != 0){
			cas = sc.nextInt();
			tab[0] = complement(Numberpages, cas);
			if((cas % 2) == 0){
				tab[1] = cas-1;
			}else{
				tab[1]=cas+1;
			}
			
			tab[2] = complement(Numberpages, tab[1]);
			Arrays.sort(tab);
			res = ""+tab[0];
			for (int i = 1; i < tab.length; i++) {
				 res =res +" "+tab[i];
			}
			System.out.println(res);
			
			Numberpages = sc.nextInt();
		}

	}
	public static int complement(int taille,int n){
		return taille+1 -n;
	}

}
