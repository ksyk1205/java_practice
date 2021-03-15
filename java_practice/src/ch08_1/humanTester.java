package ch08_1;

public class humanTester { //문ㅈㅔ 8-1

	public static void main(String[] args) {
		//클래스형 변수를 선언 한다.
		human seyeon = new human();
		human seyeon2 = new human();
		
		//클래스형 변수로 선언한 후 변수명으로 참조하는 인스턴스를 접근할 수 있다.
		seyeon.name = "세연";
		seyeon.height = 160;
		seyeon.weight = 50;
		
		seyeon2.name ="세연이";
		seyeon.height = 165;
		seyeon.weight = 55;
		
		System.out.println("이름 : "+seyeon.name);
		System.out.println("신장 : "+seyeon.height);
		System.out.println("몸무게 : "+seyeon.weight);
		System.out.println();
		
		System.out.println("이름 : "+seyeon2.name);
		System.out.println("신장 : "+seyeon2.height);
		System.out.println("몸무게 : "+seyeon2.weight);
		
		

	}

}
