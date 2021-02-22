package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch04 {
	//4장. 프로그램의 흐름 : 반복
	public static void main(String[] args) {
		// 문제 4-1. 읽은 정숫값의 부호를 판정해서 표시(원하는 만큼 반복)
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.println("정숫값 : ");
			int n = stdIn.nextInt();
			
			if(n > 0) {
				System.out.println("입력한 값은 양수 입니다");
			}else if(n < 0) {
				System.out.println("압력한 값은 음수입니다.");
			}else {
				System.out.println("입력한 값은 0입니다.");
			}
			
			System.out.println("다시 한번 입력하시겠습니까? yes - 1 , no - 2" );
			retry = stdIn.nextInt();
			/*do { //1과 2만 입력할 수 있도록 
				System.out.println("다시 한번 입력하시겠습니까? yes - 1 , no - 2" );
				retry = stdIn.nextInt();
			}while(retry!=1 || retry !=2);*/
		}while(retry == 1); //while ~하는 동안에 do 실행해라.
		
		//문제 4-2. 3자리 양의 정숫값 읽기 아니면 다시 입력하도록 하기
		int x; //읽는 값
		
		do {
		 System.out.println("3자리 정숫값을 입력하시오.");
		 x = stdIn.nextInt();
		}while( x<100 || x>999);
		
		System.out.println("입력한 값은 3자리 정숫값입니다.");
		
		//문제 4-3. 2자리 정숫값(10~99)을 맞추는 숫자맞추기 게임(난수 생성과 if문,do문을 사용할 것)
		System.out.println("숫자 맞추기 게임 시작~ :) ");
		System.out.println("10부터 99사이의 숫자를 맞추시오. ");
		Random ran = new Random();
		int no = 10 + ran.nextInt(90);
		
		do {
			System.out.println("어떤 숫자일까요?");
			x = stdIn.nextInt();
		}while( x != no); //정답이 아니면 반복
		
		System.out.println("정답입니다.");
		
		//문제 4-4. 2개의 정숫값을 읽어 작은것부터 순서대로 표시 
		System.out.println("정숫값 A :");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(a>b) {
			int t = a;
				b = a;
				a = t; 
		}
		
		System.out.println("작은 순서대로" +a +" < "+b); 
		
		//문제 4-5.입력받은 정숫값을 0까지 카운트다운 표시
		System.out.println("카운드다운 !!!!!!!!!!!");
		
		do {
			System.out.println("양의 정숫값 : ");
			x = stdIn.nextInt(); 
			
		}while(x <= 0);
		//do문 종료  시 x는 반드시 양의 값
		
		while(x>=0)
			System.out.println(x--);
			// x-- x값을 표시한 뒤 감소 / --x x값을 감소한 뒤 표시 
			System.out.println("x의 값이 "+ x +"이 됐습니다.");
			
		//문제 4-6. 입력한 값의 개수만큼 '*'를 표시(마지막에는 줄바꿈 문자출력 / 읽은 값이 1이하이면 줄바꿈 표시 X
		System.out.println("*를 몇개 표시할까요~?");
		x=stdIn.nextInt();
		
		if(x > 0) {
			 int i = 0;
			 while(i<x) {
				 System.out.print("*");
				 i++;
			 }
			System.out.println();
			
		}
		
		//문제 4-7. 읽은 개수만큼 *와 +를 교대로 표시
		System.out.println("몇개를 표시할까요?(*,+)");
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
		
		//문제 4-8. 양의정숫값을 읽어서 자릿수표시
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");

		//양의 정수 입력받기.
		do {
			System.out.println("양의 정숫값 :");
			x=stdIn.nextInt();
		}while( x <= 0 );
		
		int digit = 0 ;
		while(x>0) {
			digit++;
			x/=10;
		}
		System.out.println("입력한 숫자는 "+digit+"자리입니다.");
		
		//문제 4-9. 양의 정숫값 n을읽어서 1부터 n까지의 곱을 구하시오.
		//양의 정수 입력받기.
		int n;
		do {
			System.out.println("양의 정숫값 :");
			n=stdIn.nextInt();
		}while( n <= 0 );
		
		int factorial = 1;
		int i = 1;
		
		while(i <= n) {
			factorial *= i;
			i++;
		}
		System.out.println("1부터"+n+"까지의 곱 : "+factorial);
				
		//문제 4-10. 읽은 개수만큼 *표시 (for문)
		System.out.println("몇개의 *를 표시할까요~?");
		n=stdIn.nextInt();
		
		if(n>0) {
			for(int t=0; t<n; t++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//문제  4-11. 양의 정숫값을 0까지 카운트다운(for문)
		System.out.println("카운트다운 !_!");
		do {
			System.out.println("양의 정숫값을 입력하세요.");
			n=stdIn.nextInt();
		}while(n>0);
		
		for(; x>=0; x--) {
			System.out.println(x);
		}
		
		//문제 4-12. 앞 문제와 반대로 0부터 카운트업
		System.out.println("카운트업@_@");
		do {
			System.out.println("양의 정숫값을 입력하세요.");
			n=stdIn.nextInt();
		}while(n>0);
		
		for(int c=0; c<=n; c++) {
			System.out.println(c);
		}
		
		//문제 4-13. 1부터 n까지 합(for문)
		System.out.println("1부터 n까지 합을 구합니다.");
		do {
			System.out.println("n의 값");
			n=stdIn.nextInt();
		}while(n>0);
		
		int sum = 0;
		
		for(int c=0; c<=n ;c++) {
			sum += c;
		}
		
		System.out.println("1부터"+n+"까지의 합은 "+sum+"입니다.");
		

		

	}

}
