package ch09;

import java.util.Scanner;

public class coordinateTester1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : ");
		double x = stdIn.nextDouble();
		System.out.print("Y좌표 : ");
		double y = stdIn.nextDouble();
		
		//입력받은 x,y를 가지고 인스턴스 p를 생성
		coordinate p = new coordinate(x, y);
		System.out.println("p = ( "+p.getX()+", "+p.getY()+")"); //getter를 사용해 좌표를 읽는다.
		
		//coordinate형 변수 q를 선언 , p의 인스턴스를 참고하도록 초기화
		coordinate q = p;
		q.set(9.9,9.9);//q의 참조대상 인스턴스에 값을 설정, p용으로  만들어진 인스턴스 값을 변경하는 것과 같다.
		System.out.println("q = ( "+q.getX()+", "+q.getY()+")"); //getter를 사용해 좌표를 읽는다.
		System.out.println("p = ( "+p.getX()+", "+p.getY()+")"); //getter를 사용해 좌표를 읽는다.
	}
}
