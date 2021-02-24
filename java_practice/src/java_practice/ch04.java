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
		System.out.println("정숫값 B :");
		int b = stdIn.nextInt();
		
		if(a>b) {
			int t = b;
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
			System.out.println(factorial);
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
		}while(n<0);
		
		for(int z=n; z>=0; z--) {
			System.out.println(z);
		}
		
		//문제 4-12. 앞 문제와 반대로 0부터 카운트업
		System.out.println("카운트업@_@");
		do {
			System.out.println("양의 정숫값을 입력하세요.");
			n=stdIn.nextInt();
		}while(n<0);
		
		for(int c=0; c<=n; c++) {
			System.out.println(c);
		}
		
		//문제 4-13. 1부터 n까지 합(for문)
		System.out.println("1부터 n까지 합을 구합니다.");
		do {
			System.out.println("n의 값");
			n=stdIn.nextInt();
		}while(n<0);
		
		int sum = 0;
		
		for(int c=0; c<=n ;c++) {
			sum += c;
		}
		
		System.out.println("1부터"+n+"까지의 합은 "+sum+"입니다.");
		
		//문제 4-14. 위의 문제를 계산식까지 나오도록 수정
		System.out.println("1부터 n까지 합을 구합니다.");
		do {
			System.out.println("n의 값");
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
		
		//문제 4-15. 신장별 표준 체중 대응표 표시
		//표준체중 = (신장 - 100) x 0.9
		System.out.println("최소 몇 cm ?");
		int hMin = stdIn.nextInt();
		System.out.println("최대 몇 cm ?");
		int hMax = stdIn.nextInt();
		System.out.println("몇 cm 단위 ?");
		int step = stdIn.nextInt();
		
		System.out.println("-----신장 체중표-----");
		
		for(int t=hMin; t<=hMax; t+=step) {
			System.out.println("키 :"+t +"체중 :"+(t-100)*0.9);
		}
		
		//문제 4-16 읽은 개수 * 를 표시하는데 5개가 넘으면 줄바꿈을 해준다
		System.out.println("*를 몇개 표시할까요?");
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
		
		//문제 4-17.입력한 정수 값의 모든 약수 표시 
		System.out.println("정숫값");
		n = stdIn.nextInt();
		int count=0;
		for(int z=1; z<=n; z++) {
			if(n%z==0) {
				System.out.print(z);
				count++;
			}
		}
		System.out.println("\n약수의 개수는 "+count+"개 입니다.");
		
		//문제 4-18. 1에서 n까지의  제곱
		System.out.println("양수 값을 입력하세요.");
		n = stdIn.nextInt();
		
		for(int z=1; z<=n; z++) {
			System.out.println(z+"의 제곱은"+z*z+"입니다.");
		}
		
		//문제 4-19. 입력한 달의 계절표시
		System.out.println("계절을 찾습니다.");
		retry=0;
		do {
			int month ;
			do {
				System.out.println("몇월인가요?");
				month =stdIn.nextInt();
			}while(month<1 || month>12);
			
			if(month >= 3 && month <= 5) {
				System.out.println("봄봄봄~봄이왔네요.");
			}else if(month >= 6 && month <= 8) {
				System.out.println("여름여름해 :)");
			}else if(month >= 9 && month <= 11) {
				System.out.println("가을&_&");
			}else if(month == 12 || month == 1|| month == 2) {
				System.out.println("겨울*_*");
			}
			
			System.out.println("다시 입력하시겠습니까? yes-1 no-2");
			retry = stdIn.nextInt();
		}while(retry ==1);
		
		
		//문제 4-20. 정방형을표시
		System.out.println("정방형을 표시합니다.");
		System.out.println("단수 : ?");
		n = stdIn.nextInt();
		
		for(int z = 0; z<=n; z++) {
			for(int y = 0; y<=n; y++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
		//문제 4-21. 왼쪽아래가 직각인 이등변 삼각형
		System.out.println("왼쪽아래가  직각인 이등변 삼각형");
		System.out.println("단수 : ?");
		n = stdIn.nextInt();
		
		for(int z = 0; z<=n; z++) {
			for(int y = 0; y<=z; y++) {
				System.out.print("X");
			}
			System.out.println();
		}
		
		System.out.println("왼쪽위가  직각인 이등변 삼각형");
		System.out.println("단수 : ?");
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

		// 문제 4-23.피라미드를 표시
		//i행째는 (i-1)*2+1개의  *을 표시  마지막 n번째 행에는 (n-1)*2+1 개의 *을 표시 
		System.out.println("피라미드를 만들어보아요~_~");
		System.out.println("단수 : ?");
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
		
		
		// 문제 4-24. n단의 숫자 피라미드를 표시 , i번째행에는 i%10을 표시
		System.out.println("n단 피라미드를 만들어보아요~_~");
		System.out.println("단수 : ?");
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
		
		//문제 4-25. 양의 정수를 읽어서 소수인지 판정 
		//소수 : 2이상 n 미만인  수중 어떤 수로도 나누어지지않는 정숫값
		System.out.println("-소수인지 판정-");
		System.out.println("2이상의 양의 정수 : ?");
		n = stdIn.nextInt();
		int z;
		for(z=1; z<=n; z++) {
			if(n%z==0) {
				break;		
			}
		}
		if(z==n) {
			System.out.println("소수가 맞습니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
		
		//문제 4-26. 연속으로 읽은 정숫값들을 합계와 평균을 표시 0입력시 종료
		System.out.println("정수의 합계와 평균");
		System.out.println("몇개의 정수를 입력받을까요?");
		n = stdIn.nextInt();
		
		sum=0;
		for(z=0; z<n; z++) {
			System.out.println("정수(0을 입력하면 종료)");
			sum += stdIn.nextInt();
			
			if(sum == 0) 
			break;
		}
		
		System.out.println("입력한 정수의 합은 "+ sum + "입니다.");
		if(n!=0)
			System.out.println("입력한 정수의 평균은 "+ sum/n + "입니다.");
		
		//문제 4-27. 정숫값읖 읽어서 합계와 평균을 구하고 정숫값의 입력은 1,000이 넘지않도록
		System.out.println("정수를 더합니다.");
		System.out.print("몇개를 더할까요?");
		n = stdIn.nextInt();
		int t;
		sum = 0;
		for(i =0; i<n; i++) {
			System.out.println("정수 :");
			t =stdIn.nextInt();
			if(sum+t > 1000) {
				System.out.println("정수의 합계가 1000을 넘었습니다. 마지막 값은 무시합니다.");
				break;
			}
			sum+=t;
		}
		System.out.println("입력한 정수의 합은 "+ sum + "입니다.");
		if(n!=0)
			System.out.println("입력한 정수의 평균은 "+ sum/n + "입니다.");
		
	}

}
