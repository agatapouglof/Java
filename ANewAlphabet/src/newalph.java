import java.util.*;
public class newalph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String alph  = "abcdefghijklmnopqrstuvwxyz";
		String res="";
		String phrase = sc.nextLine();
		phrase = phrase.toLowerCase();
		for(int i=0;i<phrase.length();i++){
			res += convert(phrase.charAt(i));
		}
    	System.out.println(res);
	}
	static String convert(char val){
		switch(val){
		case 'a': return "@";
		case 'b': return "8";
		case 'c': return "(";
		case 'd': return "|)";
		case 'e': return "3";
		case 'f': return "#";
		case 'g': return "6";
		case 'h': return "[-]";
		case 'i': return "|";
		case 'j': return "_|";
		case 'k': return "|<";
		case 'l': return "1";
		case 'm': return "[]\\/[]";
		case 'n': return "[]\\[]";
		case 'o': return "0";
		case 'p': return "|D";
		case 'q': return "(,)";
		case 'r': return "|Z";
		case 's': return "$";
		case 't': return "']['";
		case 'u': return "|_|";
		case 'v': return "\\/";
		case 'w': return "\\/\\/";
		case 'x': return "}{";
		case 'y': return "`/";
		case 'z': return "2";
		default :return ""+val;
		}
	}

}
