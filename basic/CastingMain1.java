package poly.basic;

public class CastingMain1 {

	public static void main(String[] args) {
		Parent poly = new Child();
		poly.parentMethod();
		// poly.childMethod();
		
		// 다운캐스팅 부모타입-> 자식타입으로 낮춤
		Child child = (Child)poly; //poly를 강제로 Child로 바꿔서 대입시킨다.
		child.childMethod();
	}

}
