package Solution_1924;

import java.util.Scanner;

class Victoria{
	char str[];
	void course(){
		System.out.println("Ciencia da Computacao");
	}
}

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		Victoria vctra = new Victoria();
		int t, i;
		
		t = sc.nextInt();
		for (i=1; i<=t; i++){
			vctra.str = sc.nextLine().toCharArray();
		}
		vctra.course();
	}
}