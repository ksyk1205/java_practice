package ch08_3;

public class car {
	//8-3.�̸�,��ȣ(�̻� String��)/��,����,����(�̻� int��)/���� ��ġ X��ǥ,Y��ǥ,��ũ �뷮,���� ����, ����(�̻� double��)�� �ʵ带 ������.
	//���� X,Y��ǥ�� �ҷ�����, ���� ���� �ҷ�����, ��� ǥ���ϱ�, ������ X,Y���⸸ŭ �ڵ��� �̵��ϱ�, �����ϱ� ���� �޼��带 ������.

	private String name;	//�Ƹ�
	private String number;	//��ȣ
	private int width;	 	//��
	private int height;		//����
	private int length;     //����
	private double x;		//x��ǥ
	private double y;		//y��ǥ
	private double tankage; //��ũ�뷮
	private double fuel;    //���� ����
	private double sfc;     //����
	
	car(String name, String number, int width, int height, int length,
					double tankage, double fuel, double sfc){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;
		//���� ������ �ִ밪�� ��ũ �뷮�� ����
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc;
		x = y = 0.0;
	}
	
	double getX() {//���� ��ġ�� x��ǥ �ҷ�����
		return x;
	}
	double getY() {//���� ��ġ�� y��ǥ �ҷ�����
		return y;
	}
	double getFuel() {//���� ���� �ҷ�����
		return fuel;
	}
	
	/* ǥ�� */
	void putSpec() {
		System.out.println("�̸� "+name);
		System.out.println("��ȣ "+number);
		System.out.println("���� "+width+"mm");
		System.out.println("���� "+height+"mm");
		System.out.println("���� "+length+"mm");
		System.out.println("��ũ "+tankage+"mm");
		System.out.println("���� "+sfc+"km/����");
	}
	
	/* x�������� dx, y�������� dy�̵� */
	boolean move(double dx,double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy); //�̵��Ÿ�
		double f = dist/sfc;	//�̵��� �ʿ��� ����
		
		if(f>fuel) {
			return false;	//�̵��� �� ����..�������
		}else {
			fuel -= f;		//�̵� �Ÿ��и�ŭ ���ᰡ �ش�.
			
			x+=dx;
			y+=dy;
			return true;	//�̵��Ϸ�
		}
	}
	
	/* df���� ���� */
	void refuel(double df) {
		if(df>0) {
			fuel+=df;
			if(fuel>tankage)
				fuel =tankage;
		}
	}
	
}
