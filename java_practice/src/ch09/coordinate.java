package ch09;

public class coordinate {
	//x��ǥ�� y��ǥ�� ������ 2���� ��ǥ coordinate�� �ۼ�����
	private double x;
	private double y;
	
	//������
	coordinate(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//x��ǥ,y��ǥ ��������
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	//x��ǥ,y��ǥ set
	void setX(double x){
		this.x = x;
	}
	void setY(double y){
		this.y = y;
	}
	
	//��ǥ����
	void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
