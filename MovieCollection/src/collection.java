import java.util.*;
public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int m,r; //m = number of movies r= number of requests
		String retour = "" ;
		int search;//movie to search
		LinkedList<Integer> l = new LinkedList<Integer>();
		for(int ts=0;ts<cases;ts++){
			 m =sc.nextInt();
			 r =sc.nextInt();
			 retour = "";
			 int temp;
			 int f;
			 for(int j=0;j<m;j++){
				 l.add(j+1);
			 }
			 for(int k=0;k<r;k++){
				 search = sc.nextInt();
				 f= l.indexOf(search);
				 l.remove(f);
				 l.add(0,search);
				 if(k==0){
					 retour = "" +f;
				 }else{
					 retour = retour + " " + f;
				 }
		 
				 

			 }
			System.out.println(retour);
			l.clear();
		}

	}

}
