package Solution_1914;
/*
 * Author :~ Hasibul Islam
 */
import java.util.Scanner;

class WhoseTurnIsIt{
	String parimpar[] = new String[4]; //to input string 
	int n[] = new int[2];
	int decidewinner(){ //to prepare the summation of two integer value
		int sum;
		sum = n[0] + n[1];
		return sum%2; 
		//return remainder to find is the summation of integer is even or odd
	}
	String winner(int dw){ 
		//prepare the winner of the game.
		if (dw == 0 && parimpar[1].equals("PAR")){
			return parimpar[0];
		}
		else if (dw == 0 && parimpar[3].equals("PAR")){
			return parimpar[2];
		}
		else if (dw==1 && parimpar[1].equals("IMPAR")){
			return parimpar[0];
		}
		else {
			return parimpar[2];
		}
	}
}

public class Main {
	private static Scanner sc;
	private static WhoseTurnIsIt wtit;
	public static void main (String[] args){
		sc = new Scanner(System.in); 
		wtit = new WhoseTurnIsIt();
		int t, i, j;
		t = sc.nextInt();
		
		for (j=0; j<t; j++){
			for (i=0; i<4; i++){
				wtit.parimpar[i] = sc.next(); //input string data
			}
			wtit.n[0] = sc.nextInt();
			wtit.n[1] = sc.nextInt(); //input integer number
			
			System.out.println(wtit.winner(wtit.decidewinner())); //finally print out result
		}
		System.exit(0);
	}
}