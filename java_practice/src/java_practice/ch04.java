package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch04 {
	//4��. ���α׷��� �帧 : �ݺ�
	public static void main(String[] args) {
		// ���� 4-1. ���� �������� ��ȣ�� �����ؼ� ǥ��(���ϴ� ��ŭ �ݺ�)
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.println("������ : ");
			int n = stdIn.nextInt();
			
			if(n > 0) {
				System.out.println("�Է��� ���� ��� �Դϴ�");
			}else if(n < 0) {
				System.out.println("�з��� ���� �����Դϴ�.");
			}else {
				System.out.println("�Է��� ���� 0�Դϴ�.");
			}
			
			System.out.println("�ٽ� �ѹ� �Է��Ͻðڽ��ϱ�? yes - 1 , no - 2" );
			retry = stdIn.nextInt();
			/*do { //1�� 2�� �Է��� �� �ֵ��� 
				System.out.println("�ٽ� �ѹ� �Է��Ͻðڽ��ϱ�? yes - 1 , no - 2" );
				retry = stdIn.nextInt();
			}while(retry!=1 || retry !=2);*/
		}while(retry == 1); //while ~�ϴ� ���ȿ� do �����ض�.
		
		//���� 4-2. 3�ڸ� ���� ������ �б� �ƴϸ� �ٽ� �Է��ϵ��� �ϱ�
		int x; //�д� ��
		
		do {
		 System.out.println("3�ڸ� �������� �Է��Ͻÿ�.");
		 x = stdIn.nextInt();
		}while( x<100 || x>999);
		
		System.out.println("�Է��� ���� 3�ڸ� �������Դϴ�.");
		
		//���� 4-3. 2�ڸ� ������(10~99)�� ���ߴ� ���ڸ��߱� ����(���� ������ if��,do���� ����� ��)
		System.out.println("���� ���߱� ���� ����~ :) ");
		System.out.println("10���� 99������ ���ڸ� ���߽ÿ�. ");
		Random ran = new Random();
		int no = 10 + ran.nextInt(90);
		
		do {
			System.out.println("� �����ϱ��?");
			x = stdIn.nextInt();
		}while( x != no); //������ �ƴϸ� �ݺ�
		
		System.out.println("�����Դϴ�.");
		
		//���� 4-4. 2���� �������� �о� �����ͺ��� ������� ǥ�� 
		System.out.println("������ A :");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(a>b) {
			int t = a;
				b = a;
				a = t; 
		}
		
		System.out.println("���� �������" +a +" < "+b); 
		
		//���� 4-5.�Է¹��� �������� 0���� ī��Ʈ�ٿ� ǥ��
		System.out.println("ī���ٿ� !!!!!!!!!!!");
		
		do {
			System.out.println("���� ������ : ");
			x = stdIn.nextInt(); 
			
		}while(x <= 0);
		//do�� ����  �� x�� �ݵ�� ���� ��
		
		while(x>=0)
			System.out.println(x--);
			// x-- x���� ǥ���� �� ���� / --x x���� ������ �� ǥ�� 
			System.out.println("x�� ���� "+ x +"�� �ƽ��ϴ�.");
			
		//���� 4-6. �Է��� ���� ������ŭ '*'�� ǥ��(���������� �ٹٲ� ������� / ���� ���� 1�����̸� �ٹٲ� ǥ�� X
		System.out.println("*�� � ǥ���ұ��~?");
		x=stdIn.nextInt();
		
		if(x > 0) {
			 int i = 0;
			 while(i<x) {
				 System.out.print("*");
				 i++;
			 }
			System.out.println();
			
		}
		
		//���� 4-7. ���� ������ŭ *�� +�� ����� ǥ��
		System.out.println("��� ǥ���ұ��?(*,+)");
		x=stdIn.nextInt();
		
		if(x > 0) {
			 int i = 0;
			 while(i<x) {
				 if(i%2 == 0) {
					 System.out.print("*");
				 }else {
					 System.out.print("+");
				 }
				 
				 i++;
			 }
			System.out.println();
			
		}
		
		//���� 4-8. ������������ �о �ڸ���ǥ��
		System.out.println("���� �������� �ڸ����� ǥ���մϴ�.");

		//���� ���� �Է¹ޱ�.
		do {
			System.out.println("���� ������ :");
			x=stdIn.nextInt();
		}while( x <= 0 );
		
		int digit = 0 ;
		while(x>0) {
			digit++;
			x/=10;
		}
		System.out.println("�Է��� ���ڴ� "+digit+"�ڸ��Դϴ�.");
		
		//���� 4-9. ���� ������ n���о 1���� n������ ���� ���Ͻÿ�.
		//���� ���� �Է¹ޱ�.
		int n;
		do {
			System.out.println("���� ������ :");
			n=stdIn.nextInt();
		}while( n <= 0 );
		
		int factorial = 1;
		int i = 1;
		
		while(i <= n) {
			factorial *= i;
			i++;
		}
		System.out.println("1����"+n+"������ �� : "+factorial);
				
		//���� 4-10. ���� ������ŭ *ǥ�� (for��)
		System.out.println("��� *�� ǥ���ұ��~?");
		n=stdIn.nextInt();
		
		if(n>0) {
			for(int t=0; t<n; t++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//����  4-11. ���� �������� 0���� ī��Ʈ�ٿ�(for��)
		System.out.println("ī��Ʈ�ٿ� !_!");
		do {
			System.out.println("���� �������� �Է��ϼ���.");
			n=stdIn.nextInt();
		}while(n>0);
		
		for(; x>=0; x--) {
			System.out.println(x);
		}
		
		//���� 4-12. �� ������ �ݴ�� 0���� ī��Ʈ��
		System.out.println("ī��Ʈ��@_@");
		do {
			System.out.println("���� �������� �Է��ϼ���.");
			n=stdIn.nextInt();
		}while(n>0);
		
		for(int c=0; c<=n; c++) {
			System.out.println(c);
		}
		
		//���� 4-13. 1���� n���� ��(for��)
		System.out.println("1���� n���� ���� ���մϴ�.");
		do {
			System.out.println("n�� ��");
			n=stdIn.nextInt();
		}while(n>0);
		
		int sum = 0;
		
		for(int c=0; c<=n ;c++) {
			sum += c;
		}
		
		System.out.println("1����"+n+"������ ���� "+sum+"�Դϴ�.");
		

		

	}

}
