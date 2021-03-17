package ch08_2;

public class humanTester {//문제 8-2.
	//문제 1번의 단점을 보완 
	//초기화와 관련된 위험성 보완
	//데이터 보호와 관련된 위험성 보완
	public static void main(String[] args) {
		//인스턴스를 생성하여 생성자 접근
		human gildong = new human("길동",170,60);
		human chulsu = new human("철수",166,72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println(gildong.getName());
		System.out.println(gildong.getWeight());
		System.out.println(gildong.getHeight());
		System.out.println();
		
		System.out.println(chulsu.getName());
		System.out.println(chulsu.getWeight());
		System.out.println(chulsu.getHeight());
		
	}

}
