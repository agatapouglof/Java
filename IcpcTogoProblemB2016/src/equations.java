import java.util.*;

import java.text.DecimalFormat;
public class equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [] equation1 = new double [3];
		double[] equation2 = new double[3];
		String [] valstr1 = new String[3];
		String [] valstr2 = new String[3];
		int cases = sc.nextInt();
		sc.nextLine();
		for(int f=1;f<=cases;f++){
			
			
			String eq1 = sc.nextLine();
			String eq2 = sc.nextLine();
			System.out.println("Equation "+f);

	
			 valstr1[0] = eq1.substring(0, eq1.indexOf("x"));
			 valstr1[1] = eq1.substring(eq1.indexOf("+")+2, eq1.indexOf("y"));
			 valstr1[2] = eq1.substring(eq1.indexOf("=")+2);
			for(int i=0;i<3;i++){
				equation1[i] = Integer.parseInt(valstr1[i]);
			}
			 valstr2[0] = eq2.substring(0, eq2.indexOf("x"));
			 valstr2[1] = eq2.substring(eq2.indexOf("+")+2, eq2.indexOf("y"));
			 valstr2[2] = eq2.substring(eq2.indexOf("=")+2);
			for(int i=0;i<3;i++){
				equation2[i] = Double.parseDouble(valstr2[i]);
			}
	//		for(int i=0;i<3;i++){
	//			System.out.println(equation1[i]);
	//			System.out.println(equation2[i]);
	//		}
			double D = Det(equation1[0],equation1[1],equation2[0],equation2[1]);
			double Dx = Det(equation1[2],equation1[1],equation2[2],equation2[1]);
			double Dy = Det(equation1[0],equation1[2],equation2[0],equation2[2]);
	//		System.out.println(D);
	//		System.out.println(Dx);
	//		System.out.println(Dy);
			
			if((D == 0.0) && (Dx == 0.0) && (Dy == 0.0)){
				System.out.println("More than one solution.");
			}else{
				if((D == 0)){
					System.out.println("No solution.");
				}else{
					
					double x = Dx / D;
					if(x== -0.00){x=0;}
					double y =Dy / D;
					if(y== -0.00){y=0;}
					DecimalFormat df = new DecimalFormat("0.0000000");  
					String xx  = df.format(x);
					xx  = xx.substring(0,xx.length()-1);
					String yy  = df.format(y);
					yy  = yy.substring(0,yy.length()-1);
	//				DecimalFormat df1 = new DecimalFormat("#.##");  
					System.out.println("x = "+xx+" y = "+yy);
				}
			}
			if(f!=cases){System.out.println("");}
		
		}
	}
	
	public static double Det (double a,double b,double c,double d){
		return a*d - b*c;
	}
	

}
