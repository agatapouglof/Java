import java.util.Scanner;

public class ARealChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		double val = sc.nextDouble();
		val = Math.sqrt(val) * 4;
//		System.out.println(val);
        String test = ""+val;
        String [] valu = test.split(".");
//        System.out.println("lol");
		 int j =test.indexOf("."); 
		if( test.substring(j+1).equals("0")){
			System.out.println(test.substring(0,j));
		}else{System.out.println(val);}
		
	}

}
//8.94427190999915878564