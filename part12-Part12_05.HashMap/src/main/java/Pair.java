
public class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }
    
    public V getValue() {
        return this.value;
    }
    
    public K getKey() {
        return this.key;
    }
    
    public void setValue(V value) {
        this.value = value;
    }
}
