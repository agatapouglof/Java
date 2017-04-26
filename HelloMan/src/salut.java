
import java.util.*;
public class salut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lire = new Scanner(System.in);
		String nm;
//		String name = lire.nextLine();
//		while(!name.equals(".")){
//			System.out.println("Hello "+name +".");
//			name = lire.nextLine();
//		}
		ArrayList arlist = new ArrayList();
		nm = lire.nextLine();
				
		while(!nm.equals(".")){
			arlist.add("Hello "+nm+".");
			nm = lire.nextLine();
			}
		for(int i=0;i<arlist.size();i++){
			System.out.println(arlist.get(i));
		}
		
	}

}
