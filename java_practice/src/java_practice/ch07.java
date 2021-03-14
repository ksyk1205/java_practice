package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch07 {
	//07장 메서드 
	static Scanner stdIn = new Scanner(System.in);	
	static Random rand = new Random();
	static int SignOf1(int n) {
		int sign=0;
		
		if(n>0) {
			sign = 1;
		}else if(n<0) {
			sign = -1;
		}else {
			sign = 0;
		}
		
		return sign;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if(b<min) 
			min=b;
		if(c<min)
			min=c;
		
		return min;
	}

	static int med(int a, int b, int c) {
		if(a>=b) {
			if(b>=c)
				return b;
			else if(a>=c) {
				return c;
			}else {
				return a;
			}
		}else if(a > c) {//a < b
			return a;
		}else if(b < c) {//c > a /a < b
			return b;
		}else {//c > a /a < b /b > c
			return c;
		}
		
		
	}
	static int sumUp(int x) {
		int sum = 0;
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		return sum;
	}
	
	static void hello() {
		System.out.println("안녕하세요.");
	}
	
	static void printSeason(int month) {
		//봄(3,4,5) / 여름(6,7,8) / 가을(9,10,11) / 겨울(12,1,2)
		if(month>=3 && month<=5)
			System.out.print("봄");
		else if(month >=6 && month<=8) 
			System.out.print("여름");
		else if(month>=9 && month<=11)
			System.out.print("가을");
		else if(month==12 || month ==1 || month==2)
			System.out.print("겨울");
		/*
		switch(month) {
			case 3: case 4: case 5:
				System.out.print("봄"); break;
			case 6: case 7: case 8:
				System.out.print("여름"); break;
			case 9: case 10: case 11:
				System.out.print("가을"); break;
			case 12: case 1: case 2:
				System.out.print("겨울"); break;
		}*/
	}
	
	static void putChar(char c,int n) {
		while(n -- > 0)
			System.out.print(c);
	}
	static void putStart(int n) {
		putChar('*',n);
	}
	static int random(int max, int min) {
		if(max<=min)
			return min;
		else {
			Random rand = new Random();
			return min + rand.nextInt(max-min+1); 
		}
	}
	
	static int readPlusInt() {
		int x;
		do {
			System.out.println("양의 정숫값 : ");
			x = stdIn.nextInt();
		}while(x<=0);
		return x;
	}
	
	static boolean confirmRetry() {
		int count;
		do {
			System.out.println("다시 한번 실행하시겠습니까? yes....1/ no....0");
			count = stdIn.nextInt();
		}while(count!=0 && count!=1);
		return count ==1;
	}
	
	static int pow2(int n) {
		int pw = 1;
		while(n-- > 0) {
			pw*=2;
		}
		return pw;
	}
	
	static void printBits(int x) {
		for(int i =31;  i>=0; i--) {
			System.out.print((x>>>i & 1) ==1 ? '1' : '0');
		}
		
	}
	static int rRotate(int x, int n) {
		if(n<0) 
			return lRotate(x,-n);
		n%=32;
		return (n==0 ? x : (x>>>n)|(x<<(32-n)));
		
		
	}

	static int lRotate(int x, int n) {
		if(n<0) 
			return rRotate(x,-n);
		n%=32;
		return (n==0 ? x : (x<<n)|(x>>>(32-n)));
	}
	
	static int sumOf(int[] arr) {
		int sum=0;
		for(int i =0 ; i<arr.length; i++) {
			sum +=arr[i];
		}
		return sum;
	}
	
	static void minOf(int[] a) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min =a[i];
			}
		}
		System.out.print(min);
		
	}
	
	static int linearSearchR(int[] arrN, int key) {
		for(int i=arrN.length; i>=0; i--) {
			if(arrN[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static int linearSearch(int[] arrN, int key) {
		for(int i=0; i<arrN.length; i++) {
			if(arrN[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static void aryRmv(int[] arrX, int index) {
		if(index>=0 && arrX.length > index ) {
			for(int i=index; i<arrX.length-1; i++) {
				arrX[i] = arrX[i+1];
			}
		}
		
	}
	
	static void aryIns(int[] arrA, int idx, int val) {
		if(idx >0 && idx <arrA.length) {
			for(int i = arrA.length; i>idx; i--) {
				arrA[i]=arrA[i-1];
			}
			arrA[idx] = val;
		}
		
	}
	
	static void aryRmv(int[] arrX, int idx, int n) {
		if(n>0 && idx>=0 && idx+n<arrX.length) {
			int idx2 = idx +n -1;
			for(int i = idx; i<=idx2; i++) {
				arrX[i]= arrX[i+n];
			}
		}
		
	}
	
	static void aryExchng(int[] arrA, int[] arrB) {
		int n = arrA.length < arrB.length ? arrA.length : arrB.length;
		for(int i = 0;  i<n; i++ ) {
			int t = arrA[i];
			arrA[i] = arrB[i];
			arrB[i] = t;
		}
		
	}
	
	static int[] arryClone(int[] a) {
		int[] arrc = new int[a.length];
		for(int i=0; i<a.length; i++) {
			arrc[i] = a[i];
		}
		return arrc;
	}
	
	static int[] arraySrchIdx(int[] a, int n) {
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == n) {
				count++;
			}
		}
		int c[] = new int[count--];
		for(int i=a.length-1; count>=0; i--) {
			if(a[i] == n) {
				c[count--] = i;
			}
		}
		return c;
		
	}
	static int[] arrayRmvOf(int[] a, int idx) {
		if(a.length-1  <idx &&  idx<0)
			return a.clone();
		else {
			int[] c = new int[a.length-1];
			for(int i=0; i<idx; i++) {
				c[i]=a[i];
			}
			for(int i=idx; i<c.length; i++) {
				c[i]=a[i+1];
			}
			return c;
		}
	}
	
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		if(a.length<idx || idx<0 ||n<0) {
			return a.clone();
		}else {
			int[] c = new int[a.length-n];
			for(int i=0; i<idx; i++) {
				c[i] = a[i];
			}
			for(int i=0; i<c.length; i++) {
				c[i] = a[i+n];
			}
			return c;
		}
		
	}
	
	static int[] arrayInsOf(int[] a, int idx, int n) {
		if(a.length <idx || idx<0) {
			return a.clone();
		}else {
			int[] y = new int[a.length+1];
			for(int i=0; i<idx; i++) {
				y[i] = a[i];
			}
			for(int i=idx; i<y.length; i++) {
				y[i+1] = a[i];
			}
			y[idx] = n;
			return y;
		}
		
	}
	
	static void printMatrix(int[][] x) {
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		
	}

	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if(x.length != y.length || y.length != z.length ) {
			return false;
		}
		for(int i=0; i<x.length; i++) {
			if(x[i].length != y[i].length || y[i].length != z[i].length ) {
				return false;
			}
		}
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return true;
	}

	static int[][] addMatrix(int[][] x, int[][] y) {
		int[][] z = new int[x.length][];
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j] = x[i][j]+y[i][j];
			}
		}
		return z;
	}
	static int min(int[] a) {
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]<min)
				min = a[i];
		}
		
		return min;
	}

	static int min(int x, int y) {
		return x>y ? y:x;
	}
	
	
	public static void main(String[] args) {
		//문제 7-1. 입력한 int형 정숫값이 음수이면 -1, 0이면 0, 양수이면 1을 반환하는 메서드를 작성하쟈.	
		System.out.println("정수 : ");
		int x = stdIn.nextInt();
		
		int s = SignOf1(x);
		System.out.println("signOf(x)는 "+s+"입니다.");
		
		//문제 7-2. 3개의 int형 인수 a,b,c, 중에 최솟값을 구하는 min 메서드를 작성하자
		System.out.println("정수 a"); int a = stdIn.nextInt();
		System.out.println("정수 b"); int b = stdIn.nextInt();
		System.out.println("정수 c"); int c = stdIn.nextInt();
		
		System.out.println("정수 a,b,c, 중에 최솟값은 "+min(a,b,c)+" 입니다.");
		
		//문제 7-3. 3개의 정숫값에서 중간값 구하는 med 메서드를 작성하자.
		System.out.println("정수 a"); a = stdIn.nextInt();
		System.out.println("정수 b"); b = stdIn.nextInt();
		System.out.println("정수 c"); c = stdIn.nextInt();
		
		System.out.println("정수 a,b,c, 중에 중간값은 "+med(a,b,c)+" 입니다.");
		
		//문제 7-4. 1부터 n까지의 정수의 합을 구해서 반환하는 메서드
		System.out.println(" 1부터 x까지의 합을 구하자. ");
		do {
			System.out.println("x의 값 : ");
			x=stdIn.nextInt();
		}while(x<=0);
		
		System.out.println("1부터 "+x+" 까지의 합은 "+sumUp(x)+" 입니다.");
		
		//문제 7-5.안녕하세요.라고 표시하는 hello 메서드를 작성
		hello();
		
		//문제 7-6. 인수 m에 지정한 달의 계절을 표시하는 printSeason 메서드를 작성 
		int month;
		do {
			System.out.print("몇월입니까?(1~12) :");
			month = stdIn.nextInt();
			
		}while(month<1 || month>12);
		
		System.out.print(month+"월의 계절은 ");
		printSeason(month);
		System.out.print(" 입니다.\n");
		
		//문제 7-7. 문자 c를 n개 표시하는 putChar 메서드와 이 메서드를 내부에서 호출해서 문자 "*"를 n개 연속으로 표시하는 putStart메서드 작성하여
		//직각삼각형을 만들자.
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 :");
		int n = stdIn.nextInt();
		for(int i=1; i<=n; i++) {
			putStart(i);
			System.out.println();
		} 
		
		//문제 7-8.난수(a=<난수 =<b)를 생성해서 반환하는 random메서드를 작성  (참고, y<=x인 경우 x값을 그대로 반환
		System.out.println("난수를 생성합니다.");
		System.out.println("하한값 :"); x = stdIn.nextInt();
		System.out.println("상한값 :"); int y = stdIn.nextInt();
		
		System.out.println("생성한 난수는 "+random(y,x)+" 입니다.");
		
		//문제 7-9. 양의 정숫값: 이라는 메세지에 정숫값으 ㄹ입력하면 값을 거꾸로 반환하는 readPlusInt 메서드를 작성
		//0이나 음수(-)가 입력되면 재입력하도록 할 것
		do {
			n = readPlusInt();
			
			System.out.println("반대로 읽으면 ");
			while(n>0) {
				System.out.print(n%10);
				n/=10;
			}
			System.out.println("입니다.");
			
			do {
				System.out.println("다시한번 ? yes...1 / No...0");
				x = stdIn.nextInt();
			}while(x!=0 && x!=1);
		}while(x==1);
		
		//문제 7-10. 암산훈련(3개의 3자리 정수를 사용한 계산)
		//4개릐 계산 문제 중 하나를 무작위로 출제하는 프로그램  
		//x+y+z / x+y-z / x-y+z / x-y-z
		System.out.println("암산 훈련!!");
		
		do {
			x = 100 + rand.nextInt(900);
			y = 100 + rand.nextInt(900);
			int z = 100 + rand.nextInt(900);
			
			int pattern = rand.nextInt(4);
			int answer = 0;
			switch(pattern) {
				 case 0 : answer = x+y+z ; break;
				 case 1 : answer = x+y-z ; break;
				 case 2 : answer = x-y+z ; break;
				 case 3 : answer = x-y-z ; break;
			}
			while(true) {
				System.out.print(x+((pattern <2 ? "+":"-"))
						+ y + (pattern%2 ==0 ? "+":"-")
						+ z  +" = ");
				int k =stdIn.nextInt();
				
				if(k==answer)
					break;
				
			}
		}while(confirmRetry());
		
		//문제 7-11. 정수를 좌우로 시프트한 값이 , 정수 x2 거듭제곱 및 정수/2의 거듭제곱 과 같은지 확인하는 프로그램
		System.out.println("정수 x 를 n비트에 시프트 합니다.");
		System.out.println("x : "); x=stdIn.nextInt();
		System.out.println("n : "); n=stdIn.nextInt();
		
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		int lShift = x << n;
		int rShift = x >> n;
		
		System.out.printf("[a] X x(2의 %d승)=%d\n" , n,mPower);
		System.out.printf("[b] X /(2의 %d승)=%d\n" , n,dPower);
		System.out.printf("[c] X << %d=%d\n",n,lShift);
		System.out.printf("[d] X >> %d=%d\n",n,rShift);
		
		System.out.println("[a] 와  [c]의 값이 "+((mPower == lShift) ? "일치합니다.":"일치하지않습니다."));
		System.out.println("[b] 와  [d]의 값이 "+((dPower == rShift) ? "일치합니다.":"일치하지않습니다."));
		
		
		//문제 7-12. 정수 x를 오른쪽으로 n비트 회전한 값을 반환하는 rRotate메서드와 왼쪽으로 n비트 회전한 값을 반환하는 lRoate 메서드를 작성
		System.out.println("정수 x를 n비트 회전합니다.");
		System.out.print("x :"); x = stdIn.nextInt();
		System.out.print("y :"); y = stdIn.nextInt();
		
		System.out.println("회전 전 =");
		printBits(x);
		System.out.println("\n오른쪽 전 =");
		printBits(rRotate(x, n));
		System.out.println("\n왼쪽 전 =");
		printBits(lRotate(x, n));
		System.out.println();
		
		//문제 7-15. 배열 a이 가진 모든 요소의 합을 구하는 sumOf()메서드
		System.out.println("요소 수 :");
		int num = stdIn.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			System.out.print("x["+i+"] : ");
			arr[i] = stdIn.nextInt();
		}
		
		System.out.println("모든 요소의 합은"+sumOf(arr)+"입니다");
		
		//문제 7-16. 배열 a의 요소 중에서 최솟값을 구하는 minOf메서드를 작성하자.
		//가장 키가 작은 사람과 가장 마른 사람의 체중을 구한다.
		System.out.print("사람 수는 :");
		int people = stdIn.nextInt();
		
		int[] height = new int[people];
		int[] weight = new int[people];
		
		System.out.println(people+"명의 신장과 체중을 입력하자.");
		for(int i=0; i<people; i++) {
			System.out.println((i+1)+" 번의 신장");
			height[people] = stdIn.nextInt();
			System.out.println((i+1)+" 번의 몸무게");
			weight[people] = stdIn.nextInt();
		}
		
		System.out.println("가장 키가 작은 사람의 신장 :"); minOf(height);
		System.out.println("가장 몸무게가 작은 사람의 신장 :"); minOf(weight);
		
		
		//문제 7-17. 배열 a로부터 key와 같은 값을 가지는 요소를 탐색하는 linearSearch 메서드와 linearSearchR 메서드를 작성하쟈
		// 단, 키와 같은 값을 가지는 요소가 여러 개인 경우 linearSearch는 가장 앞에 위치한 요소를 찾으면 linearSearchR은 가장 뒤에 위치한 요소를 찾을 것
		System.out.print("요소 수  :"); 
		n = stdIn.nextInt();
		int[] arrN = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("arrN["+i+"]");
			arrN[i] = stdIn.nextInt();
		}
		
		System.out.print("찾는 값:");
		int key = stdIn.nextInt();
		
		int idxTop = linearSearch(arrN,key);
		int idxBtm = linearSearchR(arrN,key);
		
		if(idxTop == -1) {
			System.out.println("해당 값은 배열에 존재하지 않습니다.");
		}else if(idxTop ==  idxBtm) {
			System.out.println("해당 값은 arrN["+idxTop+"] 에 있습니다.");
		}else{
			System.out.println("해당 값의 요소가 여러 개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 arrN["+idxTop+"]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 arrN["+idxBtm+"]에 있습니다.");
		}
		
		//뮨제 7-18.배열 a로부터 요소 a[idx]를 삭제하는 aryRmv메서드를 작성하자. void aryRmv(int[] arrX, int index)
		//a[idx]의 삭제는 그 뒤에 있는 요소들을 앞으로 하나씩 이동해서 할 것. 이동한 후  마지막 요소는 이동하기 전의 마지막 값을 유지할 것
		System.out.print("요소 수 ");
		num = stdIn.nextInt();
		int[] arrX = new int[num]; 
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : ");
			arrX[i] = stdIn.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : ");
		int index = stdIn.nextInt();
		
		aryRmv(arrX , index);
		
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : "+arrX[i]);
		}
		
		//문제 7-19. 배열 a에서 요소 a[idx]부터 n개의 요소를 삭제하는 aryRmvN메서드를 작성 void aryRmv(in[] arrX, int idx, int n)
		//삭제는 a[idx]보다 뒤에있는 모든 요소를 하나씩 앞으로 이동, 이동 대상이 아닌 요소는 기존 값을 그대로 유지
		System.out.print("요소 수 ");
		num = stdIn.nextInt();
		arrX = new int[num]; 
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : ");
			arrX[i] = stdIn.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스 : ");
		int idx = stdIn.nextInt();
		System.out.print("삭제할 요소의 수  : ");
		n = stdIn.nextInt();
		
		aryRmv(arrX,idx,n);
		
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : "+arrX[i]);
		}
		
		//문제 7-20. 배열 a의 요소 a[idx]에 x를 삽입하는 aryIns 메서드를 작성하자. void aryIns(int[] a, int idx, int x)
		//삽입 시에는 a[idx] ~ a[a.length-2]를 하나씩 뒤로 이동시켜야한다.
		System.out.print("요소 수 : ");
		num = stdIn.nextInt();
		int[] arra = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"] : ");
			arra[i] = stdIn.nextInt();
		}
		
		System.out.print("삽일할 요소의 인덱스 : ");
		idx = stdIn.nextInt();
		System.out.print("삽일할 값 : ");
		int val = stdIn.nextInt();
		
		aryIns(arra,idx,val);
		
		for(int i=0; i<num; i++) {
			System.out.print("arrA["+i+"] : "+arra[i]);
		}
		
		//문제 7-21. 배열 a와 배열 b의 전체 요솟값을 교환하는 aryExchng 메서드  void aryExchng(int[] a, int[] b)
		//두 배열의 요소 수 가 같지않다면 작은 쪽의 배열 수에 맞추어 교환할 것
		System.out.print("배열 a의 요소 수 : ");
		int numA = stdIn.nextInt();
		int[] arrA = new int[num];
		for(int i=0; i<numA; i++) {
			System.out.print("a["+i+"] : ");
			arrA[i] = stdIn.nextInt();
		}
		System.out.print("배열 b의 요소 수 : ");
		int numB = stdIn.nextInt();
		int[] arrB = new int[numB];
		for(int i=0; i<numB; i++) {
			System.out.print("b["+i+"] : ");
			arrB[i] = stdIn.nextInt();
		}
		aryExchng(arrA,arrB);
		
		System.out.println("배열 a와 b의 전체요소를 교환하였습니다.");
		for(int i=0; i<numA; i++) {
			System.out.print("a["+i+"] : "+arrA[i]);
		}
		for(int i=0; i<numB; i++) {
			System.out.print("b["+i+"] : "+arrB[i]);
		}
		
		//문제 7-22.배열 a와 같은 배열(요소 수가 같고 모든 요소의 값이 같은 배열)을 생성해서 반환하는 arrayClone메서드 arryClone(int [] a)
		System.out.print("요소수 : ");
		num = stdIn.nextInt();
		int[] arrx = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arrx[i] = stdIn.nextInt();
		}
		
		int arry[] = arryClone(arrx);
		System.out.println("배열을 복사해서 배열 y를 생성했습니다.");
		for(int i=0; i<arry.length; i++) {
			System.out.println("y["+i+"] = "+ arry[i]);
		}
		
		//문제 7-23. 배열 a의 요소 중에서 값이 x인 모든 요소의 인덱스를 앞에서부터 순서대로 저장해서 반환하는 arraySrchIdx를 작성하자.
		System.out.print("요소수 : ");
		num = stdIn.nextInt();
		int[] array = new int[num];
		
		System.out.print("탐색할 값");
		n = stdIn.nextInt();
		
		int[] arryidx = arraySrchIdx(array , n);
		
		if(arryidx.length == 0) {
			System.out.println("일치하는 요소가 없습니다.");
		}else {
			System.out.println("일치하는 요소의 인덱스");
			for(int i=0; i<arryidx.length; i++)
			System.out.println(arryidx[i]);
		}
		
		//문제 7-24. 배열 a에서 요소 a[idx]를 삭제한 배열을 반환하는 arrayRmvOf를 작성하자. int[] arrayRmvOf(int[] a,int idx)
		//삭제 a[idx]보다 뒤에있는 모든 요소 를 하나씩 앞으로 이동시킬 것
		System.out.print("요소 수 : ");
		num = stdIn.nextInt();
		int[] arrayA =  new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arrayA[i] = stdIn.nextInt();
		}
		System.out.print("삭제할 인덱스는 ?");
		index = stdIn.nextInt();
		
		int[] arrayB = arrayRmvOf(arrayA,index);
		
		for(int i=0; i<arrayB.length; i++) {
			System.out.println("b["+i+"]"+arrayB[i]);
		}
		 
		//문제 7-25. 배열 a에서 요소 a[idx]부터 n개 요소를 삭제한 배열을 반환하는 arrayRmvOfN메서드를 작성하자
		//삭제a[idx] 보다 뒤에있는 요소를 n개 앞으로 이동해서 할 것.
		System.out.print("요소 수 : ");
		num = stdIn.nextInt();
		int[] arryN =  new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arryN[i] = stdIn.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스 : ");
		idx = stdIn.nextInt();
		System.out.print("삭제할 요소의 개수  : ");
		n = stdIn.nextInt();
		
		arryN = arrayRmvOfN(arryN,idx,n);
		
		for(int i=0; i<arryN.length; i++) {
			System.out.println("b["+i+"]"+arryN[i]);
		}
		
		//문제 7-26. 배열 a의 요소 a[idx]에 x를 삽입해서 배열로 반환하는 arrayInsOf를 작성하자.
		//삽입할때는 a[idx]뒤에 있는 모든 요소를 하나씩 뒤로 이동시킬 것
		System.out.print("요소 수 : ");
		num = stdIn.nextInt();
		int[] arryI =  new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arryI[i] = stdIn.nextInt();
		}
		
		System.out.print("삽입할 인덱스 :");
		idx = stdIn.nextInt();
		System.out.print("삽입할 값 :");
		n = stdIn.nextInt();
		
		arryI = arrayInsOf(arryI,idx,n);
		
		//문제 7-27. 행렬 x와 y의 합을 구해서 z에 저장하는 addMatrix 메서드를 작성하자  boolean addMatrix(int[][] x, int[][] y, int[][] z)
		//3개 배열의 요소 수가 같으면 계산해서 true를 반환하고 같지않으면 계산없이 false를 반환할 것
		int[][] arrayx = {{1,2,3},{4,5,6}};;
		int[][] arrayy = {{6,3,4},{1,2,5}};;
		int[][] arrayz = new int[2][3];
		
		if(addMatrix(arrayx,arrayy,arrayz)) {
			System.out.println("행렬 a");
			printMatrix(arrayx);
			System.out.println("행렬 b");
			printMatrix(arrayy);
			System.out.println("행렬 c");
			printMatrix(arrayz);
		}
		
		//문제 7-28. 행렬 x와 y의 합을 저장해서 2차원 배열로 반환하는 메서드 작성  int[][] addMatrix(int[][] x, int[][] y)
		System.out.print("행렬의 행 수 :");
		int row = stdIn.nextInt();
		System.out.print("행렬의 열 수 :");
		int col = stdIn.nextInt();
		
		int[][] arrayX = new int[row][col];
		int[][] arrayY = new int[row][col];
		
		for(int i=0; i<arrayX.length; i++) {
			for(int j=0; j<arrayX[i].length; j++) {
				System.out.printf("a[%d][%d]",i,j);
				arrayX[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0; i<arrayY.length; i++) {
			for(int j=0; j<arrayY[i].length; j++) {
				System.out.printf("b[%d][%d]",i,j);
				arrayY[i][j] = stdIn.nextInt();
			}
		}
		
		int[][] arrayZ = addMatrix(arrayX,arrayY);
		
	
		System.out.println("행렬 x");
		printMatrix(arrayX);
		System.out.println("행렬 y");
		printMatrix(arrayY);
		System.out.println("행렬 z");
		printMatrix(arrayZ);
		
		
		//문제 7-30. 2개의 int형 정수 a,b의 최솟값,3개의 int형 정수 a,b,c의 최솟값, 배열 a의 최솟값을 각각 구하자.
		System.out.print("x값 : ");
		x = stdIn.nextInt();
		System.out.print("y값 : ");
		y = stdIn.nextInt();
		System.out.print("z값 : ");
		int z = stdIn.nextInt();
		
		System.out.print("배열 a의 요소 수  : ");
		num = stdIn.nextInt();
		int[] arrayN = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arrayN[i] = stdIn.nextInt(); 
		}
		
		//x,y 두개의 최솟값
		System.out.println("x,y의 최솟값은 "+min(x,y)+"입니다.");
		//x,y,z 세개의 최솟값
		System.out.println("x,y의 최솟값은 "+min(x,y,z)+"입니다.");
		//배열의 최솟값
		System.out.println("x,y의 최솟값은 "+min(arryN)+"입니다.");

	}

	
	

	

	

		
	
}
