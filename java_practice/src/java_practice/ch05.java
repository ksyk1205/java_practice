package java_practice;

import java.util.Scanner;

public class ch05 {
	//5�� �⺻�ڷ����� ����
	public static void main(String[] args) {
		//SquareFloat();
	}
		public static void print12() {
		// ���� 5-1. 8���� 12, 10���� 12,16������ 12 �� 10������ ǥ��
			System.out.println("8���� 12�� 10������"+012+"�Դϴ�.");
			System.out.println("10���� 12�� 10������"+12+"�Դϴ�.");
			System.out.println("16���� 12�� 10������"+0x12+"�Դϴ�.");
				
		}
		public static void OctHex() {
		// ���� 5-2. 10�� ������ �о 8����, 16������ ǥ��
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("���� : ");
			int x = stdIn.nextInt();
			//printf �Լ� 
			//'��ǥ������ ���� ������ �������� ��Ÿ�����ΰ�
			// %o - 8����
			// %d - 10����
			// %x - 16����
			System.out.printf("8������ %o �Դϴ�.\n",x);
			System.out.printf("16������ %x �Դϴ�.\n",x);
			//System.out.printf("8������ %o �̰� 16������ %x �Դϴ�.\n",x , x);
			
		}
		public static void FloatDoubleScanPrint() {
		//���� 5-3. float�� ������ double�� ������ �Ǽ����� �о ǥ��
			Scanner stdIn =new Scanner(System.in);
			
			System.out.println("���� x �� float�� , ���� y�� double�� �Դϴ�.");
			System.out.println("x :");
			float x = stdIn.nextFloat();
			System.out.println("y :");
			Double y = stdIn.nextDouble();
			
			System.out.println(" x = "+ x);
			System.out.println(" y = "+ y);
			
			
		}
		public static void PrintBoolean(){
		//���� 5-4. ���� ������ true,flase�� �����ؼ� ǥ��
			boolean b1 = true;
			boolean b2 = false;
			
			System.out.println("b1 ="+ b1);
			System.out.println("b2 ="+ b2);
		}
		public static void Average3Wrong() {
		//���� 5-5. 3���� �������� �о ����� �Ǽ��� ǥ�� 
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("������ x,y,z���� ����� ���մϴ�.");
			System.out.println("x :");
			int x = stdIn.nextInt();
			System.out.println("y :");
			int y = stdIn.nextInt();
			System.out.println("z :");
			int z = stdIn.nextInt();
			
			double ave = (x+y+z)/3;
			
			System.out.printf("x,y,z�� ����� %.3f�Դϴ�",ave);
		}
		public static void Average3B() {
		//���� 5-6. 3�� ������ ��հ� ���ϱ�(ĳ��Ʈ ������)	
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("������ x,y,z���� ����� ���մϴ�.");
			System.out.println("x :");
			int x = stdIn.nextInt();
			System.out.println("y :");
			int y = stdIn.nextInt();
			System.out.println("z :");
			int z = stdIn.nextInt();
			
			double ave = (double)(x+y+z)/3;
			
			System.out.printf("x,y,z�� ����� %.3f�Դϴ�",ave);
			
		}
		public static void FloatToInteger() {
		//���� 5-7. int�� ��ȯ�� �Ǽ����� ����
			int a;
			a=(int)10.0;
			//a=10.0; ---����
			System.out.println("a =" + a);
			
		}
		public static void LoopFloatInt() {
		//���� 5-8. float�� ���� 0.0���� 1.0���� 0.001�� ���� /int�� ���� 0���� 1000���� 1�� ����
			System.out.println("float        int");
			System.out.println("------------------");
			
			float x = 0.0F;
			
			for(int i = 0; i<=1000; i++,x+=0.001F){
				System.out.printf("%9.7f     %9.7f\n",x,(float)i/1000);
				
			}
			
		}
		public static void SquareFloat() {
		//���� 5- 9. 0.0���� 1.0���� 0.001������ ������Ű�� ���� ǥ�� (float������ ���� )
			System.out.println("x             x�� ����");
			System.out.println("------------------");
			
			
			for(float x =0.0F; x<1.0F; x+=0.001F){
				System.out.printf("%5.3f     %10.7f\n",x,x*x);
				
			}
		}
		public static void PrintABC() {
		//���� 5-10. "ABC\n"�� ǥ���ϴ� ���α׷�	
			System.out.println("\"ABC\\n\"");
		}
}
