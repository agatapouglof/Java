import java.util.*;
public class rijeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stubw
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
//		System.out.println(fibo(0,1,nb)+" "+fibo(1,1,nb));
		int a=0;
		int b=1;
		int a1=1;
		int b1=1;
		int temp;
		if(nb==1){
			System.out.println(a+" "+b);
		}else{
			for(int i=2;i<nb;i++){
				temp = a1;
				a1=a+a1;
				a=temp;
				temp= b1;
				b1+=b;
				b=temp;
			}
			System.out.println(a1+" "+b1);

		}

		
	}
	public static int fibo(int a,int b,int n){
		if(n==1){
			return a;
		}else{
			if(n==2){
				return b;
			}else{
				return fibo(a,b,n-1) + fibo(a,b,n-2);
			}
		}
	}

}
