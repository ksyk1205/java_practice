package ch09;

import java.util.Scanner;

public class coordinateTester1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("X��ǥ : ");
		double x = stdIn.nextDouble();
		System.out.print("Y��ǥ : ");
		double y = stdIn.nextDouble();
		
		//�Է¹��� x,y�� ������ �ν��Ͻ� p�� ����
		coordinate p = new coordinate(x, y);
		System.out.println("p = ( "+p.getX()+", "+p.getY()+")"); //getter�� ����� ��ǥ�� �д´�.
		
		//coordinate�� ���� q�� ���� , p�� �ν��Ͻ��� �����ϵ��� �ʱ�ȭ
		coordinate q = p;
		q.set(9.9,9.9);//q�� ������� �ν��Ͻ��� ���� ����, p������  ������� �ν��Ͻ� ���� �����ϴ� �Ͱ� ����.
		System.out.println("q = ( "+q.getX()+", "+q.getY()+")"); //getter�� ����� ��ǥ�� �д´�.
		System.out.println("p = ( "+p.getX()+", "+p.getY()+")"); //getter�� ����� ��ǥ�� �д´�.
	}
}
