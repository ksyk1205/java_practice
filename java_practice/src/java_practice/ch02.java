package java_practice;

import java.util.Scanner;

public class ch02 {
	//2��. �������
	public static void main(String[] args) {
		// ���� 1-1. 2���� ������ 82�� 17�� �հ� ���� ���ؼ� ǥ��
		System.out.println(82+17);
		System.out.println(82-17);
		
		System.out.println("82+17 = "+ (82+17));
		System.out.println("82-17 = "+(82-17));
		
		// ����1-2. 2���� ���� x,y �հ� ����� ǥ��
		int x;
		int y;
		
		x = 63;
		y = 57;
		
		System.out.println("x���� "+x+"�Դϴ�.");
		System.out.println("y���� "+y+"�Դϴ�.");
		
		System.out.println("�հ�� "+(x+y)+" �Դϴ�.");
		System.out.println("��մ� "+(x+y)/2+" �Դϴ�.");
		
		//���� 1-3. ���� ������ ���α׷��� �Ǽ����� ���� (�Ǽ����� ���� int�� X)
		double a;
		double b;
		
		a = 63.2;
		b = 57.3;
		
		System.out.println("a���� "+a+"�Դϴ�.");
		System.out.println("b���� "+b+"�Դϴ�.");
		
		System.out.println("�հ�� "+(a+b)+" �Դϴ�.");
		System.out.println("��մ� "+(a+b)/2+" �Դϴ�.");
		
		//���� 1-4. 3���� int�� ������ ���� ���� �����ؼ� �հ�� ����� ǥ��
		
		int q,w,e ;
		int sum;
		
		q = 63;
		w = 57;
		e = 12;
		
		sum = q+w+e;
		System.out.println("q���� "+q+"�Դϴ�.");
		System.out.println("w���� "+w+"�Դϴ�.");
		System.out.println("e���� "+e+"�Դϴ�.");
		
		System.out.println("�հ�� "+sum+" �Դϴ�.");
		System.out.println("��մ� "+sum/3+" �Դϴ�.");
		
		//���� 1-5. Ű���忡 �Է��� �������� ǥ���ϴ� ���α׷��� �ۼ�
		Scanner stdIn =new Scanner(System.in);
		
		System.out.println("������ : ");
		int s = stdIn.nextInt();
		System.out.println(s+"�� �Է��߽��ϴ�.");
		
		//���� 1-6. Ű���忡�� �Է��� �������� 10�� ���� ���� 10 �� ���� ���
		Scanner scaIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		s = scaIn.nextInt();
		
		System.out.println("10�� ���� ���� : "+(10+s));
		System.out.println("10�� �A ���� : "+(s-10));
		
		//���� 1-7. Ű���忡�� �Է��� ���������� ������ �ڸ����� ������ ���� ������ �ڸ��� ���� ǥ��
		//Scanner scaIn2 = new Scanner(System.in);
		System.out.println("������ : ");
		s = scaIn.nextInt();
		
		System.out.println("������ �ڸ����� ������ �� : "+(s/10));
		System.out.println("������ �ڸ��� �� : "+(s%10));
		
		//���� 1-8. 2�� �Ǽ����� �Է¹޾� �� �հ� ���
		System.out.println("�Ǽ� c�� : ");
		double c = scaIn.nextDouble();
		
		System.out.println("�Ǽ� v�� : ");
		double v = scaIn.nextDouble();
		
		System.out.println("�հ�� : " +(c+v));
		System.out.println("����� : " +(c+v)/2);
		
		//���� 1-9. �ﰢ���� �غ��� ���̸� �Է¹޾� �ﰢ���� ���̸� ���Ͻÿ�
		System.out.println("�ﰢ���� ���̸� ���մϴ�.");
		System.out.println("�غ� : ");
		int width = scaIn.nextInt();
		System.out.println("���� : ");
		int height = scaIn.nextInt();
		
		System.out.println("���̴� : "+(width*height/2));
		
		//���� 1-10. ���� �ѳ��̿� ���Ǹ� ���ϴ� ���α׷�
		final double PI = 3.1416;
		System.out.println("���� �ѳ��̿� ���Ǹ� ���մϴ�.");
		
		System.out.println("������ :");
		double r =scaIn.nextDouble();
		
		System.out.println("�ѳ��̴� : "+(4*PI*r*r));
		System.out.println("���Ǵ� : "+(4/3.0*PI*r*r*r));
	}

}
