import java.util.*;
public class beautifulsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		ArrayList<ArrayList<Integer>> tab = new ArrayList<>();
		int taille,val,p,temp;
		String aff="";
		int cases = sc.nextInt();
		for(int k=0;k<cases;k++){
			taille =sc.nextInt();
			int [][]  tab = new int[taille][taille];
			int [][]  tab1 = new int[taille][taille];
			int [][]  tab2 = new int[taille][taille];
			for (int i = 0; i < taille; i++) {
				for (int j = 0; j < taille; j++) {
					val =sc.nextInt();
					tab[i][j] = val;
				}
			}
			p= taille /2;
			for (int i = 0; i < tab.length; i++) {
				for (int j = 0; j < tab.length; j++) {
//					temp = tab[i][j];
					tab2[i][j] = tab[tab.length-1-i][j];
				}
			}
			for (int i = 0; i < tab.length; i++) {
				for (int j = 0; j < tab.length; j++) {
//					temp = tab[i][j];
					tab1[i][j] = tab[i][tab.length-1-j];
				}
			}
			
//			System.out.println("le p"+p);
			// afficher 
//			for (int i = 0; i < taille; i++) {
//				aff="";
//				for (int j = 0; j < taille; j++) {
//					aff+= " "+tab1[i][j];
//					
//				}
//				System.out.println(aff);
//				
//			}
		
	// fin afficher
			boolean test  = true;
			if(!Arrays.deepEquals(tab, tab1)){
				test = false;
//				System.out.println("tab1 false");
			}
			if(!Arrays.deepEquals(tab, tab2)){
				test = false;
				//System.out.println("tab2 false");
			}
			if(test){
				System.out.println("beautiful square");
			}else{
				System.out.println("not a beautiful square");
			}
		}
	

	}

}
