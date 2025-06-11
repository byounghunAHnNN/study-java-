package lang.immutable.change;

public class ImmutableObj {

	
	private final int value;
	
	public ImmutableObj(int value) {
		this.value = value;
	}
	
	public ImmutableObj add(int addValue) {
		int result = value + addValue;
		return new ImmutableObj(result); // 새로운 객체를 만들어서 반환한다. final도 add가능. 
	}
	
	
	public int getValue() {
		return value;
	}
}
