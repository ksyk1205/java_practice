package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch03 {
	//3장 프로그램의 흐름 : 분기 
	public static void main(String[] args) {
		// 문제 3-1. 키보드로 입력한 정숫값이 음이면 음의 값이라고 표시
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int a = scan.nextInt();
		if(a<0) {
			System.out.println("입력한 정숫값이 움수입니다.");
		}
			
		//문제 3-2. 정숫값을 입력받아 절댓값을 표시
		System.out.println("정숫값 : ");
		int b = scan.nextInt();
		
		if(b<0) {
			b = -b;
		}			
		System.out.println("입력한 정숫값의 절댓값은" +b+"입니다.");
		
		//문제 3-3. 입력받은 정수값A가 B의 약수인지 판별
		
		System.out.println("변수 A : ");
		int A = scan.nextInt();
		System.out.println("변수 B : ");
		int B = scan.nextInt();
		
		if(B%A == 0) {
			System.out.println("A는 B의 약수이다.");
		}else {
			System.out.println("A는 B의 약수가 아니다.");
		}
		
		//문제 3-4. 입력받은 정숫값의 부호(양수,음수,0)를 판정하여 표시
		
		System.out.println("정숫값 : ");
		int n = scan.nextInt();
		if(n>0) {
			System.out.println("양수를 입력하였습니다");
		}else if(n<0) {
			System.out.println("음수를 입력하였습니다");
		}else if(n==0) {
			System.out.println("0값을 입력하였습니다");
		}
			
		//문제 3-5. 변수 a,b를 입력받아 대소관계 표시
		System.out.println("변수 a : ");
		a = scan.nextInt();
		System.out.println("변수 b : ");
		b = scan.nextInt();
		
		if(a<b) {
			System.out.println("b가 크다");
		}else if (a>b) {
			System.out.println("a가 크다");
		}else {
			System.out.println("a와b가 같다");
		}
		
		//문제 3-6. 입력받은 정숫값이 양수인지와 5로 나누어떨어지는지 표시
		System.out.println("정숫값 : ");
		n= scan.nextInt();
		if(n%5 == 0) {
			System.out.println("입력받은 값은 5로 나누어 떨어진다");
		}else {
			System.out.println("입력받은 값은 5로 나누어 떨어지지않는다.");
		}
		
		//문제 3-7. 입력받은 정숫값이 10의 배수인지 표시
		System.out.println("정숫값 : ");
		n= scan.nextInt();
		if(n>0) {
			if(n%10 == 0) {
				System.out.println("입력받은 값은 10의 배수이다");
			}else {
				System.out.println("입력받은 값은 10의 배수가 아님");
			}
		}else {
			System.out.println("n은 음수입니다.");
		}
		
		//문제 3-8. 입력한 점수에따라 수/우/미/양/가를 판정
		System.out.println("점수 : ");
		int score = scan.nextInt();
		
		if(score>=0 && score<=49) {
			System.out.println("가");
		}else if(score>=50 && score<=59) {
			System.out.println("양");
		}else if(score>=60 && score<=69) {
			System.out.println("미");
		}else if(score>=70 && score<=79) {
			System.out.println("우");
		}else if(score>=80 && score<=100) {
			System.out.println("수");
		}else {
			System.out.println("잘못된 점수를 입력하였습니다.");
		}
		
		//문제 3-9. 2개의 실숫값 중에 큰값을 표시
		System.out.println("실수 C : ");
		double C = scan.nextInt();
		System.out.println("실수 D : ");
		double D = scan.nextInt();
		
		double max ;
		if(C<D)
			max = D;
		else
			max = C;
		//max = a>b?a:b	
		System.out.println("큰 값은 :" +max);
		
		//문제 3-10. 2개의 정숫값을 읽어서 두 값의 차를 표시
		System.out.println("정수 a :");
		a = scan.nextInt();
		System.out.println("정수 b :");
		b = scan.nextInt();
		
		int tot;
		if(a>b) {
			tot = a-b;
		}else {
			tot=b-a;
		}
		System.out.println("두 정수의 차는 "+tot);
		
		//문제 3-11. 2개의 정숫값 차이가 10이하인경우와 아닌경우 표시
		System.out.println("정수 A :");
		A = scan.nextInt();
		System.out.println("정수 B :");
		B = scan.nextInt();
		
		tot = A>B ? A-B : B-A;
		
		if(tot<=10) {
			System.out.println("A와B의 차는 10 이하입니다.");
		}else {
			System.out.println("A와B의 차은 10 이상입니다.");
		}
		
		//문제 3-12.3개의 정수 중 최솟값을 구하기
		
		System.out.println("정수 a :");
		a = scan.nextInt();
		System.out.println("정수 b :");
		b = scan.nextInt();
		System.out.println("정수 c :");
		int c = scan.nextInt();
		
		int min = A;
		if(A>B)
			min = B;
		else if( A>c )
			min = c ;
		
		System.out.println("3개의 변수 중 최솟값은 " + min);
		
		//문제  3-13. 3개의 정수 중 중앙 값 구하기
		System.out.println("정수 a :");
		a = scan.nextInt();
		System.out.println("정수 b :");
		b = scan.nextInt();
		System.out.println("정수 c :");
		c = scan.nextInt();
		
		int cen  = 0;
		
		
		if(a>b) {
            if(b>c) {
               cen = b ;
            }else if(a>c){
               cen = c;
            }else {
               cen = a;
            }
         }else if(a>c){ 
           if(b<=c) {
              cen = c;
           }
         }else if(b>c) {
        	 cen = b;
         }else {
        	 cen = c;
         }
		 
		System.out.println("중간 값은" + cen);
		
		
		//뮨제  3- 14 .두 정숫값 중 작은 값과 큰값을 구해서 표시
		System.out.println("정수 a :");
		a = scan.nextInt();
		System.out.println("정수 b :");
		b = scan.nextInt();
		
		if(a==b)
			System.out.println("정수 a 와 b의 값은 같습니다.");
		else {
			if(a>b) {
				min = b;
				max = a;
			}else {
				min = a;
				max = b;
			}
			System.out.println("최솟값 : " + min);
			System.out.println("최댓값 : " + max);
		}
		
		//문제 3-15. 두 정숫값을 내림차순(큰 순)으로 표시
		if( a > b) {
			System.out.println(a+" > "+b);
		}else {
			System.out.println(b+" > "+a);
		}
		
		//문제 3-16. 세 정숫값을 오름차순(작은 순)으로 표시
		System.out.println("정수 a :");
		a = scan.nextInt();
		System.out.println("정수 b :");
		b = scan.nextInt();
		System.out.println("정수 c :");
		c = scan.nextInt();
		
		//a<b<c
		if(a>b) {
			int t = a;
				a = b;
				b = t;
		}
		
		if(b>c) {
			int t = b;
				c = b;
				b = t;
		}
		
		if(a>b) {
			int t = a;
				a = b;
				b = t;
		}
		System.out.println("a<b<c 가 되도록 정렬 -> "+ a + "<"+ b+"<"+c);
		
		//문제 3-17. //난수를 생성하여 0-가위 , 1- 바위 , 2-보
		Random ran = new Random();
		System.out.println("가위~바위~보~!");
		
		int R = ran.nextInt(3);//0~2
		
		switch(R){
			case 0 : {
				System.out.println("가위");
				break;
			}
			case 1 : {
				System.out.println("바위");
				break;				
			}
			case 2 : {
				System.out.println("보");
				break;
			}
		}
		//문제 1-18. 월을 1~12을 표시 
		System.out.println("몇 월입니까?");
		int month = scan.nextInt();
		 
		switch(month){
			case 3: 
			case 4: 
			case 5: 
				System.out.println("봄");
				break;				
			case 6 : 
			case 7: 
			case 8: 
				System.out.println("여름");
				break;
			case 9 : 
			case 10: 
			case 11: 
				System.out.println("가을");
				break;
			
			case 12 : 
			case 1: 
			case 2: 
				System.out.println("겨울");
				break;
			default : System.out.println("그런 월은 없습니다."); break;
		} 
	}
	

}
