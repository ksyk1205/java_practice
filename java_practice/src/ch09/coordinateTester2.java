package ch09;

import java.util.Scanner;

public class coordinateTester2 {
	
	static boolean comCoordinate(coordinate p, coordinate q) {
			return p.getX() == q.getX() && p.getY() == q.getY();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		double x,y;
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("X��ǥ :"); x = stdIn.nextDouble();
		System.out.print("Y��ǥ :"); y = stdIn.nextDouble();
		coordinate p = new coordinate(x, y);
		
		System.out.println("��ǥ q�� �Է��ϼ���.");
		System.out.print("X��ǥ :"); x = stdIn.nextDouble();
		System.out.print("Y��ǥ :"); y = stdIn.nextDouble();
		coordinate q = new coordinate(x, y);
		
		
		//���ϼ� ���� 
		System.out.println((p == q)?"p==q �Դϴ�.":"p!=q�Դϴ�.");
		System.out.println((p.getX() == q.getY())?"p�� q�� �����ϴ�.":"p�� q�� �ٸ��ϴ�.");
		System.out.println(comCoordinate(p,q)?"p�� q�� �����ϴ�." : "p�� q�� �ٸ��ϴ�.");
		
	}

}