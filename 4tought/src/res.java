import java.util.*;
public class res {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lire = new Scanner(System.in);
		String sms = "" ;
		
		int entre;		
		int nbtests = lire.nextInt();
		//int[] entres = new int[nbtests];;
		int f = 0;
//	while (f < nbtests){
//			entres[f] = lire.nextInt();
//			f++;
//		}
//		f= 0;
		while (nbtests > 0){
			entre = lire.nextInt();
			boolean test = false;
			String[] operateurs = {"*","+","-","/"};
			int retour ;
			
			for(int i=0; i< operateurs.length ; i++  ){
				for(int j=0; j< operateurs.length ; j++ ){
					for(int k=0; k< operateurs.length ; k++  ){
						retour = evaluate(operateurs[i],operateurs[j],operateurs[k]);
						if((retour == entre) && !test){
							sms = "4 "+operateurs[i]+" 4 "+operateurs[j]+" 4 "+operateurs[k]+" 4 = "+ retour;
						test =  true;
//           		System.out.println(sms);
						}
					}
				}	
			}
			if(test){
				System.out.println(sms);
				}else{
					System.out.println("no solution");
				}
			
		
			nbtests-- ;
		}
//	 System.out.println(evaluate("*","-","+"));
		
	}
	public static int evaluate(String a,String b,String c){
		int left,right;
		if(a == "*" || a == "/"){
			left = calc(4,4,a);
			if(b == "*" || b == "/"){
				left = calc(left,4,b);
				return calc(left,4,c);
			}else{
				if(c == "*" || c == "/"){
					right = calc(4,4,c);
					return calc(left,right,b);
				}else{
					left = calc(left,4,b);
					
					return calc(left,4,c);
				}
			}
		}else{
			if(b == "*" || b == "/"){
				if(c == "*" || c == "/"){
					left = calc(4,4,b);
					right = calc(left,4,c);
					return calc(4,right,a);
				}else{
					right = calc(4,4,b);
					left = calc(4,right,a);
					return calc(left,4,c);
				}
				
			}else{
				if(c == "*" || c == "/"){
                  left = calc(4,4,a);
                  right = calc(4,4,c);
                  return calc(left,right,b);
				}else{
					left = calc(4,4,a);
					left = calc(left,4,b);
					return calc(left,4,c);
				}
			}
		}

	}
	public static int calc (int a,int b ,String op){
		
		
		switch(op){
		case "+":
			return a + b;

		case "-":
			return  a - b;
		case "*":
			return a * b;
		case "/":
			return (int)Math.floor(a / b);
		default :return 0;	
			
		} 
	}
	

}
