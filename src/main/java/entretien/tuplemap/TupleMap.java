package main.java.entretien.tuplemap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import main.java.entretien.tuple.Tuple;


public abstract class TupleMap<K extends Tuple, T> implements Map<K, T> {
	
	protected final Map<K, T> map;
	
	public TupleMap() {
		this.map = new HashMap<>();
	}
	
	public TupleMap(Map<K, T> map) {
		this.map = map;
	}

	public Collection<T> getAllValues(Tuple filter) {
		return getAllValues(filter, 0);
	}
	
	public Collection<T> getAllValues(Tuple filter, int offset) {
		// TODO
		return null;
	}

	public Collection<Map.Entry<K, T>> getAllEntries(Tuple filter) {
		return getAllEntries(filter, 0);
	}

	public Collection<Map.Entry<K, T>> getAllEntries(Tuple filter, int offset) {
		// TODO
		return null;
	}

	public Collection<T> deleteAll(Tuple filter) {
		return deleteAll(filter, 0);
	}

	public Collection<T> deleteAll(Tuple filter, int offset) {
		// TODO
		return null;
	}

	public Collection<Map.Entry<K, T>> deleteAllEntries(Tuple filter) {
		return deleteAllEntries(filter, 0);
	}

	public Collection<Map.Entry<K, T>> deleteAllEntries(Tuple filter, int offset) {
		// TODO
		return null;
	}
	
	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return map.containsValue(value);
	}

	@Override
	public Set<Entry<K, T>> entrySet() {
		return map.entrySet();
	}

	@Override
	public T get(Object key) {
		return map.get(key);
	}
	
	public T getWithDefault(Object key, T def) {
		T res = map.get(key);
		return res == null ? def : res;
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		return map.keySet();
	}

	@Override
	public T put(K key, T value) {
		return map.put(key, value);
	}

	@Override
	public void putAll(Map<? extends K, ? extends T> m) {
		map.putAll(m);
	}

	@Override
	public T remove(Object key) {
		return map.remove(key);
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public Collection<T> values() {
		return map.values();
	}

}
