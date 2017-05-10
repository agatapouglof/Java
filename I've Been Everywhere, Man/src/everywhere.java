import java.util.ArrayList;
import java.util.Scanner;

public class everywhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lire = new Scanner(System.in);
		int cases,max,count;
		String val;
		ArrayList<String> tab = new ArrayList<>();
		cases = lire.nextInt();
		for (int i = 0; i < cases; i++) {
			max = lire.nextInt();
			lire.nextLine();
			count=0;
			
			for (int j = 0; j < max; j++) {
				val=lire.nextLine();
				if(!tab.contains(val)){
					tab.add(val);
					count++;
				}
			}
			tab.clear();
			System.out.println(count);
		}

	}

}
