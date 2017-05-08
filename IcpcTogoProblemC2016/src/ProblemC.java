import java.util.*;
public class ProblemC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cycles = new ArrayList();
		int cases = sc.nextInt();
		long nombre,temp;
		String string_case,tempo;
		sc.nextLine();
		boolean test;
		for(int i = 0 ; i < cases ; i++){

			string_case = sc.nextLine();
			nombre = Long.parseLong(string_case);
			for(int j=0;j<string_case.length();j++){
				tempo = string_case.substring(j) + string_case.substring(0, j);
				//System.out.println("tempo :"+tempo);
				cycles.add(tempo);
			}
//			System.out.println("break");
			test = true;
			for(int j=1;j<string_case.length()-1;j++){
				temp = nombre * (j);
				tempo = ""+temp;
				System.out.println("tempo :"+tempo);
				if(!cycles.contains(tempo)){
					test =false;
				}
			}
			if(test){
				System.out.println(nombre +" is cyclic");
			}else{
				System.out.println(nombre +" is not cyclic");
			}
			
			cycles.clear();
		}
		
	}

}
