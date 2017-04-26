import java.util.*;
import java.text.DecimalFormat;
public class hub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int cases  ;
		ArrayList<Double>  lati = new ArrayList<>();
		ArrayList<Double>  longi = new ArrayList<>();
		double mx=0;// absicces moyenne des x
		double my=0; // ordonne moyenne des y
		double resx,resy;
		String RX,RY ;// result format in string .00
		double min; // distance minimale
		double dist; // distance d'un point a la moyenne
		while(sc.hasNext()){
			cases = sc.nextInt();
			mx=0;
			my=0;
			for(int i=0;i<cases;i++){
				lati.add(sc.nextDouble()) ;
				longi.add(sc.nextDouble());
//				longi[i] = sc.nextDouble();
				mx+= lati.get(i);
				my+=longi.get(i);
						
			}
			resx = lati.get(0);
			resy = longi.get(0);
			min = distance(resx,resy,mx,my);
			for(int j=0;j<cases;j++){
				dist = distance(lati.get(j),longi.get(j),mx,my);
	//			System.out.println(dist);
				if(dist <=  min){
					min = dist;
					resx = lati.get(j);
					resy = longi.get(j);
				}
			}
			RX = df.format(resx);
			RX = RX.substring(0,RX.length()-1);
			RY = df.format(resy);
			RY = RY.substring(0,RY.length()-1);
			System.out.println(RX+" "+RY);
			lati.clear();
			longi.clear();
		}
//		System.out.println(distance(1,1,2,2));

	}
	public static double distance(double x1,double y1,double x2,double y2){
//		return Math.sqrt(((y2 -y1)*(y2 -y1)) + ((x2-x1)*(x2-x1)));
		return Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2) ));
	}

}
