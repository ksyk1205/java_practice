package ch08_3;

public class car {
	//8-3.이름,번호(이상 String형)/폭,높이,길이(이상 int형)/현재 위치 X좌표,Y좌표,탱크 용량,남은 연료, 연비(이상 double형)를 필드를 가진다.
	//현재 X,Y좌표를 불러오기, 남은 연료 불러오기, 사양 표시하기, 지시한 X,Y방향만큼 자동차 이동하기, 급유하기 등의 메서드를 가진다.

	private String name;	//아름
	private String number;	//번호
	private int width;	 	//폭
	private int height;		//높이
	private int length;     //길이
	private double x;		//x좌표
	private double y;		//y좌표
	private double tankage; //탱크용량
	private double fuel;    //남은 연료
	private double sfc;     //연비
	
	car(String name, String number, int width, int height, int length,
					double tankage, double fuel, double sfc){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;
		//남은 원료의 최대값은 탱크 용량과 동일
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;
		x = y = 0.0;
	}
	
	double getX() {//현재 위치의 x좌표 불러오기
		return x;
	}
	double getY() {//현재 위치의 y좌표 불러오기
		return y;
	}
	double getFuel() {//남은 연료 불러오기
		return fuel;
	}
	
	/* 표시 */
	void putSpec() {
		System.out.println("이름 "+name);
		System.out.println("번호 "+number);
		System.out.println("전폭 "+width+"mm");
		System.out.println("전고 "+height+"mm");
		System.out.println("전장 "+length+"mm");
		System.out.println("탱크 "+tankage+"mm");
		System.out.println("연비 "+sfc+"km/리터");
	}
	
	/* x방향으로 dx, y방향으로 dy이동 */
	boolean move(double dx,double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy); //이동거리
		double f = dist/sfc;	//이동에 필요한 연료
		
		if(f>fuel) {
			return false;	//이동할 수 업다..연료부족
		}else {
			fuel -= f;		//이동 거리분만큼 연료가 준다.
			
			x+=dx;
			y+=dy;
			return true;	//이동완료
		}
	}
	
	/* df리터 급유 */
	void refuel(double df) {
		if(df>0) {
			fuel+=df;
			if(fuel>tankage)
				fuel =tankage;
		}
	}
	
}
