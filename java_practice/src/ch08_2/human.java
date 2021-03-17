package ch08_2;

public class human {
	//문제 8-2. 8-1에서 다룬 문제점들이 해결되도록 human클래스를 수정하자.
	//필드(field)
	private String name; //이름
	private int height;  //신장
	private int weight;  //몸무게
	
	/* 생성자 */
	human(String n,int h, int w){
		name=n; 
		height=h;
		weight=w;
	}
	
	String getName() {
		return name;
	}
	int getHeight() {
		return height;
	}
	int getWeight() {
		return weight;
	}
	
	void gainWeight(int W) {
		weight += W; //살이 찐다.
	}
	void reduceWeight(int W) {
		weight -= W; //살이 찐다.
	}

	

}
