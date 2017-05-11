import java.util.Scanner;

public class zamka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L,D,X;
		L  = sc.nextInt();
		D = sc.nextInt();
		X = sc.nextInt();
		int i;
		for (i=L; i <= D; i++) {
			if(sum(i) == X){
				break;
			}
		}
		System.out.println(i);
		for (i=D; i >= L; i--) {
			if(sum(i) == X){
				break;
			}
		}
		System.out.println(i);
//		System.out.println(sum(10000));
		
	}
	static int sum(int a){// sum of digits of an integer
		int res=0;
		while(a>0){
		res += a % 10;
		a /= 10;
		}
		res +=a;
		return res;
	}

}
