package main.java.entretien.tuple;

public class Solo<A> extends Tuple {
	
	public final A a;
	
	public Solo(A a) {
		this.a = a;
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public Object[] getElements() {
		return new Object[]{a};
	}
}
