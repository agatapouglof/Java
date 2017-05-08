import java.util.Scanner;

public class pot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int val,ret;
		long som=0;
		for (int i = 0; i < cases; i++) {
			val = sc.nextInt();
			ret = val % 10;
			val/=10;
			som += (long)Math.pow(val, ret);			
		}
		System.out.println(som);
		sc.close();
	}

}
