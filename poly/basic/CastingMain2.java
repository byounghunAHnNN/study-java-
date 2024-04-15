package poly.basic;

public class CastingMain2 {

	public static void main(String[] args) {
		Parent poly = new Child();
		poly.parentMethod();
		// poly.childMethod();
		
		// 다운캐스팅 부모타입-> 자식타입으로 낮춤
//		Child child = (Child)poly; //poly를 강제로 Child로 바꿔서 대입시킨다.
//		child.childMethod();
		
		// 일시적 다운캐스팅 -메서드를 호출하는 순간에만 임시적으로 다운캐스팅 지정.
		((Child)poly).childMethod();
		
	}
	
	

}
