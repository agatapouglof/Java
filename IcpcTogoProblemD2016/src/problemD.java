import java.util.*;
public class problemD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int cases,a,b,render;
		cases = sc.nextInt();
		for(int i=0;i<cases;i++){
			sc.nextInt();
			sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			render = sc.nextInt();
			a = Math.abs(a-render);
			render = sc.nextInt();
			b = Math.abs(b-render);
			render = a+b;
			System.out.println(render);
		}

	}

}
