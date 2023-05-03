package day19_0502.generic.good;

public class DEF<T, C>{	//여러 타입을 사용할 수 있다
	
	
	private T key;
	private C value;
	
	public DEF() {
		
	}
	
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public C getValue() {
		return value;
	}
	public void setValue(C value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "DEF [key=" + key + ", value=" + value + "]";
	}
	
	
	
	
	
}
