import java.util.ArrayList;
import java.util.Scanner;
public class scoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> time = new ArrayList<>();
		ArrayList<String> problem = new ArrayList<>();
		ArrayList<Boolean> valide = new ArrayList<>();
		String [] tab = new String[3];
		int nbproblems = 0;
		int tempsTotal  = 0;
		int test = sc.nextInt();
		while(test !=-1){
			sc.nextLine();
			time.add(test);
			problem.add(sc.nextLine());
			if(sc.nextLine() == "right"){
				valide.add(true);
			}else{
				valide.add(false);
			}   
			test = sc.nextInt();
			test = sc.nextInt();
//			time.clear();
//			problem.clear();
//			valide.clear();
		}
		System.out.println(valide.size());
		for(int i=0;i<valide.size();i++){
			if(valide.get(i)){
				nbproblems++;
				tempsTotal += time.get(i);
				for(int j=0;j<valide.size();j++){
					if(problem.get(i) == problem.get(j)){
						if(!valide.get(j)){
							tempsTotal -= 20;
						}
					}
				}
			}
		}
		System.out.println(nbproblems +" "+tempsTotal);
	}

}