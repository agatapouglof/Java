import java.util.*;
public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] abc = new int[3];
		int temp;
        String ch;
		String res="";
		String bac="";
	
			for(int i=0;i<3;i++){//lecture des valeurs donnees
				
				abc[i] = sc.nextInt();
			}
			sc.nextLine();
			bac = sc.nextLine();
//			System.out.println(bac);		
			for(int i=0;i<2;i++){//lecture des valeurs donnees
				for(int j=1;j<3;j++){
					if(abc[i] > abc[j]){
						temp = abc[i];
						abc[i] = abc[j];
						abc[j] = temp;
					}
				}
			}
			

			ch = String.valueOf(bac.charAt(0));
			res = ""+abc[render(ch)];
			for(int i=1;i<3;i++){
				bac.charAt(i);
				ch = String.valueOf(bac.charAt(i));
				res = res+" "+abc[render(ch)];
				
			}
			System.out.println(res);
			

	}
	public static int render(String val){
		switch(val){
		case "A" : return 0;				
		case "B" : return 1; 
		case "C": return 2; 
		default : return 0; 
		}
	}

}