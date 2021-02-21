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
		

	}

}
