package java_practice;

import java.util.Scanner;

public class ch03 {
	//3�� ���α׷��� �帧 : �б� 
	public static void main(String[] args) {
		// ���� 3-1. Ű����� �Է��� �������� ���̸� ���� ���̶�� ǥ��
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ : ");
		int a = scan.nextInt();
		if(a<0) {
			System.out.println("�Է��� �������� ����Դϴ�.");
		}
			
		//���� 3-2. �������� �Է¹޾� ������ ǥ��
		System.out.println("������ : ");
		int b = scan.nextInt();
		
		if(b<0) {
			b = -b;
		}			
		System.out.println("�Է��� �������� ������" +b+"�Դϴ�.");
		
		//���� 3-3. �Է¹��� ������A�� B�� ������� �Ǻ�
		
		System.out.println("���� A : ");
		int A = scan.nextInt();
		System.out.println("���� B : ");
		int B = scan.nextInt();
		
		if(B%A == 0) {
			System.out.println("A�� B�� ����̴�.");
		}else {
			System.out.println("A�� B�� ����� �ƴϴ�.");
		}
		
		//���� 3-4. �Է¹��� �������� ��ȣ(���,����,0)�� �����Ͽ� ǥ��
		
		System.out.println("������ : ");
		int n = scan.nextInt();
		if(n>0) {
			System.out.println("����� �Է��Ͽ����ϴ�");
		}else if(n<0) {
			System.out.println("������ �Է��Ͽ����ϴ�");
		}else if(n==0) {
			System.out.println("0���� �Է��Ͽ����ϴ�");
		}
			
		//���� 3-5. ���� a,b�� �Է¹޾� ��Ұ��� ǥ��
		System.out.println("���� a : ");
		a = scan.nextInt();
		System.out.println("���� b : ");
		b = scan.nextInt();
		
		if(a<b) {
			System.out.println("b�� ũ��");
		}else if (a>b) {
			System.out.println("a�� ũ��");
		}else {
			System.out.println("a��b�� ����");
		}
		
		//���� 3-6. �Է¹��� �������� ��������� 5�� ������������� ǥ��
		System.out.println("������ : ");
		n= scan.nextInt();
		if(n%5 == 0) {
			System.out.println("�Է¹��� ���� 5�� ������ ��������");
		}else {
			System.out.println("�Է¹��� ���� 5�� ������ ���������ʴ´�.");
		}
		
		//���� 3-7. �Է¹��� �������� 10�� ������� ǥ��
		System.out.println("������ : ");
		n= scan.nextInt();
		if(n>0) {
			if(n%10 == 0) {
				System.out.println("�Է¹��� ���� 10�� ����̴�");
			}else {
				System.out.println("�Է¹��� ���� 10�� ����� �ƴ�");
			}
		}else {
			System.out.println("n�� �����Դϴ�.");
		}
		
		//���� 3-8. �Է��� ���������� ��/��/��/��/���� ����
		System.out.println("���� : ");
		int score = scan.nextInt();
		
		if(score>=0 && score<=49) {
			System.out.println("��");
		}else if(score>=50 && score<=59) {
			System.out.println("��");
		}else if(score>=60 && score<=69) {
			System.out.println("��");
		}else if(score>=70 && score<=79) {
			System.out.println("��");
		}else if(score>=80 && score<=100) {
			System.out.println("��");
		}else {
			System.out.println("�߸��� ������ �Է��Ͽ����ϴ�.");
		}
		
		//���� 3-9. 2���� �Ǽ��� �߿� ū���� ǥ��
		System.out.println("�Ǽ� C : ");
		double C = scan.nextInt();
		System.out.println("�Ǽ� D : ");
		double D = scan.nextInt();
		
		double max ;
		if(C<D)
			max = D;
		else
			max = C;
		//max = a>b?a:b	
		System.out.println("ū ���� :" +max);
		
		
		
		
		
	}
	

}
