package Rivista2.Interface;

public interface Dictionary<K, V> extends Iterable<K> {

	public void insert(K key, V value);

	public void delete(K key);

	public V search(K key);
}