import java.util.Arrays;
import java.util.Scanner;
public class BurrowsWheeler {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String val,res ="";
		while(sc.hasNextLine()){
			val  = sc.nextLine();
			String[] revert = new String[val.length()];
			revert[0] = val.substring(1) + val.charAt(0);
			for (int i = 1; i < val.length(); i++) {
				revert[i] = revert[i-1].substring(1) + revert[i-1].charAt(0);
			}
			Arrays.sort(revert);
			for (int i = 0; i < revert.length; i++) {
				res+= revert[i].charAt(val.length()-1);
			}
			System.out.println(res);
			res="";
		}

	}

}
