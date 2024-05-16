package assignment3;

public class Pair_ques {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1 = new Pair<>(1,2);
        System.out.println(p1.getKey()+" "+p1.getValue());
    }
}
class Pair<K,V>{

    private K Key;
    private V value;
    Pair(K key,V value){
        this.Key = key;
        this.value = value;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K key) {
        Key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}