package java_practice;

import java.util.Scanner;

public class ch05 {
	//5장 기본자료형과 연산
	public static void main(String[] args) {
		//SquareFloat();
	}
		public static void print12() {
		// 문제 5-1. 8진수 12, 10진수 12,16진수를 12 를 10진수로 표시
			System.out.println("8진수 12는 10진수로"+012+"입니다.");
			System.out.println("10진수 12는 10진수로"+12+"입니다.");
			System.out.println("16진수 12는 10진수로"+0x12+"입니다.");
				
		}
		public static void OctHex() {
		// 문제 5-2. 10진 정수를 읽어서 8진수, 16진수로 표시
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("정수 : ");
			int x = stdIn.nextInt();
			//printf 함수 
			//'쉼표다음에 오는 정수를 몇진수로 나타낼것인가
			// %o - 8진수
			// %d - 10진수
			// %x - 16진수
			System.out.printf("8진수는 %o 입니다.\n",x);
			System.out.printf("16진수는 %x 입니다.\n",x);
			//System.out.printf("8진수는 %o 이고 16진수는 %x 입니다.\n",x , x);
			
		}
		public static void FloatDoubleScanPrint() {
		//문제 5-3. float형 변수와 double형 변수에 실숫값을 읽어서 표시
			Scanner stdIn =new Scanner(System.in);
			
			System.out.println("변수 x 는 float형 , 변수 y는 double형 입니다.");
			System.out.println("x :");
			float x = stdIn.nextFloat();
			System.out.println("y :");
			Double y = stdIn.nextDouble();
			
			System.out.println(" x = "+ x);
			System.out.println(" y = "+ y);
			
			
		}
		public static void PrintBoolean(){
		//문제 5-4. 논리형 변수에 true,flase를 대입해서 표시
			boolean b1 = true;
			boolean b2 = false;
			
			System.out.println("b1 ="+ b1);
			System.out.println("b2 ="+ b2);
		}
		public static void Average3Wrong() {
		//문제 5-5. 3개의 정숫값을 읽어서 평균을 실수로 표시 
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("정숫값 x,y,z값의 평균을 구합니다.");
			System.out.println("x :");
			int x = stdIn.nextInt();
			System.out.println("y :");
			int y = stdIn.nextInt();
			System.out.println("z :");
			int z = stdIn.nextInt();
			
			double ave = (x+y+z)/3;
			
			System.out.printf("x,y,z의 평균은 %.3f입니다",ave);
		}
		public static void Average3B() {
		//문제 5-6. 3개 정수의 평균값 구하기(캐스트 연산자)	
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("정숫값 x,y,z값의 평균을 구합니다.");
			System.out.println("x :");
			int x = stdIn.nextInt();
			System.out.println("y :");
			int y = stdIn.nextInt();
			System.out.println("z :");
			int z = stdIn.nextInt();
			
			double ave = (double)(x+y+z)/3;
			
			System.out.printf("x,y,z의 평균은 %.3f입니다",ave);
			
		}
		public static void FloatToInteger() {
		//문제 5-7. int형 변환에 실숫값을 대입
			int a;
			a=(int)10.0;
			//a=10.0; ---오류
			System.out.println("a =" + a);
			
		}
		public static void LoopFloatInt() {
		//문제 5-8. float형 변수 0.0부터 1.0까지 0.001씩 증가 /int형 변수 0부터 1000까지 1씩 증가
			System.out.println("float        int");
			System.out.println("------------------");
			
			float x = 0.0F;
			
			for(int i = 0; i<=1000; i++,x+=0.001F){
				System.out.printf("%9.7f     %9.7f\n",x,(float)i/1000);
				
			}
			
		}
		public static void SquareFloat() {
		//문제 5- 9. 0.0부터 1.0까지 0.001단위로 증가시키며 제곱 표시 (float형으로 제어 )
			System.out.println("x             x의 제곱");
			System.out.println("------------------");
			
			
			for(float x =0.0F; x<1.0F; x+=0.001F){
				System.out.printf("%5.3f     %10.7f\n",x,x*x);
				
			}
		}
		public static void PrintABC() {
		//문제 5-10. "ABC\n"을 표시하는 프로그램	
			System.out.println("\"ABC\\n\"");
		}
}
