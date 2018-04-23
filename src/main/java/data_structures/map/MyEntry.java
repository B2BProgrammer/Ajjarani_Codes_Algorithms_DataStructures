package data_structures.map;

public class MyEntry<K, V> {

    private final K key;
    private V value;

    public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
            // Testing Comment
            // Testing 2
    }

    public K getKey() {
            return key;
    }

    public V getValue() {
            return value;
    }

    public void setValue(V value) {
            this.value = value;
    }

}
