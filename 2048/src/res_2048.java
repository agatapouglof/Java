import java.util.*;
public class res_2048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int test = sc.nextInt();
		int [][] tab  = new int [4][4];
//		int [][] tab = {
//				{2,0,0,2},
//				{4,16,8,2},
//				{2,64,32,4},
//				{1024,1024,64,0}
//		};
//		int [][] tab = {
//				{2,2,4,8},
//				{4,0,4,4},
//				{16,16,16,16},
//				{32,16,16,32}
//		};
		String aff = "";
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				tab[i][j] = sc.nextInt();
			}
		}
		int direction = sc.nextInt();
		switch(direction){
		case 0 : 
			tab = left(tab);
			break;
		case 1 :
			tab = up(tab);
			break;
		case 2 :
			tab = right(tab);
			break;
		case 3 :
			tab = down(tab);
			break;
		}
//		tab = up(tab);
		for (int i=0;i<4;i++){
			aff="";
			for (int j=0;j<4;j++){
				if(j  == 0){
					aff = aff + tab[i][j];
				}else{aff = aff +" "+tab[i][j];}
				
				
			}
			System.out.println(aff);
		}
		
	}
//	function to go left
	public static int[][] left(int[][] tab){
		boolean [][] fusion = new boolean[4][4] ;  
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				fusion[i][j] =  true ;
//				System.out.println(fusion[i][j]);
			}
		}
		boolean iterate = true;
		String aff;
		while(iterate){
			iterate = false;
			for (int i=0;i<3;i++){
				for (int j=0;j<4;j++){
					if(tab[j][i] == 0 ){
						if(tab[j][i+1] != 0){
//							System.out.println(tab[j][i]);
							tab[j][i] = tab[j][i+1];
							tab[j][i+1] = 0;
							iterate = true;
						}

					}else{
						if(tab[j][i] == tab[j][i+1]){
							if(fusion[j][i] && fusion[j][i+1]){
								tab[j][i] += tab[j][i+1];
								tab[j][i+1] = 0;
								iterate = true;
								fusion[j][i] = false;
							}
							
						}
					}
				}
			}
		}
		return tab;

	}
	// function to go right
	public static int[][] right(int[][] tab){
		boolean [][] fusion = new boolean[4][4] ;  
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				fusion[i][j] =  true ;
//				System.out.println(fusion[i][j]);
			}
		}
		boolean iterate = true;
		while(iterate){
			iterate = false;
			for (int i=3;i>0;i--){
				for (int j=0;j<4;j++){
//					System.out.println(tab[i][j]);
					if(tab[j][i] == 0 ){
						if(tab[j][i-1] != 0){
//							System.out.println(tab[j][i]);
							tab[j][i] = tab[j][i-1];
							tab[j][i-1] = 0;
							iterate = true;
						}

					}else{
						if(tab[j][i] == tab[j][i-1]){
							if(fusion[j][i] && fusion[j][i-1]){
								tab[j][i] += tab[j][i-1];
								tab[j][i-1] = 0;
								iterate = true;
								fusion[j][i]= false;
							}								
						}

					}
				}
			}
		}
		return tab;

	}
	
	// function to go up 
	public static  int[][] up(int[][] tab){
		boolean [][] fusion = new boolean[4][4] ;  
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				fusion[i][j] =  true ;
//				System.out.println(fusion[i][j]);
			}
		}
		boolean iterate = true;
		while(iterate){
			iterate = false;
			for(int i=0;i<3;i++){
				for(int j=0;j<4;j++){
//					System.out.println(tab[i][j]);
					if((tab[i][j] == 0)){
						if(tab[i+1][j] != 0){
							tab[i][j] = tab[i+1][j];
							tab[i+1][j] = 0;
						iterate = true;
						}
						
					}else{
						if(tab[i][j] == tab[i+1][j]){
							if(fusion[i][j] && fusion[i+1][j]){
								tab[i][j] += tab[i+1][j];
								tab[i+1][j] = 0;
								iterate = true;
								fusion[i][j]  = false;
							}							
						}
					}
				}
			}
		}
		return tab;

	}
	
//	function to go down
	public static  int[][] down(int[][] tab){
		boolean [][] fusion = new boolean[4][4] ;  
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				fusion[i][j] =  true ;
//				System.out.println(fusion[i][j]);
			}
		}
		boolean iterate = true;
		while(iterate){
			iterate = false;
			for(int i=3;i>0;i--){
				for(int j=0;j<4;j++){
//					System.out.println(tab[i][j]);
					if((tab[i][j] == 0)){
						if(tab[i-1][j] != 0){
							tab[i][j] = tab[i-1][j];
							tab[i-1][j] = 0;
						iterate = true;
						}
						
					}else{
						if(tab[i][j] == tab[i-1][j]){
							if(fusion[i][j] && fusion[i-1][j]){
								tab[i][j] += tab[i-1][j];
								tab[i-1][j] = 0;
								iterate = true;
								fusion[i][j]  = false;
							}							
						}
					}
				}
			}
		}
		return tab;

	}
	

}
