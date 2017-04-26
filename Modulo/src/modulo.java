import java.util.*;
public class modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int val;
		int compte=0;
		for(int i=0;i<10;i++){
			val = sc.nextInt();
			val = val % 42;
			if(!list.contains(val)){
				list.add(val);
				compte++;
			}
		}
		System.out.println(compte);
	}

}
