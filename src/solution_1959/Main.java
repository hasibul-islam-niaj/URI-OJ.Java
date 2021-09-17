package solution_1959;

import java.util.Scanner;

class RegularSimplePolygons{
	long n;
	int l;
	long Polygons(){
		return l*n;
	}
}

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		RegularSimplePolygons rsp = new RegularSimplePolygons();
		
		rsp.n = sc.nextLong();
		rsp.l = sc.nextInt();
		System.out.println(rsp.Polygons());
	}
}
