package main.java.entretien.tuplemap;

import java.util.Collection;
import java.util.Map;

import main.java.entretien.tuple.Duo;
import main.java.entretien.tuple.Tuple;


public class DuoMap<A, B, T> extends TupleMap<Duo<A, B>, T> {
	
	public DuoMap() {
		super();
	}
	
	public DuoMap(Map<Duo<A, B>, T> map) {
		super(map);
	}
	
	public boolean containsKey(A a, B b) {
		return map.containsKey(getKey(a, b));
	}

	public T get(A a, B b) {
		return map.get(getKey(a, b));
	}
	
	public T getWithDefault(A a, B b, T def) {
		T res = map.get(getKey(a, b));
		return res == null ? def : res;
	}

	public T put(A a, B b, T value) {
		return map.put(getKey(a, b), value);
	}

	public Collection<T> getAllValuesWithA(A a) {
		// TODO
		return null;
	}

	public Collection<Map.Entry<Duo<A,B>, T>> getAllEntriesWithA(A a) {
		// TODO
		return null;
	}

	public Collection<T> deleteAllWithA(A a) {
		// TODO
		return null;
	}

	public Collection<T> getAllValuesWithB(B b) {
		// TODO
		return null;
	}

	public Collection<Map.Entry<Duo<A,B>, T>> getAllEntrie0sWithB(B b) {
		// TODO
		return null;
	}

	public Collection<T> deleteAllWithB(B b) {
		// TODO
		return null;
	}
	
	private Duo<A, B> getKey(A a, B b) {
		return new Duo<A, B>(a, b);
	}
}
