package ch09;

import java.util.Scanner;

public class coordinateTester2 {
	
	static boolean comCoordinate(coordinate p, coordinate q) {
			return p.getX() == q.getX() && p.getY() == q.getY();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		double x,y;
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 :"); x = stdIn.nextDouble();
		System.out.print("Y좌표 :"); y = stdIn.nextDouble();
		coordinate p = new coordinate(x, y);
		
		System.out.println("좌표 q를 입력하세요.");
		System.out.print("X좌표 :"); x = stdIn.nextDouble();
		System.out.print("Y좌표 :"); y = stdIn.nextDouble();
		coordinate q = new coordinate(x, y);
		
		
		//동일성 판정 
		System.out.println((p == q)?"p==q 입니다.":"p!=q입니다.");
		System.out.println((p.getX() == q.getY())?"p와 q가 같습니다.":"p와 q가 다릅니다.");
		System.out.println(comCoordinate(p,q)?"p와 q가 같습니다." : "p와 q는 다릅니다.");
		
	}

}