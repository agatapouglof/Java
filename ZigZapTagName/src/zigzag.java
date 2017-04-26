import java.util.*;
public class zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String resultat = "a";
		String [] alphabet =   {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int i=0;i<26;i++){
			System.out.println(alphabet[i]);
			
		}
		calculate(0);

	}
	public static boolean calculate(int val){
		ArrayList<Integer> valu = new ArrayList<Integer>();
		int sum=0;
		
		while(sum != val){
			for(int i=0;i<26;i++){
				for(int j=0;j<valu.size()-1;j++){
					sum += Math.abs(valu.get(i)+1 - valu.get(i)+1);	
				}
				valu.set(valu.size()-1, i);
				if(i == 25){
					valu.add(0);
				}
			}
		}
		for(int i=0;i<26;i++){
			valu.add(i);			
		}
		for(int i=0;i<26;i++){
			System.out.println(valu.get(i));
			sum += valu.get(i);
			
		}
		System.out.println(sum);
		System.out.println(valu.size());
		return true;
	}

}
