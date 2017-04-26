import java.util.*;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String line;
		while(sc.hasNextDouble()){
			long p = sc.nextLong();
			long s = sc.nextLong();
			
			long  out = Math.abs(p-s);
			System.out.println(out);
		}

		

	}

}
