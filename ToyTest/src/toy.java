import java.util.*;
public class toy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lire = new Scanner(System.in);
		int [] toys = new int [4];
		int ecart;
		int ab = 0;
		boolean pass = true;
		int test = lire.nextInt();
		while(test != -1){
			pass = true;
			toys[0] = test;
			for(int i=1;i<4;i++){// lire les valeurs des toys et l ecart
				toys[i] = lire.nextInt();
								
			}
			ecart = toys [3];
			for(int j=0;j<2;j++){
				for(int k=1;k<3;k++){
				ab = Math.abs(toys[j] - toys[k] );
				if(ab > ecart){
					pass = false;
				}
			  }
			}
			if(pass){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			
			 test = lire.nextInt();
		}

	}

}
