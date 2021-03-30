package ch09;

public class coordinate {
	//xÁÂÇ¥¿Í yÁÂÇ¥·Î ±¸¼ºµÈ 2Â÷¿ø ÀÚÇ¥ coordinate¸¦ ÀÛ¼ºÇÏÀÚ
	private double x;
	private double y;
	
	//»ý¼ºÀÚ
	coordinate(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//xÁÂÇ¥,yÁÂÇ¥ °¡Á®¿À±â
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	//xÁÂÇ¥,yÁÂÇ¥ set
	void setX(double x){
		this.x = x;
	}
	void setY(double y){
		this.y = y;
	}
	
	//ÁÂÇ¥¼³Á¤
	void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
