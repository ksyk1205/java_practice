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
		

	}

}
