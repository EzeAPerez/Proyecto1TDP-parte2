package tdpp1;

public class Par<A,B> {
	protected A a;
	protected B b;
	
	public Par(A a, B b) {
		this.a =  a;
		this.b = b;
	}
	
	public A getA() {
		return a;
	}
	
	public B getB() {
		return b;
	}

}
