import java.util.*;
public class sommes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cas;
		int val;
		int cases=sc.nextInt();
		for (int i = 0; i < cases; i++) {
			cas = sc.nextInt();
			val =sc.nextInt();
			System.out.println(cas+" "+S1(val)+" "+S2(val)+" "+S3(val));
		}
		//System.out.println(S3(1001));
		

	}
	public static int S1(int n){ // somme nombre positif
		return (n) * (1+n)/2;
	}
	public static int S2(int n){ // somme nombres impaires
		int i=0;
		int val=1;
		int somme =0;
		while(i<n){
			somme +=val;
			val+=2;
			i++;
		}
		return somme ;
		
	}
	public static int S3(int n){ // somme nombre paires
		int i=0;
		int val=2;
		int somme =0;
		while(i<n){
			somme +=val;
			val+=2;
			i++;
		}
		return somme ;
	}

}
