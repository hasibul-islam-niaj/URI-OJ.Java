package solution_1930;

import java.util.Scanner;

class ElectricalOutlet{
	short a;
	short b;
	short c;
	short d;
	int ConnectedDevice(){
		return a+b+c+d-3;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ElectricalOutlet eo = new ElectricalOutlet();
		eo.a = sc.nextShort();
		eo.b = sc.nextShort();
		eo.c = sc.nextShort();
		eo.d = sc.nextShort();
		System.out.println(eo.ConnectedDevice());
	}
}
