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
		System.out.println("������ B :");
		int b = stdIn.nextInt();
		
		if(a>b) {
			int t = b;
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
			System.out.println(factorial);
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
		}while(n<0);
		
		for(int z=n; z>=0; z--) {
			System.out.println(z);
		}
		
		//���� 4-12. �� ������ �ݴ�� 0���� ī��Ʈ��
		System.out.println("ī��Ʈ��@_@");
		do {
			System.out.println("���� �������� �Է��ϼ���.");
			n=stdIn.nextInt();
		}while(n<0);
		
		for(int c=0; c<=n; c++) {
			System.out.println(c);
		}
		
		//���� 4-13. 1���� n���� ��(for��)
		System.out.println("1���� n���� ���� ���մϴ�.");
		do {
			System.out.println("n�� ��");
			n=stdIn.nextInt();
		}while(n<0);
		
		int sum = 0;
		
		for(int c=0; c<=n ;c++) {
			sum += c;
		}
		
		System.out.println("1����"+n+"������ ���� "+sum+"�Դϴ�.");
		
		//���� 4-14. ���� ������ ���ı��� �������� ����
		System.out.println("1���� n���� ���� ���մϴ�.");
		do {
			System.out.println("n�� ��");
			n=stdIn.nextInt();
		}while(n<0);
		
		sum = 0;
		
		
		for(int c=1; c<n ;c++) {
			System.out.print(c+"+");
			sum += c;
		}
		System.out.print(n + "=");
		sum+=n;
		System.out.println(sum);
		
		//���� 4-15. ���庰 ǥ�� ü�� ����ǥ ǥ��
		//ǥ��ü�� = (���� - 100) x 0.9
		System.out.println("�ּ� �� cm ?");
		int hMin = stdIn.nextInt();
		System.out.println("�ִ� �� cm ?");
		int hMax = stdIn.nextInt();
		System.out.println("�� cm ���� ?");
		int step = stdIn.nextInt();
		
		System.out.println("-----���� ü��ǥ-----");
		
		for(int t=hMin; t<=hMax; t+=step) {
			System.out.println("Ű :"+t +"ü�� :"+(t-100)*0.9);
		}
		
		//���� 4-16 ���� ���� * �� ǥ���ϴµ� 5���� ������ �ٹٲ��� ���ش�
		System.out.println("*�� � ǥ���ұ��?");
		n= stdIn.nextInt();
		
		if(n>0) {
			for(int z=0; z<n; z++) {
				System.out.print("*");
				if(z%5==4) {
					System.out.println();
				}
			}
			
//			for(int z=0; z<n/5; z++)
//				System.out.println("*****");
//			int rest = n%5;
//			if(rest>0) {
//				for(int z=0; z<rest; z++)
//					System.out.print("*");
//			}
			
		}
		System.out.println();
		
		//���� 4-17.�Է��� ���� ���� ��� ��� ǥ�� 
		System.out.println("������");
		n = stdIn.nextInt();
		int count=0;
		for(int z=1; z<=n; z++) {
			if(n%z==0) {
				System.out.print(z);
				count++;
			}
		}
		System.out.println("\n����� ������ "+count+"�� �Դϴ�.");
		
		//���� 4-18. 1���� n������  ����
		System.out.println("��� ���� �Է��ϼ���.");
		n = stdIn.nextInt();
		
		for(int z=1; z<=n; z++) {
			System.out.println(z+"�� ������"+z*z+"�Դϴ�.");
		}
		
		//���� 4-19. �Է��� ���� ����ǥ��
		System.out.println("������ ã���ϴ�.");
		retry=0;
		do {
			int month ;
			do {
				System.out.println("����ΰ���?");
				month =stdIn.nextInt();
			}while(month<1 || month>12);
			
			if(month >= 3 && month <= 5) {
				System.out.println("������~���̿Գ׿�.");
			}else if(month >= 6 && month <= 8) {
				System.out.println("���������� :)");
			}else if(month >= 9 && month <= 11) {
				System.out.println("����&_&");
			}else if(month == 12 || month == 1|| month == 2) {
				System.out.println("�ܿ�*_*");
			}
			
			System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�? yes-1 no-2");
			retry = stdIn.nextInt();
		}while(retry ==1);
		
		
		//���� 4-20. ��������ǥ��
		System.out.println("�������� ǥ���մϴ�.");
		System.out.println("�ܼ� : ?");
		n = stdIn.nextInt();
		
		for(int z = 0; z<=n; z++) {
			for(int y = 0; y<=n; y++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
		//���� 4-21. ���ʾƷ��� ������ �̵ �ﰢ��
		System.out.println("���ʾƷ���  ������ �̵ �ﰢ��");
		System.out.println("�ܼ� : ?");
		n = stdIn.nextInt();
		
		for(int z = 0; z<=n; z++) {
			for(int y = 0; y<=z; y++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
		System.out.println("��������  ������ �̵ �ﰢ��");
		System.out.println("�ܼ� : ?");
		n = stdIn.nextInt();

		for (int z = 0; z < n; z++) {
			for (int y = 0; y < z; y++) {
				System.out.print(" ");
			}
			for (int p = 0; p < n - z; p++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ���� 4-23.�Ƕ�̵带 ǥ��
		//i��°�� (i-1)*2+1����  *�� ǥ��  ������ n��° �࿡�� (n-1)*2+1 ���� *�� ǥ�� 
		System.out.println("�Ƕ�̵带 �����ƿ�~_~");
		System.out.println("�ܼ� : ?");
		n = stdIn.nextInt();

		for (int z = 1; z <= n; z++) {
			for (int y = 1; y <= n - z; y++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= 2 * z - 1; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// ���� 4-24. n���� ���� �Ƕ�̵带 ǥ�� , i��°�࿡�� i%10�� ǥ��
		System.out.println("n�� �Ƕ�̵带 �����ƿ�~_~");
		System.out.println("�ܼ� : ?");
		n = stdIn.nextInt();

		for (int z = 1; z <= n; z++) {
			for (int y = 1; y <= n - z; y++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= 2 * z - 1; y++) {
				System.out.print(z%10);
			}
			System.out.println();
		}
		
		//���� 4-25. ���� ������ �о �Ҽ����� ���� 
		//�Ҽ� : 2�̻� n �̸���  ���� � ���ε� �����������ʴ� ������
		System.out.println("-�Ҽ����� ����-");
		System.out.println("2�̻��� ���� ���� : ?");
		n = stdIn.nextInt();
		int z;
		for(z=1; z<=n; z++) {
			if(n%z==0) {
				break;		
			}
		}
		if(z==n) {
			System.out.println("�Ҽ��� �½��ϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		
		
		//���� 4-26. �������� ���� ���������� �հ�� ����� ǥ�� 0�Է½� ����
		System.out.println("������ �հ�� ���");
		System.out.println("��� ������ �Է¹������?");
		n = stdIn.nextInt();
		
		sum=0;
		for(z=0; z<n; z++) {
			System.out.println("����(0�� �Է��ϸ� ����)");
			sum += stdIn.nextInt();
			
			if(sum == 0) 
			break;
		}
		
		System.out.println("�Է��� ������ ���� "+ sum + "�Դϴ�.");
		if(n!=0)
			System.out.println("�Է��� ������ ����� "+ sum/n + "�Դϴ�.");
		
		//���� 4-27. �������� �о �հ�� ����� ���ϰ� �������� �Է��� 1,000�� �����ʵ���
		System.out.println("������ ���մϴ�.");
		System.out.print("��� ���ұ��?");
		n = stdIn.nextInt();
		int t;
		sum = 0;
		for(i =0; i<n; i++) {
			System.out.println("���� :");
			t =stdIn.nextInt();
			if(sum+t > 1000) {
				System.out.println("������ �հ谡 1000�� �Ѿ����ϴ�. ������ ���� �����մϴ�.");
				break;
			}
			sum+=t;
		}
		System.out.println("�Է��� ������ ���� "+ sum + "�Դϴ�.");
		if(n!=0)
			System.out.println("�Է��� ������ ����� "+ sum/n + "�Դϴ�.");
		
	}

}
